package org.telegram.utils.twidget;

import bi.r1;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
public final class g0 implements s10 {
    public final boolean[] f54214a;
    public final r1 f54215b;
    public final y0 f54216c;
    public final long d;

    public g0(boolean[] zArr, r1 r1Var, y0 y0Var, long j3) {
        this.f54214a = zArr;
        this.f54215b = r1Var;
        this.f54216c = y0Var;
        this.d = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        boolean[] zArr = this.f54214a;
        if (zArr[0]) {
            return;
        }
        int i7 = 1;
        zArr[0] = true;
        org.telegram.messenger.g0.r(this.f54215b);
        y0 y0Var = this.f54216c;
        long j3 = this.d;
        if (tL_messages_botWidgetQueryAnswer != null) {
            y0Var.b(0, n0.C(tL_messages_botWidgetQueryAnswer.result), j3);
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
        y0Var.b(i7, null, j3);
    }
}
