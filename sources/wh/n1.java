package wh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wk;
public final class n1 implements wk, ui {
    public final z1 f49886a;
    public final mi f49887b;

    public n1(z1 z1Var, mi miVar) {
        this.f49886a = z1Var;
        this.f49887b = miVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        z1 z1Var = this.f49886a;
        z1Var.getClass();
        mi miVar = this.f49887b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f21066w = 600;
            pageblockmap.h = 400;
            z1Var.M.R1(pageblockmap);
            miVar.dismiss(true);
            return;
        }
        miVar.dismiss(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.f49886a.M.b2((MessageObject) arrayList.get(0));
        }
        this.f49887b.dismiss(true);
    }
}
