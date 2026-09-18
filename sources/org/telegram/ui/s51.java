package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s51 implements Utilities.Callback {
    public final int f37391a;
    public final LinkedHashSet f37392b;
    public final Runnable f37393c;

    public s51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f37391a = i10;
        this.f37392b = linkedHashSet;
        this.f37393c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37391a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f37392b.addAll(arrayList);
                }
                this.f37393c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f37392b.addAll(tL_emojiList.document_id);
                }
                this.f37393c.run();
                return;
        }
    }
}
