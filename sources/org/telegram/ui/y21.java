package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class y21 implements Runnable {
    public final int f43544a;
    public final c31 f43545b;
    public final Integer f43546c;

    public y21(c31 c31Var, Integer num, int i10) {
        this.f43544a = i10;
        this.f43545b = c31Var;
        this.f43546c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f43544a;
        c31 c31Var = this.f43545b;
        switch (i10) {
            case 0:
                c31.a(c31Var, this.f43546c);
                return;
            default:
                Integer num = this.f43546c;
                if (num != null) {
                    try {
                        c31Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    w11 w11Var = (w11) c31Var;
                    g31 g31Var = w11Var.S.e;
                    List list = g31.a2;
                    g31Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = w11Var.Q;
                    long j10 = ((q21) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    g31Var.p(view, Long.valueOf(j10), ((q21) w11Var.Q).e.document, w11Var.R, num);
                    if (w11Var.R == null) {
                        org.telegram.messenger.vi.b0(g31Var.V).C1(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
