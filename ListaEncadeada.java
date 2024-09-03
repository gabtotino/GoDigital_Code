package AppCadastro;

public class ListaEncadeada<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public ListaEncadeada() {
        head = null;
        tail = null;
    }

    public void adicionar(T data) {
        Node novo = new Node(data);
        if (tail == null) {
            head = novo;
            tail = novo;
        } else {
            tail.next = novo;
            tail = novo;
        }
    }

    public void exibir() {
        Node atual = head;
        while (atual != null) {
            System.out.println(atual.data);
            atual = atual.next;
        }
    }
}

