package v4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class z0 {
    public int f59271a;
    public int f59272b;
    public int f59273c;
    public int d;
    public Interpolator f59274e;
    public boolean f59275f;
    public int f59276g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.d0(i7);
            this.f59275f = false;
        } else if (this.f59275f) {
            Interpolator interpolator = this.f59274e;
            if (interpolator != null && this.f59273c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f59273c;
            if (i10 >= 1) {
                recyclerView.f2784s0.b(this.f59271a, this.f59272b, i10, interpolator);
                int i11 = this.f59276g + 1;
                this.f59276g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f59275f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f59276g = 0;
        }
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        this.f59271a = i7;
        this.f59272b = i10;
        this.f59273c = i11;
        this.f59274e = interpolator;
        this.f59275f = true;
    }
}
