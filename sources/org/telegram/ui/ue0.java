package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

public final class ue0 extends org.telegram.ui.Components.ev0 {
    public final ig0 A;

    public final org.telegram.ui.Components.ri0 f43197a;

    public final TextView f43198b;

    public final TextView f43199c;
    public final TextView d;

    public final TextView f43200e;

    public final TextView f43201f;
    public w5 h;

    public Bundle f43202n;

    public String f43203r;

    public String f43204s;
    public String v;

    public int f43205w;

    public int f43206x;

    public Boolean f43207y;

    public ue0(ig0 ig0Var, Context context) {
        super(context);
        this.A = ig0Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.f43197a = ri0Var;
        ri0Var.setAutoRepeat(true);
        ri0Var.f(R.raw.sandclock, 120, 120, null);
        frameLayout.addView(ri0Var, h7.z5.e(120, 120, 1));
        Point point = AndroidUtilities.displaySize;
        frameLayout.setVisibility((point.x <= point.y || AndroidUtilities.isTablet()) ? 0 : 8);
        linearLayout.addView(frameLayout, h7.z5.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.f43198b = textView;
        org.telegram.ui.Cells.pa.m(18.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ResetAccount));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, h7.z5.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f43199c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView2, h7.z5.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, h7.z5.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f43201f = textView3;
        textView3.setGravity(1);
        textView3.setText(LocaleController.getString("ResetAccountStatus", R.string.ResetAccountStatus));
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView3, h7.z5.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.f43200e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView4, h7.z5.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(LocaleController.getString(R.string.ResetAccount));
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView5.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, h7.z5.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new u50(this, 7));
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
        this.f43202n = null;
        return true;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("ResetAccount", R.string.ResetAccount);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.f43202n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.f43202n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f43202n = bundle;
        this.f43203r = bundle.getString("phoneFormated");
        this.f43204s = bundle.getString("phoneHash");
        this.v = bundle.getString("code");
        this.f43205w = bundle.getInt("startTime");
        this.f43206x = bundle.getInt("waitTime");
        this.f43199c.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ResetAccountInfo", R.string.ResetAccountInfo, LocaleController.addNbsp(oe.b.c().b("+" + this.f43203r)))));
        o();
        w5 w5Var = new w5(this, 9);
        this.h = w5Var;
        AndroidUtilities.runOnUIThread(w5Var, 1000L);
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.f43198b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f43199c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f43201f.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f43200e.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int iDp = AndroidUtilities.dp(6.0f);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Wh, false);
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Q9, false);
        this.d.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iW0, iW1, iW1));
    }

    public final void o() {
        int iMax = Math.max(0, this.f43206x - (ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) this.A).currentAccount).getCurrentTime() - this.f43205w));
        int i10 = iMax / 86400;
        int iRound = Math.round(iMax / 86400.0f);
        int i11 = iMax / 3600;
        int i12 = (iMax / 60) % 60;
        int i13 = iMax % 60;
        TextView textView = this.f43200e;
        if (i10 >= 2) {
            textView.setText(LocaleController.formatPluralString("Days", iRound, new Object[0]));
        } else {
            textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        boolean z10 = iMax == 0;
        Boolean bool = this.f43207y;
        if (bool == null || bool.booleanValue() != z10) {
            org.telegram.ui.Components.ri0 ri0Var = this.f43197a;
            if (z10) {
                ri0Var.getAnimatedDrawable().I(0);
            } else {
                ri0Var.setAutoRepeat(true);
                if (!ri0Var.b()) {
                    ri0Var.d();
                }
            }
            textView.setVisibility(z10 ? 4 : 0);
            this.f43201f.setVisibility(z10 ? 4 : 0);
            this.d.setVisibility(z10 ? 0 : 4);
            this.f43207y = Boolean.valueOf(z10);
        }
    }
}
