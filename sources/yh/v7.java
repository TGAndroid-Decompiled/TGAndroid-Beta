package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.ml0;
public final class v7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f47848a;
    public final h81 f47849b;
    public final u7 f47850c;

    public v7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f47848a = i10;
        setOrientation(1);
        h81 h81Var = new h81(context, null);
        this.f47849b = h81Var;
        u7 u7Var = new u7(context, i10, z10, j3, i11, d6Var);
        this.f47850c = u7Var;
        h81Var.setAdapter(u7Var);
        View n10 = h81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18790d7, d6Var));
        addView(n10, w7.x5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(1.0f / AndroidUtilities.density)));
        addView(h81Var, w7.x5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18859h5, d6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f47850c.i();
            this.f47849b.o(true);
        }
    }

    public ml0 getCurrentListView() {
        View currentView = this.f47849b.getCurrentView();
        if (!(currentView instanceof t7)) {
            return null;
        }
        return ((t7) currentView).f47756a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f47850c.i();
        this.f47849b.o(false);
        NotificationCenter.getInstance(this.f47848a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f47848a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
