package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class sl0 implements Utilities.Callback2 {
    public final int f37416a;
    public final PasskeysActivity f37417b;

    public sl0(PasskeysActivity passkeysActivity, int i10) {
        this.f37416a = i10;
        this.f37417b = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f37416a;
        PasskeysActivity passkeysActivity = this.f37417b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var = (org.telegram.ui.Components.w51) obj2;
                ArrayList arrayList2 = passkeysActivity.f30892b;
                passkeysActivity.addPasskeyRow = -1;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i11 = R.raw.passkey;
                org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(2);
                i51Var.f24900l = string;
                i51Var.f24899k = i11;
                arrayList.add(i51Var);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    k60 k60Var = new k60(passkeysActivity, 15);
                    int i13 = ul0.f38068a;
                    org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(ul0.class);
                    J.G = (TL_account.Passkey) arrayList2.get(i12);
                    J.D = k60Var;
                    arrayList.add(J);
                }
                if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.i51 c10 = org.telegram.ui.Components.i51.c(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                    c10.f24905q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new pl0(passkeysActivity, 1)), true)));
                return;
            default:
                PasskeysActivity.U(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
