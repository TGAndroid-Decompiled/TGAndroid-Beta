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
public final class wd extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 f50777a;
    public final org.telegram.ui.Components.o5 f50778b;
    public final TextView f50779c;
    public final TextView d;
    public final DecimalFormat f50780e;
    public boolean f50781f;

    public wd(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f50777a = e6Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, b8.mf.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f50779c = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        f10.addView(textView, b8.mf.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        f10.addView(textView2, b8.mf.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.f50778b = o5Var;
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setTextSize(1, 13.0f);
        addView(o5Var, b8.mf.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f50780e = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i3;
        super.onDraw(canvas);
        if (this.f50781f) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f50777a;
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (org.telegram.messenger.bd.f21784a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(17.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.bd.f21784a0) {
                    i3 = org.telegram.messenger.g0.L(17.0f);
                } else {
                    i3 = 0;
                }
                canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }
}
