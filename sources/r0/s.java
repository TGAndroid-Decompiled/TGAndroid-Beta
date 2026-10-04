package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f45624a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f45624a = new q(nestedScrollView);
        } else {
            this.f45624a = new ob.a(20);
        }
    }
}
