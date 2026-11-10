package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vi0 implements org.telegram.ui.ActionBar.r1, ss, tj0 {
    public final int f50748a;
    public final ek0 f50749b;

    public vi0(ek0 ek0Var, int i7) {
        this.f50748a = i7;
        this.f50749b = ek0Var;
    }

    @Override
    public void a(String str, String str2) {
        this.f50749b.B1();
    }

    @Override
    public void b(ps psVar) {
        String str;
        switch (this.f50748a) {
            case 2:
                ek0 ek0Var = this.f50749b;
                ek0Var.Y[5].setText(psVar.f48826a);
                ek0Var.f45355s = psVar.d;
                return;
            default:
                ek0 ek0Var2 = this.f50749b;
                ek0Var2.Y[0].setText(psVar.f48826a);
                if (ek0Var2.U0.indexOf(psVar.f48826a) != -1) {
                    ek0Var2.Z0 = true;
                    String str2 = (String) ek0Var2.V0.get(psVar.f48826a);
                    ek0Var2.Y[1].setText(str2);
                    String str3 = (String) ek0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = ek0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    ek0Var2.Z0 = false;
                }
                org.telegram.messenger.g0.i3(new si0(ek0Var2, 3), 300L);
                ek0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = ek0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50748a) {
            case 0:
                ek0 ek0Var = this.f50749b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25570b.getPackageName()));
                    ek0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                this.f50749b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                ek0.f0(this.f50749b);
                return;
            case 4:
                ek0.i0(this.f50749b);
                return;
        }
    }
}
