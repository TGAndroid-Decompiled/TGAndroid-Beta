package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s51 implements Utilities.Callback {
    public final int f40310a;
    public final LinkedHashSet f40311b;
    public final Runnable f40312c;

    public s51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f40310a = i10;
        this.f40311b = linkedHashSet;
        this.f40312c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40310a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f40311b.addAll(arrayList);
                }
                this.f40312c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f40311b.addAll(tL_emojiList.document_id);
                }
                this.f40312c.run();
                return;
        }
    }
}
