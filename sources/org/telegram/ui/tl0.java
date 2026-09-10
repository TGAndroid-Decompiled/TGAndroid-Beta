package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class tl0 implements Utilities.Callback2 {
    public final int f36961a;
    public final PasskeysActivity f36962b;

    public tl0(PasskeysActivity passkeysActivity, int i10) {
        this.f36961a = i10;
        this.f36962b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f36961a;
        PasskeysActivity passkeysActivity = this.f36962b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var = (org.telegram.ui.Components.j61) obj2;
                ArrayList arrayList2 = passkeysActivity.f30008b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(2);
                v51Var.f27829l = string;
                v51Var.f27828k = i11;
                arrayList.add(v51Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    l60 l60Var = new l60(passkeysActivity, 15);
                    int i13 = vl0.f37584a;
                    org.telegram.ui.Components.v51 J = org.telegram.ui.Components.v51.J(vl0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = l60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.v51 c10 = org.telegram.ui.Components.v51.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f27834q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.v51.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new ql0(passkeysActivity, 1)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
