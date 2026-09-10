package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class v21 implements org.telegram.ui.ActionBar.c2, r0.n {
    public final k31 f37399a;

    public v21(k31 k31Var) {
        this.f37399a = k31Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        k31 k31Var = this.f37399a;
        k31Var.Q = defaultWindowInsets;
        k31Var.fragmentView.requestLayout();
        return r0.l1.f41073b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        k31 k31Var = this.f37399a;
        k31Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            k31Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
