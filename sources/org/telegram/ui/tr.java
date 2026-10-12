package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class tr implements Runnable {
    public final int f42266a;
    public final vr f42267b;
    public final String f42268c;

    public tr(vr vrVar, String str, int i10) {
        this.f42266a = i10;
        this.f42267b = vrVar;
        this.f42268c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.l5 l5Var;
        boolean z10;
        long j3;
        switch (this.f42266a) {
            case 0:
                vr vrVar = this.f42267b;
                vrVar.getClass();
                AndroidUtilities.runOnUIThread(new tr(vrVar, this.f42268c, 1));
                return;
            default:
                vr vrVar2 = this.f42267b;
                vrVar2.f42834n = null;
                wr wrVar = vrVar2.f42839y;
                TLRPC.Chat chat = wrVar.f43646r;
                int i10 = wrVar.f43621e1;
                if (!ChatObject.isChannel(chat) && wrVar.f43649s != null) {
                    arrayList = new ArrayList(wrVar.f43649s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(wrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f42268c;
                if (arrayList == null && arrayList2 == null) {
                    vrVar2.f42836s = false;
                    l5Var = null;
                } else {
                    l5Var = new org.telegram.ui.ActionBar.l5(vrVar2, str, arrayList, arrayList2, 14);
                }
                gg.b2 b2Var = vrVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(wrVar.f43646r)) {
                    j3 = wrVar.N;
                } else {
                    j3 = 0;
                }
                b2Var.h(str, z10, false, true, false, false, j3, false, wrVar.O, 1, 0L, l5Var);
                return;
        }
    }
}
