package vh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class f6 extends LinearLayout {
    public final TextView f51178a;
    public final TextView f51179b;

    public f6(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f51178a = textView;
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.f21038j5, p6Var, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, w7.b6.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f51179b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21170q5, p6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, w7.b6.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
