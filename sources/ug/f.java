package ug;

import android.view.View;
import org.telegram.messenger.Utilities;
import xg.l;
public final class f implements Utilities.Callback {
    public final boolean f43671a;

    @Override
    public final void run(Object obj) {
        View view = (View) obj;
        if (view instanceof l) {
            ((l) view).g(this.f43671a, true);
        }
    }
}
