package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class zi0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f40813a;
    public final TextView[] f40814b;
    public final aj0 f40815c;

    public zi0(aj0 aj0Var, Context context) {
        super(context);
        float f10;
        this.f40815c = aj0Var;
        this.f40813a = new TextView[4];
        this.f40814b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout f11 = org.telegram.messenger.y3.f(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout f12 = org.telegram.messenger.y3.f(context, 1);
                LinearLayout f13 = org.telegram.messenger.y3.f(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f40813a[i12] = new TextView(context);
                this.f40814b[i12] = new TextView(context);
                this.f40813a[i12].setTypeface(AndroidUtilities.bold());
                this.f40813a[i12].setTextSize(1, 17.0f);
                this.f40814b[i12].setTextSize(1, 13.0f);
                this.f40814b[i12].setGravity(3);
                f13.addView(this.f40813a[i12]);
                f12.addView(f13);
                f12.addView(this.f40814b[i12]);
                f11.addView(f12, k7.b6.l(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f10 = 16.0f;
            } else {
                f10 = 0.0f;
            }
            addView(f11, k7.b6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f10));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f40813a[i10];
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            aj0 aj0Var = this.f40815c;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, aj0Var.getResourceProvider()));
            this.f40814b[i10].setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20298z6, aj0Var.getResourceProvider()));
        }
    }
}
