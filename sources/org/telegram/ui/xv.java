package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class xv implements org.telegram.ui.Components.jl0 {
    public final int f43483a;
    public final py f43484b;

    public xv(py pyVar, int i10) {
        this.f43483a = i10;
        this.f43484b = pyVar;
    }

    @Override
    public final void f(int i10, View view) {
        uf.e0 e0Var;
        switch (this.f43483a) {
            case 0:
                py pyVar = this.f43484b;
                Object obj = pyVar.f40306z0.f26614s0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    xn xnVar = new xn(bundle);
                    py.d4(xnVar, messageObject);
                    pyVar.presentFragment(xnVar);
                    return;
                } else if (obj instanceof oh.f6) {
                    oh.f6 f6Var = (oh.f6) obj;
                    Bundle h = android.support.v4.media.a.h(3, "type");
                    h.putString("hashtag", f6Var.C);
                    h.putInt("storiesCount", f6Var.J);
                    pyVar.presentFragment(new org.telegram.ui.Components.fa0(h, null));
                    return;
                } else {
                    return;
                }
            default:
                py pyVar2 = this.f43484b;
                pyVar2.Y.I0(true);
                ArrayList arrayList = pyVar2.Y.U2;
                if (arrayList.isEmpty()) {
                    e0Var = uf.g0.Z2[i10];
                } else {
                    e0Var = (uf.e0) arrayList.get(i10);
                }
                pyVar2.j3(e0Var);
                return;
        }
    }
}
