package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t51 implements Utilities.Callback {
    public final int f37657a;
    public final LinkedHashSet f37658b;
    public final Runnable f37659c;

    public t51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f37657a = i10;
        this.f37658b = linkedHashSet;
        this.f37659c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37657a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f37658b.addAll(arrayList);
                }
                this.f37659c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f37658b.addAll(tL_emojiList.document_id);
                }
                this.f37659c.run();
                return;
        }
    }
}
