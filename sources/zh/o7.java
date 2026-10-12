package zh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.mm0;
public final class o7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f50953a;
    public final k91 f50954b;
    public final n7 f50955c;

    public o7(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f50953a = i10;
        setOrientation(1);
        k91 k91Var = new k91(context, null);
        this.f50954b = k91Var;
        n7 n7Var = new n7(context, i10, z10, j10, i11, c6Var);
        this.f50955c = n7Var;
        k91Var.setAdapter(n7Var);
        View n10 = k91Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19902d7, c6Var));
        addView(n10, w7.a6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.a6.z(-1.0f), w7.a6.z(1.0f / AndroidUtilities.density)));
        addView(k91Var, w7.a6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, c6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f50955c.i();
            this.f50954b.o(true);
        }
    }

    public mm0 getCurrentListView() {
        View currentView = this.f50954b.getCurrentView();
        if (!(currentView instanceof m7)) {
            return null;
        }
        return ((m7) currentView).f50839a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f50955c.i();
        this.f50954b.o(false);
        NotificationCenter.getInstance(this.f50953a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f50953a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
