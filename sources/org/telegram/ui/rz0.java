package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class rz0 implements org.telegram.messenger.u10 {
    public final int f49310a;
    public final LinkedHashSet f49311b;
    public final Runnable f49312c;

    public rz0(LinkedHashSet linkedHashSet, Runnable runnable, int i3) {
        this.f49310a = i3;
        this.f49311b = linkedHashSet;
        this.f49312c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49310a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f49311b.addAll(arrayList);
                }
                this.f49312c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f49311b.addAll(tL_emojiList.document_id);
                }
                this.f49312c.run();
                return;
        }
    }
}
