package ph;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class i3 {
    public final View f41740a;
    public View f41741b;
    public final Utilities.Callback f41742c;
    public boolean d;
    public boolean e;
    public boolean f41743f;
    public boolean f41744g;
    public final Rect h = new Rect();
    public final g3 f41745i;
    public final cf.d f41746j;
    public int f41747k;
    public int f41748l;

    public i3(View view, boolean z4, Utilities.Callback callback) {
        g3 g3Var = new g3(this, 0);
        this.f41745i = g3Var;
        cf.d dVar = new cf.d(this, 1);
        this.f41746j = dVar;
        this.f41740a = view;
        this.f41742c = callback;
        this.f41741b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(dVar);
            view.addOnLayoutChangeListener(g3Var);
        }
        view.addOnAttachStateChangeListener(new h3(this, z4, view));
    }

    public final void a() {
        if (this.e) {
            if (this.f41748l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f41742c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f41748l));
        }
    }

    public void b(boolean z4) {
        this.d = z4;
        d();
    }

    public final boolean c() {
        if (this.f41748l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z4 = this.f41743f;
            boolean z10 = false;
            View view = this.f41740a;
            if (z4) {
                View view2 = this.f41741b;
                if (view2 != null) {
                    view = view2;
                }
                r0.m1 f10 = r0.j0.f(view);
                if (f10 != null) {
                    i10 = f10.f43130a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f41748l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f41741b;
                if (view3 != null) {
                    view = view3;
                }
                this.f41748l = view.getHeight() - rect.bottom;
            }
            if (this.f41744g) {
                this.f41748l = Math.max(0, this.f41748l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f41747k;
            int i12 = this.f41748l;
            if (i11 != i12) {
                z10 = true;
            }
            this.f41747k = i12;
            if (z10) {
                a();
            }
        }
    }
}
