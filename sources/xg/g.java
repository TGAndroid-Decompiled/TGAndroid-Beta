package xg;

import ah.r;
import android.view.View;
import org.telegram.messenger.z10;
public final class g implements z10 {
    public final boolean f59921a;

    public g(boolean z10) {
        this.f59921a = z10;
    }

    @Override
    public final void a(Object obj) {
        View view = (View) obj;
        if (view instanceof r) {
            ((r) view).g(this.f59921a, true);
        }
    }
}
