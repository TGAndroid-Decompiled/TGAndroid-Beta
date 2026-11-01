package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class x80 implements Runnable {
    public final int f43282a;
    public final un f43283b;
    public final long f43284c;
    public final TLRPC.Chat d;

    public x80(un unVar, long j10, TLRPC.Chat chat, int i10) {
        this.f43282a = i10;
        this.f43283b = unVar;
        this.f43284c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f43282a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f43284c;
        un unVar = this.f43283b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.ui.Components.cc.a0(unVar).I(2131624223, org.telegram.messenger.dd.L0(2131745012, null), org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G((int) j10, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
            default:
                org.telegram.ui.Components.cc.a0(unVar).I(2131624223, org.telegram.messenger.dd.L0(2131745012, null), org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G((int) j10, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
        }
    }
}
