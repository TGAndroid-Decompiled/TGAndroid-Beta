package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ur extends org.telegram.ui.Components.p61 {
    public final ph1 e;
    public final long f38220f;
    public final nh1 h;
    public String f38221n;
    public org.telegram.ui.ActionBar.v0 f38222r;
    public boolean f38223s = false;

    public ur(ph1 ph1Var, long j3, nh1 nh1Var) {
        this.e = ph1Var;
        this.f38220f = j3;
        this.h = nh1Var;
        tr trVar = new tr(this, 0);
        if (ph1Var.f36599c) {
            trVar.run();
        } else {
            ph1Var.f36600f.add(trVar);
        }
    }

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.m61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ur.U(java.util.ArrayList, org.telegram.ui.Components.m61):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.y51 y51Var, View view) {
        int i10 = y51Var.d;
        nh1 nh1Var = this.h;
        if (i10 == 1) {
            nh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f38223s = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new md(org.telegram.ui.Cells.c1.g(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (y51Var.f15719a == 12) {
            finishFragment();
            nh1Var.run(getMessagesController().getChat(Long.valueOf(-y51Var.f30529x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.y51 y51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.d2(this, 4);
        this.f38222r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f38222r.setContentDescription(LocaleController.getString(R.string.Search));
        this.f38222r.setVisibility(8);
        super.createView(context);
        this.f27268a.q1();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.yl0 getListViewForSimpleGlass() {
        return this.f27268a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f38223s) {
            ph1 ph1Var = this.e;
            ph1Var.f36599c = false;
            ph1Var.f36600f.add(new tr(this, 1));
            this.f38223s = false;
        }
    }
}
