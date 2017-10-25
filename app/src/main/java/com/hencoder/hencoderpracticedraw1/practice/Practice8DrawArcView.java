package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawRect(100, 100, 700, 400, paint);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL); // 填充模式
        canvas.drawArc(100, 100, 700, 400, -110, 100, true, paint); // 绘制扇形
        canvas.drawArc(100, 100, 700, 400, 20, 140, false, paint); // 绘制弧形
        paint.setStyle(Paint.Style.STROKE); // 画线模式
        canvas.drawArc(100, 100, 700, 400, 180, 60, false, paint); // 绘制不封口的弧形
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
    }
}
