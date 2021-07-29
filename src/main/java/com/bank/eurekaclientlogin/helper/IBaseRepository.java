package com.bank.eurekaclientlogin.helper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.bank.eurekaclientlogin.entity.BaseEntity;

/**
 * @author
 *
 */
@NoRepositoryBean
public interface IBaseRepository<T extends BaseEntity, ID> extends JpaRepository<T, ID>, QueryByExampleExecutor<T> {
	
}
