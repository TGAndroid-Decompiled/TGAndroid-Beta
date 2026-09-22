package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.z81;
public final class v7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f48219a;
    public final z81 f48220b;
    public final u7 f48221c;

    public v7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f48219a = i10;
        setOrientation(1);
        z81 z81Var = new z81(context, null);
        this.f48220b = z81Var;
        u7 u7Var = new u7(context, i10, z10, j3, i11, f6Var);
        this.f48221c = u7Var;
        z81Var.setAdapter(u7Var);
        View n10 = z81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19110d7, f6Var));
        addView(n10, w7.y5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.y5.z(-1.0f), w7.y5.z(1.0f / AndroidUtilities.density)));
        addView(z81Var, w7.y5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19180h5, f6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f48221c.i();
            this.f48220b.o(true);
        }
    }

    public yl0 getCurrentListView() {
        View currentView = this.f48220b.getCurrentView();
        if (!(currentView instanceof t7)) {
            return null;
        }
        return ((t7) currentView).f48106a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f48221c.i();
        this.f48220b.o(false);
        NotificationCenter.getInstance(this.f48219a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f48219a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
