package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.t00;
public final class t7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final s61 f48085a;
    public final org.telegram.ui.ActionBar.f6 f48086b;
    public final int f48087c;
    public final int d;
    public final boolean e;
    public final long f48088f;
    public final r7 h;

    public t7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f48087c = i11;
        this.f48088f = j3;
        this.f48086b = f6Var;
        this.h = new r7(j3, i11, i10, z10);
        s61 s61Var = new s61(context, i11, i12, true, new s7(this, 0), new r5.d(this, 27), null, f6Var);
        this.f48085a = s61Var;
        addView(s61Var, w7.y5.c(-1.0f, -1));
        s61Var.setOnScrollListener(new sb0(this, 22));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        s61 s61Var = this.f48085a;
        if (i10 == i12) {
            s61Var.Y2.N(true);
            if (s61Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < s61Var.getChildCount(); i13++) {
                    if (!(s61Var.getChildAt(i13) instanceof t00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f48088f) {
            s61Var.Y2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f48088f;
        int i10 = this.f48087c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f48085a.Y2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f48088f;
        int i10 = this.f48087c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
