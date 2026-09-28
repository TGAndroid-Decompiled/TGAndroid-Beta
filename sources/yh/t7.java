package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.wg0;
public final class t7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final t61 f48064a;
    public final org.telegram.ui.ActionBar.d6 f48065b;
    public final int f48066c;
    public final int d;
    public final boolean e;
    public final long f48067f;
    public final r7 h;

    public t7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f48066c = i11;
        this.f48067f = j3;
        this.f48065b = d6Var;
        this.h = new r7(j3, i11, i10, z10);
        t61 t61Var = new t61(context, i11, i12, true, new s7(this, 0), new r5.d(this, 27), null, d6Var);
        this.f48064a = t61Var;
        addView(t61Var, w7.y5.c(-1.0f, -1));
        t61Var.setOnScrollListener(new wg0(this, 20));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        t61 t61Var = this.f48064a;
        if (i10 == i12) {
            t61Var.Y2.N(true);
            if (t61Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < t61Var.getChildCount(); i13++) {
                    if (!(t61Var.getChildAt(i13) instanceof v00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f48067f) {
            t61Var.Y2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f48067f;
        int i10 = this.f48066c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f48064a.Y2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f48067f;
        int i10 = this.f48066c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
