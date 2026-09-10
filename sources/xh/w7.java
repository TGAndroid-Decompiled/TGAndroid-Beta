package xh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.r61;
public final class w7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final r61 f46234a;
    public final org.telegram.ui.ActionBar.f6 f46235b;
    public final int f46236c;
    public final int d;
    public final boolean e;
    public final long f46237f;
    public final u7 h;

    public w7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f46236c = i11;
        this.f46237f = j3;
        this.f46235b = f6Var;
        this.h = new u7(j3, i11, i10, z10);
        r61 r61Var = new r61(context, i11, i12, true, new v7(this, 0), new th.e(this, 17), null, f6Var);
        this.f46234a = r61Var;
        addView(r61Var, w7.a6.c(-1.0f, -1));
        r61Var.setOnScrollListener(new al0(this, 18));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        r61 r61Var = this.f46234a;
        if (i10 == i12) {
            r61Var.Y2.N(true);
            if (r61Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < r61Var.getChildCount(); i13++) {
                    if (!(r61Var.getChildAt(i13) instanceof a10)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f46237f) {
            r61Var.Y2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f46237f;
        int i10 = this.f46236c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f46234a.Y2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f46237f;
        int i10 = this.f46236c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
