package qh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ij0;
public final class j3 extends FrameLayout {
    public static final int d = 0;
    public final org.telegram.ui.Components.p9 f45457a;
    public final d f45458b;
    public boolean f45459c;

    public j3(Context context) {
        super(context);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        addView(f10, k7.c6.e(-2, -2, 17));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f45457a = p9Var;
        f10.addView(p9Var, k7.c6.q(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.LiveStoryDisconnected));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f10.addView(textView, k7.c6.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.f45458b = dVar;
        dVar.g(LocaleController.getString(R.string.LiveStoryDisconnectedContinue), false, true);
        f10.addView(dVar, k7.c6.t((int) ((dVar.d.e() + AndroidUtilities.dp(24.0f)) / AndroidUtilities.density), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new eg.m(24));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f45459c) {
            this.f45457a.setImageDrawable(new ij0(R.raw.utyan_empty2, AndroidUtilities.dp(130.0f), "utyan_empty2", AndroidUtilities.dp(130.0f)));
            this.f45459c = true;
        }
    }
}
