import java.util.Scanner;

public class pizzaria { 
    public static void main(String[] args) {

        int menu = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite a opção: ");
            System.out.println("0 - Inicio");
            System.out.println("1 - Cadastro Cliente");
            System.out.println("2 - Lista Cliente");
            System.out.println("3 - Cadastro Sabor");
            System.out.println("4 - Lista Sabor");
            System.out.println("5 - Cadastro Pizza");
            System.out.println("6 - Lista Pizza");
            System.out.println("7 - Cadastro Comanda");
            System.out.println("8 - Lista Comanda");
            System.out.println("9 - FIm");
            menu = scanner.nextInt();
            switch (menu) {
                case 0:
                    System.out.println("Bem vindo!!");
                    break;
//==============================================================================================================                    
                case 1:
                    try {
                        System.out.println("Cadastro CLiente: \n");
                        System.out.println("Digite o ID: ");
                        int idCliente = scanner.nextInt();
                        System.out.println("Digite o nome: ");
                        String nome = scanner.next();
                        System.out.println("Digite o CPF: ");
                        int cpf = scanner.nextInt();
                        System.out.println("Digite o Telefone: ");
                        int telefone = scanner.nextInt();
                        System.out.println("Digite o Endereço: ");
                        int endereco = scanner.nextInt();
                        
                        CadastroCliente cadastrocliente = new CadastroCliente(idCliente, nome, cpf, endereco);
                        System.out.println(
                            "ID: " + cadastrocliente.idCliente + "\n" +
                            "Nome: " + cadastrocliente.nome + "\n" +
                            "CPF: " + cadastrocliente.cpf + "\n" +
                            "Telefone: " + cadastrocliente.telefone + "\n" +
                            "Endereço: " + cadastrocliente.endereco
                        );
                    } catch (Exception error) {
                        System.out.println("Erro ao cadastrar o cliente." + error.getMessage());
                }
                break;
//==============================================================================================================
                case  2:
                        System.out.println("Lista Cliente: \n");
                    for (CadastroCliente cadastrocliente : cadastroCliente.cadastrocliente) {
                        System.out.println(
                            "Id: " + cadastrocliente.idCliente + "\n" +
                            "Nome: " + cadastrocliente.nome + "\n" +
                            "Ano: " + cadastrocliente.ano
                    );
                }
                break;
//==============================================================================================================
                case 3:
                    try {
                        System.out.println("Cadastro Sabor: \n");
                        System.out.println("Digite o ID: ");
                        int idSabor = scanner.nextInt();
                        System.out.println("Digite o sabor: ");
                        int sabor = scanner.nextInt();
                        System.out.println("Digite o Detalhamento: ");
                        int detalhamento = scanner.nextInt();

                        CadastroSabor cadastrosabor = new CadastroSabor();
                        System.out.println(
                            "ID: " + cadastrosabor.idCliente + "\n" +
                            "Sabor: " + cadastrosabor.sabor + "\n" +
                            "Detalhamento: " + cadastrosabor.detalhamento  
                        );     
                    } catch (Exception error) {
                        System.out.println("Erro ao cadastrar o sabor." + error.getMessage());
                }
                break;
//==============================================================================================================
                case  4:
                        System.out.println("Lista Sabor: \n");
                    for (CadastroSabor cadastrosabor : CadastroSabor.cadastrosabor) {
                        System.out.println(
                            "ID: " + cadastrosabor.idCliente + "\n" +
                            "Sabor: " + cadastrosabor.sabor + "\n" +
                            "Detalhamento: " + cadastrosabor.detalhamento
                    );
                }
                break; 
//==============================================================================================================
                case 5:
                    try {
                        System.out.println("Cadastro Pizza: \n");
                        System.out.println("Digite o ID: ");
                        int idPizza = scanner.nextInt();
                        System.out.println("Digite o Tamanho da pizza: ");
                        String tamanho = scanner.next();
                        

                        CadastroPizza cadastropizza = new CadastroPizza();
                        System.out.println(
                            "ID: " + CadastroPizza.idPizza + "\n" +
                            "Sabor: " + CadastroPizza.tamanho 
                            
                        );     
                    } catch (Exception error) {
                        System.out.println("Erro ao cadastrar a pizza." + error.getMessage());
                }
                break; 
//============================================================================================================== 
                case 6:
                        System.out.println("Lista Pizza: \n");
                    for (CadastroComanda cadastrocomanda : CadastroComanda.cadastrocomanda) {
                        System.out.println(
                            "ID: " + CadastroPizza.idPizza + "\n" +
                            "Sabor: " + CadastroPizza.tamanho 
                        );
                }
                break; 
//==============================================================================================================
                case 7:
                    try {
                        System.out.println("Cadastro Comanda: \n");
                        System.out.println("Digite o ID: ");
                        int idComanda = scanner.nextInt();
                        System.out.println("Digite o número: ");
                        String numero = scanner.next();
                        System.out.println("Digite o Data: ");
                        String data = scanner.next();
                        
                        CadastroComanda cadastrocomanda = new CadastroComanda(idCliente, nome, cpf, endereco);
                        System.out.println(
                            "ID: " + cadastrocomanda.idComanda + "\n" +
                            "Número: " + cadastrocomanda.numero + "\n" +
                            "Data: " + cadastrocomanda.data
                    
                        );
                    } catch (Exception error) {
                        System.out.println("Erro ao cadastrar a comanda." + error.getMessage());
                }
                break;
//============================================================================================================== 
                case 8:
                        System.out.println("Lista Comanda: \n");
                    for (CadastroComanda cadastrocomanda : CadastroComanda.cadastrocomanda) {
                        System.out.println(
                            "ID: " + cadastrocomanda.idComanda + "\n" +
                            "número: " + cadastrocomanda.numero + "\n" +
                            "Data: " + cadastrocomanda.data
                        );
                }
                break; 
//==============================================================================================================
                case 9:
                        System.out.println("Obrigado pela preferência!!");
                break;
//==============================================================================================================                    
                } while (menu != 0);
        } 
    }

    
