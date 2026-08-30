package sh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import f2.l1;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.nr;
public abstract class f0 extends FrameLayout {
    public org.telegram.ui.ActionBar.k f44335a;
    public final wg.f f44336b;
    public final FrameLayout f44337c;
    public g61 d;
    public boolean e;
    public final i0 f44338f;

    public f0(i0 i0Var, Context context) {
        super(context);
        this.f44338f = i0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44337c = frameLayout;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, b6.e(-1, -1, 119));
        ?? view = new View(getContext());
        this.f44336b = view;
        view.setupColorKey(j6.f19852a7);
        view.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
        view.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        view.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
        view.f46564a.b(-AndroidUtilities.dp(20.0f), false);
        frameLayout.addView((View) view, b6.g());
    }

    public final void a() {
        this.d.j(new lb0(this, 17));
        e0 e0Var = new e0(this);
        e0Var.n(350L);
        e0Var.o(nr.h);
        e0Var.C = false;
        e0Var.f5818m = false;
        this.d.setItemAnimator(e0Var);
    }

    public float b() {
        float f10 = AndroidUtilities.displaySize.y;
        for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
            View childAt = this.d.getChildAt(i10);
            l1 T = this.d.T(childAt);
            if (T != null) {
                i51 G = this.d.V2.G(T.b());
                if (G != null && G.d != 99) {
                    f10 = Math.min(childAt.getY() + this.f44337c.getPaddingTop(), f10);
                }
            }
        }
        return f10;
    }

    public void c() {
        float b10 = b();
        org.telegram.ui.ActionBar.k kVar = this.f44335a;
        if (kVar != null) {
            kVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, b10));
        }
    }
}
