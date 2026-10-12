package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w51 implements Utilities.Callback {
    public final int f43044a;
    public final LinkedHashSet f43045b;
    public final Runnable f43046c;

    public w51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f43044a = i10;
        this.f43045b = linkedHashSet;
        this.f43046c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43044a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f43045b.addAll(arrayList);
                }
                this.f43046c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f43045b.addAll(tL_emojiList.document_id);
                }
                this.f43046c.run();
                return;
        }
    }
}
