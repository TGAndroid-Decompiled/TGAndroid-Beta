package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f46792a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f46792a = new q(nestedScrollView);
        } else {
            this.f46792a = new ob.a(20);
        }
    }
}
