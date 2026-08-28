package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class si0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f42706a;
    public final TextView[] f42707b;
    public final ti0 f42708c;

    public si0(ti0 ti0Var, Context context) {
        super(context);
        float f10;
        this.f42708c = ti0Var;
        this.f42706a = new TextView[4];
        this.f42707b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i9 = 0; i9 < 2; i9++) {
            LinearLayout f11 = org.telegram.messenger.ll.f(context, 0);
            for (int i10 = 0; i10 < 2; i10++) {
                LinearLayout f12 = org.telegram.messenger.ll.f(context, 1);
                LinearLayout f13 = org.telegram.messenger.ll.f(context, 0);
                int i11 = (i9 * 2) + i10;
                this.f42706a[i11] = new TextView(context);
                this.f42707b[i11] = new TextView(context);
                this.f42706a[i11].setTypeface(AndroidUtilities.bold());
                this.f42706a[i11].setTextSize(1, 17.0f);
                this.f42707b[i11].setTextSize(1, 13.0f);
                this.f42707b[i11].setGravity(3);
                f13.addView(this.f42706a[i11]);
                f12.addView(f13);
                f12.addView(this.f42707b[i11]);
                f11.addView(f12, g7.e6.l(1.0f, -1, -2));
            }
            if (i9 == 0) {
                f10 = 16.0f;
            } else {
                f10 = 0.0f;
            }
            addView(f11, g7.e6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f10));
        }
    }

    public final void a() {
        for (int i9 = 0; i9 < 4; i9++) {
            TextView textView = this.f42706a[i9];
            int i10 = org.telegram.ui.ActionBar.f6.G6;
            ti0 ti0Var = this.f42708c;
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, ti0Var.getResourceProvider()));
            this.f42707b[i9].setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, ti0Var.getResourceProvider()));
        }
    }
}
