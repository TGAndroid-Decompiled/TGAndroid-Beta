package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

public final class s51 implements Runnable {

    public final int f42519a;

    public final w51 f42520b;

    public final Integer f42521c;

    public s51(w51 w51Var, Integer num, int i10) {
        this.f42519a = i10;
        this.f42520b = w51Var;
        this.f42521c = num;
    }

    @Override
    public final void run() {
        int i10 = this.f42519a;
        w51 w51Var = this.f42520b;
        switch (i10) {
            case 0:
                w51.a(w51Var, this.f42521c);
                break;
            default:
                w51Var.getClass();
                Integer num = this.f42521c;
                if (num != null) {
                    try {
                        w51Var.L.performHapticFeedback(0, 1);
                        break;
                    } catch (Exception unused) {
                    }
                    p41 p41Var = (p41) w51Var;
                    q41 q41Var = p41Var.O;
                    a61 a61Var = q41Var.f41521e;
                    List list = a61.V1;
                    a61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = p41Var.M;
                    long j10 = ((j51) view).f39259e.documentId;
                    tL_emojiStatus.document_id = j10;
                    q41Var.f41521e.p(view, Long.valueOf(j10), ((j51) p41Var.M).f39259e.document, p41Var.N, num);
                    if (p41Var.N == null) {
                        MediaDataController.getInstance(q41Var.f41521e.R).pushRecentEmojiStatus(tL_emojiStatus);
                    }
                }
                break;
        }
    }
}
