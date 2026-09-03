package ph;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class i3 {
    public final View f41771a;
    public View f41772b;
    public final Utilities.Callback f41773c;
    public boolean d;
    public boolean e;
    public boolean f41774f;
    public boolean f41775g;
    public final Rect h = new Rect();
    public final g3 f41776i;
    public final bf.d f41777j;
    public int f41778k;
    public int f41779l;

    public i3(View view, boolean z4, Utilities.Callback callback) {
        g3 g3Var = new g3(this, 0);
        this.f41776i = g3Var;
        bf.d dVar = new bf.d(this, 1);
        this.f41777j = dVar;
        this.f41771a = view;
        this.f41773c = callback;
        this.f41772b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(dVar);
            view.addOnLayoutChangeListener(g3Var);
        }
        view.addOnAttachStateChangeListener(new h3(this, z4, view));
    }

    public final void a() {
        if (this.e) {
            if (this.f41779l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f41773c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f41779l));
        }
    }

    public void b(boolean z4) {
        this.d = z4;
        d();
    }

    public final boolean c() {
        if (this.f41779l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z4 = this.f41774f;
            boolean z10 = false;
            View view = this.f41771a;
            if (z4) {
                View view2 = this.f41772b;
                if (view2 != null) {
                    view = view2;
                }
                r0.m1 f10 = r0.j0.f(view);
                if (f10 != null) {
                    i10 = f10.f43154a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f41779l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f41772b;
                if (view3 != null) {
                    view = view3;
                }
                this.f41779l = view.getHeight() - rect.bottom;
            }
            if (this.f41775g) {
                this.f41779l = Math.max(0, this.f41779l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f41778k;
            int i12 = this.f41779l;
            if (i11 != i12) {
                z10 = true;
            }
            this.f41778k = i12;
            if (z10) {
                a();
            }
        }
    }
}
