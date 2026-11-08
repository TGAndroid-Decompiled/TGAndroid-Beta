package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qu implements View.OnLongClickListener {
    public final int f49316a;
    public final ww f49317b;

    public qu(ww wwVar, int i7) {
        this.f49316a = i7;
        this.f49317b = wwVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z9;
        boolean z10;
        int i7;
        int i10;
        int i11 = this.f49316a;
        ww wwVar = this.f49317b;
        switch (i11) {
            case 0:
                ArrayList arrayList = wwVar.I2;
                if (wwVar.getParentActivity() == null) {
                    return false;
                }
                boolean z11 = !arrayList.isEmpty();
                boolean z12 = true;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    long longValue = ((Long) arrayList.get(i12)).longValue();
                    if (z11 && longValue != wwVar.getUserConfig().e()) {
                        z11 = false;
                    }
                    if (org.telegram.messenger.m5.C(longValue)) {
                        z12 = false;
                    }
                    TLRPC.Chat M0 = wwVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (M0 != null && !org.telegram.messenger.t3.B(M0)) {
                        z12 = false;
                    }
                }
                if (wwVar.m4() && wwVar.x3()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    ArrayList arrayList2 = wwVar.D2;
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
                ArrayList arrayList3 = wwVar.D2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(wwVar, view);
                if (z10) {
                    i7 = 2131745638;
                } else {
                    i7 = 2131745639;
                }
                H.l(2131232359, org.telegram.messenger.id.M0(i7, null), new cu(wwVar, 5), z9);
                H.c(2131231508, org.telegram.messenger.id.M0(2131745586, null), new cu(wwVar, 6), false);
                if (z11) {
                    i10 = 2131745517;
                } else {
                    i10 = 2131745862;
                }
                H.l(2131232077, org.telegram.messenger.id.M0(i10, null), new org.telegram.ui.Components.tp0(6, wwVar, z11), z12);
                H.Z();
                return true;
            case 1:
                ww wwVar2 = this.f49317b;
                wwVar2.D4(wwVar2.I2, 104, true, true, null);
                return true;
            case 2:
                wwVar.B4(view);
                return true;
            default:
                wwVar.getContactsController().B();
                wwVar.W4();
                return true;
        }
    }
}
