package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class zu implements yx, ss {
    public final cv f45333a;

    public zu(cv cvVar) {
        this.f45333a = cvVar;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(fy fyVar) {
        return false;
    }

    @Override
    public void d(TLRPC.User user) {
        this.f45333a.l0(user);
    }

    @Override
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        if (!arrayList.isEmpty()) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            if (DialogObject.isUserDialog(j10)) {
                cv cvVar = this.f45333a;
                cvVar.l0(cvVar.getMessagesController().getUser(Long.valueOf(j10)));
                return true;
            }
            return true;
        }
        return true;
    }
}
