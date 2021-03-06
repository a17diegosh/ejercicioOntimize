package com.imatia.model.core.service;

import java.util.List;
import java.util.Map;


import com.imatia.api.core.service.ICandidateService;
import com.imatia.model.core.dao.CandidateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

@Service("CandidateService")
@Lazy
public class CandidateService implements ICandidateService {

    @Autowired private CandidateDao candidateDao;
    @Autowired private DefaultOntimizeDaoHelper daoHelper;

    @Override
    public EntityResult candidateQuery(Map<String, Object> keyMap, List<String> attrList)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.candidateDao, keyMap, attrList);
    }

    @Override
    public EntityResult candidateInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.insert(this.candidateDao, attrMap);
    }

    @Override
    public EntityResult candidateUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.update(this.candidateDao, attrMap, keyMap);
    }

    @Override
    public EntityResult candidateDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.delete(this.candidateDao, keyMap);
    }

}