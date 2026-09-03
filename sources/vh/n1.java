package vh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uk;
public final class n1 implements uk, ti {
    public final y1 f46108a;
    public final li f46109b;

    public n1(y1 y1Var, li liVar) {
        this.f46108a = y1Var;
        this.f46109b = liVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        y1 y1Var = this.f46108a;
        y1Var.getClass();
        li liVar = this.f46109b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f19380w = 600;
            pageblockmap.h = 400;
            y1Var.M.Q1(pageblockmap);
            liVar.dismiss(true);
            return;
        }
        liVar.dismiss(true);
    }

    @Override
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.f46108a.M.a2((MessageObject) arrayList.get(0));
        }
        this.f46109b.dismiss(true);
    }
}
