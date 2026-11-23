package v4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class a1 {
    public int f59097a;
    public int f59098b;
    public int f59099c;
    public int d;
    public Interpolator f59100e;
    public boolean f59101f;
    public int f59102g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.d0(i7);
            this.f59101f = false;
        } else if (this.f59101f) {
            Interpolator interpolator = this.f59100e;
            if (interpolator != null && this.f59099c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f59099c;
            if (i10 >= 1) {
                recyclerView.f2833s0.b(this.f59097a, this.f59098b, i10, interpolator);
                int i11 = this.f59102g + 1;
                this.f59102g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f59101f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f59102g = 0;
        }
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        this.f59097a = i7;
        this.f59098b = i10;
        this.f59099c = i11;
        this.f59100e = interpolator;
        this.f59101f = true;
    }
}
