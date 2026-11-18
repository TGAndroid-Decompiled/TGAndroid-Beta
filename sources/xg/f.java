package xg;

import ah.r;
import android.view.View;
import org.telegram.messenger.x10;
public final class f implements x10 {
    public final boolean f60489a;

    @Override
    public final void a(Object obj) {
        View view = (View) obj;
        if (view instanceof r) {
            ((r) view).g(this.f60489a, true);
        }
    }
}
