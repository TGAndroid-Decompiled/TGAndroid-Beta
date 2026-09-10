package wh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.f6;
public final class c1 extends h4 {
    public final ViewTreeObserver N;
    public final o0 O;

    public c1(long j3, String str, long j10, f6 f6Var, ViewTreeObserver viewTreeObserver, o0 o0Var) {
        super(j3, str, j10, f6Var);
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
