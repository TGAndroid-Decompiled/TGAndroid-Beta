package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class s51 implements Runnable {
    public final int f41302a;
    public final w51 f41303b;
    public final Integer f41304c;

    public s51(w51 w51Var, Integer num, int i10) {
        this.f41302a = i10;
        this.f41303b = w51Var;
        this.f41304c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f41302a;
        w51 w51Var = this.f41303b;
        switch (i10) {
            case 0:
                w51.a(w51Var, this.f41304c);
                return;
            default:
                w51Var.getClass();
                Integer num = this.f41304c;
                if (num != null) {
                    try {
                        w51Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    p41 p41Var = (p41) w51Var;
                    q41 q41Var = p41Var.S;
                    a61 a61Var = q41Var.e;
                    List list = a61.a2;
                    a61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = p41Var.Q;
                    long j10 = ((j51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    q41Var.e.p(view, Long.valueOf(j10), ((j51) p41Var.Q).e.document, p41Var.R, num);
                    if (p41Var.R == null) {
                        MediaDataController.getInstance(q41Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
