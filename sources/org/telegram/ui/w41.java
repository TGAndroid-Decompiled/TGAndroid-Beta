package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class w41 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final TextView[] f52925a;
    public final TextView[] f52926b;
    public final TextView[] f52927c;

    public w41(Context context, int i7) {
        super(context);
        int i10 = i7 * 2;
        this.f52925a = new TextView[i10];
        this.f52926b = new TextView[i10];
        this.f52927c = new TextView[i10];
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        for (int i11 = 0; i11 < i7; i11++) {
            LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
            for (int i12 = 0; i12 < 2; i12++) {
                LinearLayout g11 = org.telegram.messenger.f3.g(context, 1);
                LinearLayout g12 = org.telegram.messenger.f3.g(context, 0);
                int i13 = (i11 * 2) + i12;
                this.f52925a[i13] = new TextView(context);
                this.f52926b[i13] = new TextView(context);
                this.f52927c[i13] = new TextView(context);
                this.f52925a[i13].setTypeface(org.telegram.messenger.g0.o());
                this.f52925a[i13].setTextSize(1, 17.0f);
                this.f52927c[i13].setTextSize(1, 13.0f);
                this.f52927c[i13].setGravity(3);
                this.f52926b[i13].setTextSize(1, 13.0f);
                this.f52926b[i13].setPadding(org.telegram.messenger.g0.L(4.0f), 0, 0, 0);
                g12.addView(this.f52925a[i13]);
                g12.addView(this.f52926b[i13]);
                g11.addView(g12);
                g11.addView(this.f52927c[i13]);
                g10.addView(g11, c8.ma.l(1.0f, -1, -2));
            }
            addView(g10, c8.ma.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i7, String str2, String str3) {
        this.f52925a[i7].setText(str);
        this.f52926b[i7].setText(str2);
        this.f52927c[i7].setText(str3);
        updateColors();
    }

    public void setData(y41 y41Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        TextView[] textViewArr = this.f52925a;
        textViewArr[0].setText(y41Var.f53993b);
        textViewArr[1].setText(y41Var.f53996f);
        textViewArr[2].setText(y41Var.f53999j);
        textViewArr[3].setText(y41Var.f54003n);
        TextView[] textViewArr2 = this.f52926b;
        textViewArr2[0].setText(y41Var.f53994c);
        TextView textView = textViewArr2[0];
        if (y41Var.d) {
            i7 = org.telegram.ui.ActionBar.n6.f29767x6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29615p7;
        }
        textView.setTag(Integer.valueOf(i7));
        textViewArr2[1].setText(y41Var.f53997g);
        TextView textView2 = textViewArr2[1];
        if (y41Var.h) {
            i10 = org.telegram.ui.ActionBar.n6.f29767x6;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.f29615p7;
        }
        textView2.setTag(Integer.valueOf(i10));
        textViewArr2[2].setText(y41Var.f54000k);
        TextView textView3 = textViewArr2[2];
        if (y41Var.f54001l) {
            i11 = org.telegram.ui.ActionBar.n6.f29767x6;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.f29615p7;
        }
        textView3.setTag(Integer.valueOf(i11));
        textViewArr2[3].setText(y41Var.f54004o);
        TextView textView4 = textViewArr2[3];
        if (y41Var.f54005p) {
            i12 = org.telegram.ui.ActionBar.n6.f29767x6;
        } else {
            i12 = org.telegram.ui.ActionBar.n6.f29615p7;
        }
        textView4.setTag(Integer.valueOf(i12));
        TextView[] textViewArr3 = this.f52927c;
        textViewArr3[0].setText(y41Var.f53992a);
        textViewArr3[1].setText(y41Var.f53995e);
        textViewArr3[2].setText(y41Var.f53998i);
        textViewArr3[3].setText(y41Var.f54002m);
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.f52925a;
        if (textViewArr3 != null && (textViewArr = this.f52926b) != null && (textViewArr2 = this.f52927c) != null) {
            for (int i7 = 0; i7 < textViewArr3.length; i7++) {
                TextView textView = textViewArr3[i7];
                int i10 = org.telegram.ui.ActionBar.n6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                textViewArr2[i7].setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29805z6, false));
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
