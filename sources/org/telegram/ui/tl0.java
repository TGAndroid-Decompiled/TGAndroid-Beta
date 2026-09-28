package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tl0 implements org.telegram.ui.ActionBar.z1, vt, um0 {
    public final int f38149a;
    public final gn0 f38150b;

    public tl0(gn0 gn0Var, int i10) {
        this.f38149a = i10;
        this.f38150b = gn0Var;
    }

    @Override
    public void a1(qt qtVar) {
        String str;
        switch (this.f38149a) {
            case 2:
                gn0 gn0Var = this.f38150b;
                gn0Var.Y[5].setText(qtVar.f36981a);
                gn0Var.f34009s = qtVar.d;
                return;
            default:
                gn0 gn0Var2 = this.f38150b;
                gn0Var2.Y[0].setText(qtVar.f36981a);
                if (gn0Var2.U0.indexOf(qtVar.f36981a) != -1) {
                    gn0Var2.Z0 = true;
                    String str2 = (String) gn0Var2.V0.get(qtVar.f36981a);
                    gn0Var2.Y[1].setText(str2);
                    String str3 = (String) gn0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = gn0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    gn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new ql0(gn0Var2, 3), 300L);
                gn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = gn0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void c(String str, String str2) {
        this.f38150b.x1();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f38149a) {
            case 0:
                gn0 gn0Var = this.f38150b;
                gn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    gn0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f38150b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                gn0.a0(this.f38150b);
                return;
            case 4:
                gn0.d0(this.f38150b);
                return;
        }
    }
}
