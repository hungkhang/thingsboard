/**
 * Copyright © 2016-2017 The Thingsboard Authors
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
package org.thingsboard.server.dao.dashboard;

import java.util.List;
import java.util.UUID;

import org.thingsboard.server.common.data.Dashboard;
import org.thingsboard.server.common.data.page.TextPageLink;
import org.thingsboard.server.dao.Dao;
import org.thingsboard.server.dao.model.DashboardEntity;
import org.thingsboard.server.dao.model.DashboardInfoEntity;

/**
 * The Interface DashboardDao.
 *
 * @param <T> the generic type
 */
public interface DashboardDao extends Dao<DashboardEntity> {

    /**
     * Save or update dashboard object
     *
     * @param dashboard the dashboard object
     * @return saved dashboard object
     */
    DashboardEntity save(Dashboard dashboard);

}
