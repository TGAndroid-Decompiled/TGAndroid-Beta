package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class t51 implements Runnable {
    public final int f41876a;
    public final x51 f41877b;
    public final Integer f41878c;

    public t51(x51 x51Var, Integer num, int i10) {
        this.f41876a = i10;
        this.f41877b = x51Var;
        this.f41878c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f41876a;
        x51 x51Var = this.f41877b;
        switch (i10) {
            case 0:
                x51.a(x51Var, this.f41878c);
                return;
            default:
                x51Var.getClass();
                Integer num = this.f41878c;
                if (num != null) {
                    try {
                        x51Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    q41 q41Var = (q41) x51Var;
                    r41 r41Var = q41Var.S;
                    b61 b61Var = r41Var.e;
                    List list = b61.a2;
                    b61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = q41Var.Q;
                    long j10 = ((k51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    r41Var.e.p(view, Long.valueOf(j10), ((k51) q41Var.Q).e.document, q41Var.R, num);
                    if (q41Var.R == null) {
                        MediaDataController.getInstance(r41Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
