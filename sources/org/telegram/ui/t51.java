package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t51 implements Utilities.Callback {
    public final int f37633a;
    public final LinkedHashSet f37634b;
    public final Runnable f37635c;

    public t51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f37633a = i10;
        this.f37634b = linkedHashSet;
        this.f37635c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37633a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f37634b.addAll(arrayList);
                }
                this.f37635c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f37634b.addAll(tL_emojiList.document_id);
                }
                this.f37635c.run();
                return;
        }
    }
}
