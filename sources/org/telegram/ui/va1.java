package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class va1 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f41528a;
    public final TextView[] f41529b;
    public final TextView[] f41530c;

    public va1(Context context, int i10) {
        super(context);
        int i11 = i10 * 2;
        this.f41528a = new TextView[i11];
        this.f41529b = new TextView[i11];
        this.f41530c = new TextView[i11];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        for (int i12 = 0; i12 < i10; i12++) {
            LinearLayout f7 = org.telegram.messenger.vl.f(context, 0);
            for (int i13 = 0; i13 < 2; i13++) {
                LinearLayout f10 = org.telegram.messenger.vl.f(context, 1);
                LinearLayout f11 = org.telegram.messenger.vl.f(context, 0);
                int i14 = (i12 * 2) + i13;
                this.f41528a[i14] = new TextView(context);
                this.f41529b[i14] = new TextView(context);
                this.f41530c[i14] = new TextView(context);
                this.f41528a[i14].setTypeface(AndroidUtilities.bold());
                this.f41528a[i14].setTextSize(1, 17.0f);
                this.f41530c[i14].setTextSize(1, 13.0f);
                this.f41530c[i14].setGravity(3);
                this.f41529b[i14].setTextSize(1, 13.0f);
                this.f41529b[i14].setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
                f11.addView(this.f41528a[i14]);
                f11.addView(this.f41529b[i14]);
                f10.addView(f11);
                f10.addView(this.f41530c[i14]);
                f7.addView(f10, w7.x5.l(1.0f, -1, -2));
            }
            addView(f7, w7.x5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i10, String str2, String str3) {
        this.f41528a[i10].setText(str);
        this.f41529b[i10].setText(str2);
        this.f41530c[i10].setText(str3);
        b();
    }

    public final void b() {
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.f41528a;
            if (i10 < textViewArr.length) {
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.j6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                this.f41530c[i10].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21089z6, false));
                TextView[] textViewArr2 = this.f41529b;
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

    public void setData(xa1 xa1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        TextView[] textViewArr = this.f41528a;
        textViewArr[0].setText(xa1Var.f42684b);
        textViewArr[1].setText(xa1Var.f42687f);
        textViewArr[2].setText(xa1Var.f42690j);
        textViewArr[3].setText(xa1Var.f42694n);
        TextView[] textViewArr2 = this.f41529b;
        textViewArr2[0].setText(xa1Var.f42685c);
        TextView textView = textViewArr2[0];
        if (xa1Var.d) {
            i10 = org.telegram.ui.ActionBar.j6.f21053x6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20908p7;
        }
        textView.setTag(Integer.valueOf(i10));
        textViewArr2[1].setText(xa1Var.f42688g);
        TextView textView2 = textViewArr2[1];
        if (xa1Var.h) {
            i11 = org.telegram.ui.ActionBar.j6.f21053x6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f20908p7;
        }
        textView2.setTag(Integer.valueOf(i11));
        textViewArr2[2].setText(xa1Var.f42691k);
        TextView textView3 = textViewArr2[2];
        if (xa1Var.f42692l) {
            i12 = org.telegram.ui.ActionBar.j6.f21053x6;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.f20908p7;
        }
        textView3.setTag(Integer.valueOf(i12));
        textViewArr2[3].setText(xa1Var.f42695o);
        TextView textView4 = textViewArr2[3];
        if (xa1Var.f42696p) {
            i13 = org.telegram.ui.ActionBar.j6.f21053x6;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.f20908p7;
        }
        textView4.setTag(Integer.valueOf(i13));
        TextView[] textViewArr3 = this.f41530c;
        textViewArr3[0].setText(xa1Var.f42683a);
        textViewArr3[1].setText(xa1Var.f42686e);
        textViewArr3[2].setText(xa1Var.f42689i);
        textViewArr3[3].setText(xa1Var.f42693m);
        b();
    }
}
