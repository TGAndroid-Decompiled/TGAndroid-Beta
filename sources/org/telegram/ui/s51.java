package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s51 implements Utilities.Callback {
    public final int f40336a;
    public final LinkedHashSet f40337b;
    public final Runnable f40338c;

    public s51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f40336a = i10;
        this.f40337b = linkedHashSet;
        this.f40338c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40336a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f40337b.addAll(arrayList);
                }
                this.f40338c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f40337b.addAll(tL_emojiList.document_id);
                }
                this.f40338c.run();
                return;
        }
    }
}
