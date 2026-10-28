package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class x51 implements Runnable {
    public final int f45599a;
    public final b61 f45600b;
    public final Integer f45601c;

    public x51(b61 b61Var, Integer num, int i10) {
        this.f45599a = i10;
        this.f45600b = b61Var;
        this.f45601c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f45599a;
        b61 b61Var = this.f45600b;
        switch (i10) {
            case 0:
                b61.a(b61Var, this.f45601c);
                return;
            default:
                b61Var.getClass();
                Integer num = this.f45601c;
                if (num != null) {
                    try {
                        b61Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    u41 u41Var = (u41) b61Var;
                    v41 v41Var = u41Var.S;
                    f61 f61Var = v41Var.e;
                    List list = f61.a2;
                    f61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = u41Var.Q;
                    long j10 = ((o51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    v41Var.e.p(view, Long.valueOf(j10), ((o51) u41Var.Q).e.document, u41Var.R, num);
                    if (u41Var.R == null) {
                        MediaDataController.getInstance(v41Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
