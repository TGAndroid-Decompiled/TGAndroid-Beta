package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class u61 implements Runnable {
    public final int f41070a;
    public final y61 f41071b;
    public final Integer f41072c;

    public u61(y61 y61Var, Integer num, int i10) {
        this.f41070a = i10;
        this.f41071b = y61Var;
        this.f41072c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f41070a;
        y61 y61Var = this.f41071b;
        switch (i10) {
            case 0:
                y61.a(y61Var, this.f41072c);
                return;
            default:
                y61Var.getClass();
                Integer num = this.f41072c;
                if (num != null) {
                    try {
                        y61Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    r51 r51Var = (r51) y61Var;
                    s51 s51Var = r51Var.S;
                    c71 c71Var = s51Var.f40364e;
                    List list = c71.Z1;
                    c71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = r51Var.Q;
                    long j3 = ((l61) view).f38173e.documentId;
                    tL_emojiStatus.document_id = j3;
                    s51Var.f40364e.p(view, Long.valueOf(j3), ((l61) r51Var.Q).f38173e.document, r51Var.R, num);
                    if (r51Var.R == null) {
                        MediaDataController.getInstance(s51Var.f40364e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
