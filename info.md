Tvary – jednotlivec
Zadání: Vytvoř program, který bude pracovat s geometrickými tvary. Program bude
ovládán pomocí menu.
Postup řešení:
 Rozhraní
o Definuj klíčové metody (pro výpočet obsahu, obvodu a výpis informací)
 Třídy těles
o Vytvoř třídy pro tři tvary obsahující atributy uvedené za pomlčkou:
 Čtverec – hrana
 Obdélník – dvě hrany
 Kruh – poloměr
o V každé třídě bude parametrický konstruktor, metody pro výpočet
obsahu a obvodu příslušného tvaru a metoda pro vypsání informací o
tvaru.
o Všechny třídy budou implementovat výše zmíněné rozhraní.
 Třída programu
o Všechny třídy budou ukládány do jednoho listu/pole objektů – potřeba
si dostudovat
o Program bude ovládán pomocí menu, které bude poskytovat
následující možnosti:
 Vytvoření nového tvaru (čtverce, obdélníka, kruhu) – nedovol
uživateli zadat nesmyslné údaje (zápornou délku strany či
poloměru)
 Výpisy – menu umožní výběr z následujících výpisů (stačí, když
si vybereš 6 z nich)
 Všech tvarů,
 Všech tvarů jednoho druhu (čtverců/obdélníků…),
 Tvaru s největším a nejmenším obvodem,
 Počet jednotlivých druhů tvar,
 Součet obsahů všech tvarů,
 Čtverec s nejdelší stranou,
 Kruh s největším rozdílem obsahu a obvodu.