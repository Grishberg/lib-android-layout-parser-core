package com.github.grishberg.layout.parser;

import java.util.List;

public interface Node {

    List<Node> children();

    Node childAt(int index);

    int childCount();

    String name();

    NodeProperty getProperty(String name, String altNames);

    Node parent();

    Node EMPTY_NODE = new Node() {
        @Override
        public int childCount() {
            return 0;
        }

        @Override
        public List<Node> children() {
            return null;
        }

        @Override
        public Node childAt(int index) {
            return null;
        }

        @Override
        public String name() {
            return null;
        }

        @Override
        public NodeProperty getProperty(String name, String altNames) {
            return null;
        }

        @Override
        public Node parent() {
            return null;
        }
    };
}