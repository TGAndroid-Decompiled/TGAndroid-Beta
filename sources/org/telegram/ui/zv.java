package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class zv implements org.telegram.ui.Components.ml0 {
    public final int f40594a;
    public final ty f40595b;

    public zv(ty tyVar, int i10) {
        this.f40594a = i10;
        this.f40595b = tyVar;
    }

    @Override
    public final void d(int i10, View view) {
        gg.q0 q0Var;
        switch (this.f40594a) {
            case 0:
                ty tyVar = this.f40595b;
                Object obj = tyVar.C0.f26515w0.G(i10).G;
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
                    ty.m4(xnVar, messageObject);
                    tyVar.presentFragment(xnVar);
                    return;
                } else if (obj instanceof ai.v8) {
                    ai.v8 v8Var = (ai.v8) obj;
                    Bundle g10 = org.telegram.ui.Cells.c1.g(3, "type");
                    g10.putString("hashtag", v8Var.C);
                    g10.putInt("storiesCount", v8Var.J);
                    tyVar.presentFragment(new org.telegram.ui.Components.oa0(g10, null));
                    return;
                } else {
                    return;
                }
            default:
                ty tyVar2 = this.f40595b;
                tyVar2.f37960b0.J0(true);
                ArrayList arrayList = tyVar2.f37960b0.X2;
                if (arrayList.isEmpty()) {
                    q0Var = gg.s0.f9902c3[i10];
                } else {
                    q0Var = (gg.q0) arrayList.get(i10);
                }
                tyVar2.t3(q0Var);
                return;
        }
    }
}
