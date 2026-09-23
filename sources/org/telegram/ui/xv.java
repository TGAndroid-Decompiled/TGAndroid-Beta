package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class xv implements org.telegram.ui.Components.al0 {
    public final int f39667a;
    public final ry f39668b;

    public xv(ry ryVar, int i10) {
        this.f39667a = i10;
        this.f39668b = ryVar;
    }

    @Override
    public final void d(int i10, View view) {
        gg.q0 q0Var;
        switch (this.f39667a) {
            case 0:
                ry ryVar = this.f39668b;
                Object obj = ryVar.C0.f30354v0.G(i10).G;
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
                    ry.d4(xnVar, messageObject);
                    ryVar.presentFragment(xnVar);
                    return;
                } else if (obj instanceof ai.v8) {
                    ai.v8 v8Var = (ai.v8) obj;
                    Bundle e = org.telegram.ui.Cells.q3.e(3, "type");
                    e.putString("hashtag", v8Var.C);
                    e.putInt("storiesCount", v8Var.J);
                    ryVar.presentFragment(new org.telegram.ui.Components.ca0(e, null));
                    return;
                } else {
                    return;
                }
            default:
                ry ryVar2 = this.f39668b;
                ryVar2.f36962b0.I0(true);
                ArrayList arrayList = ryVar2.f36962b0.X2;
                if (arrayList.isEmpty()) {
                    q0Var = gg.s0.f9897c3[i10];
                } else {
                    q0Var = (gg.q0) arrayList.get(i10);
                }
                ryVar2.j3(q0Var);
                return;
        }
    }
}
