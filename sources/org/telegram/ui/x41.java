package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x41 implements Utilities.Callback {
    public final int f39855a;
    public final LinkedHashSet f39856b;
    public final Runnable f39857c;

    public x41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f39855a = i10;
        this.f39856b = linkedHashSet;
        this.f39857c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39855a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f39856b.addAll(arrayList);
                }
                this.f39857c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f39856b.addAll(tL_emojiList.document_id);
                }
                this.f39857c.run();
                return;
        }
    }
}
