/*
 * Copyright (c) 2002-2020 Graph Foundation, Inc.[https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.api.impl.fulltext;

public enum FulltextSortDirection
{
    ASC,
    DESC;

    public static FulltextSortDirection valueOfIgnoreCase( String name )
    {
        for ( FulltextSortDirection each : FulltextSortDirection.class.getEnumConstants() )
        {
            if ( each.name().compareToIgnoreCase( name ) == 0 )
            {
                return each;
            }
        }
        return null;
    }
}
