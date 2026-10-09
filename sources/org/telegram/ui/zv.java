package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class zv implements org.telegram.ui.Components.em0 {
    public final int f45079a;
    public final ty f45080b;

    public zv(ty tyVar, int i10) {
        this.f45079a = i10;
        this.f45080b = tyVar;
    }

    @Override
    public final void d(int i10, View view) {
        gg.p0 p0Var;
        switch (this.f45079a) {
            case 0:
                ty tyVar = this.f45080b;
                Object obj = tyVar.C0.f25785v0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    zn znVar = new zn(bundle);
                    ty.a4(znVar, messageObject);
                    tyVar.presentFragment(znVar);
                    return;
                } else if (obj instanceof ai.w8) {
                    ai.w8 w8Var = (ai.w8) obj;
                    Bundle f7 = org.telegram.ui.Cells.c1.f(3, "type");
                    f7.putString("hashtag", w8Var.C);
                    f7.putInt("storiesCount", w8Var.J);
                    tyVar.presentFragment(new org.telegram.ui.Components.db0(f7, null));
                    return;
                } else {
                    return;
                }
            default:
                ty tyVar2 = this.f45080b;
                tyVar2.f42155b0.I0(true);
                ArrayList arrayList = tyVar2.f42155b0.V2;
                if (arrayList.isEmpty()) {
                    p0Var = gg.r0.f10779a3[i10];
                } else {
                    p0Var = (gg.p0) arrayList.get(i10);
                }
                tyVar2.g3(p0Var);
                return;
        }
    }
}
