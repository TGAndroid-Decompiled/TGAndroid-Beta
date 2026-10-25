package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vl0 implements org.telegram.ui.ActionBar.b2, nt, wm0 {
    public final int f44857a;
    public final in0 f44858b;

    public vl0(in0 in0Var, int i10) {
        this.f44857a = i10;
        this.f44858b = in0Var;
    }

    @Override
    public void Y0(jt jtVar) {
        String str;
        switch (this.f44857a) {
            case 2:
                in0 in0Var = this.f44858b;
                in0Var.Y[5].setText(jtVar.f40740a);
                in0Var.f40309s = jtVar.d;
                return;
            default:
                in0 in0Var2 = this.f44858b;
                in0Var2.Y[0].setText(jtVar.f40740a);
                if (in0Var2.U0.indexOf(jtVar.f40740a) != -1) {
                    in0Var2.Z0 = true;
                    String str2 = (String) in0Var2.V0.get(jtVar.f40740a);
                    in0Var2.Y[1].setText(str2);
                    String str3 = (String) in0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = in0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    in0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new sl0(in0Var2, 3), 300L);
                in0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = in0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void d(String str, String str2) {
        this.f44858b.x1();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f44857a) {
            case 0:
                in0 in0Var = this.f44858b;
                in0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    in0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f44858b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                in0.b0(this.f44858b);
                return;
            case 4:
                in0.e0(this.f44858b);
                return;
        }
    }
}
