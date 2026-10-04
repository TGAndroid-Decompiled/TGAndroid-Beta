package xh;

import ai.o5;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import w7.z5;
import yh.k5;
import yh.t5;
public final class r2 extends org.telegram.ui.ActionBar.f3 {
    public long f50206b;

    public r2(Context context, long j3, TL_stars.SavedStarGift savedStarGift, d6 d6Var, Utilities.Callback0Return callback0Return) {
        super(1, context, d6Var, false);
        this.f50206b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = w7.d6.b(context, 20.0f, i6.G6, true, d6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, z5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = w7.d6.b(context, 14.0f, i6.f21204y6, false, d6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, z5.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        ci.d dVar = new ci.d(context, d6Var, true);
        k5 G = t5.y(this.currentAccount, false).G(j3, true);
        c71 c71Var = new c71(context, this.currentAccount, 0, false, new ai.m0(22, this, G), new rg.x(15, this, dVar), null, d6Var);
        c71Var.setSpanCount(3);
        c71Var.setOverScrollMode(2);
        c71Var.setScrollEnabled(false);
        linearLayout.addView(c71Var, z5.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, z5.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new o5(this, G, savedStarGift, callback0Return, 16));
        setCustomView(linearLayout);
    }
}
