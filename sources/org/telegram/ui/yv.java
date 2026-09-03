package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class yv implements org.telegram.ui.Components.hl0 {
    public final int f40330a;
    public final qy f40331b;

    public yv(qy qyVar, int i10) {
        this.f40330a = i10;
        this.f40331b = qyVar;
    }

    @Override
    public final void d(int i10, View view) {
        tf.e0 e0Var;
        switch (this.f40330a) {
            case 0:
                qy qyVar = this.f40331b;
                Object obj = qyVar.f37647z0.f24000s0.G(i10).G;
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
                    qy.d4(znVar, messageObject);
                    qyVar.presentFragment(znVar);
                    return;
                } else if (obj instanceof nh.f6) {
                    nh.f6 f6Var = (nh.f6) obj;
                    Bundle h = android.support.v4.media.a.h(3, "type");
                    h.putString("hashtag", f6Var.C);
                    h.putInt("storiesCount", f6Var.J);
                    qyVar.presentFragment(new org.telegram.ui.Components.ea0(h, null));
                    return;
                } else {
                    return;
                }
            default:
                qy qyVar2 = this.f40331b;
                qyVar2.Y.I0(true);
                ArrayList arrayList = qyVar2.Y.U2;
                if (arrayList.isEmpty()) {
                    e0Var = tf.g0.Z2[i10];
                } else {
                    e0Var = (tf.e0) arrayList.get(i10);
                }
                qyVar2.j3(e0Var);
                return;
        }
    }
}
