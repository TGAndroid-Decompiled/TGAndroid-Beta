package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class r61 implements Runnable {
    public final int f36703a;
    public final v61 f36704b;
    public final Integer f36705c;

    public r61(v61 v61Var, Integer num, int i10) {
        this.f36703a = i10;
        this.f36704b = v61Var;
        this.f36705c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f36703a;
        v61 v61Var = this.f36704b;
        switch (i10) {
            case 0:
                v61.a(v61Var, this.f36705c);
                return;
            default:
                v61Var.getClass();
                Integer num = this.f36705c;
                if (num != null) {
                    try {
                        v61Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    o51 o51Var = (o51) v61Var;
                    p51 p51Var = o51Var.S;
                    z61 z61Var = p51Var.e;
                    List list = z61.Z1;
                    z61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = o51Var.Q;
                    long j3 = ((i61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    p51Var.e.p(view, Long.valueOf(j3), ((i61) o51Var.Q).e.document, o51Var.R, num);
                    if (o51Var.R == null) {
                        MediaDataController.getInstance(p51Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
