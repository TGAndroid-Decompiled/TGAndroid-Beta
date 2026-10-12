package zh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.kc0;
public final class m7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final h71 f50839a;
    public final org.telegram.ui.ActionBar.c6 f50840b;
    public final int f50841c;
    public final int d;
    public final boolean e;
    public final long f50842f;
    public final k7 h;

    public m7(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.f50841c = i11;
        this.f50842f = j10;
        this.f50840b = c6Var;
        this.h = new k7(j10, i11, i10, z10);
        h71 h71Var = new h71(context, i11, i12, true, new l7(this, 0), new x3(this, 3), null, c6Var);
        this.f50839a = h71Var;
        addView(h71Var, w7.a6.d(-1.0f, -1));
        h71Var.setOnScrollListener(new kc0(this, 24));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        h71 h71Var = this.f50839a;
        if (i10 == i12) {
            h71Var.W2.N(true);
            if (h71Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < h71Var.getChildCount(); i13++) {
                    if (!(h71Var.getChildAt(i13) instanceof f10)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f50842f) {
            h71Var.W2.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = (this.f50842f > 0L ? 1 : (this.f50842f == 0L ? 0 : -1));
        int i11 = this.f50841c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f50839a.W2.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = (this.f50842f > 0L ? 1 : (this.f50842f == 0L ? 0 : -1));
        int i11 = this.f50841c;
        if (i10 != 0) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
