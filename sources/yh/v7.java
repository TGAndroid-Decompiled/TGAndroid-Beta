package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.y81;
import org.telegram.ui.Components.zl0;
public final class v7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f48262a;
    public final y81 f48263b;
    public final u7 f48264c;

    public v7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f48262a = i10;
        setOrientation(1);
        y81 y81Var = new y81(context, null);
        this.f48263b = y81Var;
        u7 u7Var = new u7(context, i10, z10, j3, i11, d6Var);
        this.f48264c = u7Var;
        y81Var.setAdapter(u7Var);
        View n10 = y81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19077d7, d6Var));
        addView(n10, w7.y5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.y5.z(-1.0f), w7.y5.z(1.0f / AndroidUtilities.density)));
        addView(y81Var, w7.y5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19146h5, d6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f48264c.i();
            this.f48263b.o(true);
        }
    }

    public zl0 getCurrentListView() {
        View currentView = this.f48263b.getCurrentView();
        if (!(currentView instanceof t7)) {
            return null;
        }
        return ((t7) currentView).f48172a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f48264c.i();
        this.f48263b.o(false);
        NotificationCenter.getInstance(this.f48262a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f48262a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
