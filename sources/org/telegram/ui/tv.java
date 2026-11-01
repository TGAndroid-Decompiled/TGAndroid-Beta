package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tv implements View.OnLongClickListener {
    public final int f41730a;
    public final zx f41731b;

    public tv(zx zxVar, int i10) {
        this.f41730a = i10;
        this.f41731b = zxVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12 = this.f41730a;
        zx zxVar = this.f41731b;
        switch (i12) {
            case 0:
                ArrayList arrayList = zxVar.I2;
                if (zxVar.getParentActivity() == null) {
                    return false;
                }
                boolean z12 = !arrayList.isEmpty();
                boolean z13 = true;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    long longValue = ((Long) arrayList.get(i13)).longValue();
                    if (z12 && longValue != zxVar.getUserConfig().e()) {
                        z12 = false;
                    }
                    if (org.telegram.messenger.o5.C(longValue)) {
                        z13 = false;
                    }
                    TLRPC.Chat L0 = zxVar.getMessagesController().L0(Long.valueOf(-longValue));
                    if (L0 != null && !org.telegram.messenger.w3.B(L0)) {
                        z13 = false;
                    }
                }
                if (zxVar.m4() && zxVar.x3()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ArrayList arrayList2 = zxVar.D2;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            Object obj = arrayList2.get(i14);
                            i14++;
                            if (((org.telegram.messenger.ff) obj).b()) {
                                z10 = false;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = zxVar.D2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(zxVar, view);
                if (z11) {
                    i10 = 2131745652;
                } else {
                    i10 = 2131745653;
                }
                H.l(2131232358, org.telegram.messenger.dd.L0(i10, null), new ev(zxVar, 5), z10);
                H.c(2131231509, org.telegram.messenger.dd.L0(2131745600, null), new ev(zxVar, 6), false);
                if (z12) {
                    i11 = 2131745531;
                } else {
                    i11 = 2131745876;
                }
                H.l(2131232076, org.telegram.messenger.dd.L0(i11, null), new k2.v(26, zxVar, z12), z13);
                H.Z();
                return true;
            case 1:
                zx zxVar2 = this.f41731b;
                zxVar2.D4(zxVar2.I2, 104, true, true, null);
                return true;
            case 2:
                zxVar.B4(view);
                return true;
            default:
                zxVar.getContactsController().B();
                zxVar.W4();
                return true;
        }
    }
}
