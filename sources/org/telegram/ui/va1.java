package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class va1 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f42765a;
    public final TextView[] f42766b;
    public final TextView[] f42767c;

    public va1(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f42765a = new TextView[i11];
        this.f42766b = new TextView[i11];
        this.f42767c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout e7 = org.telegram.messenger.bi.e(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout e10 = org.telegram.messenger.bi.e(context, 1);
                LinearLayout e11 = org.telegram.messenger.bi.e(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f42765a[i14] = new TextView(context);
                this.f42766b[i14] = new TextView(context);
                this.f42767c[i14] = new TextView(context);
                this.f42765a[i14].setTypeface(AndroidUtilities.bold());
                this.f42765a[i14].setTextSize(1, 17.0f);
                this.f42767c[i14].setTextSize(1, 13.0f);
                this.f42767c[i14].setGravity(3);
                this.f42766b[i14].setTextSize(1, 13.0f);
                this.f42766b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                e11.addView(this.f42765a[i14]);
                e11.addView(this.f42766b[i14]);
                e10.addView(e11);
                e10.addView(this.f42767c[i14]);
                e7.addView(e10, w7.x5.l(1.0f, -1, -2));
            }
            addView(e7, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 16.0f, -1, 0));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f42765a[i10].setText(str);
        this.f42766b[i10].setText(str2);
        this.f42767c[i10].setText(str3);
        b();
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.f42765a;
            if (i10 < textViewArr.length) {
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.i6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
                this.f42767c[i10].setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21199z6, false));
                TextView[] textViewArr2 = this.f42766b;
                Integer num = (Integer) textViewArr2[i10].getTag();
                if (num != null) {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.i6.x0(null, num.intValue(), false));
                } else {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setData(xa1 xa1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f42765a;
        textViewArr[0].setText(xa1Var.f43897b);
        textViewArr[1].setText(xa1Var.f43900f);
        textViewArr[2].setText(xa1Var.f43903j);
        textViewArr[3].setText(xa1Var.f43907n);
        TextView[] textViewArr2 = this.f42766b;
        textViewArr2[0].setText(xa1Var.f43898c);
        TextView textView = textViewArr2[0];
        if (xa1Var.d) {
            i10 = org.telegram.ui.ActionBar.i6.f21165x6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f21018p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(xa1Var.f43901g);
        TextView textView2 = textViewArr2[1];
        if (xa1Var.h) {
            i11 = org.telegram.ui.ActionBar.i6.f21165x6;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.f21018p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(xa1Var.f43904k);
        TextView textView3 = textViewArr2[2];
        if (xa1Var.f43905l) {
            i12 = org.telegram.ui.ActionBar.i6.f21165x6;
        } else {
            i12 = org.telegram.ui.ActionBar.i6.f21018p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(xa1Var.f43908o);
        TextView textView4 = textViewArr2[3];
        if (xa1Var.f43909p) {
            i13 = org.telegram.ui.ActionBar.i6.f21165x6;
        } else {
            i13 = org.telegram.ui.ActionBar.i6.f21018p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f42767c;
        textViewArr3[0].setText(xa1Var.f43896a);
        textViewArr3[1].setText(xa1Var.f43899e);
        textViewArr3[2].setText(xa1Var.f43902i);
        textViewArr3[3].setText(xa1Var.f43906m);
        b();
    }
}
