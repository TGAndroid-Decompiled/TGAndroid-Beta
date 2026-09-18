package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.ml0;
public final class x7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f48037a;
    public final j81 f48038b;
    public final w7 f48039c;

    public x7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f48037a = i10;
        setOrientation(1);
        j81 j81Var = new j81(context, null);
        this.f48038b = j81Var;
        w7 w7Var = new w7(context, i10, z10, j3, i11, f6Var);
        this.f48039c = w7Var;
        j81Var.setAdapter(w7Var);
        View n10 = j81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18864d7, f6Var));
        addView(n10, w7.x5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(1.0f / AndroidUtilities.density)));
        addView(j81Var, w7.x5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18934h5, f6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f48039c.i();
            this.f48038b.o(true);
        }
    }

    public ml0 getCurrentListView() {
        View currentView = this.f48038b.getCurrentView();
        if (!(currentView instanceof v7)) {
            return null;
        }
        return ((v7) currentView).f47947a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f48039c.i();
        this.f48038b.o(false);
        NotificationCenter.getInstance(this.f48037a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f48037a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
