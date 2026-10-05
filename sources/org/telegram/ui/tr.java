package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class tr extends org.telegram.ui.Components.z61 {
    public final gh1 f41006e;
    public final long f41007f;
    public final eh1 h;
    public String f41008n;
    public org.telegram.ui.ActionBar.v0 f41009r;
    public boolean f41010s = false;

    public tr(gh1 gh1Var, long j3, eh1 eh1Var) {
        this.f41006e = gh1Var;
        this.f41007f = j3;
        this.h = eh1Var;
        sr srVar = new sr(this, 0);
        if (gh1Var.f36677c) {
            srVar.run();
        } else {
            gh1Var.f36679f.add(srVar);
        }
    }

    @Override
    public final void S(java.util.ArrayList r18, org.telegram.ui.Components.w61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tr.S(java.util.ArrayList, org.telegram.ui.Components.w61):void");
    }

    @Override
    public final CharSequence T() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void U(org.telegram.ui.Components.h61 h61Var, View view) {
        int i10 = h61Var.d;
        eh1 eh1Var = this.h;
        if (i10 == 1) {
            eh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f41010s = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new nd(org.telegram.ui.Cells.c1.h(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (h61Var.f17192a == 12) {
            finishFragment();
            eh1Var.run(getMessagesController().getChat(Long.valueOf(-h61Var.f27104x)));
        }
    }

    @Override
    public final boolean W(org.telegram.ui.Components.h61 h61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.d2(this, 4);
        this.f41009r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f41009r.setContentDescription(LocaleController.getString(R.string.Search));
        this.f41009r.setVisibility(8);
        super.createView(context);
        this.f33438a.r1();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f33438a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f41010s) {
            gh1 gh1Var = this.f41006e;
            gh1Var.f36677c = false;
            gh1Var.f36679f.add(new sr(this, 1));
            this.f41010s = false;
        }
    }
}
