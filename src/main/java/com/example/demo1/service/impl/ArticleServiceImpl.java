package com.example.demo1.service.impl;

import com.example.demo1.entity.Article;
import com.example.demo1.mapper.ArticleMapper;
import com.example.demo1.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ***
 * @since 2022-04-16
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
