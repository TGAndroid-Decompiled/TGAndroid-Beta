package zh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.h6;
public final class t0 extends m3 {
    public final ViewTreeObserver S;
    public final k0 T;

    public t0(long j3, String str, long j10, h6 h6Var, ViewTreeObserver viewTreeObserver, k0 k0Var) {
        super(j3, str, j10, h6Var);
        this.S = viewTreeObserver;
        this.T = k0Var;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.S.removeOnPreDrawListener(this.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.S.addOnPreDrawListener(this.T);
    }
}
