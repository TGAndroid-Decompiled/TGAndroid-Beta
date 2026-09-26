package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.xl0;
public final class v7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f48153a;
    public final x81 f48154b;
    public final u7 f48155c;

    public v7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f48153a = i10;
        setOrientation(1);
        x81 x81Var = new x81(context, null);
        this.f48154b = x81Var;
        u7 u7Var = new u7(context, i10, z10, j3, i11, d6Var);
        this.f48155c = u7Var;
        x81Var.setAdapter(u7Var);
        View n10 = x81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d7, d6Var));
        addView(n10, w7.y5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.y5.z(-1.0f), w7.y5.z(1.0f / AndroidUtilities.density)));
        addView(x81Var, w7.y5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19129h5, d6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f48155c.i();
            this.f48154b.o(true);
        }
    }

    public xl0 getCurrentListView() {
        View currentView = this.f48154b.getCurrentView();
        if (!(currentView instanceof t7)) {
            return null;
        }
        return ((t7) currentView).f48063a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f48155c.i();
        this.f48154b.o(false);
        NotificationCenter.getInstance(this.f48153a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f48153a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
