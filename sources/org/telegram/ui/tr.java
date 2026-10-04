package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class tr extends org.telegram.ui.Components.x61 {
    public final ih1 f40950e;
    public final long f40951f;
    public final gh1 h;
    public String f40952n;
    public org.telegram.ui.ActionBar.v0 f40953r;
    public boolean f40954s = false;

    public tr(ih1 ih1Var, long j3, gh1 gh1Var) {
        this.f40950e = ih1Var;
        this.f40951f = j3;
        this.h = gh1Var;
        sr srVar = new sr(this, 0);
        if (ih1Var.f37444c) {
            srVar.run();
        } else {
            ih1Var.f37446f.add(srVar);
        }
    }

    @Override
    public final void S(java.util.ArrayList r18, org.telegram.ui.Components.u61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tr.S(java.util.ArrayList, org.telegram.ui.Components.u61):void");
    }

    @Override
    public final CharSequence T() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void U(org.telegram.ui.Components.g61 g61Var, View view) {
        int i10 = g61Var.d;
        gh1 gh1Var = this.h;
        if (i10 == 1) {
            gh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f40954s = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new nd(org.telegram.ui.Cells.c1.h(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (g61Var.f17187a == 12) {
            finishFragment();
            gh1Var.run(getMessagesController().getChat(Long.valueOf(-g61Var.f26685x)));
        }
    }

    @Override
    public final boolean W(org.telegram.ui.Components.g61 g61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.d2(this, 4);
        this.f40953r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f40953r.setContentDescription(LocaleController.getString(R.string.Search));
        this.f40953r.setVisibility(8);
        super.createView(context);
        this.f32731a.s1();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f32731a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f40954s) {
            ih1 ih1Var = this.f40950e;
            ih1Var.f37444c = false;
            ih1Var.f37446f.add(new sr(this, 1));
            this.f40954s = false;
        }
    }
}
