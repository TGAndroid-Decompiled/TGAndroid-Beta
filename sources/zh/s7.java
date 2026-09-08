package zh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.t00;
public final class s7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final d61 f52622a;
    public final org.telegram.ui.ActionBar.f6 f52623b;
    public final int f52624c;
    public final int d;
    public final boolean f52625e;
    public final long f52626f;
    public final q7 h;

    public s7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = i10;
        this.f52625e = z10;
        this.f52624c = i11;
        this.f52626f = j3;
        this.f52623b = f6Var;
        this.h = new q7(j3, i11, i10, z10);
        d61 d61Var = new d61(context, i11, i12, true, new r7(this, 0), new rg.p2(this, 27), null, f6Var);
        this.f52622a = d61Var;
        addView(d61Var, w7.x5.c(-1.0f, -1));
        d61Var.setOnScrollListener(new lb0(this, 21));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        d61 d61Var = this.f52622a;
        if (i10 == i12) {
            d61Var.Y2.N(true);
            if (d61Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < d61Var.getChildCount(); i13++) {
                    if (!(d61Var.getChildAt(i13) instanceof t00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f52626f) {
            d61Var.Y2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f52626f;
        int i10 = this.f52624c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f52622a.Y2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f52626f;
        int i10 = this.f52624c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
