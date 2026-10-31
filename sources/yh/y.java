package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.u51;
import s4.c1;
import w7.b6;
public abstract class y extends FrameLayout {
    public org.telegram.ui.ActionBar.l f54536a;
    public final bh.i f54537b;
    public final FrameLayout f54538c;
    public u51 d;
    public boolean e;
    public final a0 f54539f;

    public y(a0 a0Var, Context context) {
        super(context);
        this.f54539f = a0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f54538c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, b6.e(-1, -1, 119));
        bh.i iVar = new bh.i(getContext());
        this.f54537b = iVar;
        iVar.setupColorKey(t6.f20872a7);
        iVar.setFadeZoneBottom(i0.L(72.0f) + i0.f16021n);
        iVar.setFadeHeightBottom(i0.L(24.0f));
        iVar.setFadeZoneTop(i0.L(64.0f) + i0.f16020m);
        iVar.f2796a.b(-i0.L(20.0f), false);
        frameLayout.addView(iVar, b6.g());
    }

    public final void a() {
        this.d.j(new p(this, 2));
        x xVar = new x(this);
        xVar.n(350L);
        xVar.o(gr.h);
        xVar.C = false;
        xVar.f47927m = false;
        this.d.setItemAnimator(xVar);
    }

    public float b() {
        float f7 = i0.f16026q.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            c1 T = this.d.T(childAt);
            if (T != null) {
                a51 G = this.d.f30819f3.G(T.b());
                if (G != null && G.d != 99) {
                    f7 = Math.min(childAt.getY() + this.f54538c.getPaddingTop(), f7);
                }
            }
        }
        return f7;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.l lVar = this.f54536a;
        if (lVar != null) {
            lVar.setTranslationY(Math.max(i0.f16020m, b10));
        }
    }
}
