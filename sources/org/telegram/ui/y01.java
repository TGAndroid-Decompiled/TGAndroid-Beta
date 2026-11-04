package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class y01 implements Runnable {
    public final int f52151a;
    public final c11 f52152b;
    public final Integer f52153c;

    public y01(c11 c11Var, Integer num, int i3) {
        this.f52151a = i3;
        this.f52152b = c11Var;
        this.f52153c = num;
    }

    @Override
    public final void run() {
        int i3 = this.f52151a;
        c11 c11Var = this.f52152b;
        switch (i3) {
            case 0:
                c11.a(c11Var, this.f52153c);
                return;
            default:
                Integer num = this.f52153c;
                if (num != null) {
                    try {
                        c11Var.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    wz0 wz0Var = (wz0) c11Var;
                    g11 g11Var = wz0Var.T.f52134e;
                    List list = g11.f45431b2;
                    g11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = wz0Var.R;
                    long j10 = ((q01) view).f48720e.documentId;
                    tL_emojiStatus.document_id = j10;
                    g11Var.p(view, Long.valueOf(j10), ((q01) wz0Var.R).f48720e.document, wz0Var.S, num);
                    if (wz0Var.S == null) {
                        org.telegram.messenger.li.b0(g11Var.W).C1(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
