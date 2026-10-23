package yh;

import ai.ha;
import ai.y9;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Wallet.e8;
import w7.d6;
import w7.z5;
public final class o2 extends org.telegram.ui.ActionBar.h3 {
    public long f50913b;

    public o2(Context context, long j10, TL_stars.SavedStarGift savedStarGift, g6 g6Var, Utilities.Callback0Return callback0Return) {
        super(1, context, g6Var, false);
        this.f50913b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = d6.b(context, 20.0f, k6.G6, true, g6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, z5.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = d6.b(context, 14.0f, k6.f21571y6, false, g6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, z5.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        ei.d dVar = new ei.d(context, g6Var, true);
        y9 G = ha.y(this.currentAccount, false).G(j10, true);
        j71 j71Var = new j71(context, this.currentAccount, 0, false, new org.telegram.ui.Wallet.r1(7, this, G), new e8(26, this, dVar), null, g6Var);
        j71Var.setSpanCount(3);
        j71Var.setOverScrollMode(2);
        j71Var.setScrollEnabled(false);
        linearLayout.addView(j71Var, z5.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, z5.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new ci.b4(this, G, savedStarGift, callback0Return, 16));
        setCustomView(linearLayout);
    }
}
