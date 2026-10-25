package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ui0 extends LinearLayout {
    public static final int d = 0;
    public final TextView[] f44145a;
    public final TextView[] f44146b;
    public final vi0 f44147c;

    public ui0(vi0 vi0Var, Context context) {
        super(context);
        float f7;
        this.f44147c = vi0Var;
        this.f44145a = new TextView[4];
        this.f44146b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            LinearLayout d10 = org.telegram.messenger.vh.d(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout d11 = org.telegram.messenger.vh.d(context, 1);
                LinearLayout d12 = org.telegram.messenger.vh.d(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f44145a[i12] = new TextView(context);
                this.f44146b[i12] = new TextView(context);
                this.f44145a[i12].setTypeface(AndroidUtilities.bold());
                this.f44145a[i12].setTextSize(1, 17.0f);
                this.f44146b[i12].setTextSize(1, 13.0f);
                this.f44146b[i12].setGravity(3);
                d12.addView(this.f44145a[i12]);
                d11.addView(d12);
                d11.addView(this.f44146b[i12]);
                d10.addView(d11, org.telegram.ui.Components.gb1.p(1.0f, -1, -2));
            }
            if (i10 == 0) {
                f7 = 16.0f;
            } else {
                f7 = 0.0f;
            }
            addView(d10, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, f7));
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f44145a[i10];
            int i11 = org.telegram.ui.ActionBar.y6.G6;
            vi0 vi0Var = this.f44147c;
            textView.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, vi0Var.getResourceProvider()));
            this.f44146b[i10].setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23765z6, vi0Var.getResourceProvider()));
        }
    }
}
