package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x81;
public final class u7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f48093a;
    public final x81 f48094b;
    public final t7 f48095c;

    public u7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f48093a = i10;
        setOrientation(1);
        x81 x81Var = new x81(context, null);
        this.f48094b = x81Var;
        t7 t7Var = new t7(context, i10, z10, j3, i11, e6Var);
        this.f48095c = t7Var;
        x81Var.setAdapter(t7Var);
        View n10 = x81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19063d7, e6Var));
        addView(n10, w7.y5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.y5.z(-1.0f), w7.y5.z(1.0f / AndroidUtilities.density)));
        addView(x81Var, w7.y5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19133h5, e6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f48095c.i();
            this.f48094b.o(true);
        }
    }

    public wl0 getCurrentListView() {
        View currentView = this.f48094b.getCurrentView();
        if (!(currentView instanceof s7)) {
            return null;
        }
        return ((s7) currentView).f48018a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f48095c.i();
        this.f48094b.o(false);
        NotificationCenter.getInstance(this.f48093a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f48093a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
