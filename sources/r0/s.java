package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f46836a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f46836a = new q(nestedScrollView);
        } else {
            this.f46836a = new ob.a(20);
        }
    }
}
