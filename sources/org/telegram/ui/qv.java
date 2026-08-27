package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

public final class qv implements org.telegram.ui.Components.pk0 {

    public final int f41748a;

    public final gy f41749b;

    public qv(gy gyVar, int i10) {
        this.f41748a = i10;
        this.f41749b = gyVar;
    }

    @Override
    public final void a(int i10, View view) {
        switch (this.f41748a) {
            case 0:
                gy gyVar = this.f41749b;
                Object obj = gyVar.f38619y0.f29758r0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    rn rnVar = new rn(bundle);
                    gy.d4(rnVar, messageObject);
                    gyVar.presentFragment(rnVar);
                } else if (obj instanceof jh.d6) {
                    jh.d6 d6Var = (jh.d6) obj;
                    Bundle bundleG = a9.p.g(3, "type");
                    bundleG.putString("hashtag", d6Var.C);
                    bundleG.putInt("storiesCount", d6Var.J);
                    gyVar.presentFragment(new org.telegram.ui.Components.o90(bundleG, null));
                }
                break;
            default:
                gy gyVar2 = this.f41749b;
                gyVar2.X.I0(true);
                ArrayList arrayList = gyVar2.X.T2;
                gyVar2.j3(arrayList.isEmpty() ? pf.g0.Y2[i10] : (pf.e0) arrayList.get(i10));
                break;
        }
    }
}
