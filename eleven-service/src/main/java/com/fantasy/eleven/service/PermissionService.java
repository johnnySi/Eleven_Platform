package com.fantasy.eleven.service;

import com.fantasy.eleven.model.PermissionDO;

import java.util.List;

/**
 * Created by Fantasy on 2018/1/22.
 *
 * @author Fantasy
 */
public interface PermissionService {
    /**
     * Find list permission list.
     *
     * @param u the u
     * @return the list
     */
    List<PermissionDO> findListPermission(PermissionDO u);

    /**
     * Insert permission boolean.
     *
     * @param u the u
     * @return the boolean
     */
    Boolean insertPermission(PermissionDO u);

    /**
     * Update permission boolean.
     *
     * @param u the u
     * @return the boolean
     */
    Boolean updatePermission(PermissionDO u);

    /**
     * Delete permission boolean.
     *
     * @param u the u
     * @return the boolean
     */
    Boolean deletePermission(PermissionDO u);
}