package qh;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class i3 {
    public final View f45409a;
    public View f45410b;
    public final Utilities.Callback f45411c;
    public boolean d;
    public boolean f45412e;
    public boolean f45413f;
    public boolean f45414g;
    public final Rect h = new Rect();
    public final g3 f45415i;
    public final cf.d f45416j;
    public int f45417k;
    public int f45418l;

    public i3(View view, boolean z4, Utilities.Callback callback) {
        g3 g3Var = new g3(this, 0);
        this.f45415i = g3Var;
        cf.d dVar = new cf.d(this, 1);
        this.f45416j = dVar;
        this.f45409a = view;
        this.f45411c = callback;
        this.f45410b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(dVar);
            view.addOnLayoutChangeListener(g3Var);
        }
        view.addOnAttachStateChangeListener(new h3(this, z4, view));
    }

    public final void a() {
        if (this.f45412e) {
            if (this.f45418l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.f45412e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f45411c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f45418l));
        }
    }

    public void b(boolean z4) {
        this.d = z4;
        d();
    }

    public final boolean c() {
        if (this.f45418l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.f45412e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z4 = this.f45413f;
            boolean z10 = false;
            View view = this.f45409a;
            if (z4) {
                View view2 = this.f45410b;
                if (view2 != null) {
                    view = view2;
                }
                r0.m1 f10 = r0.j0.f(view);
                if (f10 != null) {
                    i10 = f10.f46452a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f45418l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f45410b;
                if (view3 != null) {
                    view = view3;
                }
                this.f45418l = view.getHeight() - rect.bottom;
            }
            if (this.f45414g) {
                this.f45418l = Math.max(0, this.f45418l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f45417k;
            int i12 = this.f45418l;
            if (i11 != i12) {
                z10 = true;
            }
            this.f45417k = i12;
            if (z10) {
                a();
            }
        }
    }
}
