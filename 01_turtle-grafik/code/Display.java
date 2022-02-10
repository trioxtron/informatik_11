















public class Display {    
    Turtle t;
    
    public Display() {
        t = new Turtle();
        t.zumStart(200, 200);
        t.zeige();
    }
    public void right() {
        t.drehe(90);
    }
    public void left() {
        t.drehe(-90);
    }
    public void around() {
        t.drehe(180);
    }

    public void rechteck(int s) {
        go(s);
        right();
        go(s);
        right();
        go(s);
        right();
        go(s);
        right();
    }
    
    public void go(double s) {
        for(int i = 0; i<s; i++) {
            t.vor(1);
        }
    }
    
    public void turnR(double r) {
        for(int i = 0; i<r; i++) {
            t.drehe(1);
        }
    }
    
    public void hausVomNikolaus() {
        t.geheNach(250, 150);
        t.geheNach(200, 150);
        t.geheNach(250, 200);
        t.geheNach(200, 200);
        t.geheNach(200, 150);
        t.geheNach(225, 100);
        t.geheNach(250, 150);
        t.geheNach(250, 200);
    }
    
    public void hausVomRichtigenNikolaus() {
        t.drehe(-45);
        go(Math.sqrt(5000));
        t.drehe(-135);
        go(50);
        t.drehe(-135);
        go(Math.sqrt(5000));
        t.drehe(135);
        go(50);
        t.drehe(90);
        go(50);
        t.drehe(45);
        go(Math.sqrt(1250));
        t.drehe(90);
        go(Math.sqrt(1250));
        t.drehe(45);
        go(50);
    }
    
    public void stern() {
        t.vor(100);
        t.drehe(144);
        t.vor(100);
        t.drehe(144);
        t.vor(100);
        t.drehe(144);
        t.vor(100);
        t.drehe(144);
        t.vor(100);
    }
    
    public void kreis() {
        for(int i = 0; i<360; i++) {
            go(1);
            turnR(1);
        }
    }
    
    public void rechteckForm() {
        int i = 0;
        while (i<4) {
            rechteck(50);
            left();
            i++;
        }     
    }
    
    public void dreieck() {
        for (int i=0; i<3; i++) {
            go(50);
            turnR(120);
        }
    }
    
    public void sechseckForm() {
        for (int i=0; i<6; i++) {
            dreieck();
            go(50);
            turnR(60);
        }
    }
    
    
    public void kreisbogen() {
        int i = 0;
        while (i<120) {
            go(1);
            turnR(1);
            
            if (i>20 && i<80) {
                go(1);
                i += 3;
            } else {
                i++;
            }
            
        }
    }
    
    public void blatt() {
        kreisbogen();
        turnR(100);
        kreisbogen();
    }
    
    public void blume() {
        for(int i=0; i<9; i++) {
            blatt();
            turnR(20);
        }
        hide();
    }
    
    public void hide() {
        t.verstecke();
    }
    
    
}