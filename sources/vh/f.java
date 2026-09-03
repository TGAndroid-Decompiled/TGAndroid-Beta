package vh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uk;
public final class f implements uk, ti {
    public final q f45959a;
    public final li f45960b;

    public f(q qVar, li liVar) {
        this.f45959a = qVar;
        this.f45960b = liVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        q qVar = this.f45959a;
        qVar.getClass();
        li liVar = this.f45960b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f19380w = 600;
            pageblockmap.h = 400;
            qVar.f46156r.Q1(pageblockmap);
            qVar.V(true);
            liVar.dismiss(true);
            return;
        }
        liVar.dismiss(true);
    }

    @Override
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.f45959a.f46156r.a2((MessageObject) arrayList.get(0));
        }
        this.f45960b.dismiss(true);
    }
}
