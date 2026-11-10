package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
public final class vu implements Runnable {
    public final int f50799a;
    public final zw f50800b;
    public final long f50801c;
    public final boolean d;

    public vu(zw zwVar, long j3, boolean z9, int i7) {
        this.f50799a = i7;
        this.f50800b = zwVar;
        this.f50801c = j3;
        this.d = z9;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder X2;
        int i7 = this.f50799a;
        boolean z9 = this.d;
        long j3 = this.f50801c;
        zw zwVar = this.f50800b;
        switch (i7) {
            case 0:
                zw zwVar2 = this.f50800b;
                di.z6 P1 = zwVar2.getMessagesController().P1();
                long j10 = this.f50801c;
                boolean z10 = this.d;
                P1.l0(j10, z10, false);
                ?? obj = new Object();
                obj.f19616a = new vu(zwVar2, j10, z10, 1);
                obj.f19617b = new vu(zwVar2, j10, z10, 2);
                if (j10 >= 0) {
                    TLRPC.User a22 = zwVar2.getMessagesController().a2(Long.valueOf(j10));
                    str = org.telegram.messenger.g5.m(15, a22.first_name, null);
                    chat = a22;
                } else {
                    TLRPC.Chat M0 = zwVar2.getMessagesController().M0(Long.valueOf(-j10));
                    str = M0.title;
                    chat = M0;
                }
                if (zwVar2.q4()) {
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoriesMovedToDialogs", null, 2131744758, str));
                } else {
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoriesMovedToContacts", null, 2131744759, org.telegram.messenger.g5.m(15, str, null)));
                }
                zwVar2.S = org.telegram.ui.Components.gc.X().V(Collections.singletonList(chat), X2, null, obj).j();
                return;
            case 1:
                zwVar.getMessagesController().P1().l0(j3, !z9, false);
                return;
            default:
                zwVar.getMessagesController().P1().l0(j3, z9, true);
                return;
        }
    }
}
