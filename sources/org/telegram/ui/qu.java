package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qu implements View.OnLongClickListener {
    public final int f51336a;
    public final cx f51337b;

    public qu(cx cxVar, int i7) {
        this.f51336a = i7;
        this.f51337b = cxVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        int i11 = this.f51336a;
        cx cxVar = this.f51337b;
        switch (i11) {
            case 0:
                ArrayList arrayList = cxVar.K2;
                if (cxVar.getParentActivity() == null) {
                    return false;
                }
                boolean z12 = !arrayList.isEmpty();
                boolean z13 = true;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    long longValue = ((Long) arrayList.get(i12)).longValue();
                    if (z12 && longValue != cxVar.getUserConfig().e()) {
                        z12 = false;
                    }
                    if (org.telegram.messenger.n5.C(longValue)) {
                        z13 = false;
                    }
                    TLRPC.Chat O0 = cxVar.getMessagesController().O0(Long.valueOf(-longValue));
                    if (O0 != null && !org.telegram.messenger.v3.B(O0)) {
                        z13 = false;
                    }
                }
                if (cxVar.o4() && cxVar.x3()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ArrayList arrayList2 = cxVar.F2;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            if (((org.telegram.messenger.ef) obj).b()) {
                                z10 = false;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = cxVar.F2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(cxVar, view);
                if (z11) {
                    i7 = 2131745440;
                } else {
                    i7 = 2131745441;
                }
                I.l(2131232361, org.telegram.messenger.gd.M0(i7, null), new gu(cxVar, 13), z10);
                I.c(2131231509, org.telegram.messenger.gd.M0(2131745388, null), new gu(cxVar, 14), false);
                if (z12) {
                    i10 = 2131745319;
                } else {
                    i10 = 2131745664;
                }
                I.l(2131232079, org.telegram.messenger.gd.M0(i10, null), new org.telegram.ui.Components.pp0(7, cxVar, z12), z13);
                I.a0();
                return true;
            case 1:
                cx cxVar2 = this.f51337b;
                cxVar2.K4(cxVar2.K2, 104, true, true, null);
                return true;
            case 2:
                cxVar.G4(view);
                return true;
            default:
                cxVar.getContactsController().B();
                cxVar.e5();
                return true;
        }
    }
}
