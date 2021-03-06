/*************************************************************************
 * Copyright 2017 Ent. Services Development Corporation LP
 *
 * Redistribution and use of this software in source and binary forms,
 * with or without modification, are permitted provided that the
 * following conditions are met:
 *
 *   Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 *   Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer
 *   in the documentation and/or other materials provided with the
 *   distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ************************************************************************/
package com.eucalyptus.auth.principal;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.text.IsEmptyString.isEmptyOrNullString;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.eucalyptus.auth.principal.TemporaryAccessKey.TemporaryKeyType;
import com.eucalyptus.util.Parameters;
import javaslang.control.Option;

/**
 *
 */
public final class AccessKeyCredential {

  public enum SignatureVersion { v2, v4 }

  private final String accessKeyId;
  private final SignatureVersion signatureVersion;
  private final Long signatureTimestamp;
  private final Option<TemporaryKeyType> type;

  private AccessKeyCredential( @Nonnull final String accessKeyId,
                               @Nonnull final SignatureVersion signatureVersion,
                                        final Long signatureTimestamp,
                               @Nonnull final Option<TemporaryKeyType> type ) {
    this.accessKeyId = Parameters.checkParam( "accessKeyId", accessKeyId, not( isEmptyOrNullString( ) ) );
    this.signatureVersion = Parameters.checkParam( "signatureVersion", signatureVersion, notNullValue( ) );
    this.signatureTimestamp = signatureTimestamp;
    this.type = Parameters.checkParam( "type", type, notNullValue( ) );
  }

  public static AccessKeyCredential of( @Nonnull final String queryId,
                                        @Nonnull final SignatureVersion signatureVersion,
                                                 final Long signatureTimestamp,
                                        @Nonnull final Option<TemporaryKeyType> type ) {
    return new AccessKeyCredential( queryId, signatureVersion, signatureTimestamp, type );
  }

  @Nonnull
  public String getAccessKeyId( ) {
    return accessKeyId;
  }

  @Nonnull
  public SignatureVersion getSignatureVersion( ) {
    return signatureVersion;
  }

  @Nullable
  public Long getSignatureTimestamp( ) {
    return signatureTimestamp;
  }

  @Nonnull
  public Option<TemporaryKeyType> getType( ) {
    return type;
  }

  public String toString( ) {
    return getAccessKeyId( );
  }

  @SuppressWarnings( "RedundantIfStatement" )
  @Override
  public boolean equals( final Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass( ) != o.getClass( ) ) return false;

    final AccessKeyCredential that = (AccessKeyCredential) o;

    if ( !accessKeyId.equals( that.accessKeyId ) ) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return accessKeyId.hashCode( );
  }
}
