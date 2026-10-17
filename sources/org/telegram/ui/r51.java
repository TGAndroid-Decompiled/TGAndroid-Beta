package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class r51 implements Runnable {
    public final int f40583a;
    public final v51 f40584b;
    public final Integer f40585c;

    public r51(v51 v51Var, Integer num, int i10) {
        this.f40583a = i10;
        this.f40584b = v51Var;
        this.f40585c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f40583a;
        v51 v51Var = this.f40584b;
        switch (i10) {
            case 0:
                v51.a(v51Var, this.f40585c);
                return;
            default:
                v51Var.getClass();
                Integer num = this.f40585c;
                if (num != null) {
                    try {
                        v51Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    o41 o41Var = (o41) v51Var;
                    p41 p41Var = o41Var.S;
                    z51 z51Var = p41Var.e;
                    List list = z51.Z1;
                    z51Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = o41Var.Q;
                    long j10 = ((i51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    p41Var.e.p(view, Long.valueOf(j10), ((i51) o41Var.Q).e.document, o41Var.R, num);
                    if (o41Var.R == null) {
                        MediaDataController.getInstance(p41Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
