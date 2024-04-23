package model;

public class Principal {

        public static void main(String[] args) {
            ArvoreBinaria arvore = new ArvoreBinaria();
            arvore.inserirNo(arvore.noRaiz, 10);
            arvore.inserirNo(arvore.noRaiz, 5);
            arvore.inserirNo(arvore.noRaiz, 15);
            arvore.inserirNo(arvore.noRaiz, 3);
            arvore.inserirNo(arvore.noRaiz, 7);
            arvore.inserirNo(arvore.noRaiz, 12);
            arvore.inserirNo(arvore.noRaiz, 18);

            System.out.println("In-Order Traversal:");
            arvore.inOrder(arvore.noRaiz);

            System.out.println("Pre-Order Traversal:");
            arvore.preOrder(arvore.noRaiz);

            System.out.println("Post-Order Traversal:");
            arvore.postOrder(arvore.noRaiz);
        }
}
