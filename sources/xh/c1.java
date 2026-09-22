package xh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.e6;
public final class c1 extends h4 {
    public final ViewTreeObserver N;
    public final n0 O;

    public c1(long j3, String str, long j10, e6 e6Var, ViewTreeObserver viewTreeObserver, n0 n0Var) {
        super(j3, str, j10, e6Var);
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
