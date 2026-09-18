package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ur extends org.telegram.ui.Components.o61 {
    public final nh1 e;
    public final long f38090f;
    public final lh1 h;
    public String f38091n;
    public org.telegram.ui.ActionBar.v0 f38092r;
    public boolean f38093s = false;

    public ur(nh1 nh1Var, long j3, lh1 lh1Var) {
        this.e = nh1Var;
        this.f38090f = j3;
        this.h = lh1Var;
        tr trVar = new tr(this, 0);
        if (nh1Var.f35947c) {
            trVar.run();
        } else {
            nh1Var.f35948f.add(trVar);
        }
    }

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.l61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ur.U(java.util.ArrayList, org.telegram.ui.Components.l61):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.x51 x51Var, View view) {
        int i10 = x51Var.d;
        lh1 lh1Var = this.h;
        if (i10 == 1) {
            lh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f38093s = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new md(org.telegram.ui.Cells.c1.f(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (x51Var.f15672a == 12) {
            finishFragment();
            lh1Var.run(getMessagesController().getChat(Long.valueOf(-x51Var.f30259x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.x51 x51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.d2(this, 4);
        this.f38092r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f38092r.setContentDescription(LocaleController.getString(R.string.Search));
        this.f38092r.setVisibility(8);
        super.createView(context);
        this.f26891a.q1();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.wl0 getListViewForSimpleGlass() {
        return this.f26891a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f38093s) {
            nh1 nh1Var = this.e;
            nh1Var.f35947c = false;
            nh1Var.f35948f.add(new tr(this, 1));
            this.f38093s = false;
        }
    }
}
