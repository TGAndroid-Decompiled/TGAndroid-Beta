package xh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.d6;
public final class e1 extends i4 {
    public final ViewTreeObserver N;
    public final p0 O;

    public e1(long j3, String str, long j10, d6 d6Var, ViewTreeObserver viewTreeObserver, p0 p0Var) {
        super(j3, str, j10, d6Var);
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
