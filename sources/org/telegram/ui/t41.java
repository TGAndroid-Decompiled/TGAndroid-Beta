package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t41 extends org.telegram.ui.ActionBar.m2 {
    public static final int[] f40290c = {750000, 1000000, 1200000, 2000000};
    public org.telegram.ui.Components.mm0 f40291a;
    public s41 f40292b;

    public static String U(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        } else if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        } else {
            return (i10 / 1000) + " kbps";
        }
    }

    public final void V(int i10, CharSequence[] charSequenceArr, ul0 ul0Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f19548a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new mg.j(11, this, ul0Var));
        showDialog(alertDialog$Builder.f19548a);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 29));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f40291a = mm0Var;
        mm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f40291a);
        this.f40291a.setLayoutManager(new s4.b0());
        this.f40291a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f40291a;
        s41 s41Var = new s41(context);
        this.f40292b = s41Var;
        mm0Var2.setAdapter(s41Var);
        this.f40291a.setOnItemClickListener(new i21(this, 4));
        frameLayout.addView(this.f40291a, w7.a6.d(-1.0f, -1));
        return this.fragmentView;
    }
}
