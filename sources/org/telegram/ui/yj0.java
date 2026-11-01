package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yj0 implements org.telegram.ui.ActionBar.u1, pt, xk0 {
    public final int f43680a;
    public final jl0 f43681b;

    public yj0(jl0 jl0Var, int i10) {
        this.f43680a = i10;
        this.f43681b = jl0Var;
    }

    @Override
    public void c(mt mtVar) {
        String str;
        switch (this.f43680a) {
            case 2:
                jl0 jl0Var = this.f43681b;
                jl0Var.Y[5].setText(mtVar.f39611a);
                jl0Var.f38449s = mtVar.d;
                return;
            default:
                jl0 jl0Var2 = this.f43681b;
                jl0Var2.Y[0].setText(mtVar.f39611a);
                if (jl0Var2.U0.indexOf(mtVar.f39611a) != -1) {
                    jl0Var2.Z0 = true;
                    String str2 = (String) jl0Var2.V0.get(mtVar.f39611a);
                    jl0Var2.Y[1].setText(str2);
                    String str3 = (String) jl0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = jl0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    jl0Var2.Z0 = false;
                }
                org.telegram.messenger.i0.h3(new vj0(jl0Var2, 3), 300L);
                jl0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = jl0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void d(String str, String str2) {
        this.f43681b.B1();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f43680a) {
            case 0:
                jl0 jl0Var = this.f43681b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                    jl0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                this.f43681b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                jl0.f0(this.f43681b);
                return;
            case 4:
                jl0.i0(this.f43681b);
                return;
        }
    }
}
