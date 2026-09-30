package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.xg0;
public final class t7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final u61 f48172a;
    public final org.telegram.ui.ActionBar.d6 f48173b;
    public final int f48174c;
    public final int d;
    public final boolean e;
    public final long f48175f;
    public final r7 h;

    public t7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f48174c = i11;
        this.f48175f = j3;
        this.f48173b = d6Var;
        this.h = new r7(j3, i11, i10, z10);
        u61 u61Var = new u61(context, i11, i12, true, new s7(this, 0), new r5.d(this, 27), null, d6Var);
        this.f48172a = u61Var;
        addView(u61Var, w7.y5.c(-1.0f, -1));
        u61Var.setOnScrollListener(new xg0(this, 20));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        u61 u61Var = this.f48172a;
        if (i10 == i12) {
            u61Var.f28778f3.N(true);
            if (u61Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < u61Var.getChildCount(); i13++) {
                    if (!(u61Var.getChildAt(i13) instanceof w00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f48175f) {
            u61Var.f28778f3.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f48175f;
        int i10 = this.f48174c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f48172a.f28778f3.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f48175f;
        int i10 = this.f48174c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
