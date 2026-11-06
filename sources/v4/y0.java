package v4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class y0 {
    public int f57105a;
    public int f57106b;
    public int f57107c;
    public int d;
    public Interpolator f57108e;
    public boolean f57109f;
    public int f57110g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.d0(i7);
            this.f57109f = false;
        } else if (this.f57109f) {
            Interpolator interpolator = this.f57108e;
            if (interpolator != null && this.f57107c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f57107c;
            if (i10 >= 1) {
                recyclerView.f2863r0.b(this.f57105a, this.f57106b, i10, interpolator);
                int i11 = this.f57110g + 1;
                this.f57110g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f57109f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f57110g = 0;
        }
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        this.f57105a = i7;
        this.f57106b = i10;
        this.f57107c = i11;
        this.f57108e = interpolator;
        this.f57109f = true;
    }
}
