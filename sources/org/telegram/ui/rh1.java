package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class rh1 extends org.telegram.ui.Components.f71 {
    public ph1 d;
    public long f41428e;
    public nh1 f41429f;
    public String h;
    public org.telegram.ui.ActionBar.v0 f41430n;
    public boolean f41431r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.c71 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rh1.U(java.util.ArrayList, org.telegram.ui.Components.c71):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.p61 p61Var, View view) {
        nh1 nh1Var = this.f41429f;
        int i10 = p61Var.d;
        if (i10 == 1) {
            nh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f41431r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new md(org.telegram.ui.Cells.c1.f(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (p61Var.f17125a == 12) {
            finishFragment();
            nh1Var.run(getMessagesController().getChat(Long.valueOf(-p61Var.f29745x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.p61 p61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.o().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.e2(this, 19);
        this.f41430n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f41430n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f41430n.setVisibility(8);
        super.createView(context);
        this.f26290a.p1();
        this.actionBar.setAdaptiveBackground(this.f26290a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f41431r) {
            ph1 ph1Var = this.d;
            ph1Var.f40808c = false;
            ph1Var.f40810f.add(new qh1(this, 0));
            this.f41431r = false;
        }
    }
}
