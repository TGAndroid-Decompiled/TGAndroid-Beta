package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.mh0;
public final class m7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final k71 f52905a;
    public final org.telegram.ui.ActionBar.e6 f52906b;
    public final int f52907c;
    public final int d;
    public final boolean f52908e;
    public final long f52909f;
    public final k7 h;

    public m7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = i10;
        this.f52908e = z10;
        this.f52907c = i11;
        this.f52909f = j3;
        this.f52906b = e6Var;
        this.h = new k7(j3, i11, i10, z10);
        k71 k71Var = new k71(context, i11, i12, true, new l7(this, 0), new r5.d(this, 27), null, e6Var);
        this.f52905a = k71Var;
        addView(k71Var, w7.x5.d(-1.0f, -1));
        k71Var.setOnScrollListener(new mh0(this, 23));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        k71 k71Var = this.f52905a;
        if (i10 == i12) {
            k71Var.W2.N(true);
            if (k71Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < k71Var.getChildCount(); i13++) {
                    if (!(k71Var.getChildAt(i13) instanceof j10)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f52909f) {
            k71Var.W2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = (this.f52909f > 0L ? 1 : (this.f52909f == 0L ? 0 : -1));
        int i11 = this.f52907c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f52905a.W2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = (this.f52909f > 0L ? 1 : (this.f52909f == 0L ? 0 : -1));
        int i11 = this.f52907c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
