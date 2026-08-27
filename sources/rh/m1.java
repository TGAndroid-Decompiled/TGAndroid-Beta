package rh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.ok;

public final class m1 implements ok, oi {

    public final x1 f47266a;

    public final gi f47267b;

    public m1(x1 x1Var, gi giVar) {
        this.f47266a = x1Var;
        this.f47267b = giVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        x1 x1Var = this.f47266a;
        x1Var.getClass();
        gi giVar = this.f47267b;
        if (messageMedia == null || messageMedia.geo == null) {
            giVar.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.f22603w = 600;
        pageblockmap.h = 400;
        x1Var.L.R1(pageblockmap);
        giVar.dismiss(true);
    }

    @Override
    public void g(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f47266a.L.b2((MessageObject) arrayList.get(0));
        }
        this.f47267b.dismiss(true);
    }
}
