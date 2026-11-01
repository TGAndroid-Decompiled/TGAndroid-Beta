package rh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.zz;
public final class e8 extends FrameLayout implements vs {
    public final v51 f46888a;
    public final org.telegram.ui.ActionBar.p6 f46889b;
    public final int f46890c;
    public final int d;
    public final boolean e;
    public final long f46891f;
    public final d8 h;

    public e8(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f46890c = i11;
        this.f46891f = j10;
        this.f46889b = p6Var;
        this.h = new d8(i11, i10, j10, z10);
        v51 v51Var = new v51(context, i11, i12, true, new qh.d(this, 12), new d0(this, 8), null, p6Var);
        this.f46888a = v51Var;
        addView(v51Var, w7.b6.c(-1.0f, -1));
        v51Var.setOnScrollListener(new cu0(this, 20));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.f14830z3;
        v51 v51Var = this.f46888a;
        if (i10 == i12) {
            v51Var.f31183f3.O(true);
            if (v51Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < v51Var.getChildCount(); i13++) {
                    if (!(v51Var.getChildAt(i13) instanceof zz)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == at.D3 && ((Long) objArr[0]).longValue() == this.f46891f) {
            v51Var.f31183f3.O(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = (this.f46891f > 0L ? 1 : (this.f46891f == 0L ? 0 : -1));
        int i11 = this.f46890c;
        if (i10 != 0) {
            at.f(i11).c(this, at.D3);
        } else {
            at.f(i11).c(this, at.f14830z3);
        }
        this.f46888a.f31183f3.O(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = (this.f46891f > 0L ? 1 : (this.f46891f == 0L ? 0 : -1));
        int i11 = this.f46890c;
        if (i10 != 0) {
            at.f(i11).n(this, at.D3);
        } else {
            at.f(i11).n(this, at.f14830z3);
        }
    }
}
