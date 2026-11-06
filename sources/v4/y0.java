package v4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class y0 {
    public int f57080a;
    public int f57081b;
    public int f57082c;
    public int d;
    public Interpolator f57083e;
    public boolean f57084f;
    public int f57085g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.d0(i7);
            this.f57084f = false;
        } else if (this.f57084f) {
            Interpolator interpolator = this.f57083e;
            if (interpolator != null && this.f57082c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f57082c;
            if (i10 >= 1) {
                recyclerView.f2863r0.b(this.f57080a, this.f57081b, i10, interpolator);
                int i11 = this.f57085g + 1;
                this.f57085g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f57084f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f57085g = 0;
        }
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        this.f57080a = i7;
        this.f57081b = i10;
        this.f57082c = i11;
        this.f57083e = interpolator;
        this.f57084f = true;
    }
}
