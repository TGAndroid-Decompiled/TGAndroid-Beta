package zh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.f6;
public final class t0 extends l3 {
    public final ViewTreeObserver Q;
    public final k0 R;

    public t0(long j3, String str, long j10, f6 f6Var, ViewTreeObserver viewTreeObserver, k0 k0Var) {
        super(j3, str, j10, f6Var);
        this.Q = viewTreeObserver;
        this.R = k0Var;
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
