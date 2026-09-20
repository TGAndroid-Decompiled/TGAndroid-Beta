package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.x81;
public final class v7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f48198a;
    public final x81 f48199b;
    public final u7 f48200c;

    public v7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f48198a = i10;
        setOrientation(1);
        x81 x81Var = new x81(context, null);
        this.f48199b = x81Var;
        u7 u7Var = new u7(context, i10, z10, j3, i11, f6Var);
        this.f48200c = u7Var;
        x81Var.setAdapter(u7Var);
        View n10 = x81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19095d7, f6Var));
        addView(n10, w7.y5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.y5.z(-1.0f), w7.y5.z(1.0f / AndroidUtilities.density)));
        addView(x81Var, w7.y5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19165h5, f6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f48200c.i();
            this.f48199b.o(true);
        }
    }

    public vl0 getCurrentListView() {
        View currentView = this.f48199b.getCurrentView();
        if (!(currentView instanceof t7)) {
            return null;
        }
        return ((t7) currentView).f48085a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f48200c.i();
        this.f48199b.o(false);
        NotificationCenter.getInstance(this.f48198a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f48198a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
