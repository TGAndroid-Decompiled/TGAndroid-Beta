package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class wv implements org.telegram.ui.Components.il0 {
    public final int f39798a;
    public final oy f39799b;

    public wv(oy oyVar, int i10) {
        this.f39798a = i10;
        this.f39799b = oyVar;
    }

    @Override
    public final void f(int i10, View view) {
        tf.e0 e0Var;
        switch (this.f39798a) {
            case 0:
                oy oyVar = this.f39799b;
                Object obj = oyVar.f37129z0.f24334s0.G(i10).G;
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
                    oy.d4(xnVar, messageObject);
                    oyVar.presentFragment(xnVar);
                    return;
                } else if (obj instanceof nh.f6) {
                    nh.f6 f6Var = (nh.f6) obj;
                    Bundle h = android.support.v4.media.a.h(3, "type");
                    h.putString("hashtag", f6Var.C);
                    h.putInt("storiesCount", f6Var.J);
                    oyVar.presentFragment(new org.telegram.ui.Components.da0(h, null));
                    return;
                } else {
                    return;
                }
            default:
                oy oyVar2 = this.f39799b;
                oyVar2.Y.I0(true);
                ArrayList arrayList = oyVar2.Y.U2;
                if (arrayList.isEmpty()) {
                    e0Var = tf.g0.Z2[i10];
                } else {
                    e0Var = (tf.e0) arrayList.get(i10);
                }
                oyVar2.j3(e0Var);
                return;
        }
    }
}
