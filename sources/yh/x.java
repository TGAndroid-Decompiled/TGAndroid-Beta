package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.v51;
import s4.c1;
import w7.b6;
public abstract class x extends FrameLayout {
    public org.telegram.ui.ActionBar.l f54537a;
    public final bh.i f54538b;
    public final FrameLayout f54539c;
    public v51 d;
    public boolean e;
    public final z f54540f;

    public x(z zVar, Context context) {
        super(context);
        this.f54540f = zVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f54539c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, b6.e(-1, -1, 119));
        bh.i iVar = new bh.i(getContext());
        this.f54538b = iVar;
        iVar.setupColorKey(t6.f20873a7);
        iVar.setFadeZoneBottom(i0.L(72.0f) + i0.f16167n);
        iVar.setFadeHeightBottom(i0.L(24.0f));
        iVar.setFadeZoneTop(i0.L(64.0f) + i0.f16166m);
        iVar.f2796a.b(-i0.L(20.0f), false);
        frameLayout.addView(iVar, b6.g());
    }

    public final void a() {
        this.d.j(new o(this, 2));
        w wVar = new w(this);
        wVar.n(350L);
        wVar.o(gr.h);
        wVar.C = false;
        wVar.f47938m = false;
        this.d.setItemAnimator(wVar);
    }

    public float b() {
        float f7 = i0.f16172q.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            c1 T = this.d.T(childAt);
            if (T != null) {
                b51 G = this.d.f31183f3.G(T.b());
                if (G != null && G.d != 99) {
                    f7 = Math.min(childAt.getY() + this.f54539c.getPaddingTop(), f7);
                }
            }
        }
        return f7;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.l lVar = this.f54537a;
        if (lVar != null) {
            lVar.setTranslationY(Math.max(i0.f16166m, b10));
        }
    }
}
