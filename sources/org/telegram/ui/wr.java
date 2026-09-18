package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class wr extends org.telegram.ui.Components.a61 {
    public final ph1 e;
    public final long f39162f;
    public final nh1 h;
    public String f39163n;
    public org.telegram.ui.ActionBar.w0 f39164r;
    public boolean f39165s = false;

    public wr(ph1 ph1Var, long j3, nh1 nh1Var) {
        this.e = ph1Var;
        this.f39162f = j3;
        this.h = nh1Var;
        vr vrVar = new vr(this, 0);
        if (ph1Var.f36640c) {
            vrVar.run();
        } else {
            ph1Var.f36641f.add(vrVar);
        }
    }

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.x51 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wr.U(java.util.ArrayList, org.telegram.ui.Components.x51):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.j51 j51Var, View view) {
        int i10 = j51Var.d;
        nh1 nh1Var = this.h;
        if (i10 == 1) {
            nh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f39165s = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new nd(org.telegram.ui.Cells.p6.e(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (j51Var.f15543a == 12) {
            finishFragment();
            nh1Var.run(getMessagesController().getChat(Long.valueOf(-j51Var.f25138x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.j51 j51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.d2(this, 4);
        this.f39164r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f39164r.setContentDescription(LocaleController.getString(R.string.Search));
        this.f39164r.setVisibility(8);
        super.createView(context);
        this.f22336a.q1();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ml0 getListViewForSimpleGlass() {
        return this.f22336a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f39165s) {
            ph1 ph1Var = this.e;
            ph1Var.f36640c = false;
            ph1Var.f36641f.add(new vr(this, 1));
            this.f39165s = false;
        }
    }
}
