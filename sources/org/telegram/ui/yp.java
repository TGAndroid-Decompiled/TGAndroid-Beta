package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yp extends mp {
    public final boolean[] f52151c1;
    public final long f52152d1;
    public final qq f52153e1;

    public yp(qq qqVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.f52153e1 = qqVar;
        this.f52151c1 = zArr;
        this.f52152d1 = j11;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 && z10 && this.f52151c1[0]) {
            qq qqVar = this.f52153e1;
            if (org.telegram.ui.Components.hc.a(qqVar)) {
                long j3 = this.f52152d1;
                if (j3 > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
                    if (a22 != null) {
                        org.telegram.ui.Components.hc.C(a22.first_name, qqVar).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
                if (M0 != null) {
                    org.telegram.ui.Components.hc.C(M0.title, qqVar).j();
                }
            }
        }
    }
}
