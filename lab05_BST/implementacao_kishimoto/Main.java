//
// Árvore de Busca Binária - Exemplo de implementação em Java
// Copyright (C) 2024 André Kishimoto
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <https://www.gnu.org/licenses/>.
//

import ed2.BST;
import ed2.BTNode;

public class Main {

	public static void main(String[] args) {
		// 
		// Árvore criada no exemplo abaixo:
		//
		//     C
		//   /   \
		//  A     E
		//   \   / \ 
		//    B D   F
		//
		
		BST tree = new BST(); 
		tree.insert("C");
		tree.insert("A");
		tree.insert("B");
		tree.insert("E");
		tree.insert("D");
		tree.insert("F");

		System.out.println("Árvore: \n" + tree.inReversedOrderAscii());
		System.out.println("Pré-ordem: \n" + tree.preOrderTraversal());
		System.out.println("Em ordem: \n" + tree.inOrderTraversal());
		System.out.println("Pós-ordem: \n" + tree.postOrderTraversal());
		System.out.println("Por nível: \n" + tree.levelOrderTraversal());
		
		String searchStr = "E";
		BTNode searchNode = tree.search(searchStr);
		System.out.println("search(" + searchStr + "): " + searchNode + "\n");

		String removeStr = "C";
		tree.removeIgnoreCase(removeStr);
		
		System.out.println("Árvore: \n" + tree.inReversedOrderAscii());
		System.out.println("Pré-ordem: \n" + tree.preOrderTraversal());
		System.out.println("Em ordem: \n" + tree.inOrderTraversal());
		System.out.println("Pós-ordem: \n" + tree.postOrderTraversal());
		System.out.println("Por nível: \n" + tree.levelOrderTraversal());
	}

}
