package com.pilot.linklist;
import java.util.Map;
public interface ICommOperate<T> {
    
    public boolean insertNode(T node) ;
    public boolean insertPosNode(int pos, T node) ;
    public boolean deleteNode(int pos) ;
    public boolean updateNode(int pos, Map<String, Object> map) ;
    public T getNode(int pos, Map<String, Object> map) ;
    public void printLink() ;
}