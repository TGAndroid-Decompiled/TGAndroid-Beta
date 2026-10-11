package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s51 implements Utilities.Callback {
    public final int f41589a;
    public final LinkedHashSet f41590b;
    public final Runnable f41591c;

    public s51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f41589a = i10;
        this.f41590b = linkedHashSet;
        this.f41591c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41589a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f41590b.addAll(arrayList);
                }
                this.f41591c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f41590b.addAll(tL_emojiList.document_id);
                }
                this.f41591c.run();
                return;
        }
    }
}
