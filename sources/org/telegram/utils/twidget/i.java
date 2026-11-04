package org.telegram.utils.twidget;

import ai.z1;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
public final class i implements n10 {
    public final boolean[] f52887a;
    public final z1 f52888b;
    public final u f52889c;
    public final long d;

    public i(boolean[] zArr, z1 z1Var, u uVar, long j10) {
        this.f52887a = zArr;
        this.f52888b = z1Var;
        this.f52889c = uVar;
        this.d = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        boolean[] zArr = this.f52887a;
        if (zArr[0]) {
            return;
        }
        int i3 = 1;
        zArr[0] = true;
        org.telegram.messenger.g0.r(this.f52888b);
        u uVar = this.f52889c;
        long j10 = this.d;
        if (tL_messages_botWidgetQueryAnswer != null) {
            uVar.a(0, p.A(tL_messages_botWidgetQueryAnswer.result), j10);
            return;
        }
        if (tL_error != null) {
            str = tL_error.text;
        } else {
            str = "";
        }
        if (!"WIDGET_RESPONSE_TIMEOUT".equals(str)) {
            if (str != null && str.startsWith("FLOOD_WAIT")) {
                i3 = 2;
            } else {
                i3 = 3;
            }
        }
        uVar.a(i3, null, j10);
    }
}
