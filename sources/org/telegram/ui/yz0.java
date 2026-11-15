package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class yz0 implements org.telegram.messenger.z10 {
    public final int f53750a;
    public final LinkedHashSet f53751b;
    public final Runnable f53752c;

    public yz0(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.f53750a = i7;
        this.f53751b = linkedHashSet;
        this.f53752c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53750a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f53751b.addAll(arrayList);
                }
                this.f53752c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f53751b.addAll(tL_emojiList.document_id);
                }
                this.f53752c.run();
                return;
        }
    }
}
