package org.telegram.ui;

import android.text.SpannableStringBuilder;
import java.util.Collections;
import org.telegram.tgnet.TLRPC;
public final class su implements Runnable {
    public final int f49826a;
    public final ww f49827b;
    public final long f49828c;
    public final boolean d;

    public su(ww wwVar, long j3, boolean z9, int i7) {
        this.f49826a = i7;
        this.f49827b = wwVar;
        this.f49828c = j3;
        this.d = z9;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder X2;
        int i7 = this.f49826a;
        boolean z9 = this.d;
        long j3 = this.f49828c;
        ww wwVar = this.f49827b;
        switch (i7) {
            case 0:
                ww wwVar2 = this.f49827b;
                di.y6 P1 = wwVar2.getMessagesController().P1();
                long j10 = this.f49828c;
                boolean z10 = this.d;
                P1.l0(j10, z10, false);
                ?? obj = new Object();
                obj.f19611a = new su(wwVar2, j10, z10, 1);
                obj.f19612b = new su(wwVar2, j10, z10, 2);
                if (j10 >= 0) {
                    TLRPC.User a22 = wwVar2.getMessagesController().a2(Long.valueOf(j10));
                    str = org.telegram.messenger.g5.m(15, a22.first_name, null);
                    chat = a22;
                } else {
                    TLRPC.Chat M0 = wwVar2.getMessagesController().M0(Long.valueOf(-j10));
                    str = M0.title;
                    chat = M0;
                }
                if (wwVar2.q4()) {
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoriesMovedToDialogs", null, 2131744761, str));
                } else {
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoriesMovedToContacts", null, 2131744762, org.telegram.messenger.g5.m(15, str, null)));
                }
                wwVar2.S = org.telegram.ui.Components.hc.X().V(Collections.singletonList(chat), X2, null, obj).j();
                return;
            case 1:
                wwVar.getMessagesController().P1().l0(j3, !z9, false);
                return;
            default:
                wwVar.getMessagesController().P1().l0(j3, z9, true);
                return;
        }
    }
}
