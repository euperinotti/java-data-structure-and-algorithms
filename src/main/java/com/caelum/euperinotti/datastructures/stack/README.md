# Stack

A stack is a data structure that follows a last in, first out (LIFO) protocol. The latest node added to a stack is the node which is eligible to be removed first. If three nodes (`a`, `b` and, `c`) are added to a stack in this exact same order, the node `c` must be removed first. The only way to remove or return the value of the node `a` is by removing the nodes `c` and `b`.

The stack data structure has three main methods: `push()`, `pop()` and `peek()`. The `push()` method adds a node to the top of the stack. The `pop()` method removes a node from the top of the stack. The `peek()` method returns the value of the top node without removing it from the stack.