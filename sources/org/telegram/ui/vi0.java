package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vi0 implements org.telegram.ui.ActionBar.q1, ss, uj0 {
    public final int f52974a;
    public final fk0 f52975b;

    public vi0(fk0 fk0Var, int i7) {
        this.f52974a = i7;
        this.f52975b = fk0Var;
    }

    @Override
    public void d(ps psVar) {
        String str;
        switch (this.f52974a) {
            case 2:
                fk0 fk0Var = this.f52975b;
                fk0Var.Z[5].setText(psVar.f51135a);
                fk0Var.f47891s = psVar.d;
                return;
            default:
                fk0 fk0Var2 = this.f52975b;
                fk0Var2.Z[0].setText(psVar.f51135a);
                if (fk0Var2.V0.indexOf(psVar.f51135a) != -1) {
                    fk0Var2.f47853a1 = true;
                    String str2 = (String) fk0Var2.W0.get(psVar.f51135a);
                    fk0Var2.Z[1].setText(str2);
                    String str3 = (String) fk0Var2.Y0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = fk0Var2.Z[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    fk0Var2.f47853a1 = false;
                }
                org.telegram.messenger.g0.h3(new si0(fk0Var2, 3), 300L);
                fk0Var2.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = fk0Var2.Z[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void f(String str, String str2) {
        this.f52975b.B1();
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f52974a) {
            case 0:
                fk0 fk0Var = this.f52975b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
                    fk0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                this.f52975b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                fk0.f0(this.f52975b);
                return;
            case 4:
                fk0.i0(this.f52975b);
                return;
        }
    }
}
