package zf;

import android.util.LongSparseArray;
import android.view.View;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Components.k41;
public final class f implements View.OnClickListener {
    public final int f55500a;
    public final Object f55501b;

    public f(Object obj, int i10) {
        this.f55500a = i10;
        this.f55501b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f55500a) {
            case 0:
                m mVar = (m) this.f55501b;
                wp.r1(mVar.F).f19236s.clear();
                wp.d1().edit().remove("installReferer").commit();
                mVar.f();
                return;
            case 1:
                ((r) this.f55501b).run();
                return;
            case 2:
                ((h0) this.f55501b).K();
                return;
            default:
                o1 o1Var = (o1) this.f55501b;
                LongSparseArray longSparseArray = o1Var.f55619n;
                w3 w3Var = (w3) view.getParent();
                TLRPC.StickerSetCovered stickerSet = w3Var.getStickerSet();
                if (stickerSet != null && o1Var.h.indexOfKey(stickerSet.set.f19821id) < 0 && longSparseArray.indexOfKey(stickerSet.set.f19821id) < 0) {
                    if (w3Var.f23387r) {
                        longSparseArray.put(stickerSet.set.f19821id, stickerSet);
                        k41 k41Var = o1Var.e;
                        k41Var.f27726a.h(w3Var.getStickerSet());
                        return;
                    }
                    o1Var.F(stickerSet, w3Var);
                    return;
                }
                return;
        }
    }
}
