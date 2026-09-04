package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s51 implements Utilities.Callback {
    public final int f40309a;
    public final LinkedHashSet f40310b;
    public final Runnable f40311c;

    public s51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f40309a = i10;
        this.f40310b = linkedHashSet;
        this.f40311c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40309a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f40310b.addAll(arrayList);
                }
                this.f40311c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f40310b.addAll(tL_emojiList.document_id);
                }
                this.f40311c.run();
                return;
        }
    }
}
