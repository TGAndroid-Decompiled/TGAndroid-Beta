package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
public final class wv implements Runnable {
    public final int f43373a;
    public final ay f43374b;
    public final long f43375c;
    public final boolean d;

    public wv(ay ayVar, long j10, boolean z10, int i10) {
        this.f43373a = i10;
        this.f43374b = ayVar;
        this.f43375c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder W2;
        int i10 = this.f43373a;
        boolean z10 = this.d;
        long j10 = this.f43375c;
        ay ayVar = this.f43374b;
        switch (i10) {
            case 0:
                ay ayVar2 = this.f43374b;
                th.e5 O1 = ayVar2.getMessagesController().O1();
                long j11 = this.f43375c;
                boolean z11 = this.d;
                O1.l0(j11, z11, false);
                m4.c cVar = new m4.c((char) 0, 15);
                cVar.f12705b = new wv(ayVar2, j11, z11, 1);
                cVar.f12706c = new wv(ayVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User Z1 = ayVar2.getMessagesController().Z1(Long.valueOf(j11));
                    str = org.telegram.messenger.i5.m(15, Z1.first_name, null);
                    chat = Z1;
                } else {
                    TLRPC.Chat L0 = ayVar2.getMessagesController().L0(Long.valueOf(-j11));
                    str = L0.title;
                    chat = L0;
                }
                if (ayVar2.p4()) {
                    W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StoriesMovedToDialogs", null, 2131744776, str));
                } else {
                    W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StoriesMovedToContacts", null, 2131744777, org.telegram.messenger.i5.m(15, str, null)));
                }
                ayVar2.S = org.telegram.ui.Components.cc.X().V(Collections.singletonList(chat), W2, null, cVar).j();
                return;
            case 1:
                ayVar.getMessagesController().O1().l0(j10, !z10, false);
                return;
            default:
                ayVar.getMessagesController().O1().l0(j10, z10, true);
                return;
        }
    }
}
