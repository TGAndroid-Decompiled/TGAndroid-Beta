package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.y81;
import org.telegram.ui.Components.yl0;
public final class u7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f48175a;
    public final y81 f48176b;
    public final t7 f48177c;

    public u7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f48175a = i10;
        setOrientation(1);
        y81 y81Var = new y81(context, null);
        this.f48176b = y81Var;
        t7 t7Var = new t7(context, i10, z10, j3, i11, e6Var);
        this.f48177c = t7Var;
        y81Var.setAdapter(t7Var);
        View n10 = y81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19058d7, e6Var));
        addView(n10, w7.y5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.y5.z(-1.0f), w7.y5.z(1.0f / AndroidUtilities.density)));
        addView(y81Var, w7.y5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19128h5, e6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f48177c.i();
            this.f48176b.o(true);
        }
    }

    public yl0 getCurrentListView() {
        View currentView = this.f48176b.getCurrentView();
        if (!(currentView instanceof s7)) {
            return null;
        }
        return ((s7) currentView).f48080a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f48177c.i();
        this.f48176b.o(false);
        NotificationCenter.getInstance(this.f48175a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f48175a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
