package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class up extends ip {
    public final boolean[] f50168d1;
    public final long f50169e1;
    public final nq f50170f1;

    public up(nq nqVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i3, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i3, true, false, null);
        this.f50170f1 = nqVar;
        this.f50168d1 = zArr;
        this.f50169e1 = j12;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f50168d1[0]) {
            nq nqVar = this.f50170f1;
            if (org.telegram.ui.Components.fc.a(nqVar)) {
                long j10 = this.f50169e1;
                if (j10 > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
                    if (a22 != null) {
                        org.telegram.ui.Components.fc.C(a22.first_name, nqVar).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
                if (M0 != null) {
                    org.telegram.ui.Components.fc.C(M0.title, nqVar).j();
                }
            }
        }
    }
}
