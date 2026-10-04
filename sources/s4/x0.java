package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f46682a;
    public int f46683b;
    public int f46684c;
    public int d;
    public Interpolator f46685e;
    public boolean f46686f;
    public int f46687g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.d0(i10);
            this.f46686f = false;
        } else if (this.f46686f) {
            Interpolator interpolator = this.f46685e;
            if (interpolator != null && this.f46684c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f46684c;
            if (i11 >= 1) {
                recyclerView.f3080q0.b(this.f46682a, this.f46683b, i11, interpolator);
                int i12 = this.f46687g + 1;
                this.f46687g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f46686f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f46687g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f46682a = i10;
        this.f46683b = i11;
        this.f46684c = i12;
        this.f46685e = interpolator;
        this.f46686f = true;
    }
}
