package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class yu implements wx, ts {
    public final bv f44952a;

    public yu(bv bvVar) {
        this.f44952a = bvVar;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean I(dy dyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f44952a.k0(user);
    }

    @Override
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        if (!arrayList.isEmpty()) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j10)) {
                bv bvVar = this.f44952a;
                bvVar.k0(bvVar.getMessagesController().getUser(Long.valueOf(j10)));
                return true;
            }
            return true;
        }
        return true;
    }
}
