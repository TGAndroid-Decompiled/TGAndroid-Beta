package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zp extends np {
    public final boolean[] f54576d1;
    public final long f54577e1;
    public final rq f54578f1;

    public zp(rq rqVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i7, true, false, null);
        this.f54578f1 = rqVar;
        this.f54576d1 = zArr;
        this.f54577e1 = j11;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f54576d1[0]) {
            rq rqVar = this.f54578f1;
            if (org.telegram.ui.Components.lc.a(rqVar)) {
                long j3 = this.f54577e1;
                if (j3 > 0) {
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
                    if (c22 != null) {
                        org.telegram.ui.Components.lc.C(c22.first_name, rqVar).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
                if (O0 != null) {
                    org.telegram.ui.Components.lc.C(O0.title, rqVar).j();
                }
            }
        }
    }
}
