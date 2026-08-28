package qh;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.sk;
public final class m1 implements sk, si {
    public final x1 f46520a;
    public final ki f46521b;

    public m1(x1 x1Var, ki kiVar) {
        this.f46520a = x1Var;
        this.f46521b = kiVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        x1 x1Var = this.f46520a;
        x1Var.getClass();
        ki kiVar = this.f46521b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f22603w = 600;
            pageblockmap.h = 400;
            x1Var.L.R1(pageblockmap);
            kiVar.dismiss(true);
            return;
        }
        kiVar.dismiss(true);
    }

    @Override
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f46520a.L.b2((MessageObject) arrayList.get(0));
        }
        this.f46521b.dismiss(true);
    }
}
