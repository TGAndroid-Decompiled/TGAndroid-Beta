package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.xb0;
public final class u7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final c71 f52102a;
    public final org.telegram.ui.ActionBar.d6 f52103b;
    public final int f52104c;
    public final int d;
    public final boolean f52105e;
    public final long f52106f;
    public final s7 h;

    public u7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = i10;
        this.f52105e = z10;
        this.f52104c = i11;
        this.f52106f = j3;
        this.f52103b = d6Var;
        this.h = new s7(j3, i11, i10, z10);
        c71 c71Var = new c71(context, i11, i12, true, new t7(this, 0), new r2.s(this, 29), null, d6Var);
        this.f52102a = c71Var;
        addView(c71Var, w7.z5.c(-1.0f, -1));
        c71Var.setOnScrollListener(new xb0(this, 23));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        c71 c71Var = this.f52102a;
        if (i10 == i12) {
            c71Var.f25244f3.N(true);
            if (c71Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < c71Var.getChildCount(); i13++) {
                    if (!(c71Var.getChildAt(i13) instanceof w00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f52106f) {
            c71Var.f25244f3.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f52106f;
        int i10 = this.f52104c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f52102a.f25244f3.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f52106f;
        int i10 = this.f52104c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
