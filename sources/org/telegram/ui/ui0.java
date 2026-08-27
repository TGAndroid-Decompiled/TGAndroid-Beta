package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class ui0 extends LinearLayout {
    public static final int d = 0;

    public final TextView[] f43237a;

    public final TextView[] f43238b;

    public final vi0 f43239c;

    public ui0(vi0 vi0Var, Context context) {
        super(context);
        this.f43239c = vi0Var;
        this.f43237a = new TextView[4];
        this.f43238b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i10 = 0;
        while (i10 < 2) {
            LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout linearLayoutG2 = org.telegram.messenger.y1.g(context, 1);
                LinearLayout linearLayoutG3 = org.telegram.messenger.y1.g(context, 0);
                int i12 = (i10 * 2) + i11;
                this.f43237a[i12] = new TextView(context);
                this.f43238b[i12] = new TextView(context);
                this.f43237a[i12].setTypeface(AndroidUtilities.bold());
                this.f43237a[i12].setTextSize(1, 17.0f);
                this.f43238b[i12].setTextSize(1, 13.0f);
                this.f43238b[i12].setGravity(3);
                linearLayoutG3.addView(this.f43237a[i12]);
                linearLayoutG2.addView(linearLayoutG3);
                linearLayoutG2.addView(this.f43238b[i12]);
                linearLayoutG.addView(linearLayoutG2, h7.z5.l(1.0f, -1, -2));
            }
            addView(linearLayoutG, h7.z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, i10 == 0 ? 16.0f : 0.0f));
            i10++;
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.f43237a[i10];
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            vi0 vi0Var = this.f43239c;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, vi0Var.getResourceProvider()));
            this.f43238b[i10].setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, vi0Var.getResourceProvider()));
        }
    }
}
