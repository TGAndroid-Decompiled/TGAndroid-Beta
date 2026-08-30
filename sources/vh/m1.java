package vh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uk;
public final class m1 implements uk, ti {
    public final y1 f46011a;
    public final li f46012b;

    public m1(y1 y1Var, li liVar) {
        this.f46011a = y1Var;
        this.f46012b = liVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        y1 y1Var = this.f46011a;
        y1Var.getClass();
        li liVar = this.f46012b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f19405w = 600;
            pageblockmap.h = 400;
            y1Var.M.R1(pageblockmap);
            liVar.dismiss(true);
            return;
        }
        liVar.dismiss(true);
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.f46011a.M.b2((MessageObject) arrayList.get(0));
        }
        this.f46012b.dismiss(true);
    }
}
