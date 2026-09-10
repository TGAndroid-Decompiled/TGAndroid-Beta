package wh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.k6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.r61;
import w7.a6;
import w7.e6;
import xh.n5;
import xh.v5;
public final class p2 extends org.telegram.ui.ActionBar.h3 {
    public long f44307b;

    public p2(Context context, long j3, TL_stars.SavedStarGift savedStarGift, f6 f6Var, Utilities.Callback0Return callback0Return) {
        super(1, context, f6Var, false);
        this.f44307b = 0L;
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = e6.b(context, 20.0f, j6.G6, true, f6Var);
        b10.setText(LocaleController.getString(R.string.Gift2UnpinAlertTitle));
        linearLayout.addView(b10, a6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = e6.b(context, 14.0f, j6.f18306y6, false, f6Var);
        b11.setText(LocaleController.getString(R.string.Gift2UnpinAlertSubtitle));
        linearLayout.addView(b11, a6.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        bi.d dVar = new bi.d(context, f6Var, true);
        n5 G = v5.y(this.currentAccount, false).G(j3, true);
        r61 r61Var = new r61(context, this.currentAccount, 0, false, new k6(20, this, G), new sg.f0(7, this, dVar), null, f6Var);
        r61Var.setSpanCount(3);
        r61Var.setOverScrollMode(2);
        r61Var.setScrollEnabled(false);
        linearLayout.addView(r61Var, a6.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.g(LocaleController.getString(R.string.Gift2UnpinAlertButton), false, true);
        linearLayout.addView(dVar, a6.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new di.o(this, G, savedStarGift, callback0Return, 15));
        setCustomView(linearLayout);
    }
}
