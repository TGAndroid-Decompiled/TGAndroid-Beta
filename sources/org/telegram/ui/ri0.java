package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ri0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f42120a;
    public final TextView[] f42121b;
    public final si0 f42122c;

    public ri0(si0 si0Var, Context context) {
        super(context);
        float f9;
        this.f42122c = si0Var;
        this.f42120a = new TextView[4];
        this.f42121b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout g11 = org.telegram.messenger.x3.g(context, 1);
                LinearLayout g12 = org.telegram.messenger.x3.g(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f42120a[i12] = new TextView(context);
                this.f42121b[i12] = new TextView(context);
                this.f42120a[i12].setTypeface(AndroidUtilities.bold());
                this.f42120a[i12].setTextSize(1, 17.0f);
                this.f42121b[i12].setTextSize(1, 13.0f);
                this.f42121b[i12].setGravity(3);
                g12.addView(this.f42120a[i12]);
                g11.addView(g12);
                g11.addView(this.f42121b[i12]);
                g10.addView(g11, i7.f6.l(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f9 = 16.0f;
            } else {
                f9 = 0.0f;
            }
            addView(g10, i7.f6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f9));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f42120a[i10];
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            si0 si0Var = this.f42122c;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, si0Var.getResourceProvider()));
            this.f42121b[i10].setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, si0Var.getResourceProvider()));
        }
    }
}
