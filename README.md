# GUI-ADD
GUI
	    Primeiro, importamos as classes JFrame, JTextField, JButton, JLabel, ActionEvent, ActionListener e JOptionPane do pacote javax.swing e as classes GridLayout e SwingUtilities do pacote java.awt. Essas classes são necessárias para criar a interface gráfica e lidar com eventos.

    Em seguida, criamos a classe CalculatorGUI, que herda da classe JFrame e implementa a interface ActionListener para lidar com eventos do botão.

    Dentro da classe CalculatorGUI, definimos as variáveis de instância numField1, numField2, addButton e resultLabel para representar os componentes da interface gráfica.

    O construtor CalculatorGUI() é responsável por inicializar a janela. Definimos o título da janela usando setTitle(), o tamanho da janela usando setSize(), definimos o fechamento padrão da janela usando setDefaultCloseOperation(), e configuramos o layout da janela usando setLayout() com um GridLayout de 4 linhas e 1 coluna.

    Criamos os componentes da interface gráfica, incluindo dois JTextField para inserir os números, um JButton com o texto "Add" para realizar a soma e um JLabel para exibir o resultado.

    Adicionamos um ouvinte de ação ao botão usando addActionListener(this). Isso significa que a classe CalculatorGUI irá lidar com os eventos de ação do botão.

    Adicionamos os componentes à janela usando o método add().

    Sobrescrevemos o método actionPerformed() da interface ActionListener para lidar com os eventos de ação. Quando o botão "Add" é clicado, esse método é chamado.

    No método actionPerformed(), verificamos se a origem do evento é o botão "Add" usando e.getSource() == addButton. Em seguida, obtemos os números inseridos nos campos de texto numField1 e numField2, convertemos esses valores em números inteiros usando Integer.parseInt(), realizamos a soma e armazenamos o resultado na variável result.

    O resultado é exibido no rótulo usando resultLabel.setText(). Se ocorrer uma exceção NumberFormatException, significa que os valores inseridos nos campos de texto não são números válidos. Nesse caso, exibimos uma mensagem de erro usando JOptionPane.showMessageDialog().

    No método main(), usamos SwingUtilities.invokeLater() para garantir que a criação e exibição da janela ocorra na thread de eventos do Swing.

    Dentro do método invokeLater(), criamos uma instância da classe CalculatorGUI e a tornamos visível chamando setVisible(true).

    Quando o programa é executado, a janela do CalculatorGUI será exibida. Você pode inserir dois números nos campos de texto e clicar no botão "Add" para obter o resultado da soma exibido no rótulo.
