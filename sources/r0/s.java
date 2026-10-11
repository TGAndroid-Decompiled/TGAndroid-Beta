package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f46916a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f46916a = new q(nestedScrollView);
        } else {
            this.f46916a = new ob.a(20);
        }
    }
}
