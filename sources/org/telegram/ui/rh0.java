package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class rh0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f41231a;
    public final TextView[] f41232b;
    public final sh0 f41233c;

    public rh0(sh0 sh0Var, Context context) {
        super(context);
        float f7;
        this.f41233c = sh0Var;
        this.f41231a = new TextView[4];
        this.f41232b = new TextView[4];
        setOrientation(1);
        setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout f10 = org.telegram.messenger.m5.f(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout f11 = org.telegram.messenger.m5.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.m5.f(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f41231a[i12] = new TextView(context);
                this.f41232b[i12] = new TextView(context);
                this.f41231a[i12].setTypeface(org.telegram.messenger.i0.o());
                this.f41231a[i12].setTextSize(1, 17.0f);
                this.f41232b[i12].setTextSize(1, 13.0f);
                this.f41232b[i12].setGravity(3);
                f12.addView(this.f41231a[i12]);
                f11.addView(f12);
                f11.addView(this.f41232b[i12]);
                f10.addView(f11, w7.b6.l(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f7 = 16.0f;
            } else {
                f7 = 0.0f;
            }
            addView(f10, w7.b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f7));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f41231a[i10];
            int i11 = org.telegram.ui.ActionBar.t6.G6;
            sh0 sh0Var = this.f41233c;
            textView.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, sh0Var.getResourceProvider()));
            this.f41232b[i10].setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21330z6, sh0Var.getResourceProvider()));
        }
    }
}
