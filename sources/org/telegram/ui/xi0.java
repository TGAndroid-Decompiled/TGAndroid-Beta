package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xi0 implements org.telegram.ui.ActionBar.r1, ss, wj0 {
    public final int f53837a;
    public final hk0 f53838b;

    public xi0(hk0 hk0Var, int i7) {
        this.f53837a = i7;
        this.f53838b = hk0Var;
    }

    @Override
    public void b(ps psVar) {
        String str;
        switch (this.f53837a) {
            case 2:
                hk0 hk0Var = this.f53838b;
                hk0Var.Z[5].setText(psVar.f50920a);
                hk0Var.f48409s = psVar.d;
                return;
            default:
                hk0 hk0Var2 = this.f53838b;
                hk0Var2.Z[0].setText(psVar.f50920a);
                if (hk0Var2.V0.indexOf(psVar.f50920a) != -1) {
                    hk0Var2.f48371a1 = true;
                    String str2 = (String) hk0Var2.W0.get(psVar.f50920a);
                    hk0Var2.Z[1].setText(str2);
                    String str3 = (String) hk0Var2.Y0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = hk0Var2.Z[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    hk0Var2.f48371a1 = false;
                }
                org.telegram.messenger.g0.h3(new ui0(hk0Var2, 3), 300L);
                hk0Var2.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = hk0Var2.Z[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void d(String str, String str2) {
        this.f53838b.B1();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f53837a) {
            case 0:
                hk0 hk0Var = this.f53838b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26913b.getPackageName()));
                    hk0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                this.f53838b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                hk0.f0(this.f53838b);
                return;
            case 4:
                hk0.i0(this.f53838b);
                return;
        }
    }
}
