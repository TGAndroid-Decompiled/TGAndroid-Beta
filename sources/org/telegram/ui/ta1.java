package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ta1 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f37680a;
    public final TextView[] f37681b;
    public final TextView[] f37682c;

    public ta1(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f37680a = new TextView[i11];
        this.f37681b = new TextView[i11];
        this.f37682c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout e = org.telegram.messenger.wh.e(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout e7 = org.telegram.messenger.wh.e(context, 1);
                LinearLayout e10 = org.telegram.messenger.wh.e(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f37680a[i14] = new TextView(context);
                this.f37681b[i14] = new TextView(context);
                this.f37682c[i14] = new TextView(context);
                this.f37680a[i14].setTypeface(AndroidUtilities.bold());
                this.f37680a[i14].setTextSize(1, 17.0f);
                this.f37682c[i14].setTextSize(1, 13.0f);
                this.f37682c[i14].setGravity(3);
                this.f37681b[i14].setTextSize(1, 13.0f);
                this.f37681b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                e10.addView(this.f37680a[i14]);
                e10.addView(this.f37681b[i14]);
                e7.addView(e10);
                e7.addView(this.f37682c[i14]);
                e.addView(e7, w7.y5.l(1.0f, -1, -2));
            }
            addView(e, w7.y5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f37680a[i10].setText(str);
        this.f37681b[i10].setText(str2);
        this.f37682c[i10].setText(str3);
        b();
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.f37680a;
            if (i10 < textViewArr.length) {
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.j6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                this.f37682c[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19464z6, false));
                TextView[] textViewArr2 = this.f37681b;
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

    public void setData(va1 va1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f37680a;
        textViewArr[0].setText(va1Var.f38399b);
        textViewArr[1].setText(va1Var.f38401f);
        textViewArr[2].setText(va1Var.f38404j);
        textViewArr[3].setText(va1Var.f38408n);
        TextView[] textViewArr2 = this.f37681b;
        textViewArr2[0].setText(va1Var.f38400c);
        TextView textView = textViewArr2[0];
        if (va1Var.d) {
            i10 = org.telegram.ui.ActionBar.j6.f19428x6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f19283p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(va1Var.f38402g);
        TextView textView2 = textViewArr2[1];
        if (va1Var.h) {
            i11 = org.telegram.ui.ActionBar.j6.f19428x6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f19283p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(va1Var.f38405k);
        TextView textView3 = textViewArr2[2];
        if (va1Var.f38406l) {
            i12 = org.telegram.ui.ActionBar.j6.f19428x6;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.f19283p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(va1Var.f38409o);
        TextView textView4 = textViewArr2[3];
        if (va1Var.f38410p) {
            i13 = org.telegram.ui.ActionBar.j6.f19428x6;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.f19283p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f37682c;
        textViewArr3[0].setText(va1Var.f38398a);
        textViewArr3[1].setText(va1Var.e);
        textViewArr3[2].setText(va1Var.f38403i);
        textViewArr3[3].setText(va1Var.f38407m);
        b();
    }
}
