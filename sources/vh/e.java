package vh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uk;
public final class e implements uk, ti {
    public final p f45862a;
    public final li f45863b;

    public e(p pVar, li liVar) {
        this.f45862a = pVar;
        this.f45863b = liVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        p pVar = this.f45862a;
        pVar.getClass();
        li liVar = this.f45863b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f19405w = 600;
            pageblockmap.h = 400;
            pVar.f46059r.R1(pageblockmap);
            pVar.V(true);
            liVar.dismiss(true);
            return;
        }
        liVar.dismiss(true);
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.f45862a.f46059r.b2((MessageObject) arrayList.get(0));
        }
        this.f45863b.dismiss(true);
    }
}
