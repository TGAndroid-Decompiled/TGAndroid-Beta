package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class r11 implements org.telegram.messenger.q20 {
    public final int f41117a;
    public final LinkedHashSet f41118b;
    public final Runnable f41119c;

    public r11(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f41117a = i10;
        this.f41118b = linkedHashSet;
        this.f41119c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f41117a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f41118b.addAll(arrayList);
                }
                this.f41119c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f41118b.addAll(tL_emojiList.document_id);
                }
                this.f41119c.run();
                return;
        }
    }
}
