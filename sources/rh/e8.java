package rh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.zz;
public final class e8 extends FrameLayout implements us {
    public final u51 f46874a;
    public final org.telegram.ui.ActionBar.p6 f46875b;
    public final int f46876c;
    public final int d;
    public final boolean e;
    public final long f46877f;
    public final d8 h;

    public e8(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f46876c = i11;
        this.f46877f = j10;
        this.f46875b = p6Var;
        this.h = new d8(i11, i10, j10, z10);
        u51 u51Var = new u51(context, i11, i12, true, new qh.d(this, 12), new d0(this, 8), null, p6Var);
        this.f46874a = u51Var;
        addView(u51Var, w7.b6.c(-1.0f, -1));
        u51Var.setOnScrollListener(new bu0(this, 20));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.f19734z3;
        u51 u51Var = this.f46874a;
        if (i10 == i12) {
            u51Var.f30819f3.O(true);
            if (u51Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < u51Var.getChildCount(); i13++) {
                    if (!(u51Var.getChildAt(i13) instanceof zz)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == zs.D3 && ((Long) objArr[0]).longValue() == this.f46877f) {
            u51Var.f30819f3.O(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = (this.f46877f > 0L ? 1 : (this.f46877f == 0L ? 0 : -1));
        int i11 = this.f46876c;
        if (i10 != 0) {
            zs.f(i11).c(this, zs.D3);
        } else {
            zs.f(i11).c(this, zs.f19734z3);
        }
        this.f46874a.f30819f3.O(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = (this.f46877f > 0L ? 1 : (this.f46877f == 0L ? 0 : -1));
        int i11 = this.f46876c;
        if (i10 != 0) {
            zs.f(i11).n(this, zs.D3);
        } else {
            zs.f(i11).n(this, zs.f19734z3);
        }
    }
}
