import javax.swing.*;
import java.awt.event.*;   //подключаем нужные классы и пакеты


public class MagicBall implements ActionListener {
    JFrame frame = new JFrame("Магический шар");   // задаем и присваиваем название объекту "поле"
    JLabel label = new JLabel("Введите ваш вопрос:");  // задаем и присваиваем название объекту для подписи текстовых окон
    JTextField question = new JTextField();   // задаем и присваиваем название текстовому полю "вопрос"
    JTextField answer = new JTextField();   // задаем и присваиваем название текстовому полю "ответ"
    JButton b1 = new JButton("Получить ответ");  // задаем и присваиваем название кнопке
    static int rand;    // задаем переменную

    MagicBall() {
        label.setBounds(30,20,200,30);
        question.setBounds(30,50,200,30);
        b1.setBounds(30,100,200,30);
        answer.setBounds(30,150,200,30);   // указываем размер и расположение объектов на "поле"

        frame.add(label);
        frame.add(question);
        frame.add(b1);
        frame.add(answer);     // размещаем объекты на поле

        frame.setLayout(null);    // ставим для "поля" абсалюное позиционирование
        frame.setVisible(true);   // отображаем окно "поля"
        frame.setSize(280, 250);  // устанавливаем размер поля
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);     // запрет на изменение размера "поля"

        b1.addActionListener(this); // регистрируем кнопку как источника событий(слушатель действия)
    }

    public void actionPerformed(ActionEvent e) {     // метод для работы с объектами событий
        if(e.getSource() == b1)      // ссылка на объект события и т.д.
            rand = (int) (Math.random() * 8);
        if (rand == 0) {
            answer.setText("Бесспорно");
        } else if (rand == 1) {
            answer.setText("Определённо, да!");
        } else if (rand == 2) {
            answer.setText("Вероятнее всего");
        } else if (rand == 3) {
            answer.setText("Хорошие перспективы");
        } else if (rand == 4) {
            answer.setText("Спроси позже...");
        } else if (rand == 5) {
            answer.setText("Попробуй снова");
        } else if (rand == 6) {
            answer.setText("Мой ответ - нет");
        } else if (rand == 7) {
            answer.setText("Весьма сомнительно");
        }    // присвоение значения событию и т.д.
    }

    public static void main(String...s) {
        new MagicBall();    // вызов конструктора
    }
}
