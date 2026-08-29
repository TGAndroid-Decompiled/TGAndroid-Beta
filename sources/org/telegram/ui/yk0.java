package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class yk0 implements Utilities.Callback2 {
    public final int f44902a;
    public final PasskeysActivity f44903b;

    public yk0(PasskeysActivity passkeysActivity, int i10) {
        this.f44902a = i10;
        this.f44903b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f44902a;
        PasskeysActivity passkeysActivity = this.f44903b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.k51 k51Var = (org.telegram.ui.Components.k51) obj2;
                ArrayList arrayList2 = passkeysActivity.f35644b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.w41 w41Var = new org.telegram.ui.Components.w41(2);
                w41Var.f34300l = string;
                w41Var.f34299k = i11;
                arrayList.add(w41Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    t50 t50Var = new t50(passkeysActivity, 15);
                    int i13 = bl0.f36827a;
                    org.telegram.ui.Components.w41 J = org.telegram.ui.Components.w41.J(bl0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = t50Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.w41 c3 = org.telegram.ui.Components.w41.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c3.f34305q = true;
                    arrayList.add(c3);
                }
                arrayList.add(org.telegram.ui.Components.w41.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new vk0(passkeysActivity, 1)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
