## Calculadora de Plano de Telefone

Este projeto Java simula o cálculo de uma conta de telefone baseada no consumo de minutos. O programa define um plano básico de R$ 50,00 que inclui 100 minutos. Ele solicita ao usuário que digite o tempo total de uso em minutos ( `double` ).

O código verifica algumas condições:
* Se o tempo for **negativo**, ele indica "TEMPO INVALIDO".
* Se o tempo estiver **dentro do limite** de 100 minutos, informa "ESTÁ DENTRO DOS LIMITES DO PLANO".
* Se o tempo **ultrapassar 100 minutos**, calcula um acréscimo de R$ 2,00 por minuto excedente. Em seguida, exibe o valor do acréscimo e o valor total final da conta.
