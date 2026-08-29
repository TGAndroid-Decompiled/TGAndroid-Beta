package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class s2 extends m2.a {
    public final u2 f42255c;

    public s2(u2 u2Var) {
        this.f42255c = u2Var;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView(((r2) obj).f41844b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f42255c.d;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f42255c.d.items.contains(((r2) obj).f41843a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        b3 b3Var;
        u2 u2Var = this.f42255c;
        k4 k4Var = u2Var.f43143w;
        m4 m4Var = u2Var.f43144x;
        TL_iv.PageBlock pageBlock = u2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            g2 g2Var = new g2(u2Var.getContext(), m4Var, k4Var, 1);
            g2Var.a((TL_iv.pageBlockPhoto) pageBlock, k4Var.A.cached_page, false, true);
            b3Var = g2Var;
        } else {
            b3 b3Var2 = new b3(u2Var.getContext(), m4Var, k4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            b3Var2.b(pageblockvideo, (c3) m4Var.f37389y.f(pageblockvideo.video_id), false, true);
            b3Var = b3Var2;
        }
        gVar.addView(b3Var);
        ?? obj = new Object();
        obj.f41844b = b3Var;
        obj.f41843a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((r2) obj).f41844b == view) {
            return true;
        }
        return false;
    }
}
