package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class t51 implements Runnable {
    public final int f42860a;
    public final x51 f42861b;
    public final Integer f42862c;

    public t51(x51 x51Var, Integer num, int i9) {
        this.f42860a = i9;
        this.f42861b = x51Var;
        this.f42862c = num;
    }

    @Override
    public final void run() {
        int i9 = this.f42860a;
        x51 x51Var = this.f42861b;
        switch (i9) {
            case 0:
                x51.a(x51Var, this.f42862c);
                return;
            default:
                x51Var.getClass();
                Integer num = this.f42862c;
                if (num != null) {
                    try {
                        x51Var.L.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    q41 q41Var = (q41) x51Var;
                    r41 r41Var = q41Var.O;
                    b61 b61Var = r41Var.f42269e;
                    List list = b61.V1;
                    b61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = q41Var.M;
                    long j10 = ((k51) view).f39713e.documentId;
                    tL_emojiStatus.document_id = j10;
                    r41Var.f42269e.p(view, Long.valueOf(j10), ((k51) q41Var.M).f39713e.document, q41Var.N, num);
                    if (q41Var.N == null) {
                        MediaDataController.getInstance(r41Var.f42269e.R).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
