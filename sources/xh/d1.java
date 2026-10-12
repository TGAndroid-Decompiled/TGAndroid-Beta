package xh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.c6;
public final class d1 extends h4 {
    public final ViewTreeObserver N;
    public final p0 O;

    public d1(long j3, String str, long j10, c6 c6Var, ViewTreeObserver viewTreeObserver, p0 p0Var) {
        super(j3, str, j10, c6Var);
        this.N = viewTreeObserver;
        this.O = p0Var;
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
