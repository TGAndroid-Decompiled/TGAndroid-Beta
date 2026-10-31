package ph;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.p6;
public final class x0 extends r3 {
    public final ViewTreeObserver Q;
    public final o0 R;

    public x0(long j10, String str, long j11, p6 p6Var, ViewTreeObserver viewTreeObserver, o0 o0Var) {
        super(j10, str, j11, p6Var);
        this.Q = viewTreeObserver;
        this.R = o0Var;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.Q.removeOnPreDrawListener(this.R);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.Q.addOnPreDrawListener(this.R);
    }
}
