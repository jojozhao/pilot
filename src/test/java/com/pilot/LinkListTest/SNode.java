package com.pilot.LinkListTest;
// 单连表节点
public class SNode {
    private String data;
    private SNode  nextNode;
    public SNode() {
    }
    public SNode(String data) {
        this.data = data;
        this.nextNode = new SNode();
    }
    
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public SNode getNextNode() {
        return nextNode;
    }
    public void setNextNode(SNode nextNode) {
        this.nextNode = nextNode;
    }
    @Override
    public String toString() {
        return "SNode [data=" + data + "]";
    }
}