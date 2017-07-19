package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    Paint paint = new Paint();
    Paint paintTv = new Paint();
    Path path = new Path();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        paint.setStyle(Paint.Style.FILL);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(300, 100, 1000, 800, -50, 50, true, paint);

        paint.setColor(Color.MAGENTA);
        canvas.drawArc(300, 100, 1000, 800, 2, 6, true, paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(300, 100, 1000, 800, 10, 5, true, paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(300, 100, 1000, 800, 17, 60, true, paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(300, 100, 1000, 800, 79, 97, true, paint);

        // 圆心位置偏离一些
        paint.setColor(Color.RED);
        canvas.drawArc(280, 80, 980, 780, 178, 130, true, paint);

        paintTv.setColor(Color.WHITE);
        paintTv.setTextSize(55);
        canvas.drawText("饼图", 600, 900, paintTv);

        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);

        paintTv.setTextSize(30);

        // 绘制第一条折线
        path.moveTo(200, 120);
        path.lineTo(400, 120);
        path.rLineTo(25, 25);
        canvas.drawPath(path, paint);
        canvas.drawText("Lollipop", 80, 130, paintTv);

        // 绘制第二条折线
        path.moveTo(250, 750);
        path.lineTo(400, 750);
        path.rLineTo(25, -25);
        canvas.drawPath(path, paint);
        canvas.drawText("KitKat", 140, 760, paintTv);

        // 绘制第三条折线
        path.moveTo(1100, 300);
        path.lineTo(1000, 300);
        path.rLineTo(-25, 25);
        canvas.drawPath(path, paint);
        canvas.drawText("Marshmallow", 1120, 310, paintTv);

        // 绘制第四条折线
        path.moveTo(1100, 455);
        path.lineTo(1000, 455);
        canvas.drawPath(path, paint);
        canvas.drawText("Froyo", 1120, 465, paintTv);

        // 绘制第五条折线
        path.moveTo(1100, 500);
        path.lineTo(1050, 500);
        path.rLineTo(-25, -25);
        path.rLineTo(-25, 0);
        canvas.drawPath(path, paint);
        canvas.drawText("GingerBread", 1120, 510, paintTv);

        // 绘制第六条折线
        path.moveTo(1100, 550);
        path.lineTo(1050, 550);
        path.rLineTo(-25, -25);
        path.rLineTo(-30, 0);
        canvas.drawPath(path, paint);
        canvas.drawText("Ice Cream Sandwich", 1120, 560, paintTv);

        // 绘制第七条折线
        path.moveTo(1050, 720);
        path.lineTo(950, 720);
        path.rLineTo(-35, -35);
        canvas.drawPath(path, paint);
        canvas.drawText("Jelly Bean", 1070, 730, paintTv);
    }
}
