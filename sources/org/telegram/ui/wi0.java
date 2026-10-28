package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class wi0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f45014a;
    public final TextView[] f45015b;
    public final xi0 f45016c;

    public wi0(xi0 xi0Var, Context context) {
        super(context);
        float f7;
        this.f45016c = xi0Var;
        this.f45014a = new TextView[4];
        this.f45015b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout d10 = org.telegram.messenger.wh.d(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout d11 = org.telegram.messenger.wh.d(context, 1);
                LinearLayout d12 = org.telegram.messenger.wh.d(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f45014a[i12] = new TextView(context);
                this.f45015b[i12] = new TextView(context);
                this.f45014a[i12].setTypeface(AndroidUtilities.bold());
                this.f45014a[i12].setTextSize(1, 17.0f);
                this.f45015b[i12].setTextSize(1, 13.0f);
                this.f45015b[i12].setGravity(3);
                d12.addView(this.f45014a[i12]);
                d11.addView(d12);
                d11.addView(this.f45015b[i12]);
                d10.addView(d11, org.telegram.ui.Components.kb1.p(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f7 = 16.0f;
            } else {
                f7 = 0.0f;
            }
            addView(d10, org.telegram.ui.Components.kb1.h(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f7));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f45014a[i10];
            int i11 = org.telegram.ui.ActionBar.y6.G6;
            xi0 xi0Var = this.f45016c;
            textView.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, xi0Var.getResourceProvider()));
            this.f45015b[i10].setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23768z6, xi0Var.getResourceProvider()));
        }
    }
}
