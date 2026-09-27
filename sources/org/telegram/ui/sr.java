package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class sr extends org.telegram.ui.Components.o61 {
    public final gh1 e;
    public final long f37568f;
    public final eh1 h;
    public String f37569n;
    public org.telegram.ui.ActionBar.w0 f37570r;
    public boolean f37571s = false;

    public sr(gh1 gh1Var, long j3, eh1 eh1Var) {
        this.e = gh1Var;
        this.f37568f = j3;
        this.h = eh1Var;
        rr rrVar = new rr(this, 0);
        if (gh1Var.f33937c) {
            rrVar.run();
        } else {
            gh1Var.f33938f.add(rrVar);
        }
    }

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.l61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sr.U(java.util.ArrayList, org.telegram.ui.Components.l61):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.x51 x51Var, View view) {
        int i10 = x51Var.d;
        eh1 eh1Var = this.h;
        if (i10 == 1) {
            eh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f37571s = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new nd(org.telegram.ui.Cells.c1.g(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (x51Var.f15754a == 12) {
            finishFragment();
            eh1Var.run(getMessagesController().getChat(Long.valueOf(-x51Var.f30313x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.x51 x51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.o().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.d2(this, 4);
        this.f37570r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f37570r.setContentDescription(LocaleController.getString(R.string.Search));
        this.f37570r.setVisibility(8);
        super.createView(context);
        this.f27008a.q1();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.yl0 getListViewForSimpleGlass() {
        return this.f27008a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f37571s) {
            gh1 gh1Var = this.e;
            gh1Var.f33937c = false;
            gh1Var.f33938f.add(new rr(this, 1));
            this.f37571s = false;
        }
    }
}
