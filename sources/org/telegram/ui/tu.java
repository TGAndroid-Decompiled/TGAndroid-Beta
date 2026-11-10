package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tu implements View.OnLongClickListener {
    public final int f50343a;
    public final zw f50344b;

    public tu(zw zwVar, int i7) {
        this.f50343a = i7;
        this.f50344b = zwVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z9;
        boolean z10;
        int i7;
        int i10;
        int i11 = this.f50343a;
        zw zwVar = this.f50344b;
        switch (i11) {
            case 0:
                ArrayList arrayList = zwVar.J2;
                if (zwVar.getParentActivity() == null) {
                    return false;
                }
                boolean z11 = !arrayList.isEmpty();
                boolean z12 = true;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    long longValue = ((Long) arrayList.get(i12)).longValue();
                    if (z11 && longValue != zwVar.getUserConfig().e()) {
                        z11 = false;
                    }
                    if (org.telegram.messenger.m5.C(longValue)) {
                        z12 = false;
                    }
                    TLRPC.Chat M0 = zwVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (M0 != null && !org.telegram.messenger.t3.B(M0)) {
                        z12 = false;
                    }
                }
                if (zwVar.m4() && zwVar.x3()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    ArrayList arrayList2 = zwVar.E2;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            if (((org.telegram.messenger.gf) obj).b()) {
                                z9 = false;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = zwVar.E2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(zwVar, view);
                if (z10) {
                    i7 = 2131745635;
                } else {
                    i7 = 2131745636;
                }
                H.l(2131232359, org.telegram.messenger.id.M0(i7, null), new fu(zwVar, 5), z9);
                H.c(2131231508, org.telegram.messenger.id.M0(2131745583, null), new fu(zwVar, 6), false);
                if (z11) {
                    i10 = 2131745514;
                } else {
                    i10 = 2131745859;
                }
                H.l(2131232077, org.telegram.messenger.id.M0(i10, null), new org.telegram.ui.Components.tp0(6, zwVar, z11), z12);
                H.Z();
                return true;
            case 1:
                zw zwVar2 = this.f50344b;
                zwVar2.D4(zwVar2.J2, 104, true, true, null);
                return true;
            case 2:
                zwVar.B4(view);
                return true;
            default:
                zwVar.getContactsController().B();
                zwVar.W4();
                return true;
        }
    }
}
