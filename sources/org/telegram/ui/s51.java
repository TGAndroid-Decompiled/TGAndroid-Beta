package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s51 implements Utilities.Callback {
    public final int f40337a;
    public final LinkedHashSet f40338b;
    public final Runnable f40339c;

    public s51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f40337a = i10;
        this.f40338b = linkedHashSet;
        this.f40339c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40337a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f40338b.addAll(arrayList);
                }
                this.f40339c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f40338b.addAll(tL_emojiList.document_id);
                }
                this.f40339c.run();
                return;
        }
    }
}
