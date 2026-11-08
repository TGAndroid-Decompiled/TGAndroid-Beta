package xg;

import ah.r;
import android.view.View;
import org.telegram.messenger.c20;
public final class g implements c20 {
    public final boolean f58729a;

    public g(boolean z9) {
        this.f58729a = z9;
    }

    @Override
    public final void a(Object obj) {
        View view = (View) obj;
        if (view instanceof r) {
            ((r) view).g(this.f58729a, true);
        }
    }
}
