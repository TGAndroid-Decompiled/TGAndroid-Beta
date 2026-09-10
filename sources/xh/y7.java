package xh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.vl0;
public final class y7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f46342a;
    public final v81 f46343b;
    public final x7 f46344c;

    public y7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f46342a = i10;
        setOrientation(1);
        v81 v81Var = new v81(context, null);
        this.f46343b = v81Var;
        x7 x7Var = new x7(context, i10, z10, j3, i11, f6Var);
        this.f46344c = x7Var;
        v81Var.setAdapter(x7Var);
        View n10 = v81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17929d7, f6Var));
        addView(n10, w7.a6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.a6.z(-1.0f), w7.a6.z(1.0f / AndroidUtilities.density)));
        addView(v81Var, w7.a6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f46344c.i();
            this.f46343b.o(true);
        }
    }

    public vl0 getCurrentListView() {
        View currentView = this.f46343b.getCurrentView();
        if (!(currentView instanceof w7)) {
            return null;
        }
        return ((w7) currentView).f46234a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f46344c.i();
        this.f46343b.o(false);
        NotificationCenter.getInstance(this.f46342a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f46342a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
