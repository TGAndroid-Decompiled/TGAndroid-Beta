package zh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ca;
import bi.t9;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.r71;
public final class q2 extends org.telegram.ui.ActionBar.k3 {
    public long f53223b;

    public q2(Context context, long j10, TL_stars.SavedStarGift savedStarGift, u6 u6Var, Utilities.Callback0Return callback0Return) {
        super(1, context, u6Var, false);
        this.f53223b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView L = gb1.L(context, 20.0f, y6.G6, true, u6Var);
        L.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(L, gb1.o(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView L2 = gb1.L(context, 14.0f, y6.f23748y6, false, u6Var);
        L2.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(L2, gb1.o(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        fi.d dVar = new fi.d(context, u6Var, true);
        t9 G = ca.y(this.currentAccount, false).G(j10, true);
        r71 r71Var = new r71(context, this.currentAccount, 0, false, new org.telegram.ui.Wallet.r1(7, this, G), new o2(this, dVar), null, u6Var);
        r71Var.setSpanCount(3);
        r71Var.setOverScrollMode(2);
        r71Var.setScrollEnabled(false);
        linearLayout.addView(r71Var, gb1.o(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, gb1.o(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new di.c4(this, G, savedStarGift, callback0Return, 16));
        setCustomView(linearLayout);
    }
}
