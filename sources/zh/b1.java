package zh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.u6;
public final class b1 extends h4 {
    public final ViewTreeObserver Q;
    public final m0 R;

    public b1(long j10, String str, long j11, u6 u6Var, ViewTreeObserver viewTreeObserver, m0 m0Var) {
        super(j10, str, j11, u6Var);
        this.Q = viewTreeObserver;
        this.R = m0Var;
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
