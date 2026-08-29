package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class v51 implements Runnable {
    public final int f43435a;
    public final z51 f43436b;
    public final Integer f43437c;

    public v51(z51 z51Var, Integer num, int i10) {
        this.f43435a = i10;
        this.f43436b = z51Var;
        this.f43437c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f43435a;
        z51 z51Var = this.f43436b;
        switch (i10) {
            case 0:
                z51.a(z51Var, this.f43437c);
                return;
            default:
                z51Var.getClass();
                Integer num = this.f43437c;
                if (num != null) {
                    try {
                        z51Var.L.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    s41 s41Var = (s41) z51Var;
                    t41 t41Var = s41Var.O;
                    d61 d61Var = t41Var.f42550e;
                    List list = d61.V1;
                    d61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = s41Var.M;
                    long j10 = ((m51) view).f40429e.documentId;
                    tL_emojiStatus.document_id = j10;
                    t41Var.f42550e.p(view, Long.valueOf(j10), ((m51) s41Var.M).f40429e.document, s41Var.N, num);
                    if (s41Var.N == null) {
                        MediaDataController.getInstance(t41Var.f42550e.R).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
