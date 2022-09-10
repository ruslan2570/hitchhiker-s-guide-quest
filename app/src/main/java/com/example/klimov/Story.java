package com.example.klimov;

import android.content.Intent;
import android.view.View;

public class Story {

    String next = "Далее";
    String end = "Конец";
    GameScreen gs;

    String nextPosition1, nextPosition2, nextPosition3;

    Story(GameScreen gs){
        this.gs = gs;
    }

    public void selectPosition(String position){
        switch (position){
            case "yellow": yellow(); break;
            case "work": work(); break;
            case "fortyTwo": fortyTwo(); break;
            case "crawler": crawler(); break;
            case "yield": yield(); break;
            case "continueLyingDown": continueLyingDown(); break;
            case "goToBar": goToBar(); break;
            case "collect": collect(); break;
            case "getPeanut": getPeanut(); break;
            case "getTowel": getTowel(); break;
            case "hitTheRoad": hitTheRoad(); break;
            case "fail": fail(); break;


            case "theEnd": theEnd(); break;
        }
    }

    public void startingPoint(){

        gs.text.setText("В четверг в восемь часов утра Вы чувствуете себя далеко не замечательно. Едва открыв глаза, Вы обошли комнату, открыли окно, увидели Большой Желтый Бульдозер, нашли тапочки и пошли в ванную. После чистки зубов Вы посмотрели на зеркало. В Вашей голове что-то всплыло.\nЧто именно?");

        gs.btn1.setVisibility(View.VISIBLE);
        gs.btn1.setVisibility(View.VISIBLE);
        gs.btn1.setVisibility(View.VISIBLE);

        nextPosition1 = "yellow";
        nextPosition2 = "work";
        nextPosition3 = "fortyTwo";
    }

    public void yellow(){
        gs.text.setText("Вы вспоминаете, что было вчера.\nВчера вечером Вы зашли в бар, чтобы...\nчтобы что?\nчтобы поделиться со всеми окружающими новостью, что на месте Вашего дома построят новое шоссе.");

        gs.btn1.setVisibility(View.VISIBLE);
        gs.btn2.setVisibility(View.GONE);
        gs.btn3.setVisibility(View.GONE);

        gs.btn1.setText(next);
        gs.btn2.setText("");
        gs.btn3.setText("");

        nextPosition1 = "crawler";
        nextPosition2 = "";
        nextPosition3 = "";
    }

    public void work(){
        gs.text.setText("Вы собрались на работу. Работаете Вы ведущим на радио. Не успев дойти до своей машины, в небе появляется огромный красный луч, дойдя до Земли, уничтожил Вас, вашу машину и всю планету в целом.");

        gs.btn1.setVisibility(View.VISIBLE);
        gs.btn2.setVisibility(View.GONE);
        gs.btn3.setVisibility(View.GONE);

        gs.btn1.setText(end);
        gs.btn2.setText("");
        gs.btn3.setText("");

        nextPosition1 = "theEnd";
        nextPosition2 = "";
        nextPosition3 = "";

    }

    public void fortyTwo(){
        gs.text.setText("Вы в замешательстве. Что ещё за сорок два? Быть может, это ответ на Главный вопрос Вселенной, Жизни и всего такого? Или же это количество покушений на Адольфа Гитлера, а может длина марафона или количество зубов у собаки, Вы не знаете, поэтому решили проигнорировать эту мысль");

        gs.btn1.setVisibility(View.VISIBLE);
        gs.btn2.setVisibility(View.GONE);
        gs.btn3.setVisibility(View.GONE);

        gs.btn1.setText(next);
        gs.btn2.setText("");
        gs.btn3.setText("");

        nextPosition1 = "crawler";
        nextPosition2 = "";
        nextPosition3 = "";
    }

    public void crawler(){
        gs.text.setText("Вы снова глядите в окно и видите желтый бульдозер около Вашего дома.\nЧерез четверть минуты Вы оказываетесь перед своим домом, лежащим в грязи. На Вас и Ваш дом медленно надвигается бульдозер. Бульдозер останавливается и из него вылазит Л. Проссер - человек, под чьей ответственностью находится процесс постройки шоссе и, следовательно, процесс сноса Вашего дома.\nПроссер уверяет Вас, что сопротивление не принесёт никакой пользы и шоссе будет построенно.");

        gs.btn1.setVisibility(View.VISIBLE);
        gs.btn2.setVisibility(View.VISIBLE);
        gs.btn3.setVisibility(View.GONE);

        gs.btn1.setText("Сдаться");
        gs.btn2.setText("Продолжить лежать");
        gs.btn3.setText("");

        nextPosition1 = "yield";
        nextPosition2 = "continueLyingDown";
        nextPosition3 = "";
    }

    public void yield(){
        gs.text.setText("Вы отходите в сторону и с отчаянием смотрите, как бульдозер сравнивает Ваш дом с землей.\nОт этого печального зрелища Вас отвлекает Ваш друг Форд. Он предлагает направиться в бар, чтобы обсудить одно очень важно дело.\nФорд умеет убеждать людей, поэтому у Вас нет выбора.");

        gs.btn1.setVisibility(View.VISIBLE);
        gs.btn2.setVisibility(View.GONE);
        gs.btn3.setVisibility(View.GONE);

        gs.btn1.setText("Пойти в бар");
        gs.btn2.setText("");
        gs.btn3.setText("");

        nextPosition1 = "goToBar";
        nextPosition2 = "";
        nextPosition3 = "";
    }

    public void continueLyingDown(){
        gs.text.setText("Вы продолжаете лежать. Рабочие в этот момент занимаются своими делами. Через несколько минут к Вам подходит Ваш лучший друг Форд Префект. Он хочет обсудить одно важное дело. Вы забываете, зачем лежали на грязи и пошли в бар.");

        gs.btn1.setVisibility(View.VISIBLE);
        gs.btn2.setVisibility(View.GONE);
        gs.btn3.setVisibility(View.GONE);

        gs.btn1.setText(next);
        gs.btn2.setText("");
        gs.btn3.setText("");

        nextPosition1 = "goToBar";
        nextPosition2 = "";
        nextPosition3 = "";
    }

    public void goToBar(){
        gs.text.setText("Форд сообщил Вам, что он совсем не бывший актер из Гилдфорда, а с некой маленькой планеты в окрестности Бетельгейзе. И что через 10 минут планета Земля будет уничтожена инопланетной цивиллизацией Вогонов для прокладки межгалактического шоссе. Форд предлагает пробраться на корабль Вогонов, чтобы спастись. Сначало нужно собрать все необходимые вещи.");

        gs.btn1.setVisibility(View.VISIBLE);
        gs.btn2.setVisibility(View.GONE);
        gs.btn3.setVisibility(View.GONE);

        gs.btn1.setText(next);
        gs.btn2.setText("");
        gs.btn3.setText("");

        nextPosition1 = "collect";
        nextPosition2 = "";
        nextPosition3 = "";
    }

    boolean peanuts, towel;

    public void collect(){

        String collectString = "Необходимые вещи:\n";



        if(!peanuts)
            collectString = collectString + "Арахис - нет\n";
        else{

            gs.btn1.setEnabled(false);
            collectString = collectString + "Арахис - есть\n";
            collectString = collectString + "Пиво?! - есть\n";
        }
        if(!towel)
            collectString = collectString + "Полотенце - нет\n";
        else {
            gs.btn2.setEnabled(false);
            collectString = collectString + "Полотенце - есть\n";
        }
        gs.text.setText(collectString);

        gs.btn1.setVisibility(View.VISIBLE);
        gs.btn2.setVisibility(View.VISIBLE);
        gs.btn3.setVisibility(View.VISIBLE);

        gs.btn1.setText("Взять арахис");
        gs.btn2.setText("Взять полотенце");
        gs.btn3.setText("К отправке готов!");

        nextPosition1 = "getPeanut";
        nextPosition2 = "getTowel";
        if(peanuts && towel)
            nextPosition3 = "hitTheRoad";
        else
            nextPosition3 = "fail";
    }


    public void getTowel(){
        gs.text.setText("Полотенце - самая необходимая вещь в багаже путешествующего по Галактике автостопом.\nВы быстро бежите домой, а точнее, в место, где он раньше находился, в руинах Вы находите полотенце.");

        gs.btn1.setEnabled(true);
        gs.btn2.setEnabled(true);

        gs.btn1.setVisibility(View.VISIBLE);
        gs.btn2.setVisibility(View.GONE);
        gs.btn3.setVisibility(View.GONE);

        gs.btn1.setText(next);
        gs.btn2.setText("");
        gs.btn3.setText("");

        towel = true;

        nextPosition1 = "collect";
        nextPosition2 = "";
        nextPosition3 = "";
    }

    public void getPeanut(){
        gs.text.setText("Чтобы проникнуть на корабль необходимо использовать портативный телепорт, который находится у Форда на пальце и выглядит как обычное кольцо. Телепортация расходует много солей в организме, поэтому для их восполнения понадобится соленый арахис.\nВы купили у бармена 10 пачек солёного арахиса и получили пиво в подарок!");

        gs.btn1.setEnabled(true);
        gs.btn2.setEnabled(true);

        gs.btn1.setVisibility(View.VISIBLE);
        gs.btn2.setVisibility(View.GONE);
        gs.btn3.setVisibility(View.GONE);

        gs.btn1.setText(next);
        gs.btn2.setText("");
        gs.btn3.setText("");

        peanuts = true;

        nextPosition1 = "collect";
        nextPosition2 = "";
        nextPosition3 = "";
    }

    public void fail(){
        gs.text.setText("Вы не собрали всех нужных вещей.\nИз-за этого Вы умерли от истощения на инопланетном корабле, уничтожившем вашу планету.");

        gs.btn1.setVisibility(View.GONE);
        gs.btn2.setVisibility(View.GONE);
        gs.btn3.setVisibility(View.VISIBLE);

        gs.btn1.setText("");
        gs.btn2.setText("");
        gs.btn3.setText(end);

        nextPosition1 = "";
        nextPosition2 = "";
        nextPosition3 = "theEnd";
    }

    public void hitTheRoad(){
        gs.text.setText("С помощью телепортирующего кольца Вы со своим другом оказываетесь на инопланетном корабле. Вы осознаете всю потребность в арахисе и полотенце. Осозновая, что всё, что Вам дорого было уничтожено, Вам только и остается укрыться полотенцем и есть арахис. В иллюминаторе видна мимопролетающая вывеска \"Вкусно и точка\".\n\nКонец первой части. Продолжение не следует.");

        gs.btn1.setVisibility(View.GONE);
        gs.btn2.setVisibility(View.GONE);
        gs.btn3.setVisibility(View.VISIBLE);

        gs.btn1.setText("");
        gs.btn2.setText("");
        gs.btn3.setText(end);

        nextPosition1 = "";
        nextPosition2 = "";
        nextPosition3 = "theEnd";
    }

    public void theEnd(){
        Intent intent = new Intent(gs, TitleScreen.class);
        gs.startActivity(intent);
    }
}
