package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ll0;
public final class x7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f48009a;
    public final i81 f48010b;
    public final w7 f48011c;

    public x7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f48009a = i10;
        setOrientation(1);
        i81 i81Var = new i81(context, null);
        this.f48010b = i81Var;
        w7 w7Var = new w7(context, i10, z10, j3, i11, e6Var);
        this.f48011c = w7Var;
        i81Var.setAdapter(w7Var);
        View n10 = i81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18837d7, e6Var));
        addView(n10, w7.x5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(1.0f / AndroidUtilities.density)));
        addView(i81Var, w7.x5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18907h5, e6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f48011c.i();
            this.f48010b.o(true);
        }
    }

    public ll0 getCurrentListView() {
        View currentView = this.f48010b.getCurrentView();
        if (!(currentView instanceof v7)) {
            return null;
        }
        return ((v7) currentView).f47919a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f48011c.i();
        this.f48010b.o(false);
        NotificationCenter.getInstance(this.f48009a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f48009a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
