package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.xb0;
public final class w7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final e71 f52203a;
    public final org.telegram.ui.ActionBar.d6 f52204b;
    public final int f52205c;
    public final int d;
    public final boolean f52206e;
    public final long f52207f;
    public final u7 h;

    public w7(Context context, boolean z10, long j3, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = i10;
        this.f52206e = z10;
        this.f52205c = i11;
        this.f52207f = j3;
        this.f52204b = d6Var;
        this.h = new u7(j3, i11, i10, z10);
        e71 e71Var = new e71(context, i11, i12, true, new o7(this, 1), new v7(this, 0), null, d6Var);
        this.f52203a = e71Var;
        addView(e71Var, w7.z5.c(-1.0f, -1));
        e71Var.setOnScrollListener(new xb0(this, 23));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        e71 e71Var = this.f52203a;
        if (i10 == i12) {
            e71Var.f26034f3.N(true);
            if (e71Var.canScrollVertically(1)) {
                for (int i13 = 0; i13 < e71Var.getChildCount(); i13++) {
                    if (!(e71Var.getChildAt(i13) instanceof w00)) {
                    }
                }
                return;
            }
            this.h.run();
        } else if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f52207f) {
            e71Var.f26034f3.N(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f52207f;
        int i10 = this.f52205c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.f52203a.f26034f3.N(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f52207f;
        int i10 = this.f52205c;
        if (j3 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
