package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class xh1 extends org.telegram.ui.Components.c71 {
    public vh1 d;
    public long e;
    public th1 f41862f;
    public String h;
    public org.telegram.ui.ActionBar.u0 f41863n;
    public boolean f41864r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.z61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xh1.U(java.util.ArrayList, org.telegram.ui.Components.z61):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.l61 l61Var, View view) {
        th1 th1Var = this.f41862f;
        int i10 = l61Var.d;
        if (i10 == 1) {
            th1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f41864r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new sd(org.telegram.ui.Cells.d0.g(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (l61Var.f43203a == 12) {
            finishFragment();
            th1Var.run(getMessagesController().getChat(Long.valueOf(-l61Var.f26965x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.l61 l61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new ig.d2(this, 19);
        this.f41863n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f41863n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f41863n.setVisibility(8);
        super.createView(context);
        this.f23964a.p1();
        this.actionBar.setAdaptiveBackground(this.f23964a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f41864r) {
            vh1 vh1Var = this.d;
            vh1Var.f41013c = false;
            vh1Var.f41014f.add(new wh1(this, 0));
            this.f41864r = false;
        }
    }
}
