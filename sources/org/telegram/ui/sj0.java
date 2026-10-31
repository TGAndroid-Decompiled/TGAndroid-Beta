package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
public final class sj0 implements org.telegram.messenger.j20 {
    public final int f41531a;
    public final PasskeysActivity f41532b;

    public sj0(PasskeysActivity passkeysActivity, int i10) {
        this.f41531a = i10;
        this.f41532b = passkeysActivity;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f41531a;
        PasskeysActivity passkeysActivity = this.f41532b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.p51 p51Var = (org.telegram.ui.Components.p51) obj2;
                ArrayList arrayList2 = passkeysActivity.f33428b;
                passkeysActivity.addPasskeyRow = -1;
                String L0 = org.telegram.messenger.cd.L0(2131747645, null);
                org.telegram.ui.Components.a51 a51Var = new org.telegram.ui.Components.a51(2);
                a51Var.f24292l = L0;
                a51Var.f24291k = 2131624111;
                arrayList.add(a51Var);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    f50 f50Var = new f50(passkeysActivity, 16);
                    int i12 = uj0.f42153b;
                    org.telegram.ui.Components.a51 K = org.telegram.ui.Components.a51.K(uj0.class);
                    K.G = (TL_account.Passkey) arrayList2.get(i11);
                    K.D = f50Var;
                    arrayList.add(K);
                }
                if (arrayList2.size() + 1 <= ((org.telegram.messenger.l0) passkeysActivity.getMessagesController().f18957y7.f17859z.f10700a).f16658c) {
                    passkeysActivity.addPasskeyRow = arrayList.size();
                    org.telegram.ui.Components.a51 c10 = org.telegram.ui.Components.a51.c(-1, 2131231844, org.telegram.messenger.cd.L0(2131747666, null));
                    c10.f24297q = true;
                    arrayList.add(c10);
                }
                arrayList.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131747651, null), new mg0(passkeysActivity, 4)), true)));
                return;
            default:
                PasskeysActivity.Y(passkeysActivity, (TL_account.Passkey) obj, (String) obj2);
                return;
        }
    }
}
