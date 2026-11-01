package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
public final class vv implements Runnable {
    public final int f42611a;
    public final zx f42612b;
    public final long f42613c;
    public final boolean d;

    public vv(zx zxVar, long j10, boolean z10, int i10) {
        this.f42611a = i10;
        this.f42612b = zxVar;
        this.f42613c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder W2;
        int i10 = this.f42611a;
        boolean z10 = this.d;
        long j10 = this.f42613c;
        zx zxVar = this.f42612b;
        switch (i10) {
            case 0:
                zx zxVar2 = this.f42612b;
                th.e5 O1 = zxVar2.getMessagesController().O1();
                long j11 = this.f42613c;
                boolean z11 = this.d;
                O1.l0(j11, z11, false);
                m4.c cVar = new m4.c((char) 0, 15);
                cVar.f12706b = new vv(zxVar2, j11, z11, 1);
                cVar.f12707c = new vv(zxVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User Z1 = zxVar2.getMessagesController().Z1(Long.valueOf(j11));
                    str = org.telegram.messenger.i5.m(15, Z1.first_name, null);
                    chat = Z1;
                } else {
                    TLRPC.Chat L0 = zxVar2.getMessagesController().L0(Long.valueOf(-j11));
                    str = L0.title;
                    chat = L0;
                }
                if (zxVar2.q4()) {
                    W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("StoriesMovedToDialogs", null, 2131744776, str));
                } else {
                    W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("StoriesMovedToContacts", null, 2131744777, org.telegram.messenger.i5.m(15, str, null)));
                }
                zxVar2.S = org.telegram.ui.Components.cc.X().V(Collections.singletonList(chat), W2, null, cVar).j();
                return;
            case 1:
                zxVar.getMessagesController().O1().l0(j10, !z10, false);
                return;
            default:
                zxVar.getMessagesController().O1().l0(j10, z10, true);
                return;
        }
    }
}
