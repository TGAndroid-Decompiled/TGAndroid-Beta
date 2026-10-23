package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f45264a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f45264a = new q(nestedScrollView);
        } else {
            this.f45264a = new pb.a(20);
        }
    }
}
