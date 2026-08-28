package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class re0 extends org.telegram.ui.Components.cv0 {
    public final fg0 A;
    public final org.telegram.ui.Components.pi0 f42382a;
    public final TextView f42383b;
    public final TextView f42384c;
    public final TextView d;
    public final TextView f42385e;
    public final TextView f42386f;
    public v5 h;
    public Bundle f42387n;
    public String f42388r;
    public String f42389s;
    public String v;
    public int f42390w;
    public int f42391x;
    public Boolean f42392y;

    public re0(fg0 fg0Var, Context context) {
        super(context);
        int i9;
        this.A = fg0Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        ?? imageView = new ImageView(context);
        this.f42382a = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(R.raw.sandclock, 120, 120, null);
        frameLayout.addView((View) imageView, g7.e6.e(120, 120, 1));
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y && !AndroidUtilities.isTablet()) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        frameLayout.setVisibility(i9);
        linearLayout.addView(frameLayout, g7.e6.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.f42383b = textView;
        j3.r0.u(18.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ResetAccount));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, g7.e6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f42384c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView2, g7.e6.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, g7.e6.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f42386f = textView3;
        textView3.setGravity(1);
        textView3.setText(LocaleController.getString("ResetAccountStatus", R.string.ResetAccountStatus));
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView3, g7.e6.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.f42385e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView4, g7.e6.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(LocaleController.getString(R.string.ResetAccount));
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView5.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, g7.e6.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new q50(this, 7));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.A.k1(true, true);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.h = null;
        this.f42387n = null;
        return true;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("ResetAccount", R.string.ResetAccount);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.f42387n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.f42387n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f42387n = bundle;
        this.f42388r = bundle.getString("phoneFormated");
        this.f42389s = bundle.getString("phoneHash");
        this.v = bundle.getString("code");
        this.f42390w = bundle.getInt("startTime");
        this.f42391x = bundle.getInt("waitTime");
        int i9 = R.string.ResetAccountInfo;
        ne.b c10 = ne.b.c();
        this.f42384c.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ResetAccountInfo", i9, LocaleController.addNbsp(c10.b("+" + this.f42388r)))));
        o();
        v5 v5Var = new v5(this, 9);
        this.h = v5Var;
        AndroidUtilities.runOnUIThread(v5Var, 1000L);
    }

    @Override
    public final void n() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        this.f42383b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.f42384c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.f42386f.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.f42385e.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        int dp = AndroidUtilities.dp(6.0f);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Wh, false);
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Q9, false);
        this.d.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, w02, w03, w03));
    }

    public final void o() {
        int i9;
        boolean z10;
        int i10;
        int i11;
        int i12 = this.f42391x;
        i9 = ((org.telegram.ui.ActionBar.o2) this.A).currentAccount;
        int currentTime = i12 - (ConnectionsManager.getInstance(i9).getCurrentTime() - this.f42390w);
        int i13 = 0;
        int max = Math.max(0, currentTime);
        int i14 = max / 86400;
        int round = Math.round(max / 86400.0f);
        int i15 = max / 3600;
        int i16 = (max / 60) % 60;
        int i17 = max % 60;
        TextView textView = this.f42385e;
        if (i14 >= 2) {
            textView.setText(LocaleController.formatPluralString("Days", round, new Object[0]));
        } else {
            textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)));
        }
        if (max == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f42392y;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        org.telegram.ui.Components.pi0 pi0Var = this.f42382a;
        if (!z10) {
            pi0Var.setAutoRepeat(true);
            if (!pi0Var.b()) {
                pi0Var.d();
            }
        } else {
            pi0Var.getAnimatedDrawable().I(0);
        }
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        if (z10) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        this.f42386f.setVisibility(i11);
        if (!z10) {
            i13 = 4;
        }
        this.d.setVisibility(i13);
        this.f42392y = Boolean.valueOf(z10);
    }
}
