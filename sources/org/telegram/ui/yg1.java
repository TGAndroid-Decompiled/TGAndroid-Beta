package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class yg1 extends org.telegram.ui.Components.c61 {
    public wg1 d;
    public long f43631e;
    public ug1 f43632f;
    public String h;
    public org.telegram.ui.ActionBar.w0 f43633n;
    public boolean f43634r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.x51 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yg1.U(java.util.ArrayList, org.telegram.ui.Components.x51):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.j51 j51Var, View view) {
        ug1 ug1Var = this.f43632f;
        int i10 = j51Var.d;
        if (i10 == 1) {
            ug1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f43634r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new nd(android.support.v4.media.a.h(0, "step")));
                return;
            }
            presentFragment(new i(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (j51Var.f2505a == 12) {
            finishFragment();
            ug1Var.run(getMessagesController().getChat(Long.valueOf(-j51Var.f28025x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.j51 j51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.E = new fb(this, 18);
        this.f43633n = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f43633n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f43633n.setVisibility(8);
        super.createView(context);
        this.f25815a.p1();
        this.actionBar.setAdaptiveBackground(this.f25815a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f43634r) {
            wg1 wg1Var = this.d;
            wg1Var.f42811c = false;
            wg1Var.f42813f.add(new xg1(this, 0));
            this.f43634r = false;
        }
    }
}
