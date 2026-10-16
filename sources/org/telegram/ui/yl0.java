package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class yl0 implements Utilities.Callback2 {
    public final int f41848a;
    public final PasskeysActivity f41849b;

    public yl0(PasskeysActivity passkeysActivity, int i10) {
        this.f41848a = i10;
        this.f41849b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f41848a;
        PasskeysActivity passkeysActivity = this.f41849b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var = (org.telegram.ui.Components.a71) obj2;
                ArrayList arrayList2 = passkeysActivity.f31886b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.m61 m61Var = new org.telegram.ui.Components.m61(2);
                m61Var.f26946l = string;
                m61Var.f26945k = i11;
                arrayList.add(m61Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    t60 t60Var = new t60(passkeysActivity, 14);
                    int i13 = zl0.f42353a;
                    org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(zl0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = t60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.m61 c10 = org.telegram.ui.Components.m61.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f26951q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.m61.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new xk0(passkeysActivity, 2)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
