package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class w21 implements org.telegram.ui.ActionBar.z1, r0.n {
    public final l31 f40849a;

    public w21(l31 l31Var) {
        this.f40849a = l31Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        l31 l31Var = this.f40849a;
        l31Var.Q = defaultWindowInsets;
        l31Var.fragmentView.requestLayout();
        return r0.l1.f43496b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        l31 l31Var = this.f40849a;
        l31Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            l31Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
