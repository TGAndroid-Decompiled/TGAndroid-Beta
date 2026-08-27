package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_iv;

public final class s2 extends m2.a {

    public final u2 f42396c;

    public s2(u2 u2Var) {
        this.f42396c = u2Var;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView(((r2) obj).f41784b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f42396c.d;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        return this.f42396c.d.items.contains(((r2) obj).f41783a) ? -1 : -2;
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        FrameLayout frameLayout;
        u2 u2Var = this.f42396c;
        k4 k4Var = u2Var.f43076w;
        m4 m4Var = u2Var.f43077x;
        TL_iv.PageBlock pageBlock = u2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            g2 g2Var = new g2(u2Var.getContext(), m4Var, k4Var, 1);
            g2Var.a((TL_iv.pageBlockPhoto) pageBlock, k4Var.A.cached_page, false, true);
            frameLayout = g2Var;
        } else {
            b3 b3Var = new b3(u2Var.getContext(), m4Var, k4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            b3Var.b(pageblockvideo, (c3) m4Var.f37294y.f(pageblockvideo.video_id), false, true);
            frameLayout = b3Var;
        }
        gVar.addView(frameLayout);
        r2 r2Var = new r2();
        r2Var.f41784b = frameLayout;
        r2Var.f41783a = pageBlock;
        return r2Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return ((r2) obj).f41784b == view;
    }
}
