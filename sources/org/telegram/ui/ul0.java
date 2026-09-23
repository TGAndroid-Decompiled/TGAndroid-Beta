package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ul0 implements org.telegram.ui.ActionBar.a2, wt, wm0 {
    public final int f38129a;
    public final in0 f38130b;

    public ul0(in0 in0Var, int i10) {
        this.f38129a = i10;
        this.f38130b = in0Var;
    }

    @Override
    public void a1(st stVar) {
        String str;
        switch (this.f38129a) {
            case 2:
                in0 in0Var = this.f38130b;
                in0Var.Y[5].setText(stVar.f37415a);
                in0Var.f34202s = stVar.d;
                return;
            default:
                in0 in0Var2 = this.f38130b;
                in0Var2.Y[0].setText(stVar.f37415a);
                if (in0Var2.U0.indexOf(stVar.f37415a) != -1) {
                    in0Var2.Z0 = true;
                    String str2 = (String) in0Var2.V0.get(stVar.f37415a);
                    in0Var2.Y[1].setText(str2);
                    String str3 = (String) in0Var2.X0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = in0Var2.Y[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    in0Var2.Z0 = false;
                }
                AndroidUtilities.runOnUIThread(new rl0(in0Var2, 3), 300L);
                in0Var2.Y[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = in0Var2.Y[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public void b(String str, String str2) {
        this.f38130b.x1();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38129a) {
            case 0:
                in0 in0Var = this.f38130b;
                in0Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    in0Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                this.f38130b.finishFragment();
                return;
            case 2:
            case 3:
            default:
                in0.a0(this.f38130b);
                return;
            case 4:
                in0.d0(this.f38130b);
                return;
        }
    }
}
