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
    public final org.telegram.ui.ActionBar.f6 f52219a;
    public final org.telegram.ui.Components.q5 f52220b;
    public final TextView f52221c;
    public final TextView d;
    public final DecimalFormat f52222e;
    public boolean f52223f;

    public yd(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f52219a = f6Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ha.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f52221c = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        f10.addView(textView, c8.ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28241y6, f6Var);
        f10.addView(textView2, c8.ha.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(context);
        this.f52220b = q5Var;
        q5Var.setTypeface(org.telegram.messenger.g0.o());
        q5Var.setTextSize(1, 13.0f);
        addView(q5Var, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f52222e = decimalFormat;
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
        if (this.f52223f) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f52219a;
            if (f6Var != null) {
                paint = f6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.k6.f27972k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (org.telegram.messenger.hd.f22878a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(17.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.hd.f22878a0) {
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
