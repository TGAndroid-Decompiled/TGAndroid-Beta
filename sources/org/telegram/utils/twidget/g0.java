package org.telegram.utils.twidget;

import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class g0 implements v10 {
    public final boolean[] f52801a;
    public final bi.i0 f52802b;
    public final v0 f52803c;
    public final long d;

    public g0(boolean[] zArr, bi.i0 i0Var, v0 v0Var, long j3) {
        this.f52801a = zArr;
        this.f52802b = i0Var;
        this.f52803c = v0Var;
        this.d = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        boolean[] zArr = this.f52801a;
        if (zArr[0]) {
            return;
        }
        int i7 = 1;
        zArr[0] = true;
        org.telegram.messenger.g0.r(this.f52802b);
        v0 v0Var = this.f52803c;
        long j3 = this.d;
        if (tL_messages_botWidgetQueryAnswer != null) {
            v0Var.b(0, n0.C(tL_messages_botWidgetQueryAnswer.result), j3);
            return;
        }
        if (tL_error != null) {
            str = tL_error.text;
        } else {
            str = "";
        }
        if (!"WIDGET_RESPONSE_TIMEOUT".equals(str)) {
            if (str != null && str.startsWith("FLOOD_WAIT")) {
                i7 = 2;
            } else {
                i7 = 3;
            }
        }
        v0Var.b(i7, null, j3);
    }
}
