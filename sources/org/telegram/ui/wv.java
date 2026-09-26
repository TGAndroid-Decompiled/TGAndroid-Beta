package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class wv implements org.telegram.ui.Components.kl0 {
    public final int f39765a;
    public final qy f39766b;

    public wv(qy qyVar, int i10) {
        this.f39765a = i10;
        this.f39766b = qyVar;
    }

    @Override
    public final void d(int i10, View view) {
        gg.q0 q0Var;
        switch (this.f39765a) {
            case 0:
                qy qyVar = this.f39766b;
                Object obj = qyVar.C0.f26170v0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    wn wnVar = new wn(bundle);
                    qy.d4(wnVar, messageObject);
                    qyVar.presentFragment(wnVar);
                    return;
                } else if (obj instanceof ai.v8) {
                    ai.v8 v8Var = (ai.v8) obj;
                    Bundle g10 = org.telegram.ui.Cells.c1.g(3, "type");
                    g10.putString("hashtag", v8Var.C);
                    g10.putInt("storiesCount", v8Var.J);
                    qyVar.presentFragment(new org.telegram.ui.Components.na0(g10, null));
                    return;
                } else {
                    return;
                }
            default:
                qy qyVar2 = this.f39766b;
                qyVar2.f37017b0.I0(true);
                ArrayList arrayList = qyVar2.f37017b0.X2;
                if (arrayList.isEmpty()) {
                    q0Var = gg.s0.f9896c3[i10];
                } else {
                    q0Var = (gg.q0) arrayList.get(i10);
                }
                qyVar2.j3(q0Var);
                return;
        }
    }
}
