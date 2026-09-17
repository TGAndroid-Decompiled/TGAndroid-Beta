package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s51 implements Utilities.Callback {
    public final int f37386a;
    public final LinkedHashSet f37387b;
    public final Runnable f37388c;

    public s51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f37386a = i10;
        this.f37387b = linkedHashSet;
        this.f37388c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37386a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f37387b.addAll(arrayList);
                }
                this.f37388c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f37387b.addAll(tL_emojiList.document_id);
                }
                this.f37388c.run();
                return;
        }
    }
}
