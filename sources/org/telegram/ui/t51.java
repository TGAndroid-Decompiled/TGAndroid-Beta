package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t51 implements Utilities.Callback {
    public final int f41857a;
    public final LinkedHashSet f41858b;
    public final Runnable f41859c;

    public t51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f41857a = i10;
        this.f41858b = linkedHashSet;
        this.f41859c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41857a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f41858b.addAll(arrayList);
                }
                this.f41859c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f41858b.addAll(tL_emojiList.document_id);
                }
                this.f41859c.run();
                return;
        }
    }
}
