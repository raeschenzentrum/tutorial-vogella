/*
 * Copyright (c) 2011, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     David McCann - December 02, 2011 - 2.4 - Initial implementation
package org.eclipse.persistence.internal.sessions.factories;

import org.eclipse.persistence.internal.helper.ComplexDatabaseType;
import org.eclipse.persistence.internal.helper.DatabaseType;

/**
 * <b>INTERNAL</b>: a helper class that holds DatabaseType's. Used to support marshalling
 * PLSQLStoredProcedureCall's
 */
public class OracleArrayTypeWrapper extends DatabaseTypeWrapper {

    public OracleArrayTypeWrapper() {
        super();
    }

    public OracleArrayTypeWrapper(DatabaseType wrappedType) {
        super(wrappedType);
    }

    public ComplexDatabaseType getWrappedType() {
        return (ComplexDatabaseType)wrappedDatabaseType;
    }
}
