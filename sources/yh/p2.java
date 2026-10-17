package yh;

import ai.fa;
import ai.x9;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import w7.z5;
public final class p2 extends org.telegram.ui.ActionBar.f3 {
    public long f50481b;

    public p2(Context context, long j10, TL_stars.SavedStarGift savedStarGift, d6 d6Var, Utilities.Callback0Return callback0Return) {
        super(1, context, d6Var, false);
        this.f50481b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = w7.d6.b(context, 20.0f, h6.G6, true, d6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, z5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = w7.d6.b(context, 14.0f, h6.f21374y6, false, d6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, z5.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        ei.d dVar = new ei.d(context, d6Var, true);
        x9 G = fa.y(this.currentAccount, false).G(j10, true);
        a71 a71Var = new a71(context, this.currentAccount, 0, false, new org.telegram.ui.Wallet.s1(7, this, G), new org.telegram.ui.web.c0(23, this, dVar), null, d6Var);
        a71Var.setSpanCount(3);
        a71Var.setOverScrollMode(2);
        a71Var.setScrollEnabled(false);
        linearLayout.addView(a71Var, z5.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, z5.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new ci.c4(this, G, savedStarGift, callback0Return, 16));
        setCustomView(linearLayout);
    }
}
