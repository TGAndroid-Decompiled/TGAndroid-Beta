package wh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wk;
public final class f implements wk, ui {
    public final q f49733a;
    public final mi f49734b;

    public f(q qVar, mi miVar) {
        this.f49733a = qVar;
        this.f49734b = miVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        q qVar = this.f49733a;
        qVar.getClass();
        mi miVar = this.f49734b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f21066w = 600;
            pageblockmap.h = 400;
            qVar.f49929r.R1(pageblockmap);
            qVar.V(true);
            miVar.dismiss(true);
            return;
        }
        miVar.dismiss(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        if (!arrayList.isEmpty()) {
            this.f49733a.f49929r.b2((MessageObject) arrayList.get(0));
        }
        this.f49734b.dismiss(true);
    }
}
