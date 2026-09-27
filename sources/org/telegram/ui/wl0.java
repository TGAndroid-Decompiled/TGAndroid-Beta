package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wl0 implements org.telegram.ui.ActionBar.b2, xt, xm0 {
    public final int f39372a;
    public final jn0 f39373b;

    public wl0(jn0 jn0Var, int i10) {
        this.f39372a = i10;
        this.f39373b = jn0Var;
    }

    @Override
    public void a1(tt ttVar) {
        String str;
        switch (this.f39372a) {
            case 2:
                jn0 jn0Var = this.f39373b;
                jn0Var.Y[5].setText(ttVar.f37908a);
                jn0Var.f34807s = ttVar.d;
                return;
            default:
                jn0 jn0Var2 = this.f39373b;
                jn0Var2.Y[0].setText(ttVar.f37908a);
                if (jn0Var2.U0.indexOf(ttVar.f37908a) != -1) {
                    jn0Var2.Z0 = true;
                    String str2 = (String) jn0Var2.V0.get(ttVar.f37908a);
                    jn0Var2.Y[1].setText(str2);
                    String str3 = (String) jn0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = jn0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    jn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new tl0(jn0Var2, 3), 300L);
                jn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = jn0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void c(String str, String str2) {
        this.f39373b.x1();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f39372a) {
            case 0:
                jn0 jn0Var = this.f39373b;
                jn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    jn0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f39373b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                jn0.a0(this.f39373b);
                return;
            case 4:
                jn0.d0(this.f39373b);
                return;
        }
    }
}
