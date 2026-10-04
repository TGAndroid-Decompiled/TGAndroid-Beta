package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xl0 implements org.telegram.ui.ActionBar.a2, yt, ym0 {
    public final int f42914a;
    public final kn0 f42915b;

    public xl0(kn0 kn0Var, int i10) {
        this.f42914a = i10;
        this.f42915b = kn0Var;
    }

    @Override
    public void b1(ut utVar) {
        String str;
        switch (this.f42914a) {
            case 2:
                kn0 kn0Var = this.f42915b;
                kn0Var.Y[5].setText(utVar.f41305a);
                kn0Var.f38050s = utVar.d;
                return;
            default:
                kn0 kn0Var2 = this.f42915b;
                kn0Var2.Y[0].setText(utVar.f41305a);
                if (kn0Var2.U0.indexOf(utVar.f41305a) != -1) {
                    kn0Var2.Z0 = true;
                    String str2 = (String) kn0Var2.V0.get(utVar.f41305a);
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
    public void c(String str, String str2) {
        this.f42915b.x1();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42914a) {
            case 0:
                kn0 kn0Var = this.f42915b;
                kn0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    kn0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                this.f42915b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                kn0.Z(this.f42915b);
                return;
            case 4:
                kn0.d0(this.f42915b);
                return;
        }
    }
}
