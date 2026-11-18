package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
public final class tu implements Runnable {
    public final int f52352a;
    public final cx f52353b;
    public final long f52354c;
    public final boolean d;

    public tu(cx cxVar, long j3, boolean z10, int i7) {
        this.f52352a = i7;
        this.f52353b = cxVar;
        this.f52354c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder W2;
        int i7 = this.f52352a;
        boolean z10 = this.d;
        long j3 = this.f52354c;
        cx cxVar = this.f52353b;
        switch (i7) {
            case 0:
                cx cxVar2 = this.f52353b;
                fi.p6 R1 = cxVar2.getMessagesController().R1();
                long j10 = this.f52354c;
                boolean z11 = this.d;
                R1.l0(j10, z11, false);
                k8.a aVar = new k8.a(15, false);
                aVar.f18180b = new tu(cxVar2, j10, z11, 1);
                aVar.f18181c = new tu(cxVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User c22 = cxVar2.getMessagesController().c2(Long.valueOf(j10));
                    str = org.telegram.messenger.i5.m(15, c22.first_name, null);
                    chat = c22;
                } else {
                    TLRPC.Chat O0 = cxVar2.getMessagesController().O0(Long.valueOf(-j10));
                    str = O0.title;
                    chat = O0;
                }
                if (cxVar2.t4()) {
                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoriesMovedToDialogs", null, 2131744523, str));
                } else {
                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoriesMovedToContacts", null, 2131744524, org.telegram.messenger.i5.m(15, str, null)));
                }
                cxVar2.T = org.telegram.ui.Components.lc.Y().V(Collections.singletonList(chat), W2, null, aVar).j();
                return;
            case 1:
                cxVar.getMessagesController().R1().l0(j3, !z10, false);
                return;
            default:
                cxVar.getMessagesController().R1().l0(j3, z10, true);
                return;
        }
    }
}
