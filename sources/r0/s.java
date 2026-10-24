package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f45263a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f45263a = new q(nestedScrollView);
        } else {
            this.f45263a = new pb.a(20);
        }
    }
}
