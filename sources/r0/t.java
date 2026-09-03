package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class t {
    public final s f46497a;

    public t(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f46497a = new r(nestedScrollView);
        } else {
            this.f46497a = new ab.a(21);
        }
    }
}
