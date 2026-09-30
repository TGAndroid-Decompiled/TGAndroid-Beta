package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sl0 implements org.telegram.ui.ActionBar.z1, vt, tm0 {
    public final int f37918a;
    public final fn0 f37919b;

    public sl0(fn0 fn0Var, int i10) {
        this.f37918a = i10;
        this.f37919b = fn0Var;
    }

    @Override
    public void a1(qt qtVar) {
        String str;
        switch (this.f37918a) {
            case 2:
                fn0 fn0Var = this.f37919b;
                fn0Var.Y[5].setText(qtVar.f37082a);
                fn0Var.f33827s = qtVar.d;
                return;
            default:
                fn0 fn0Var2 = this.f37919b;
                fn0Var2.Y[0].setText(qtVar.f37082a);
                if (fn0Var2.U0.indexOf(qtVar.f37082a) != -1) {
                    fn0Var2.Z0 = true;
                    String str2 = (String) fn0Var2.V0.get(qtVar.f37082a);
                    fn0Var2.Y[1].setText(str2);
                    String str3 = (String) fn0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = fn0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    fn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new pl0(fn0Var2, 3), 300L);
                fn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = fn0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void c(String str, String str2) {
        this.f37919b.x1();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37918a) {
            case 0:
                fn0 fn0Var = this.f37919b;
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
                this.f37919b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                fn0.a0(this.f37919b);
                return;
            case 4:
                fn0.d0(this.f37919b);
                return;
        }
    }
}
