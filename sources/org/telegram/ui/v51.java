package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v51 implements Utilities.Callback {
    public final int f37415a;
    public final LinkedHashSet f37416b;
    public final Runnable f37417c;

    public v51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f37415a = i10;
        this.f37416b = linkedHashSet;
        this.f37417c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37415a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f37416b.addAll(arrayList);
                }
                this.f37417c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f37416b.addAll(tL_emojiList.document_id);
                }
                this.f37417c.run();
                return;
        }
    }
}
