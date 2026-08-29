package qh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import f2.n1;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
public abstract class f0 extends FrameLayout {
    public org.telegram.ui.ActionBar.l f46695a;
    public final ug.f f46696b;
    public final FrameLayout f46697c;
    public u51 d;
    public boolean f46698e;
    public final i0 f46699f;

    public f0(i0 i0Var, Context context) {
        super(context);
        this.f46699f = i0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46697c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, f6.e(-1, -1, 119));
        ?? view = new View(getContext());
        this.f46696b = view;
        view.setupColorKey(g6.f23009a7);
        view.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        view.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        view.f49227a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView((View) view, f6.g());
    }

    public final void a() {
        this.d.j(new h00(this, 17));
        e0 e0Var = new e0(this);
        e0Var.n(350L);
        e0Var.o(jr.h);
        e0Var.C = false;
        e0Var.f6463m = false;
        this.d.setItemAnimator(e0Var);
    }

    public float b() {
        float f9 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            n1 T = this.d.T(childAt);
            if (T != null) {
                w41 G = this.d.U2.G(T.b());
                if (G != null && G.d != 99) {
                    f9 = Math.min(childAt.getY() + this.f46697c.getPaddingTop(), f9);
                }
            }
        }
        return f9;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.l lVar = this.f46695a;
        if (lVar != null) {
            lVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
