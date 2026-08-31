package th;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import f2.m1;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.pr;
public abstract class f0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f48114a;
    public final xg.f f48115b;
    public final FrameLayout f48116c;
    public i61 d;
    public boolean f48117e;
    public final i0 f48118f;

    public f0(i0 i0Var, Context context) {
        super(context);
        this.f48118f = i0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48116c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c6.e(-1, -1, 119));
        ?? view = new View(getContext());
        this.f48115b = view;
        view.setupColorKey(k6.f21605a7);
        view.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        view.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        view.f50576a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView((View) view, c6.g());
    }

    public final void a() {
        this.d.j(new nb0(this, 17));
        e0 e0Var = new e0(this);
        e0Var.n(350L);
        e0Var.o(pr.h);
        e0Var.C = false;
        e0Var.f5910m = false;
        this.d.setItemAnimator(e0Var);
    }

    public float b() {
        float f10 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            m1 T = this.d.T(childAt);
            if (T != null) {
                j51 G = this.d.V2.G(T.b());
                if (G != null && G.d != 99) {
                    f10 = Math.min(childAt.getY() + this.f48116c.getPaddingTop(), f10);
                }
            }
        }
        return f10;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f48114a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
