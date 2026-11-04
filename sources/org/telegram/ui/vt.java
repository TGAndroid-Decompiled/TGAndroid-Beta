package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vt implements nw, tr {
    public final yt f50611a;

    public vt(yt ytVar) {
        this.f50611a = ytVar;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(uw uwVar) {
        return false;
    }

    @Override
    public void c(TLRPC.User user) {
        this.f50611a.q0(user);
    }

    @Override
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        if (!arrayList.isEmpty()) {
            long j10 = ((org.telegram.messenger.pr) arrayList.get(0)).f24797a;
            if (org.telegram.messenger.m5.E(j10)) {
                yt ytVar = this.f50611a;
                ytVar.q0(ytVar.getMessagesController().a2(Long.valueOf(j10)));
                return true;
            }
            return true;
        }
        return true;
    }
}
