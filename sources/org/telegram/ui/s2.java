package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class s2 extends m2.a {
    public final u2 f38089c;

    public s2(u2 u2Var) {
        this.f38089c = u2Var;
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView(((r2) obj).f37679b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f38089c.d;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f38089c.d.items.contains(((r2) obj).f37678a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(m2.h hVar, int i10) {
        b3 b3Var;
        u2 u2Var = this.f38089c;
        l4 l4Var = u2Var.f38670w;
        n4 n4Var = u2Var.f38671x;
        TL_iv.PageBlock pageBlock = u2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            g2 g2Var = new g2(u2Var.getContext(), n4Var, l4Var, 1);
            g2Var.a((TL_iv.pageBlockPhoto) pageBlock, l4Var.B.cached_page, false, true);
            b3Var = g2Var;
        } else {
            b3 b3Var2 = new b3(u2Var.getContext(), n4Var, l4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            b3Var2.b(pageblockvideo, (c3) n4Var.f36989y.f(pageblockvideo.video_id), false, true);
            b3Var = b3Var2;
        }
        hVar.addView(b3Var);
        ?? obj = new Object();
        obj.f37679b = b3Var;
        obj.f37678a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((r2) obj).f37679b == view) {
            return true;
        }
        return false;
    }
}
