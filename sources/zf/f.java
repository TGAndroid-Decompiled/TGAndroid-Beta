package zf;

import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Components.j41;
public final class f implements View.OnClickListener {
    public final int f55482a;
    public final Object f55483b;

    public f(Object obj, int i10) {
        this.f55482a = i10;
        this.f55483b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f55482a) {
            case 0:
                m mVar = (m) this.f55483b;
                vp.r1(mVar.F).f18893s.clear();
                vp.d1().edit().remove("installReferer").commit();
                mVar.f();
                return;
            case 1:
                ((r) this.f55483b).run();
                return;
            case 2:
                ((h0) this.f55483b).K();
                return;
            default:
                o1 o1Var = (o1) this.f55483b;
                LongSparseArray longSparseArray = o1Var.f55601n;
                w3 w3Var = (w3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = w3Var.getStickerSet();
                if (stickerSet != null && o1Var.h.indexOfKey(stickerSet.set.f19820id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f19820id) < 0) {
                    if (w3Var.f23386r) {
                        longSparseArray.put(stickerSet.set.f19820id, stickerSet);
                        j41 j41Var = o1Var.e;
                        j41Var.f27222a.h(w3Var.getStickerSet());
                        return;
                    }
                    o1Var.F(stickerSet, w3Var);
                    return;
                }
                return;
        }
    }
}
