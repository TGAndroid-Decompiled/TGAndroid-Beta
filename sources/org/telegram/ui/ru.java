package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ru implements View.OnLongClickListener {
    public final int f51025a;
    public final yw f51026b;

    public ru(yw ywVar, int i7) {
        this.f51025a = i7;
        this.f51026b = ywVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        int i11 = this.f51025a;
        yw ywVar = this.f51026b;
        switch (i11) {
            case 0:
                ArrayList arrayList = ywVar.K2;
                if (ywVar.getParentActivity() == null) {
                    return false;
                }
                boolean z12 = !arrayList.isEmpty();
                boolean z13 = true;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    long longValue = ((Long) arrayList.get(i12)).longValue();
                    if (z12 && longValue != ywVar.getUserConfig().e()) {
                        z12 = false;
                    }
                    if (org.telegram.messenger.m5.C(longValue)) {
                        z13 = false;
                    }
                    TLRPC.Chat M0 = ywVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (M0 != null && !org.telegram.messenger.t3.B(M0)) {
                        z13 = false;
                    }
                }
                if (ywVar.m4() && ywVar.x3()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ArrayList arrayList2 = ywVar.F2;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            if (((org.telegram.messenger.ff) obj).b()) {
                                z10 = false;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = ywVar.F2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(ywVar, view);
                if (z11) {
                    i7 = 2131745635;
                } else {
                    i7 = 2131745636;
                }
                H.l(2131232360, org.telegram.messenger.hd.M0(i7, null), new eu(ywVar, 5), z10);
                H.c(2131231508, org.telegram.messenger.hd.M0(2131745583, null), new eu(ywVar, 6), false);
                if (z12) {
                    i10 = 2131745514;
                } else {
                    i10 = 2131745859;
                }
                H.l(2131232078, org.telegram.messenger.hd.M0(i10, null), new org.telegram.ui.Components.fp0(7, ywVar, z12), z13);
                H.Z();
                return true;
            case 1:
                yw ywVar2 = this.f51026b;
                ywVar2.D4(ywVar2.K2, 104, true, true, null);
                return true;
            case 2:
                ywVar.B4(view);
                return true;
            default:
                ywVar.getContactsController().B();
                ywVar.W4();
                return true;
        }
    }
}
