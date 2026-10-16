package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f43509a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f43509a = new q(nestedScrollView);
        } else {
            this.f43509a = new rb.b(20);
        }
    }
}
