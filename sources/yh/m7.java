package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.qh0;
public final class m7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final p71 f53121a;
    public final org.telegram.ui.ActionBar.c6 f53122b;
    public final int f53123c;
    public final int d;
    public final boolean f53124e;
    public final long f53125f;
    public final k7 h;

    public m7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = i10;
        this.f53124e = z10;
        this.f53123c = i11;
        this.f53125f = j3;
        this.f53122b = c6Var;
        this.h = new k7(j3, i11, i10, z10);
        p71 p71Var = new p71(context, i11, i12, true, new l7(this, 0), new r5.d(this, 27), null, c6Var);
        this.f53121a = p71Var;
        addView(p71Var, w7.w5.d(-1.0f, -1));
        p71Var.setOnScrollListener(new qh0(this, 23));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        p71 p71Var = this.f53121a;
        if (i10 == i12) {
            p71Var.W2.N(true);
            if (p71Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < p71Var.getChildCount(); i13++) {
                    if (!(p71Var.getChildAt(i13) instanceof m10)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f53125f) {
            p71Var.W2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = (this.f53125f > 0L ? 1 : (this.f53125f == 0L ? 0 : -1));
        int i11 = this.f53123c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f53121a.W2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = (this.f53125f > 0L ? 1 : (this.f53125f == 0L ? 0 : -1));
        int i11 = this.f53123c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
