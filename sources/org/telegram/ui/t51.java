package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t51 implements Utilities.Callback {
    public final int f41903a;
    public final LinkedHashSet f41904b;
    public final Runnable f41905c;

    public t51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f41903a = i10;
        this.f41904b = linkedHashSet;
        this.f41905c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41903a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f41904b.addAll(arrayList);
                }
                this.f41905c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f41904b.addAll(tL_emojiList.document_id);
                }
                this.f41905c.run();
                return;
        }
    }
}
