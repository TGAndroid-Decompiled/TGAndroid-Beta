package org.telegram.utils.twidget;

import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
public final class i implements k20 {
    public final boolean[] f44361a;
    public final org.telegram.messenger.voip.g f44362b;
    public final w f44363c;
    public final long d;

    public i(boolean[] zArr, org.telegram.messenger.voip.g gVar, w wVar, long j10) {
        this.f44361a = zArr;
        this.f44362b = gVar;
        this.f44363c = wVar;
        this.d = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        boolean[] zArr = this.f44361a;
        if (zArr[0]) {
            return;
        }
        int i10 = 1;
        zArr[0] = true;
        org.telegram.messenger.i0.r(this.f44362b);
        w wVar = this.f44363c;
        long j10 = this.d;
        if (tL_messages_botWidgetQueryAnswer != null) {
            wVar.a(0, p.A(tL_messages_botWidgetQueryAnswer.result), j10);
            return;
        }
        if (tL_error != null) {
            str = tL_error.text;
        } else {
            str = "";
        }
        if (!"WIDGET_RESPONSE_TIMEOUT".equals(str)) {
            if (str != null && str.startsWith("FLOOD_WAIT")) {
                i10 = 2;
            } else {
                i10 = 3;
            }
        }
        wVar.a(i10, null, j10);
    }
}
