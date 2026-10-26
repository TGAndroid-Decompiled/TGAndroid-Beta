package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class z0 {
    public int f47871a;
    public int f47872b;
    public int f47873c;
    public int d;
    public Interpolator e;
    public boolean f47874f;
    public int f47875g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.d0(i10);
            this.f47874f = false;
        } else if (this.f47874f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f47873c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f47873c;
            if (i11 >= 1) {
                recyclerView.f3076r0.b(this.f47871a, this.f47872b, i11, interpolator);
                int i12 = this.f47875g + 1;
                this.f47875g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f47874f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f47875g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f47871a = i10;
        this.f47872b = i11;
        this.f47873c = i12;
        this.e = interpolator;
        this.f47874f = true;
    }
}
