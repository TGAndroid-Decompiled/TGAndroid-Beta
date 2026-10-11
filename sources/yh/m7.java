package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.oh0;
public final class m7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final m71 f52972a;
    public final org.telegram.ui.ActionBar.d6 f52973b;
    public final int f52974c;
    public final int d;
    public final boolean f52975e;
    public final long f52976f;
    public final k7 h;

    public m7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = i10;
        this.f52975e = z10;
        this.f52974c = i11;
        this.f52976f = j3;
        this.f52973b = d6Var;
        this.h = new k7(j3, i11, i10, z10);
        m71 m71Var = new m71(context, i11, i12, true, new l7(this, 0), new r5.d(this, 27), null, d6Var);
        this.f52972a = m71Var;
        addView(m71Var, w7.x5.d(-1.0f, -1));
        m71Var.setOnScrollListener(new oh0(this, 23));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        m71 m71Var = this.f52972a;
        if (i10 == i12) {
            m71Var.W2.N(true);
            if (m71Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < m71Var.getChildCount(); i13++) {
                    if (!(m71Var.getChildAt(i13) instanceof k10)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f52976f) {
            m71Var.W2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = (this.f52976f > 0L ? 1 : (this.f52976f == 0L ? 0 : -1));
        int i11 = this.f52974c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f52972a.W2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = (this.f52976f > 0L ? 1 : (this.f52976f == 0L ? 0 : -1));
        int i11 = this.f52974c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
