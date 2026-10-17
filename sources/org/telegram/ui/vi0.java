package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vi0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f42219a;
    public final TextView[] f42220b;
    public final wi0 f42221c;

    public vi0(wi0 wi0Var, Context context) {
        super(context);
        float f7;
        this.f42221c = wi0Var;
        this.f42219a = new TextView[4];
        this.f42220b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout e = org.telegram.messenger.wh.e(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout e7 = org.telegram.messenger.wh.e(context, 1);
                LinearLayout e10 = org.telegram.messenger.wh.e(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f42219a[i12] = new TextView(context);
                this.f42220b[i12] = new TextView(context);
                this.f42219a[i12].setTypeface(AndroidUtilities.bold());
                this.f42219a[i12].setTextSize(1, 17.0f);
                this.f42220b[i12].setTextSize(1, 13.0f);
                this.f42220b[i12].setGravity(3);
                e10.addView(this.f42219a[i12]);
                e7.addView(e10);
                e7.addView(this.f42220b[i12]);
                e.addView(e7, w7.z5.l(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f7 = 16.0f;
            } else {
                f7 = 0.0f;
            }
            addView(e, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, f7, -1, 0));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f42219a[i10];
            int i11 = org.telegram.ui.ActionBar.h6.G6;
            wi0 wi0Var = this.f42221c;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, wi0Var.getResourceProvider()));
            this.f42220b[i10].setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21391z6, wi0Var.getResourceProvider()));
        }
    }
}
