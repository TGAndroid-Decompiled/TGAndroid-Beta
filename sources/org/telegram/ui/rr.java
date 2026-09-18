package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class rr implements Runnable {
    public final int f37299a;
    public final tr f37300b;
    public final String f37301c;

    public rr(tr trVar, String str, int i10) {
        this.f37299a = i10;
        this.f37300b = trVar;
        this.f37301c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.o5 o5Var;
        boolean z10;
        long j3;
        switch (this.f37299a) {
            case 0:
                tr trVar = this.f37300b;
                trVar.getClass();
                AndroidUtilities.runOnUIThread(new rr(trVar, this.f37301c, 1));
                return;
            default:
                tr trVar2 = this.f37300b;
                trVar2.f37857n = null;
                ur urVar = trVar2.f37862y;
                TLRPC.Chat chat = urVar.f38159r;
                int i10 = urVar.f38134e1;
                if (!ChatObject.isChannel(chat) && urVar.f38162s != null) {
                    arrayList = new ArrayList(urVar.f38162s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(urVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f37301c;
                if (arrayList == null && arrayList2 == null) {
                    trVar2.f37859s = false;
                    o5Var = null;
                } else {
                    o5Var = new org.telegram.ui.ActionBar.o5(trVar2, str, arrayList, arrayList2, 14);
                }
                gg.c2 c2Var = trVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(urVar.f38159r)) {
                    j3 = urVar.N;
                } else {
                    j3 = 0;
                }
                c2Var.h(str, z10, false, true, false, false, j3, false, urVar.O, 1, 0L, o5Var);
                return;
        }
    }
}
