package v4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class y0 {
    public int f57104a;
    public int f57105b;
    public int f57106c;
    public int d;
    public Interpolator f57107e;
    public boolean f57108f;
    public int f57109g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.d0(i7);
            this.f57108f = false;
        } else if (this.f57108f) {
            Interpolator interpolator = this.f57107e;
            if (interpolator != null && this.f57106c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f57106c;
            if (i10 >= 1) {
                recyclerView.f2863r0.b(this.f57104a, this.f57105b, i10, interpolator);
                int i11 = this.f57109g + 1;
                this.f57109g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f57108f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f57109g = 0;
        }
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        this.f57104a = i7;
        this.f57105b = i10;
        this.f57106c = i11;
        this.f57107e = interpolator;
        this.f57108f = true;
    }
}
