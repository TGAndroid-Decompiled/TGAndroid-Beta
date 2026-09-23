package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.u00;
public final class t7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final d61 f47756a;
    public final org.telegram.ui.ActionBar.d6 f47757b;
    public final int f47758c;
    public final int d;
    public final boolean e;
    public final long f47759f;
    public final r7 h;

    public t7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f47758c = i11;
        this.f47759f = j3;
        this.f47757b = d6Var;
        this.h = new r7(j3, i11, i10, z10);
        d61 d61Var = new d61(context, i11, i12, true, new s7(this, 0), new r5.d(this, 27), null, d6Var);
        this.f47756a = d61Var;
        addView(d61Var, w7.x5.c(-1.0f, -1));
        d61Var.setOnScrollListener(new kg0(this, 20));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        d61 d61Var = this.f47756a;
        if (i10 == i12) {
            d61Var.Y2.N(true);
            if (d61Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < d61Var.getChildCount(); i13++) {
                    if (!(d61Var.getChildAt(i13) instanceof u00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f47759f) {
            d61Var.Y2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f47759f;
        int i10 = this.f47758c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f47756a.Y2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f47759f;
        int i10 = this.f47758c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
