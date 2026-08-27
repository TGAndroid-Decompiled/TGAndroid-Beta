package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

public final class t {

    public final s f46633a;

    public t(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f46633a = new r(nestedScrollView);
        } else {
            this.f46633a = new xa.a(21);
        }
    }
}
