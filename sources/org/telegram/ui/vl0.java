package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class vl0 implements Utilities.Callback2 {
    public final int f38476a;
    public final PasskeysActivity f38477b;

    public vl0(PasskeysActivity passkeysActivity, int i10) {
        this.f38476a = i10;
        this.f38477b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f38476a;
        PasskeysActivity passkeysActivity = this.f38477b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var = (org.telegram.ui.Components.x51) obj2;
                ArrayList arrayList2 = passkeysActivity.f30912b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.j51 j51Var = new org.telegram.ui.Components.j51(2);
                j51Var.f25127l = string;
                j51Var.f25126k = i11;
                arrayList.add(j51Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    m60 m60Var = new m60(passkeysActivity, 15);
                    int i13 = wl0.f39079a;
                    org.telegram.ui.Components.j51 J = org.telegram.ui.Components.j51.J(wl0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = m60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.j51 c10 = org.telegram.ui.Components.j51.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f25132q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.j51.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new sl0(passkeysActivity, 1)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
