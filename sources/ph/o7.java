package ph;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class o7 extends LinearLayout {
    public final TextView f42064a;
    public final TextView f42065b;

    public o7(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f42064a = textView;
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.j6.f20012j5, f6Var, textView, 1, 20.0f);
        if (z4) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, k7.b6.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f42065b = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f20139q5, f6Var, textView2, 1, 14.0f);
        if (z4) {
            addView(textView2, k7.b6.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
