package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f44866a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f44866a = new q(nestedScrollView);
        } else {
            this.f44866a = new pb.a(20);
        }
    }
}
