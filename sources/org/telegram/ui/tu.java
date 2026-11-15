package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
public final class tu implements Runnable {
    public final int f51674a;
    public final yw f51675b;
    public final long f51676c;
    public final boolean d;

    public tu(yw ywVar, long j3, boolean z10, int i7) {
        this.f51674a = i7;
        this.f51675b = ywVar;
        this.f51676c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder X2;
        int i7 = this.f51674a;
        boolean z10 = this.d;
        long j3 = this.f51676c;
        yw ywVar = this.f51675b;
        switch (i7) {
            case 0:
                yw ywVar2 = this.f51675b;
                fi.s6 P1 = ywVar2.getMessagesController().P1();
                long j10 = this.f51676c;
                boolean z11 = this.d;
                P1.l0(j10, z11, false);
                k8.a aVar = new k8.a(15, false);
                aVar.f17788b = new tu(ywVar2, j10, z11, 1);
                aVar.f17789c = new tu(ywVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User a22 = ywVar2.getMessagesController().a2(Long.valueOf(j10));
                    str = org.telegram.messenger.g5.m(15, a22.first_name, null);
                    chat = a22;
                } else {
                    TLRPC.Chat M0 = ywVar2.getMessagesController().M0(Long.valueOf(-j10));
                    str = M0.title;
                    chat = M0;
                }
                if (ywVar2.q4()) {
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StoriesMovedToDialogs", null, 2131744758, str));
                } else {
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StoriesMovedToContacts", null, 2131744759, org.telegram.messenger.g5.m(15, str, null)));
                }
                ywVar2.T = org.telegram.ui.Components.cc.X().V(Collections.singletonList(chat), X2, null, aVar).j();
                return;
            case 1:
                ywVar.getMessagesController().P1().l0(j3, !z10, false);
                return;
            default:
                ywVar.getMessagesController().P1().l0(j3, z10, true);
                return;
        }
    }
}
