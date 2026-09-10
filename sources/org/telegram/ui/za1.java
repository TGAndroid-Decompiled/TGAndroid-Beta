package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class za1 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f39248a;
    public final TextView[] f39249b;
    public final TextView[] f39250c;

    public za1(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f39248a = new TextView[i11];
        this.f39249b = new TextView[i11];
        this.f39250c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout f7 = org.telegram.messenger.em.f(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout f10 = org.telegram.messenger.em.f(context, 1);
                LinearLayout f11 = org.telegram.messenger.em.f(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f39248a[i14] = new TextView(context);
                this.f39249b[i14] = new TextView(context);
                this.f39250c[i14] = new TextView(context);
                this.f39248a[i14].setTypeface(AndroidUtilities.bold());
                this.f39248a[i14].setTextSize(1, 17.0f);
                this.f39250c[i14].setTextSize(1, 13.0f);
                this.f39250c[i14].setGravity(3);
                this.f39249b[i14].setTextSize(1, 13.0f);
                this.f39249b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                f11.addView(this.f39248a[i14]);
                f11.addView(this.f39249b[i14]);
                f10.addView(f11);
                f10.addView(this.f39250c[i14]);
                f7.addView(f10, w7.a6.l(1.0f, -1, -2));
            }
            addView(f7, w7.a6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f39248a[i10].setText(str);
        this.f39249b[i10].setText(str2);
        this.f39250c[i10].setText(str3);
        b();
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.f39248a;
            if (i10 < textViewArr.length) {
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.j6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                this.f39250c[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18325z6, false));
                TextView[] textViewArr2 = this.f39249b;
                Integer num = (Integer) textViewArr2[i10].getTag();
                if (num != null) {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, num.intValue(), false));
                } else {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setData(bb1 bb1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f39248a;
        textViewArr[0].setText(bb1Var.f31217b);
        textViewArr[1].setText(bb1Var.f31219f);
        textViewArr[2].setText(bb1Var.f31222j);
        textViewArr[3].setText(bb1Var.f31226n);
        TextView[] textViewArr2 = this.f39249b;
        textViewArr2[0].setText(bb1Var.f31218c);
        TextView textView = textViewArr2[0];
        if (bb1Var.d) {
            i10 = org.telegram.ui.ActionBar.j6.f18289x6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f18144p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(bb1Var.f31220g);
        TextView textView2 = textViewArr2[1];
        if (bb1Var.h) {
            i11 = org.telegram.ui.ActionBar.j6.f18289x6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f18144p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(bb1Var.f31223k);
        TextView textView3 = textViewArr2[2];
        if (bb1Var.f31224l) {
            i12 = org.telegram.ui.ActionBar.j6.f18289x6;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.f18144p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(bb1Var.f31227o);
        TextView textView4 = textViewArr2[3];
        if (bb1Var.f31228p) {
            i13 = org.telegram.ui.ActionBar.j6.f18289x6;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.f18144p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f39250c;
        textViewArr3[0].setText(bb1Var.f31216a);
        textViewArr3[1].setText(bb1Var.e);
        textViewArr3[2].setText(bb1Var.f31221i);
        textViewArr3[3].setText(bb1Var.f31225m);
        b();
    }
}
