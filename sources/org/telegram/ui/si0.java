package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class si0 implements org.telegram.ui.ActionBar.r1, ps, qj0 {
    public final int f49780a;
    public final bk0 f49781b;

    public si0(bk0 bk0Var, int i7) {
        this.f49780a = i7;
        this.f49781b = bk0Var;
    }

    @Override
    public void a(String str, String str2) {
        this.f49781b.B1();
    }

    @Override
    public void b(ms msVar) {
        String str;
        switch (this.f49780a) {
            case 2:
                bk0 bk0Var = this.f49781b;
                bk0Var.Y[5].setText(msVar.f47870a);
                bk0Var.f44400s = msVar.d;
                return;
            default:
                bk0 bk0Var2 = this.f49781b;
                bk0Var2.Y[0].setText(msVar.f47870a);
                if (bk0Var2.U0.indexOf(msVar.f47870a) != -1) {
                    bk0Var2.Z0 = true;
                    String str2 = (String) bk0Var2.V0.get(msVar.f47870a);
                    bk0Var2.Y[1].setText(str2);
                    String str3 = (String) bk0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = bk0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    bk0Var2.Z0 = false;
                }
                org.telegram.messenger.g0.i3(new pi0(bk0Var2, 3), 300L);
                bk0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = bk0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f49780a) {
            case 0:
                bk0 bk0Var = this.f49781b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25555b.getPackageName()));
                    bk0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                this.f49781b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                bk0.f0(this.f49781b);
                return;
            case 4:
                bk0.i0(this.f49781b);
                return;
        }
    }
}
