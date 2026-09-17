package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.t00;
public final class v7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final f61 f47942a;
    public final org.telegram.ui.ActionBar.f6 f47943b;
    public final int f47944c;
    public final int d;
    public final boolean e;
    public final long f47945f;
    public final t7 h;

    public v7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f47944c = i11;
        this.f47945f = j3;
        this.f47943b = f6Var;
        this.h = new t7(j3, i11, i10, z10);
        f61 f61Var = new f61(context, i11, i12, true, new u7(this, 0), new r5.d(this, 27), null, f6Var);
        this.f47942a = f61Var;
        addView(f61Var, w7.x5.c(-1.0f, -1));
        f61Var.setOnScrollListener(new kb0(this, 22));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        f61 f61Var = this.f47942a;
        if (i10 == i12) {
            f61Var.Y2.N(true);
            if (f61Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < f61Var.getChildCount(); i13++) {
                    if (!(f61Var.getChildAt(i13) instanceof t00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f47945f) {
            f61Var.Y2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f47945f;
        int i10 = this.f47944c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f47942a.Y2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f47945f;
        int i10 = this.f47944c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
