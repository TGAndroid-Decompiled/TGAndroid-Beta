package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class qr implements Runnable {
    public final int f41166a;
    public final sr f41167b;
    public final String f41168c;

    public qr(sr srVar, String str, int i10) {
        this.f41166a = i10;
        this.f41167b = srVar;
        this.f41168c = str;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        long j3;
        switch (this.f41166a) {
            case 0:
                sr srVar = this.f41167b;
                srVar.getClass();
                AndroidUtilities.runOnUIThread(new qr(srVar, this.f41168c, 1));
                return;
            default:
                sr srVar2 = this.f41167b;
                org.telegram.ui.ActionBar.n5 n5Var = null;
                srVar2.f41752n = null;
                tr trVar = srVar2.f41757y;
                TLRPC.Chat chat = trVar.f42088r;
                int i10 = trVar.f42063e1;
                if (!ChatObject.isChannel(chat) && trVar.f42091s != null) {
                    arrayList = new ArrayList(trVar.f42091s.participants.participants);
                } else {
                    arrayList = null;
                }
                if (i10 == 1) {
                    arrayList2 = new ArrayList(trVar.getContactsController().contacts);
                } else {
                    arrayList2 = null;
                }
                String str = this.f41168c;
                if (arrayList == null && arrayList2 == null) {
                    srVar2.f41754s = false;
                } else {
                    n5Var = new org.telegram.ui.ActionBar.n5(srVar2, str, arrayList, arrayList2);
                }
                org.telegram.ui.ActionBar.n5 n5Var2 = n5Var;
                gg.b2 b2Var = srVar2.h;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ChatObject.isChannel(trVar.f42088r)) {
                    j3 = trVar.N;
                } else {
                    j3 = 0;
                }
                b2Var.h(str, z10, false, true, false, false, j3, false, trVar.O, 1, 0L, n5Var2);
                return;
        }
    }
}
