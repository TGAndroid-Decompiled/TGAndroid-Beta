package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ui0 implements org.telegram.ui.ActionBar.r1, rs, sj0 {
    public final int f50414a;
    public final dk0 f50415b;

    public ui0(dk0 dk0Var, int i7) {
        this.f50414a = i7;
        this.f50415b = dk0Var;
    }

    @Override
    public void a(String str, String str2) {
        this.f50415b.B1();
    }

    @Override
    public void b(os osVar) {
        String str;
        switch (this.f50414a) {
            case 2:
                dk0 dk0Var = this.f50415b;
                dk0Var.Y[5].setText(osVar.f48510a);
                dk0Var.f45031s = osVar.d;
                return;
            default:
                dk0 dk0Var2 = this.f50415b;
                dk0Var2.Y[0].setText(osVar.f48510a);
                if (dk0Var2.U0.indexOf(osVar.f48510a) != -1) {
                    dk0Var2.Z0 = true;
                    String str2 = (String) dk0Var2.V0.get(osVar.f48510a);
                    dk0Var2.Y[1].setText(str2);
                    String str3 = (String) dk0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = dk0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    dk0Var2.Z0 = false;
                }
                org.telegram.messenger.g0.i3(new ri0(dk0Var2, 3), 300L);
                dk0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = dk0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50414a) {
            case 0:
                dk0 dk0Var = this.f50415b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                    dk0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                this.f50415b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                dk0.f0(this.f50415b);
                return;
            case 4:
                dk0.i0(this.f50415b);
                return;
        }
    }
}
