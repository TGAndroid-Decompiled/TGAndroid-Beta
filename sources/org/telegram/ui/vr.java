package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class vr implements Runnable {
    public final int f40752a;
    public final xr f40753b;
    public final String f40754c;

    public vr(xr xrVar, String str, int i10) {
        this.f40752a = i10;
        this.f40753b = xrVar;
        this.f40754c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        p6 p6Var;
        boolean z10;
        long j10;
        switch (this.f40752a) {
            case 0:
                xr xrVar = this.f40753b;
                xrVar.getClass();
                AndroidUtilities.runOnUIThread(new vr(xrVar, this.f40754c, 1));
                return;
            default:
                xr xrVar2 = this.f40753b;
                xrVar2.f41619n = null;
                yr yrVar = xrVar2.f41624y;
                TLRPC.Chat chat = yrVar.f41926r;
                int i10 = yrVar.f41901e1;
                if (!ChatObject.isChannel(chat) && yrVar.f41929s != null) {
                    arrayList = new ArrayList(yrVar.f41929s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(yrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f40754c;
                if (arrayList == null && arrayList2 == null) {
                    xrVar2.f41621s = false;
                    p6Var = null;
                } else {
                    p6Var = new p6(xrVar2, str, arrayList, arrayList2, 12);
                }
                hg.a2 a2Var = xrVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(yrVar.f41926r)) {
                    j10 = yrVar.N;
                } else {
                    j10 = 0;
                }
                a2Var.h(str, z10, false, true, false, false, j10, false, yrVar.O, 1, 0L, p6Var);
                return;
        }
    }
}
