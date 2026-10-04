package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class u61 implements Runnable {
    public final int f41077a;
    public final y61 f41078b;
    public final Integer f41079c;

    public u61(y61 y61Var, Integer num, int i10) {
        this.f41077a = i10;
        this.f41078b = y61Var;
        this.f41079c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f41077a;
        y61 y61Var = this.f41078b;
        switch (i10) {
            case 0:
                y61.a(y61Var, this.f41079c);
                return;
            default:
                y61Var.getClass();
                Integer num = this.f41079c;
                if (num != null) {
                    try {
                        y61Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    r51 r51Var = (r51) y61Var;
                    s51 s51Var = r51Var.S;
                    c71 c71Var = s51Var.f40370e;
                    List list = c71.Z1;
                    c71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = r51Var.Q;
                    long j3 = ((l61) view).f38179e.documentId;
                    tL_emojiStatus.document_id = j3;
                    s51Var.f40370e.p(view, Long.valueOf(j3), ((l61) r51Var.Q).f38179e.document, r51Var.R, num);
                    if (r51Var.R == null) {
                        MediaDataController.getInstance(s51Var.f40370e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
