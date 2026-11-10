package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class y41 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final TextView[] f51892a;
    public final TextView[] f51893b;
    public final TextView[] f51894c;

    public y41(Context context, int i7) {
        super(context);
        int i10 = i7 * 2;
        this.f51892a = new TextView[i10];
        this.f51893b = new TextView[i10];
        this.f51894c = new TextView[i10];
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        for (int i11 = 0; i11 < i7; i11++) {
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
            for (int i12 = 0; i12 < 2; i12++) {
                LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.k5.f(context, 0);
                int i13 = (i11 * 2) + i12;
                this.f51892a[i13] = new TextView(context);
                this.f51893b[i13] = new TextView(context);
                this.f51894c[i13] = new TextView(context);
                this.f51892a[i13].setTypeface(org.telegram.messenger.g0.o());
                this.f51892a[i13].setTextSize(1, 17.0f);
                this.f51894c[i13].setTextSize(1, 13.0f);
                this.f51894c[i13].setGravity(3);
                this.f51893b[i13].setTextSize(1, 13.0f);
                this.f51893b[i13].setPadding(org.telegram.messenger.g0.L(4.0f), 0, 0, 0);
                f12.addView(this.f51892a[i13]);
                f12.addView(this.f51893b[i13]);
                f11.addView(f12);
                f11.addView(this.f51894c[i13]);
                f10.addView(f11, c8.ha.l(1.0f, -1, -2));
            }
            addView(f10, c8.ha.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i7, String str2, String str3) {
        this.f51892a[i7].setText(str);
        this.f51893b[i7].setText(str2);
        this.f51894c[i7].setText(str3);
        updateColors();
    }

    public void setData(a51 a51Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        TextView[] textViewArr = this.f51892a;
        textViewArr[0].setText(a51Var.f43565b);
        textViewArr[1].setText(a51Var.f43568f);
        textViewArr[2].setText(a51Var.f43571j);
        textViewArr[3].setText(a51Var.f43575n);
        TextView[] textViewArr2 = this.f51893b;
        textViewArr2[0].setText(a51Var.f43566c);
        TextView textView = textViewArr2[0];
        if (a51Var.d) {
            i7 = org.telegram.ui.ActionBar.m6.f28263x6;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f28111p7;
        }
        textView.setTag(Integer.valueOf(i7));
        textViewArr2[1].setText(a51Var.f43569g);
        TextView textView2 = textViewArr2[1];
        if (a51Var.h) {
            i10 = org.telegram.ui.ActionBar.m6.f28263x6;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.f28111p7;
        }
        textView2.setTag(Integer.valueOf(i10));
        textViewArr2[2].setText(a51Var.f43572k);
        TextView textView3 = textViewArr2[2];
        if (a51Var.f43573l) {
            i11 = org.telegram.ui.ActionBar.m6.f28263x6;
        } else {
            i11 = org.telegram.ui.ActionBar.m6.f28111p7;
        }
        textView3.setTag(Integer.valueOf(i11));
        textViewArr2[3].setText(a51Var.f43576o);
        TextView textView4 = textViewArr2[3];
        if (a51Var.f43577p) {
            i12 = org.telegram.ui.ActionBar.m6.f28263x6;
        } else {
            i12 = org.telegram.ui.ActionBar.m6.f28111p7;
        }
        textView4.setTag(Integer.valueOf(i12));
        TextView[] textViewArr3 = this.f51894c;
        textViewArr3[0].setText(a51Var.f43564a);
        textViewArr3[1].setText(a51Var.f43567e);
        textViewArr3[2].setText(a51Var.f43570i);
        textViewArr3[3].setText(a51Var.f43574m);
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.f51892a;
        if (textViewArr3 != null && (textViewArr = this.f51893b) != null && (textViewArr2 = this.f51894c) != null) {
            for (int i7 = 0; i7 < textViewArr3.length; i7++) {
                TextView textView = textViewArr3[i7];
                int i10 = org.telegram.ui.ActionBar.m6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
                textViewArr2[i7].setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28300z6, false));
                Integer num = (Integer) textViewArr[i7].getTag();
                if (num != null) {
                    textViewArr[i7].setTextColor(org.telegram.ui.ActionBar.m6.x0(null, num.intValue(), false));
                } else {
                    textViewArr[i7].setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
