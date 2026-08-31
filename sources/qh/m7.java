package qh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class m7 extends LinearLayout {
    public final TextView f45679a;
    public final TextView f45680b;

    public m7(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f45679a = textView;
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.k6.f21766j5, g6Var, textView, 1, 20.0f);
        if (z4) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, k7.c6.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f45680b = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f21893q5, g6Var, textView2, 1, 14.0f);
        if (z4) {
            addView(textView2, k7.c6.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
