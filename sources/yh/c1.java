package yh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.d6;
public final class c1 extends h4 {
    public final ViewTreeObserver N;
    public final n0 O;

    public c1(long j10, String str, long j11, d6 d6Var, ViewTreeObserver viewTreeObserver, n0 n0Var) {
        super(j10, str, j11, d6Var);
        this.N = viewTreeObserver;
        this.O = n0Var;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.N.removeOnPreDrawListener(this.O);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.N.addOnPreDrawListener(this.O);
    }
}
