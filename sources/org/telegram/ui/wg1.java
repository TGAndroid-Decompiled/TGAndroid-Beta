package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class wg1 extends org.telegram.ui.Components.b61 {
    public ug1 d;
    public long e;
    public sg1 f39737f;
    public String h;
    public org.telegram.ui.ActionBar.w0 f39738n;
    public boolean f39739r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.w51 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wg1.U(java.util.ArrayList, org.telegram.ui.Components.w51):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.i51 i51Var, View view) {
        sg1 sg1Var = this.f39737f;
        int i10 = i51Var.d;
        if (i10 == 1) {
            sg1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f39739r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new nd(android.support.v4.media.a.h(0, "step")));
                return;
            }
            presentFragment(new i(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (i51Var.f1808a == 12) {
            finishFragment();
            sg1Var.run(getMessagesController().getChat(Long.valueOf(-i51Var.f25576x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.i51 i51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.E = new fb(this, 18);
        this.f39738n = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f39738n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f39738n.setVisibility(8);
        super.createView(context);
        this.f23580a.p1();
        this.actionBar.setAdaptiveBackground(this.f23580a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f39739r) {
            ug1 ug1Var = this.d;
            ug1Var.f38938c = false;
            ug1Var.f38939f.add(new vg1(this, 0));
            this.f39739r = false;
        }
    }
}
