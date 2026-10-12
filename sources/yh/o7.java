package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.wm0;
public final class o7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f53213a;
    public final u91 f53214b;
    public final n7 f53215c;

    public o7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f53213a = i10;
        setOrientation(1);
        u91 u91Var = new u91(context, null);
        this.f53214b = u91Var;
        n7 n7Var = new n7(context, i10, z10, j3, i11, c6Var);
        this.f53215c = n7Var;
        u91Var.setAdapter(n7Var);
        View n10 = u91Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20561d7, c6Var));
        addView(n10, w7.w5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.w5.z(-1.0f), w7.w5.z(1.0f / AndroidUtilities.density)));
        addView(u91Var, w7.w5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20631h5, c6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f53215c.i();
            this.f53214b.o(true);
        }
    }

    public wm0 getCurrentListView() {
        View currentView = this.f53214b.getCurrentView();
        if (!(currentView instanceof m7)) {
            return null;
        }
        return ((m7) currentView).f53121a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f53215c.i();
        this.f53214b.o(false);
        NotificationCenter.getInstance(this.f53213a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f53213a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
