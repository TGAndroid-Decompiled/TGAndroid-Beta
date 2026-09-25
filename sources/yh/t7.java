package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ug0;
public final class t7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final r61 f48065a;
    public final org.telegram.ui.ActionBar.d6 f48066b;
    public final int f48067c;
    public final int d;
    public final boolean e;
    public final long f48068f;
    public final r7 h;

    public t7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f48067c = i11;
        this.f48068f = j3;
        this.f48066b = d6Var;
        this.h = new r7(j3, i11, i10, z10);
        r61 r61Var = new r61(context, i11, i12, true, new s7(this, 0), new r5.d(this, 27), null, d6Var);
        this.f48065a = r61Var;
        addView(r61Var, w7.y5.c(-1.0f, -1));
        r61Var.setOnScrollListener(new ug0(this, 20));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        r61 r61Var = this.f48065a;
        if (i10 == i12) {
            r61Var.Y2.N(true);
            if (r61Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < r61Var.getChildCount(); i13++) {
                    if (!(r61Var.getChildAt(i13) instanceof u00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f48068f) {
            r61Var.Y2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f48068f;
        int i10 = this.f48067c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f48065a.Y2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f48068f;
        int i10 = this.f48067c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
