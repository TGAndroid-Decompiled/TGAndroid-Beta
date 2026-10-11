package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.nh0;
public final class m7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final l71 f53006a;
    public final org.telegram.ui.ActionBar.d6 f53007b;
    public final int f53008c;
    public final int d;
    public final boolean f53009e;
    public final long f53010f;
    public final k7 h;

    public m7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = i10;
        this.f53009e = z10;
        this.f53008c = i11;
        this.f53010f = j3;
        this.f53007b = d6Var;
        this.h = new k7(j3, i11, i10, z10);
        l71 l71Var = new l71(context, i11, i12, true, new l7(this, 0), new r5.d(this, 27), null, d6Var);
        this.f53006a = l71Var;
        addView(l71Var, w7.x5.d(-1.0f, -1));
        l71Var.setOnScrollListener(new nh0(this, 23));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        l71 l71Var = this.f53006a;
        if (i10 == i12) {
            l71Var.W2.N(true);
            if (l71Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < l71Var.getChildCount(); i13++) {
                    if (!(l71Var.getChildAt(i13) instanceof k10)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f53010f) {
            l71Var.W2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = (this.f53010f > 0L ? 1 : (this.f53010f == 0L ? 0 : -1));
        int i11 = this.f53008c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f53006a.W2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = (this.f53010f > 0L ? 1 : (this.f53010f == 0L ? 0 : -1));
        int i11 = this.f53008c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
