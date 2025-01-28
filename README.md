# Bancomat in Java

Questo progetto è un semplice programma che simula il funzionamento di un **Bancomat**. Permette agli utenti di eseguire alcune operazioni bancarie come prelievo, deposito e visualizzazione del saldo. È stato scritto in **Java** e può essere eseguito direttamente dalla riga di comando.

## Funzionalità

- **Accesso con PIN**: L'utente deve inserire un PIN corretto per accedere al sistema del Bancomat.
- **Visualizzazione saldo**: L'utente può visualizzare il saldo corrente del proprio conto.
- **Prelievo denaro**: L'utente può prelevare denaro dal proprio conto, a condizione che il saldo sia sufficiente.
- **Deposito denaro**: L'utente può depositare una somma di denaro nel proprio conto.
- **Uscita dal sistema**: L'utente può scegliere di uscire dal sistema del Bancomat in qualsiasi momento.

## Come funziona

1. Il programma inizia chiedendo all'utente di inserire il proprio **PIN**.
2. Se il PIN è corretto, viene presentato un menu con le seguenti opzioni:
   - Visualizzare il saldo
   - Prelevare denaro
   - Deposito denaro
   - Uscire dal sistema
3. L'utente può scegliere l'operazione desiderata e il programma eseguirà l'azione corrispondente.
4. Al termine, l'utente può scegliere di uscire dal sistema.

## Requisiti

- **Java 8** o versioni successive installate sul tuo computer.
- Un terminale o un ambiente di sviluppo integrato (IDE) come IntelliJ IDEA, Eclipse, o NetBeans.

## Come eseguire il programma

1. Clona il repository:

   ```bash
   git clone https://github.com/riccardosacco97/bancomat-java.git
