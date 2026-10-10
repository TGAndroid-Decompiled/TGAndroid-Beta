package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class ul0 implements Utilities.Callback2 {
    public final int f42497a;
    public final PasskeysActivity f42498b;

    public ul0(PasskeysActivity passkeysActivity, int i10) {
        this.f42497a = i10;
        this.f42498b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f42497a;
        PasskeysActivity passkeysActivity = this.f42498b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.d71 d71Var = (org.telegram.ui.Components.d71) obj2;
                ArrayList arrayList2 = passkeysActivity.f33899b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.q61 q61Var = new org.telegram.ui.Components.q61(2);
                q61Var.f30063l = string;
                q61Var.f30062k = i11;
                arrayList.add(q61Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    m60 m60Var = new m60(passkeysActivity, 14);
                    int i13 = vl0.f42945a;
                    org.telegram.ui.Components.q61 J = org.telegram.ui.Components.q61.J(vl0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = m60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.q61 c10 = org.telegram.ui.Components.q61.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f30068q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.q61.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new tk0(passkeysActivity, 2)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
