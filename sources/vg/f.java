package vg;

import android.view.View;
import org.telegram.messenger.Utilities;
import yg.l;
public final class f implements Utilities.Callback {
    public final boolean f46975a;

    @Override
    public final void run(Object obj) {
        View view = (View) obj;
        if (view instanceof l) {
            ((l) view).g(this.f46975a, true);
        }
    }
}
