package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class vl0 implements Utilities.Callback2 {
    public final int f38574a;
    public final PasskeysActivity f38575b;

    public vl0(PasskeysActivity passkeysActivity, int i10) {
        this.f38574a = i10;
        this.f38575b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f38574a;
        PasskeysActivity passkeysActivity = this.f38575b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.k61 k61Var = (org.telegram.ui.Components.k61) obj2;
                ArrayList arrayList2 = passkeysActivity.f31179b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(2);
                w51Var.f29948l = string;
                w51Var.f29947k = i11;
                arrayList.add(w51Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    k60 k60Var = new k60(passkeysActivity, 15);
                    int i13 = wl0.f39178a;
                    org.telegram.ui.Components.w51 J = org.telegram.ui.Components.w51.J(wl0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = k60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.w51 c10 = org.telegram.ui.Components.w51.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f29953q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.w51.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new sl0(passkeysActivity, 1)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
