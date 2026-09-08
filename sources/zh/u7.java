package zh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ll0;
public final class u7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f52726a;
    public final i81 f52727b;
    public final t7 f52728c;

    public u7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f52726a = i10;
        setOrientation(1);
        i81 i81Var = new i81(context, null);
        this.f52727b = i81Var;
        t7 t7Var = new t7(context, i10, z10, j3, i11, f6Var);
        this.f52728c = t7Var;
        i81Var.setAdapter(t7Var);
        View n10 = i81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20691d7, f6Var));
        addView(n10, w7.x5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(1.0f / AndroidUtilities.density)));
        addView(i81Var, w7.x5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20761h5, f6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f52728c.i();
            this.f52727b.o(true);
        }
    }

    public ll0 getCurrentListView() {
        View currentView = this.f52727b.getCurrentView();
        if (!(currentView instanceof s7)) {
            return null;
        }
        return ((s7) currentView).f52622a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f52728c.i();
        this.f52727b.o(false);
        NotificationCenter.getInstance(this.f52726a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f52726a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
