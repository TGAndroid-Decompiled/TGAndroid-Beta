package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class y61 implements Runnable {
    public final int f39711a;
    public final c71 f39712b;
    public final Integer f39713c;

    public y61(c71 c71Var, Integer num, int i10) {
        this.f39711a = i10;
        this.f39712b = c71Var;
        this.f39713c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f39711a;
        c71 c71Var = this.f39712b;
        switch (i10) {
            case 0:
                c71.a(c71Var, this.f39713c);
                return;
            default:
                c71Var.getClass();
                Integer num = this.f39713c;
                if (num != null) {
                    try {
                        c71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    v51 v51Var = (v51) c71Var;
                    w51 w51Var = v51Var.S;
                    g71 g71Var = w51Var.e;
                    List list = g71.Z1;
                    g71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = v51Var.Q;
                    long j3 = ((p61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    w51Var.e.p(view, Long.valueOf(j3), ((p61) v51Var.Q).e.document, v51Var.R, num);
                    if (v51Var.R == null) {
                        MediaDataController.getInstance(w51Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
