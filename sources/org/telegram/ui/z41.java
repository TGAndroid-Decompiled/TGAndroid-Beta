package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z41 implements Utilities.Callback {
    public final int f43814a;
    public final LinkedHashSet f43815b;
    public final Runnable f43816c;

    public z41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f43814a = i10;
        this.f43815b = linkedHashSet;
        this.f43816c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43814a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f43815b.addAll(arrayList);
                }
                this.f43816c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f43815b.addAll(tL_emojiList.document_id);
                }
                this.f43816c.run();
                return;
        }
    }
}
