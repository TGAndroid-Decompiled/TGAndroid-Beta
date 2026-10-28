package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xl0 implements org.telegram.ui.ActionBar.b2, pt, ym0 {
    public final int f45735a;
    public final kn0 f45736b;

    public xl0(kn0 kn0Var, int i10) {
        this.f45735a = i10;
        this.f45736b = kn0Var;
    }

    @Override
    public void Y0(lt ltVar) {
        String str;
        switch (this.f45735a) {
            case 2:
                kn0 kn0Var = this.f45736b;
                kn0Var.Y[5].setText(ltVar.f41258a);
                kn0Var.f40875s = ltVar.d;
                return;
            default:
                kn0 kn0Var2 = this.f45736b;
                kn0Var2.Y[0].setText(ltVar.f41258a);
                if (kn0Var2.U0.indexOf(ltVar.f41258a) != -1) {
                    kn0Var2.Z0 = true;
                    String str2 = (String) kn0Var2.V0.get(ltVar.f41258a);
                    kn0Var2.Y[1].setText(str2);
                    String str3 = (String) kn0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = kn0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    kn0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new ul0(kn0Var2, 3), 300L);
                kn0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = kn0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void d(String str, String str2) {
        this.f45736b.x1();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f45735a) {
            case 0:
                kn0 kn0Var = this.f45736b;
                kn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kn0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f45736b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                kn0.b0(this.f45736b);
                return;
            case 4:
                kn0.e0(this.f45736b);
                return;
        }
    }
}
