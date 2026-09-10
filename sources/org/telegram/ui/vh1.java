package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class vh1 extends org.telegram.ui.Components.m61 {
    public th1 d;
    public long e;
    public rh1 f37561f;
    public String h;
    public org.telegram.ui.ActionBar.w0 f37562n;
    public boolean f37563r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.j61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vh1.U(java.util.ArrayList, org.telegram.ui.Components.j61):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.v51 v51Var, View view) {
        rh1 rh1Var = this.f37561f;
        int i10 = v51Var.d;
        if (i10 == 1) {
            rh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f37563r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new nd(org.telegram.ui.Cells.r6.e(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (v51Var.f14046a == 12) {
            finishFragment();
            rh1Var.run(getMessagesController().getChat(Long.valueOf(-v51Var.f27840x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.v51 v51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new gg.m2(this, 19);
        this.f37562n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f37562n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f37562n.setVisibility(8);
        super.createView(context);
        this.f25171a.o1();
        this.actionBar.setAdaptiveBackground(this.f25171a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f37563r) {
            th1 th1Var = this.d;
            th1Var.f36944c = false;
            th1Var.f36945f.add(new uh1(this, 0));
            this.f37563r = false;
        }
    }
}
