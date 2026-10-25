package wg;

import android.view.View;
import org.telegram.messenger.Utilities;
import zg.l;
public final class f implements Utilities.Callback {
    public final boolean f51181a;

    @Override
    public final void run(Object obj) {
        View view = (View) obj;
        if (view instanceof l) {
            ((l) view).g(this.f51181a, true);
        }
    }
}
