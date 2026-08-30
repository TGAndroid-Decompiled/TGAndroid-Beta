package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class x11 implements org.telegram.ui.ActionBar.c2, r0.o {
    public final m21 f39831a;

    public x11(m21 m21Var) {
        this.f39831a = m21Var;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        m21 m21Var = this.f39831a;
        m21Var.N = defaultWindowInsets;
        m21Var.fragmentView.requestLayout();
        return r0.m1.f43129b;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        m21 m21Var = this.f39831a;
        m21Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            m21Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
