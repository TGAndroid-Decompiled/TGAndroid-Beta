package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sl0 implements org.telegram.ui.ActionBar.c2, yt, tm0 {
    public final int f41323a;
    public final fn0 f41324b;

    public sl0(fn0 fn0Var, int i10) {
        this.f41323a = i10;
        this.f41324b = fn0Var;
    }

    @Override
    public void C(String str, String str2) {
        this.f41324b.x1();
    }

    @Override
    public void V0(tt ttVar) {
        String str;
        switch (this.f41323a) {
            case 2:
                fn0 fn0Var = this.f41324b;
                fn0Var.V[5].setText(ttVar.f41703a);
                fn0Var.f36958s = ttVar.d;
                return;
            default:
                fn0 fn0Var2 = this.f41324b;
                fn0Var2.V[0].setText(ttVar.f41703a);
                if (fn0Var2.R0.indexOf(ttVar.f41703a) != -1) {
                    fn0Var2.W0 = true;
                    String str2 = (String) fn0Var2.S0.get(ttVar.f41703a);
                    fn0Var2.V[1].setText(str2);
                    String str3 = (String) fn0Var2.U0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = fn0Var2.V[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    fn0Var2.W0 = false;
                }
                AndroidUtilities.runOnUIThread(new pl0(fn0Var2, 3), 300L);
                fn0Var2.V[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = fn0Var2.V[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f41323a) {
            case 0:
                fn0 fn0Var = this.f41324b;
                fn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    fn0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 1:
                this.f41324b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                fn0.a0(this.f41324b);
                return;
            case 4:
                fn0.d0(this.f41324b);
                return;
        }
    }
}
