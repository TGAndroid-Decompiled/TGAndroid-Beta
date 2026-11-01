package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vq extends iq {
    public final boolean[] f42580c1;
    public final long f42581d1;
    public final pr f42582e1;

    public vq(pr prVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f42582e1 = prVar;
        this.f42580c1 = zArr;
        this.f42581d1 = j12;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f42580c1[0]) {
            pr prVar = this.f42582e1;
            if (org.telegram.ui.Components.cc.a(prVar)) {
                long j10 = this.f42581d1;
                if (j10 > 0) {
                    TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
                    if (Z1 != null) {
                        org.telegram.ui.Components.cc.C(Z1.first_name, prVar).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j10));
                if (L0 != null) {
                    org.telegram.ui.Components.cc.C(L0.title, prVar).j();
                }
            }
        }
    }
}
