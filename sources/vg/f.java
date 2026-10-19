package vg;

import android.view.View;
import org.telegram.messenger.Utilities;
import yg.k;
public final class f implements Utilities.Callback {
    public final boolean f48362a;

    @Override
    public final void run(Object obj) {
        View view = (View) obj;
        if (view instanceof k) {
            ((k) view).g(this.f48362a, true);
        }
    }
}
