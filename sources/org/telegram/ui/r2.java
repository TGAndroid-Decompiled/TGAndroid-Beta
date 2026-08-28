package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class r2 extends m2.a {
    public final t2 f42254c;

    public r2(t2 t2Var) {
        this.f42254c = t2Var;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView(((q2) obj).f41651b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f42254c.d;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f42254c.d.items.contains(((q2) obj).f41650a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(m2.g gVar, int i9) {
        a3 a3Var;
        t2 t2Var = this.f42254c;
        j4 j4Var = t2Var.f42819w;
        l4 l4Var = t2Var.f42820x;
        TL_iv.PageBlock pageBlock = t2Var.d.items.get(i9);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            f2 f2Var = new f2(t2Var.getContext(), l4Var, j4Var, 1);
            f2Var.a((TL_iv.pageBlockPhoto) pageBlock, j4Var.A.cached_page, false, true);
            a3Var = f2Var;
        } else {
            a3 a3Var2 = new a3(t2Var.getContext(), l4Var, j4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            a3Var2.b(pageblockvideo, (b3) l4Var.f36383y.f(pageblockvideo.video_id), false, true);
            a3Var = a3Var2;
        }
        gVar.addView(a3Var);
        ?? obj = new Object();
        obj.f41651b = a3Var;
        obj.f41650a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((q2) obj).f41651b == view) {
            return true;
        }
        return false;
    }
}
