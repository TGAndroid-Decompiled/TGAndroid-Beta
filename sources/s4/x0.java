package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f42762a;
    public int f42763b;
    public int f42764c;
    public int d;
    public Interpolator e;
    public boolean f42765f;
    public int f42766g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f42765f = false;
        } else if (this.f42765f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f42764c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f42764c;
            if (i11 >= 1) {
                recyclerView.f2850q0.b(this.f42762a, this.f42763b, i11, interpolator);
                int i12 = this.f42766g + 1;
                this.f42766g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f42765f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f42766g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f42762a = i10;
        this.f42763b = i11;
        this.f42764c = i12;
        this.e = interpolator;
        this.f42765f = true;
    }
}
