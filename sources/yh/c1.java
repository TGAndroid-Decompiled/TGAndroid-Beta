package yh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.c6;
public final class c1 extends g4 {
    public final ViewTreeObserver N;
    public final o0 O;

    public c1(long j10, String str, long j11, c6 c6Var, ViewTreeObserver viewTreeObserver, o0 o0Var) {
        super(j10, str, j11, c6Var);
        this.N = viewTreeObserver;
        this.O = o0Var;
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
