package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    Paint paint = new Paint();

    int startX = 200;
    int margin = 30;
    int width = 100;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);

//        canvas.drawRect(200, 690, 300, 700, paint);
//        canvas.drawRect(330, 670, 430, 700, paint);
//        canvas.drawRect(460, 670, 560, 700, paint);
//        canvas.drawRect(590, 300, 690, 700, paint);
//        canvas.drawRect(720, 150, 820, 700, paint);
//        canvas.drawRect(850, 100, 950, 700, paint);
//        canvas.drawRect(980, 320, 1080, 700, paint);

        canvas.drawRect(getLeft(0), 690, getRight(0), 700, paint);
        canvas.drawRect(getLeft(1), 670, getRight(1), 700, paint);
        canvas.drawRect(getLeft(2), 670, getRight(2), 700, paint);
        canvas.drawRect(getLeft(3), 300, getRight(3), 700, paint);
        canvas.drawRect(getLeft(4), 150, getRight(4), 700, paint);
        canvas.drawRect(getLeft(5), 100, getRight(5), 700, paint);
        canvas.drawRect(getLeft(6), 320, getRight(6), 700, paint);

        paint.setStrokeWidth(3);
        paint.setColor(Color.LTGRAY);
        canvas.drawLine(175, 80, 175, 700, paint);
        canvas.drawLine(175, 700, 1200, 700, paint);

        paint.setTextSize(32);
        canvas.drawText("Froyo", getLeft(0) + getPadding("Froyo"), 740, paint);
        canvas.drawText("GB", getLeft(1) + getPadding("GB"), 740, paint);
        canvas.drawText("ICS", getLeft(2) + getPadding("ICS"), 740, paint);
        canvas.drawText("JB", getLeft(3) + getPadding("JB"), 740, paint);
        canvas.drawText("KitKat", getLeft(4) + getPadding("KitKat"), 740, paint);
        canvas.drawText("L", getLeft(5) + getPadding("L"), 740, paint);
        canvas.drawText("M", getLeft(6) + getPadding("M"), 740, paint);

        paint.setTextSize(55);
        canvas.drawText("直方图", 600, 850, paint);
    }

    private int getLeft(int index) {
        return startX + width * index + margin * index;
    }

    private int getRight(int index) {
        return startX + width * (index + 1) + margin * index;
    }

    private int getPadding(String str) {
        float strWidth = paint.measureText(str, 0, str.length());
        return (width - (int) strWidth) / 2;
    }
}
