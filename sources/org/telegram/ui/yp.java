package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yp extends mp {
    public final boolean[] f53603d1;
    public final long f53604e1;
    public final qq f53605f1;

    public yp(qq qqVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.f53605f1 = qqVar;
        this.f53603d1 = zArr;
        this.f53604e1 = j11;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f53603d1[0]) {
            qq qqVar = this.f53605f1;
            if (org.telegram.ui.Components.cc.a(qqVar)) {
                long j3 = this.f53604e1;
                if (j3 > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
                    if (a22 != null) {
                        org.telegram.ui.Components.cc.C(a22.first_name, qqVar).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
                if (M0 != null) {
                    org.telegram.ui.Components.cc.C(M0.title, qqVar).j();
                }
            }
        }
    }
}
