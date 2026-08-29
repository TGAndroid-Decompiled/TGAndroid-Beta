package th;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wk;
public final class e implements wk, vi {
    public final p f48411a;
    public final ni f48412b;

    public e(p pVar, ni niVar) {
        this.f48411a = pVar;
        this.f48412b = niVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        p pVar = this.f48411a;
        pVar.getClass();
        ni niVar = this.f48412b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f22615w = 600;
            pageblockmap.h = 400;
            pVar.f48623r.R1(pageblockmap);
            pVar.V(true);
            niVar.dismiss(true);
            return;
        }
        niVar.dismiss(true);
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f48411a.f48623r.b2((MessageObject) arrayList.get(0));
        }
        this.f48412b.dismiss(true);
    }
}
