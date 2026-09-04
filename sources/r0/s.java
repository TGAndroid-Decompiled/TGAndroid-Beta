package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f44725a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f44725a = new q(nestedScrollView);
        } else {
            this.f44725a = new qb.b(20);
        }
    }
}
