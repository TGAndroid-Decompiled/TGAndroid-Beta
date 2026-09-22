package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class rr implements Runnable {
    public final int f37194a;
    public final tr f37195b;
    public final String f37196c;

    public rr(tr trVar, String str, int i10) {
        this.f37194a = i10;
        this.f37195b = trVar;
        this.f37196c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.n5 n5Var;
        boolean z10;
        long j3;
        switch (this.f37194a) {
            case 0:
                tr trVar = this.f37195b;
                trVar.getClass();
                AndroidUtilities.runOnUIThread(new rr(trVar, this.f37196c, 1));
                return;
            default:
                tr trVar2 = this.f37195b;
                trVar2.f37718n = null;
                ur urVar = trVar2.f37723y;
                TLRPC.Chat chat = urVar.f38144r;
                int i10 = urVar.f38119e1;
                if (!ChatObject.isChannel(chat) && urVar.f38147s != null) {
                    arrayList = new ArrayList(urVar.f38147s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(urVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f37196c;
                if (arrayList == null && arrayList2 == null) {
                    trVar2.f37720s = false;
                    n5Var = null;
                } else {
                    n5Var = new org.telegram.ui.ActionBar.n5(trVar2, str, arrayList, arrayList2, 14);
                }
                gg.c2 c2Var = trVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(urVar.f38144r)) {
                    j3 = urVar.N;
                } else {
                    j3 = 0;
                }
                c2Var.h(str, z10, false, true, false, false, j3, false, urVar.O, 1, 0L, n5Var);
                return;
        }
    }
}
