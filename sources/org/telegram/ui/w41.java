package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class w41 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final TextView[] f52935a;
    public final TextView[] f52936b;
    public final TextView[] f52937c;

    public w41(Context context, int i7) {
        super(context);
        int i10 = i7 * 2;
        this.f52935a = new TextView[i10];
        this.f52936b = new TextView[i10];
        this.f52937c = new TextView[i10];
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        for (int i11 = 0; i11 < i7; i11++) {
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
            for (int i12 = 0; i12 < 2; i12++) {
                LinearLayout g11 = org.telegram.messenger.f3.g(context, 1);
                LinearLayout g12 = org.telegram.messenger.f3.g(context, 0);
                int i13 = (i11 * 2) + i12;
                this.f52935a[i13] = new TextView(context);
                this.f52936b[i13] = new TextView(context);
                this.f52937c[i13] = new TextView(context);
                this.f52935a[i13].setTypeface(org.telegram.messenger.g0.o());
                this.f52935a[i13].setTextSize(1, 17.0f);
                this.f52937c[i13].setTextSize(1, 13.0f);
                this.f52937c[i13].setGravity(3);
                this.f52936b[i13].setTextSize(1, 13.0f);
                this.f52936b[i13].setPadding(org.telegram.messenger.g0.L(4.0f), 0, 0, 0);
                g12.addView(this.f52935a[i13]);
                g12.addView(this.f52936b[i13]);
                g11.addView(g12);
                g11.addView(this.f52937c[i13]);
                g10.addView(g11, c8.ma.l(1.0f, -1, -2));
            }
            addView(g10, c8.ma.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i7, String str2, String str3) {
        this.f52935a[i7].setText(str);
        this.f52936b[i7].setText(str2);
        this.f52937c[i7].setText(str3);
        updateColors();
    }

    public void setData(y41 y41Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        TextView[] textViewArr = this.f52935a;
        textViewArr[0].setText(y41Var.f54025b);
        textViewArr[1].setText(y41Var.f54028f);
        textViewArr[2].setText(y41Var.f54031j);
        textViewArr[3].setText(y41Var.f54035n);
        TextView[] textViewArr2 = this.f52936b;
        textViewArr2[0].setText(y41Var.f54026c);
        TextView textView = textViewArr2[0];
        if (y41Var.d) {
            i7 = org.telegram.ui.ActionBar.n6.f29769x6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29617p7;
        }
        textView.setTag(Integer.valueOf(i7));
        textViewArr2[1].setText(y41Var.f54029g);
        TextView textView2 = textViewArr2[1];
        if (y41Var.h) {
            i10 = org.telegram.ui.ActionBar.n6.f29769x6;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.f29617p7;
        }
        textView2.setTag(Integer.valueOf(i10));
        textViewArr2[2].setText(y41Var.f54032k);
        TextView textView3 = textViewArr2[2];
        if (y41Var.f54033l) {
            i11 = org.telegram.ui.ActionBar.n6.f29769x6;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.f29617p7;
        }
        textView3.setTag(Integer.valueOf(i11));
        textViewArr2[3].setText(y41Var.f54036o);
        TextView textView4 = textViewArr2[3];
        if (y41Var.f54037p) {
            i12 = org.telegram.ui.ActionBar.n6.f29769x6;
        } else {
            i12 = org.telegram.ui.ActionBar.n6.f29617p7;
        }
        textView4.setTag(Integer.valueOf(i12));
        TextView[] textViewArr3 = this.f52937c;
        textViewArr3[0].setText(y41Var.f54024a);
        textViewArr3[1].setText(y41Var.f54027e);
        textViewArr3[2].setText(y41Var.f54030i);
        textViewArr3[3].setText(y41Var.f54034m);
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.f52935a;
        if (textViewArr3 != null && (textViewArr = this.f52936b) != null && (textViewArr2 = this.f52937c) != null) {
            for (int i7 = 0; i7 < textViewArr3.length; i7++) {
                TextView textView = textViewArr3[i7];
                int i10 = org.telegram.ui.ActionBar.n6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                textViewArr2[i7].setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29807z6, false));
                Integer num = (Integer) textViewArr[i7].getTag();
                if (num != null) {
                    textViewArr[i7].setTextColor(org.telegram.ui.ActionBar.n6.x0(null, num.intValue(), false));
                } else {
                    textViewArr[i7].setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
