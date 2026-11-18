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
    public final org.telegram.ui.ActionBar.i6 f53081a;
    public final org.telegram.ui.Components.w5 f53082b;
    public final TextView f53083c;
    public final TextView d;
    public final DecimalFormat f53084e;
    public boolean f53085f;

    public wd(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f53081a = i6Var;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        addView(g10, c8.ma.d(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
        TextView textView = new TextView(context);
        this.f53083c = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        g10.addView(textView, c8.ma.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29788y6, i6Var);
        g10.addView(textView2, c8.ma.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(context);
        this.f53082b = w5Var;
        w5Var.setTypeface(org.telegram.messenger.g0.o());
        w5Var.setTextSize(1, 13.0f);
        addView(w5Var, c8.ma.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f53084e = decimalFormat;
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
        if (this.f53085f) {
            org.telegram.ui.ActionBar.i6 i6Var = this.f53081a;
            if (i6Var != null) {
                paint = i6Var.g("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.n6.f29519k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (org.telegram.messenger.gd.f24216a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(17.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.gd.f24216a0) {
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
