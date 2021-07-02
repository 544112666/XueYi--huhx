package com.xueyi.system.authority.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.xueyi.system.api.authority.SysSystem;
import com.xueyi.system.authority.domain.SystemMenuVo;
import com.xueyi.system.role.domain.SysRoleSystemMenu;
import com.xueyi.system.utils.vo.TreeSelect;

import java.util.List;

/**
 * 子系统模块Service接口
 *
 * @author xueyi
 */
public interface ISysSystemService {

    /**
     * 查询首页可展示子系统模块列表
     *
     * @param userId   当前用户Id
     * @param userType 用户标识
     * @return 子系统模块集合
     */
    public List<SysSystem> selectSystemViewList(Long userId, String userType);

    /**
     * 根据用户Id查询模块&&菜单
     *
     * @param userId 用户Id
     * @return 模块&&菜单列表
     */
    public List<SysRoleSystemMenu> selectSystemMenuListByUserId(Long userId);

    /**
     * 查询子系统模块
     *
     * @param sysSystem 子系统模块 | systemId 子系统模块Id
     * @return 子系统模块
     */
    public SysSystem selectSystemById(SysSystem sysSystem);

    /**
     * 查询子系统模块列表
     *
     * @param sysSystem 子系统模块
     * @return 子系统模块集合
     */
    public List<SysSystem> selectSystemList(SysSystem sysSystem);

    /**
     * 新增子系统模块
     *
     * @param sysSystem 子系统模块
     * @return 结果
     */
    public int insertSystem(SysSystem sysSystem);

    /**
     * 修改子系统模块
     *
     * @param sysSystem 子系统模块
     * @return 结果
     */
    public int updateSystem(SysSystem sysSystem);

    /**
     * 修改子系统模块状态
     *
     * @param sysSystem 子系统模块
     * @return 结果
     */
    public int updateSystemStatus(SysSystem sysSystem);

    /**
     * 批量删除子系统模块
     *
     * @param sysSystem 子系统模块 | params.Ids 需要删除的子系统模块Ids组
     * @return 结果
     */
    public int deleteSystemByIds(SysSystem sysSystem);

    /**
     * 加载对应角色系统-菜单列表树 | searchValue === 0 仅查询所有正常模块&&菜单 | searchValue === 1 查询所有模块&&菜单
     */
    public List<TreeSelect> buildSystemMenuTreeSelect(SysSystem sysSystem);

    /**
     * 构建前端所需要树结构
     *
     * @param systemMenuList 系统-菜单数组装列表
     * @return 树结构列表
     */
    public List<SystemMenuVo> buildSystemMenuTree(List<SystemMenuVo> systemMenuList);
}
