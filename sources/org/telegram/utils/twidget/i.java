package org.telegram.utils.twidget;

import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class i implements v10 {
    public final boolean[] f52822a;
    public final bi.i0 f52823b;
    public final u f52824c;
    public final long d;

    public i(boolean[] zArr, bi.i0 i0Var, u uVar, long j3) {
        this.f52822a = zArr;
        this.f52823b = i0Var;
        this.f52824c = uVar;
        this.d = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        boolean[] zArr = this.f52822a;
        if (zArr[0]) {
            return;
        }
        int i7 = 1;
        zArr[0] = true;
        org.telegram.messenger.g0.r(this.f52823b);
        u uVar = this.f52824c;
        long j3 = this.d;
        if (tL_messages_botWidgetQueryAnswer != null) {
            uVar.a(0, p.A(tL_messages_botWidgetQueryAnswer.result), j3);
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
        uVar.a(i7, null, j3);
    }
}
