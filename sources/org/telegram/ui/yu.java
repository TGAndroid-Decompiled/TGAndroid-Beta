package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class yu implements xx, ts {
    public final bv f46084a;

    public yu(bv bvVar) {
        this.f46084a = bvVar;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(ey eyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f46084a.m0(user);
    }

    @Override
    public boolean v(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, cf1 cf1Var) {
        if (!arrayList.isEmpty()) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j10)) {
                bv bvVar = this.f46084a;
                bvVar.m0(bvVar.getMessagesController().getUser(Long.valueOf(j10)));
                return true;
            }
            return true;
        }
        return true;
    }
}
