package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class wu implements ux, rs {
    public final zu f45556a;

    public wu(zu zuVar) {
        this.f45556a = zuVar;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(cy cyVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f45556a.m0(user);
    }

    @Override
    public boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        if (!arrayList.isEmpty()) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j10)) {
                zu zuVar = this.f45556a;
                zuVar.m0(zuVar.getMessagesController().getUser(Long.valueOf(j10)));
                return true;
            }
            return true;
        }
        return true;
    }
}
