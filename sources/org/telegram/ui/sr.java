package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class sr implements Runnable {
    public final int f40503a;
    public final ur f40504b;
    public final String f40505c;

    public sr(ur urVar, String str, int i10) {
        this.f40503a = i10;
        this.f40504b = urVar;
        this.f40505c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.n5 n5Var;
        boolean z10;
        long j3;
        switch (this.f40503a) {
            case 0:
                ur urVar = this.f40504b;
                urVar.getClass();
                AndroidUtilities.runOnUIThread(new sr(urVar, this.f40505c, 1));
                return;
            default:
                ur urVar2 = this.f40504b;
                urVar2.f41206n = null;
                vr vrVar = urVar2.f41211y;
                TLRPC.Chat chat = vrVar.f41668r;
                int i10 = vrVar.f41643e1;
                if (!ChatObject.isChannel(chat) && vrVar.f41671s != null) {
                    arrayList = new ArrayList(vrVar.f41671s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(vrVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f40505c;
                if (arrayList == null && arrayList2 == null) {
                    urVar2.f41208s = false;
                    n5Var = null;
                } else {
                    n5Var = new org.telegram.ui.ActionBar.n5(urVar2, str, arrayList, arrayList2, 14);
                }
                hg.b2 b2Var = urVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(vrVar.f41668r)) {
                    j3 = vrVar.N;
                } else {
                    j3 = 0;
                }
                b2Var.h(str, z10, false, true, false, false, j3, false, vrVar.O, 1, 0L, n5Var);
                return;
        }
    }
}
