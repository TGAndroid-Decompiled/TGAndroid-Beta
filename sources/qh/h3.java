package qh;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class h3 {
    public final View f45391a;
    public View f45392b;
    public final Utilities.Callback f45393c;
    public boolean d;
    public boolean f45394e;
    public boolean f45395f;
    public boolean f45396g;
    public final Rect h = new Rect();
    public final f3 f45397i;
    public final cf.d f45398j;
    public int f45399k;
    public int f45400l;

    public h3(View view, boolean z4, Utilities.Callback callback) {
        f3 f3Var = new f3(this, 0);
        this.f45397i = f3Var;
        cf.d dVar = new cf.d(this, 1);
        this.f45398j = dVar;
        this.f45391a = view;
        this.f45393c = callback;
        this.f45392b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(dVar);
            view.addOnLayoutChangeListener(f3Var);
        }
        view.addOnAttachStateChangeListener(new g3(this, z4, view));
    }

    public final void a() {
        if (this.f45394e) {
            if (this.f45400l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.f45394e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f45393c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f45400l));
        }
    }

    public void b(boolean z4) {
        this.d = z4;
        d();
    }

    public final boolean c() {
        if (this.f45400l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.f45394e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z4 = this.f45395f;
            boolean z10 = false;
            View view = this.f45391a;
            if (z4) {
                View view2 = this.f45392b;
                if (view2 != null) {
                    view = view2;
                }
                r0.m1 f10 = r0.j0.f(view);
                if (f10 != null) {
                    i10 = f10.f46483a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f45400l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f45392b;
                if (view3 != null) {
                    view = view3;
                }
                this.f45400l = view.getHeight() - rect.bottom;
            }
            if (this.f45396g) {
                this.f45400l = Math.max(0, this.f45400l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f45399k;
            int i12 = this.f45400l;
            if (i11 != i12) {
                z10 = true;
            }
            this.f45399k = i12;
            if (z10) {
                a();
            }
        }
    }
}
