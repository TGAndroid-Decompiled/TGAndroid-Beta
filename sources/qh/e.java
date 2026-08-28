package qh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.sk;
public final class e implements sk, si {
    public final p f46353a;
    public final ki f46354b;

    public e(p pVar, ki kiVar) {
        this.f46353a = pVar;
        this.f46354b = kiVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        p pVar = this.f46353a;
        pVar.getClass();
        ki kiVar = this.f46354b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f22603w = 600;
            pageblockmap.h = 400;
            pVar.f46606r.R1(pageblockmap);
            pVar.U(true);
            kiVar.dismiss(true);
            return;
        }
        kiVar.dismiss(true);
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f46353a.f46606r.b2((MessageObject) arrayList.get(0));
        }
        this.f46354b.dismiss(true);
    }
}
