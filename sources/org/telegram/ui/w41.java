package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class w41 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final TextView[] f50949a;
    public final TextView[] f50950b;
    public final TextView[] f50951c;

    public w41(Context context, int i7) {
        super(context);
        int i10 = i7 * 2;
        this.f50949a = new TextView[i10];
        this.f50950b = new TextView[i10];
        this.f50951c = new TextView[i10];
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        for (int i11 = 0; i11 < i7; i11++) {
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
            for (int i12 = 0; i12 < 2; i12++) {
                LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.k5.f(context, 0);
                int i13 = (i11 * 2) + i12;
                this.f50949a[i13] = new TextView(context);
                this.f50950b[i13] = new TextView(context);
                this.f50951c[i13] = new TextView(context);
                this.f50949a[i13].setTypeface(org.telegram.messenger.g0.o());
                this.f50949a[i13].setTextSize(1, 17.0f);
                this.f50951c[i13].setTextSize(1, 13.0f);
                this.f50951c[i13].setGravity(3);
                this.f50950b[i13].setTextSize(1, 13.0f);
                this.f50950b[i13].setPadding(org.telegram.messenger.g0.L(4.0f), 0, 0, 0);
                f12.addView(this.f50949a[i13]);
                f12.addView(this.f50950b[i13]);
                f11.addView(f12);
                f11.addView(this.f50951c[i13]);
                f10.addView(f11, c8.ha.l(1.0f, -1, -2));
            }
            addView(f10, c8.ha.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i7, String str2, String str3) {
        this.f50949a[i7].setText(str);
        this.f50950b[i7].setText(str2);
        this.f50951c[i7].setText(str3);
        updateColors();
    }

    public void setData(y41 y41Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        TextView[] textViewArr = this.f50949a;
        textViewArr[0].setText(y41Var.f52057b);
        textViewArr[1].setText(y41Var.f52060f);
        textViewArr[2].setText(y41Var.f52063j);
        textViewArr[3].setText(y41Var.f52067n);
        TextView[] textViewArr2 = this.f50950b;
        textViewArr2[0].setText(y41Var.f52058c);
        TextView textView = textViewArr2[0];
        if (y41Var.d) {
            i7 = org.telegram.ui.ActionBar.k6.f28221x6;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.f28069p7;
        }
        textView.setTag(Integer.valueOf(i7));
        textViewArr2[1].setText(y41Var.f52061g);
        TextView textView2 = textViewArr2[1];
        if (y41Var.h) {
            i10 = org.telegram.ui.ActionBar.k6.f28221x6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f28069p7;
        }
        textView2.setTag(Integer.valueOf(i10));
        textViewArr2[2].setText(y41Var.f52064k);
        TextView textView3 = textViewArr2[2];
        if (y41Var.f52065l) {
            i11 = org.telegram.ui.ActionBar.k6.f28221x6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f28069p7;
        }
        textView3.setTag(Integer.valueOf(i11));
        textViewArr2[3].setText(y41Var.f52068o);
        TextView textView4 = textViewArr2[3];
        if (y41Var.f52069p) {
            i12 = org.telegram.ui.ActionBar.k6.f28221x6;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.f28069p7;
        }
        textView4.setTag(Integer.valueOf(i12));
        TextView[] textViewArr3 = this.f50951c;
        textViewArr3[0].setText(y41Var.f52056a);
        textViewArr3[1].setText(y41Var.f52059e);
        textViewArr3[2].setText(y41Var.f52062i);
        textViewArr3[3].setText(y41Var.f52066m);
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.f50949a;
        if (textViewArr3 != null && (textViewArr = this.f50950b) != null && (textViewArr2 = this.f50951c) != null) {
            for (int i7 = 0; i7 < textViewArr3.length; i7++) {
                TextView textView = textViewArr3[i7];
                int i10 = org.telegram.ui.ActionBar.k6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                textViewArr2[i7].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28258z6, false));
                Integer num = (Integer) textViewArr[i7].getTag();
                if (num != null) {
                    textViewArr[i7].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, num.intValue(), false));
                } else {
                    textViewArr[i7].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
