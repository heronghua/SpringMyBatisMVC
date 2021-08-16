package com.archermind.springmybatismvc.service;

import com.archermind.springmybatismvc.vo.Version;

public interface VersionService {

    Version getVersionByType(String type);

}
