package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sl0 implements org.telegram.ui.ActionBar.c2, zt, tm0 {
    public final int f38264a;
    public final fn0 f38265b;

    public sl0(fn0 fn0Var, int i10) {
        this.f38264a = i10;
        this.f38265b = fn0Var;
    }

    @Override
    public void D(String str, String str2) {
        this.f38265b.x1();
    }

    @Override
    public void Y0(ut utVar) {
        String str;
        switch (this.f38264a) {
            case 2:
                fn0 fn0Var = this.f38265b;
                fn0Var.V[5].setText(utVar.f38913a);
                fn0Var.f34150s = utVar.d;
                return;
            default:
                fn0 fn0Var2 = this.f38265b;
                fn0Var2.V[0].setText(utVar.f38913a);
                if (fn0Var2.R0.indexOf(utVar.f38913a) != -1) {
                    fn0Var2.W0 = true;
                    String str2 = (String) fn0Var2.S0.get(utVar.f38913a);
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
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38264a) {
            case 0:
                fn0 fn0Var = this.f38265b;
                fn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    fn0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f38265b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                fn0.a0(this.f38265b);
                return;
            case 4:
                fn0.d0(this.f38265b);
                return;
        }
    }
}
