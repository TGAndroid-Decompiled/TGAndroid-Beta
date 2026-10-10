package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class rh1 extends org.telegram.ui.Components.g71 {
    public ph1 d;
    public long f41474e;
    public nh1 f41475f;
    public String h;
    public org.telegram.ui.ActionBar.v0 f41476n;
    public boolean f41477r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.d71 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rh1.U(java.util.ArrayList, org.telegram.ui.Components.d71):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.q61 q61Var, View view) {
        nh1 nh1Var = this.f41475f;
        int i10 = q61Var.d;
        if (i10 == 1) {
            nh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f41477r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new md(org.telegram.ui.Cells.c1.f(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (q61Var.f17129a == 12) {
            finishFragment();
            nh1Var.run(getMessagesController().getChat(Long.valueOf(-q61Var.f30074x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.q61 q61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.o().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.e2(this, 19);
        this.f41476n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f41476n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f41476n.setVisibility(8);
        super.createView(context);
        this.f26629a.p1();
        this.actionBar.setAdaptiveBackground(this.f26629a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f41477r) {
            ph1 ph1Var = this.d;
            ph1Var.f40854c = false;
            ph1Var.f40856f.add(new qh1(this, 0));
            this.f41477r = false;
        }
    }
}
