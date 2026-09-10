package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class tr implements Runnable {
    public final int f36994a;
    public final vr f36995b;
    public final String f36996c;

    public tr(vr vrVar, String str, int i10) {
        this.f36994a = i10;
        this.f36995b = vrVar;
        this.f36996c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        da daVar;
        boolean z10;
        long j3;
        switch (this.f36994a) {
            case 0:
                vr vrVar = this.f36995b;
                vrVar.getClass();
                AndroidUtilities.runOnUIThread(new tr(vrVar, this.f36996c, 1));
                return;
            default:
                vr vrVar2 = this.f36995b;
                vrVar2.f37611n = null;
                wr wrVar = vrVar2.f37616y;
                TLRPC.Chat chat = wrVar.f38354r;
                int i10 = wrVar.f38329e1;
                if (!ChatObject.isChannel(chat) && wrVar.f38357s != null) {
                    arrayList = new ArrayList(wrVar.f38357s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(wrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f36996c;
                if (arrayList == null && arrayList2 == null) {
                    vrVar2.f37613s = false;
                    daVar = null;
                } else {
                    daVar = new da(vrVar2, str, arrayList, arrayList2, 10);
                }
                fg.d2 d2Var = vrVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(wrVar.f38354r)) {
                    j3 = wrVar.N;
                } else {
                    j3 = 0;
                }
                d2Var.h(str, z10, false, true, false, false, j3, false, wrVar.O, 1, 0L, daVar);
                return;
        }
    }
}
