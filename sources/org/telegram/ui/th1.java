package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class th1 extends org.telegram.ui.Components.k71 {
    public rh1 d;
    public long f42198e;
    public ph1 f42199f;
    public String h;
    public org.telegram.ui.ActionBar.u0 f42200n;
    public boolean f42201r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.h71 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.th1.U(java.util.ArrayList, org.telegram.ui.Components.h71):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.u61 u61Var, View view) {
        ph1 ph1Var = this.f42199f;
        int i10 = u61Var.d;
        if (i10 == 1) {
            ph1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f42201r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new qd(org.telegram.ui.Cells.c1.f(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (u61Var.f16877a == 12) {
            finishFragment();
            ph1Var.run(getMessagesController().getChat(Long.valueOf(-u61Var.f31082x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.u61 u61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.p().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.e2(this, 19);
        this.f42200n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f42200n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f42200n.setVisibility(8);
        super.createView(context);
        this.f27776a.p1();
        this.actionBar.setAdaptiveBackground(this.f27776a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f42201r) {
            rh1 rh1Var = this.d;
            rh1Var.f41657c = false;
            rh1Var.f41659f.add(new sh1(this, 0));
            this.f42201r = false;
        }
    }
}
