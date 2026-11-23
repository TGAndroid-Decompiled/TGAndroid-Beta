package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
public final class su implements Runnable {
    public final int f52153a;
    public final bx f52154b;
    public final long f52155c;
    public final boolean d;

    public su(bx bxVar, long j3, boolean z10, int i7) {
        this.f52153a = i7;
        this.f52154b = bxVar;
        this.f52155c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder W2;
        int i7 = this.f52153a;
        boolean z10 = this.d;
        long j3 = this.f52155c;
        bx bxVar = this.f52154b;
        switch (i7) {
            case 0:
                bx bxVar2 = this.f52154b;
                fi.p6 R1 = bxVar2.getMessagesController().R1();
                long j10 = this.f52155c;
                boolean z11 = this.d;
                R1.l0(j10, z11, false);
                jb.m mVar = new jb.m(16, false);
                mVar.f17464b = new su(bxVar2, j10, z11, 1);
                mVar.f17465c = new su(bxVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User c22 = bxVar2.getMessagesController().c2(Long.valueOf(j10));
                    str = org.telegram.messenger.i5.m(15, c22.first_name, null);
                    chat = c22;
                } else {
                    TLRPC.Chat O0 = bxVar2.getMessagesController().O0(Long.valueOf(-j10));
                    str = O0.title;
                    chat = O0;
                }
                if (bxVar2.t4()) {
                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoriesMovedToDialogs", null, 2131744517, str));
                } else {
                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoriesMovedToContacts", null, 2131744518, org.telegram.messenger.i5.m(15, str, null)));
                }
                bxVar2.T = org.telegram.ui.Components.kc.Y().V(Collections.singletonList(chat), W2, null, mVar).j();
                return;
            case 1:
                bxVar.getMessagesController().R1().l0(j3, !z10, false);
                return;
            default:
                bxVar.getMessagesController().R1().l0(j3, z10, true);
                return;
        }
    }
}
