package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class s61 implements Runnable {
    public final int f37603a;
    public final w61 f37604b;
    public final Integer f37605c;

    public s61(w61 w61Var, Integer num, int i10) {
        this.f37603a = i10;
        this.f37604b = w61Var;
        this.f37605c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f37603a;
        w61 w61Var = this.f37604b;
        switch (i10) {
            case 0:
                w61.a(w61Var, this.f37605c);
                return;
            default:
                w61Var.getClass();
                Integer num = this.f37605c;
                if (num != null) {
                    try {
                        w61Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    p51 p51Var = (p51) w61Var;
                    q51 q51Var = p51Var.S;
                    a71 a71Var = q51Var.e;
                    List list = a71.Z1;
                    a71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = p51Var.Q;
                    long j3 = ((j61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    q51Var.e.p(view, Long.valueOf(j3), ((j61) p51Var.Q).e.document, p51Var.R, num);
                    if (p51Var.R == null) {
                        MediaDataController.getInstance(q51Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
