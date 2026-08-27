package rh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.ok;

public final class e implements ok, oi {

    public final p f47111a;

    public final gi f47112b;

    public e(p pVar, gi giVar) {
        this.f47111a = pVar;
        this.f47112b = giVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        p pVar = this.f47111a;
        pVar.getClass();
        gi giVar = this.f47112b;
        if (messageMedia == null || messageMedia.geo == null) {
            giVar.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.f22603w = 600;
        pageblockmap.h = 400;
        pVar.f47324r.R1(pageblockmap);
        pVar.V(true);
        giVar.dismiss(true);
    }

    @Override
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f47111a.f47324r.b2((MessageObject) arrayList.get(0));
        }
        this.f47112b.dismiss(true);
    }
}
