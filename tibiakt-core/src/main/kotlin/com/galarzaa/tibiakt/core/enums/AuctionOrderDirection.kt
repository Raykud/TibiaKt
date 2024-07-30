/*
 * Copyright © 2024 Allan Galarza
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.galarzaa.tibiakt.core.enums

/**
 * The possible ordering directions for auctions.
 */
public enum class AuctionOrderDirection(override val value: Int) : IntEnum {
    /**
     * Descending order.
     */
    HIGHEST_LATEST(0),

    /**
     * Ascending order.
     */
    LOWEST_EARLIEST(1);

    public companion object {
        /**
         * The query parameter name used to set this value.
         */
        public const val QUERY_PARAM: String = "order_direction"
    }
}
