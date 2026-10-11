package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ua1 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f42499a;
    public final TextView[] f42500b;
    public final TextView[] f42501c;

    public ua1(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f42499a = new TextView[i11];
        this.f42500b = new TextView[i11];
        this.f42501c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout e7 = org.telegram.messenger.ai.e(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout e10 = org.telegram.messenger.ai.e(context, 1);
                LinearLayout e11 = org.telegram.messenger.ai.e(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f42499a[i14] = new TextView(context);
                this.f42500b[i14] = new TextView(context);
                this.f42501c[i14] = new TextView(context);
                this.f42499a[i14].setTypeface(AndroidUtilities.bold());
                this.f42499a[i14].setTextSize(1, 17.0f);
                this.f42501c[i14].setTextSize(1, 13.0f);
                this.f42501c[i14].setGravity(3);
                this.f42500b[i14].setTextSize(1, 13.0f);
                this.f42500b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                e11.addView(this.f42499a[i14]);
                e11.addView(this.f42500b[i14]);
                e10.addView(e11);
                e10.addView(this.f42501c[i14]);
                e7.addView(e10, w7.x5.l(1.0f, -1, -2));
            }
            addView(e7, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 16.0f, -1, 0));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f42499a[i10].setText(str);
        this.f42500b[i10].setText(str2);
        this.f42501c[i10].setText(str3);
        b();
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.f42499a;
            if (i10 < textViewArr.length) {
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.h6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                this.f42501c[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21225z6, false));
                TextView[] textViewArr2 = this.f42500b;
                Integer num = (Integer) textViewArr2[i10].getTag();
                if (num != null) {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, num.intValue(), false));
                } else {
                    textViewArr2[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setData(wa1 wa1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f42499a;
        textViewArr[0].setText(wa1Var.f43319b);
        textViewArr[1].setText(wa1Var.f43322f);
        textViewArr[2].setText(wa1Var.f43325j);
        textViewArr[3].setText(wa1Var.f43329n);
        TextView[] textViewArr2 = this.f42500b;
        textViewArr2[0].setText(wa1Var.f43320c);
        TextView textView = textViewArr2[0];
        if (wa1Var.d) {
            i10 = org.telegram.ui.ActionBar.h6.f21191x6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f21043p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(wa1Var.f43323g);
        TextView textView2 = textViewArr2[1];
        if (wa1Var.h) {
            i11 = org.telegram.ui.ActionBar.h6.f21191x6;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.f21043p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(wa1Var.f43326k);
        TextView textView3 = textViewArr2[2];
        if (wa1Var.f43327l) {
            i12 = org.telegram.ui.ActionBar.h6.f21191x6;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.f21043p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(wa1Var.f43330o);
        TextView textView4 = textViewArr2[3];
        if (wa1Var.f43331p) {
            i13 = org.telegram.ui.ActionBar.h6.f21191x6;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.f21043p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f42501c;
        textViewArr3[0].setText(wa1Var.f43318a);
        textViewArr3[1].setText(wa1Var.f43321e);
        textViewArr3[2].setText(wa1Var.f43324i);
        textViewArr3[3].setText(wa1Var.f43328m);
        b();
    }
}
