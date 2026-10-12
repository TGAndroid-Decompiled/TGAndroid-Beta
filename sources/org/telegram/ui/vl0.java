package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class vl0 implements Utilities.Callback2 {
    public final int f42813a;
    public final PasskeysActivity f42814b;

    public vl0(PasskeysActivity passkeysActivity, int i10) {
        this.f42813a = i10;
        this.f42814b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f42813a;
        PasskeysActivity passkeysActivity = this.f42814b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.h71 h71Var = (org.telegram.ui.Components.h71) obj2;
                ArrayList arrayList2 = passkeysActivity.f33700b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(2);
                u61Var.f31071l = string;
                u61Var.f31070k = i11;
                arrayList.add(u61Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    o60 o60Var = new o60(passkeysActivity, 14);
                    int i13 = wl0.f43565a;
                    org.telegram.ui.Components.u61 J = org.telegram.ui.Components.u61.J(wl0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = o60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.u61 c10 = org.telegram.ui.Components.u61.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f31076q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.u61.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new uk0(passkeysActivity, 2)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
