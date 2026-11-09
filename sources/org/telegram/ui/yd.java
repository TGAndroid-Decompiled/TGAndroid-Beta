package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public final class yd extends FrameLayout {
    public final org.telegram.ui.ActionBar.g6 f52086a;
    public final org.telegram.ui.Components.q5 f52087b;
    public final TextView f52088c;
    public final TextView d;
    public final DecimalFormat f52089e;
    public boolean f52090f;

    public yd(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f52086a = g6Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ha.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f52088c = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, g6Var);
        f10.addView(textView, c8.ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28257y6, g6Var);
        f10.addView(textView2, c8.ha.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(context);
        this.f52087b = q5Var;
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        q5Var.setTextSize(1, 13.0f);
        addView(q5Var, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f52089e = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.f52090f) {
            org.telegram.ui.ActionBar.g6 g6Var = this.f52086a;
            if (g6Var != null) {
                paint = g6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.l6.f27988k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (org.telegram.messenger.id.f23157a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(17.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.id.f23157a0) {
                    i7 = org.telegram.messenger.g0.L(17.0f);
                } else {
                    i7 = 0;
                }
                canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }
}
