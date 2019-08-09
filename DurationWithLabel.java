/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplayer;

import javafx.scene.paint.Paint;
import javafx.util.Duration;


    public class DurationWithLabel {

        Duration startingTime;
        Duration endingTime;
        String label;
        Paint paint;
        public DurationWithLabel()
        {}
        
        public DurationWithLabel(Duration s, Duration e, String l, Paint p) {
            this.startingTime = s;
            this.endingTime = e;
            this.label = l;
            this.paint = p;
        }
    }
