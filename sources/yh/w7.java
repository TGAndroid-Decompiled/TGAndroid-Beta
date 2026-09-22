package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ll0;
public final class w7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f47916a;
    public final i81 f47917b;
    public final v7 f47918c;

    public w7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f47916a = i10;
        setOrientation(1);
        i81 i81Var = new i81(context, null);
        this.f47917b = i81Var;
        v7 v7Var = new v7(context, i10, z10, j3, i11, e6Var);
        this.f47918c = v7Var;
        i81Var.setAdapter(v7Var);
        View n10 = i81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18835d7, e6Var));
        addView(n10, w7.x5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(1.0f / AndroidUtilities.density)));
        addView(i81Var, w7.x5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18904h5, e6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f47918c.i();
            this.f47917b.o(true);
        }
    }

    public ll0 getCurrentListView() {
        View currentView = this.f47917b.getCurrentView();
        if (!(currentView instanceof u7)) {
            return null;
        }
        return ((u7) currentView).f47825a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f47918c.i();
        this.f47917b.o(false);
        NotificationCenter.getInstance(this.f47916a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f47916a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
