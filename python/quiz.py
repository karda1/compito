import random

# Questo programma crea un sistema di quiz a scelta multipla.
# Il quiz ha una lista di domande e risposte. L'utente deve selezionare la risposta corretta.

def quiz():
    domande = {
        "Qual è la capitale dell'Italia?": ["Roma", "Milano", "Torino", "Napoli"],
        "Chi ha dipinto la Gioconda?": ["Leonardo da Vinci", "Michelangelo", "Raffaello", "Donatello"],
        "Qual è la formula chimica dell'acqua?": ["H2O", "CO2", "NaCl", "O2"],
        "In che anno è avvenuto il primo sbarco sulla Luna?": ["1969", "1959", "1979", "1989"]
    }

    punteggio = 0

    for domanda, risposte in domande.items():
        print(domanda)
        for i, risposta in enumerate(risposte):
            print(f"{i + 1}. {risposta}")

        scelta = int(input("Seleziona la risposta corretta (1-4): "))

        if risposte[scelta - 1] == risposte[0]:
            punteggio += 1

    print(f"Hai ottenuto {punteggio} su {len(domande)} domande corrette.")

if __name__ == "__main__":
    quiz()
