public class Start {
    public static void main(String[] args) throws IOException {
        // Консольный интерфейс
        WeatherViewer.processCity();
    }

}

/* Вывод в консоль
псков
Ответ сервера погоды:
	Место: город Псков(RU).
	Прогноз погоды на 5 дней (детализация 3 часа):
		2021-12-19 06:00:00: 	средняя температура 1.43,	 ветер 5.65м/с,	 состояние - "небольшой снег",
		2021-12-19 09:00:00: 	средняя температура 0.85,	 ветер 6.43м/с,	 состояние - "пасмурно",
		2021-12-19 12:00:00: 	средняя температура -0.52,	 ветер 6.42м/с,	 состояние - "небольшой снег",
		2021-12-19 15:00:00: 	средняя температура -1.03,	 ветер 5.22м/с,	 состояние - "небольшой снег",
		2021-12-19 18:00:00: 	средняя температура -2.63,	 ветер 4.16м/с,	 состояние - "небольшой снег",
		2021-12-19 21:00:00: 	средняя температура -4.03,	 ветер 4.91м/с,	 состояние - "пасмурно",
		2021-12-20 00:00:00: 	средняя температура -5.91,	 ветер 5.86м/с,	 состояние - "пасмурно",
		2021-12-20 03:00:00: 	средняя температура -7.44,	 ветер 5.76м/с,	 состояние - "пасмурно",
		2021-12-20 06:00:00: 	средняя температура -8.12,	 ветер 5.68м/с,	 состояние - "пасмурно",
		2021-12-20 09:00:00: 	средняя температура -8.65,	 ветер 5.84м/с,	 состояние - "пасмурно",
		2021-12-20 12:00:00: 	средняя температура -9.28,	 ветер 5.58м/с,	 состояние - "пасмурно",
		2021-12-20 15:00:00: 	средняя температура -9.15,	 ветер 5.03м/с,	 состояние - "пасмурно",
		2021-12-20 18:00:00: 	средняя температура -9.54,	 ветер 4.39м/с,	 состояние - "пасмурно",
		2021-12-20 21:00:00: 	средняя температура -9.49,	 ветер 4.2м/с,	 состояние - "облачно с прояснениями",
		2021-12-21 00:00:00: 	средняя температура -9.83,	 ветер 3.87м/с,	 состояние - "облачно с прояснениями",
		2021-12-21 03:00:00: 	средняя температура -10.12,	 ветер 3.54м/с,	 состояние - "небольшая облачность",
		2021-12-21 06:00:00: 	средняя температура -10.23,	 ветер 3.35м/с,	 состояние - "небольшая облачность",
		2021-12-21 09:00:00: 	средняя температура -9.6,	 ветер 3.62м/с,	 состояние - "небольшая облачность",
		2021-12-21 12:00:00: 	средняя температура -9.31,	 ветер 3.45м/с,	 состояние - "переменная облачность",
		2021-12-21 15:00:00: 	средняя температура -10.1,	 ветер 3.28м/с,	 состояние - "переменная облачность",
		2021-12-21 18:00:00: 	средняя температура -10.17,	 ветер 2.94м/с,	 состояние - "переменная облачность",
		2021-12-21 21:00:00: 	средняя температура -9.99,	 ветер 2.82м/с,	 состояние - "переменная облачность",
		2021-12-22 00:00:00: 	средняя температура -9.13,	 ветер 3.75м/с,	 состояние - "небольшой снег",
		2021-12-22 03:00:00: 	средняя температура -9.36,	 ветер 3.56м/с,	 состояние - "пасмурно",
		2021-12-22 06:00:00: 	средняя температура -9.32,	 ветер 3.36м/с,	 состояние - "пасмурно",
		2021-12-22 09:00:00: 	средняя температура -8.72,	 ветер 3.19м/с,	 состояние - "пасмурно",
		2021-12-22 12:00:00: 	средняя температура -8.14,	 ветер 3.07м/с,	 состояние - "пасмурно",
		2021-12-22 15:00:00: 	средняя температура -8.59,	 ветер 2.5м/с,	 состояние - "пасмурно",
		2021-12-22 18:00:00: 	средняя температура -9.67,	 ветер 2.0м/с,	 состояние - "облачно с прояснениями",
		2021-12-22 21:00:00: 	средняя температура -10.09,	 ветер 1.85м/с,	 состояние - "переменная облачность",
		2021-12-23 00:00:00: 	средняя температура -10.29,	 ветер 1.92м/с,	 состояние - "переменная облачность",
		2021-12-23 03:00:00: 	средняя температура -9.53,	 ветер 2.27м/с,	 состояние - "пасмурно",
		2021-12-23 06:00:00: 	средняя температура -9.36,	 ветер 3.05м/с,	 состояние - "пасмурно",
		2021-12-23 09:00:00: 	средняя температура -8.77,	 ветер 3.52м/с,	 состояние - "пасмурно",
		2021-12-23 12:00:00: 	средняя температура -7.98,	 ветер 3.57м/с,	 состояние - "пасмурно",
		2021-12-23 15:00:00: 	средняя температура -7.9,	 ветер 3.61м/с,	 состояние - "пасмурно",
		2021-12-23 18:00:00: 	средняя температура -7.54,	 ветер 3.83м/с,	 состояние - "пасмурно",
		2021-12-23 21:00:00: 	средняя температура -7.64,	 ветер 3.82м/с,	 состояние - "пасмурно",
		2021-12-24 00:00:00: 	средняя температура -6.72,	 ветер 3.79м/с,	 состояние - "пасмурно",
		2021-12-24 03:00:00: 	средняя температура -5.62,	 ветер 4.03м/с,	 состояние - "небольшой снег"
--= Введите город (для выхода из программы наберите 'exit') =--
Куртушев
Такого города нет в OpenWeatherMap или данные по нему не могут быть предоставлены