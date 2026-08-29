package th;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wk;
public final class m1 implements wk, vi {
    public final x1 f48566a;
    public final ni f48567b;

    public m1(x1 x1Var, ni niVar) {
        this.f48566a = x1Var;
        this.f48567b = niVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        x1 x1Var = this.f48566a;
        x1Var.getClass();
        ni niVar = this.f48567b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f22615w = 600;
            pageblockmap.h = 400;
            x1Var.L.R1(pageblockmap);
            niVar.dismiss(true);
            return;
        }
        niVar.dismiss(true);
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f48566a.L.b2((MessageObject) arrayList.get(0));
        }
        this.f48567b.dismiss(true);
    }
}
