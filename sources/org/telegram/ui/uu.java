package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
public final class uu implements Runnable {
    public final int f50470a;
    public final yw f50471b;
    public final long f50472c;
    public final boolean d;

    public uu(yw ywVar, long j3, boolean z9, int i7) {
        this.f50470a = i7;
        this.f50471b = ywVar;
        this.f50472c = j3;
        this.d = z9;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder X2;
        int i7 = this.f50470a;
        boolean z9 = this.d;
        long j3 = this.f50472c;
        yw ywVar = this.f50471b;
        switch (i7) {
            case 0:
                yw ywVar2 = this.f50471b;
                di.z6 P1 = ywVar2.getMessagesController().P1();
                long j10 = this.f50472c;
                boolean z10 = this.d;
                P1.l0(j10, z10, false);
                ?? obj = new Object();
                obj.f19611a = new uu(ywVar2, j10, z10, 1);
                obj.f19612b = new uu(ywVar2, j10, z10, 2);
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
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoriesMovedToDialogs", null, 2131744758, str));
                } else {
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoriesMovedToContacts", null, 2131744759, org.telegram.messenger.g5.m(15, str, null)));
                }
                ywVar2.S = org.telegram.ui.Components.hc.X().V(Collections.singletonList(chat), X2, null, obj).j();
                return;
            case 1:
                ywVar.getMessagesController().P1().l0(j3, !z9, false);
                return;
            default:
                ywVar.getMessagesController().P1().l0(j3, z9, true);
                return;
        }
    }
}
