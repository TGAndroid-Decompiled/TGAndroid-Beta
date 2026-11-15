package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ui0 implements org.telegram.ui.ActionBar.q1, ss, tj0 {
    public final int f51959a;
    public final ek0 f51960b;

    public ui0(ek0 ek0Var, int i7) {
        this.f51959a = i7;
        this.f51960b = ek0Var;
    }

    @Override
    public void d(String str, String str2) {
        this.f51960b.B1();
    }

    @Override
    public void e(ps psVar) {
        String str;
        switch (this.f51959a) {
            case 2:
                ek0 ek0Var = this.f51960b;
                ek0Var.Z[5].setText(psVar.f50349a);
                ek0Var.f46832s = psVar.d;
                return;
            default:
                ek0 ek0Var2 = this.f51960b;
                ek0Var2.Z[0].setText(psVar.f50349a);
                if (ek0Var2.V0.indexOf(psVar.f50349a) != -1) {
                    ek0Var2.f46794a1 = true;
                    String str2 = (String) ek0Var2.W0.get(psVar.f50349a);
                    ek0Var2.Z[1].setText(str2);
                    String str3 = (String) ek0Var2.Y0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = ek0Var2.Z[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    ek0Var2.f46794a1 = false;
                }
                org.telegram.messenger.g0.i3(new ri0(ek0Var2, 3), 300L);
                ek0Var2.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = ek0Var2.Z[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51959a) {
            case 0:
                ek0 ek0Var = this.f51960b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
                    ek0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                this.f51960b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                ek0.f0(this.f51960b);
                return;
            case 4:
                ek0.i0(this.f51960b);
                return;
        }
    }
}
