package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f42832a;
    public int f42833b;
    public int f42834c;
    public int d;
    public Interpolator e;
    public boolean f42835f;
    public int f42836g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.d0(i10);
            this.f42835f = false;
        } else if (this.f42835f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f42834c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f42834c;
            if (i11 >= 1) {
                recyclerView.f2858q0.b(this.f42832a, this.f42833b, i11, interpolator);
                int i12 = this.f42836g + 1;
                this.f42836g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f42835f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f42836g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f42832a = i10;
        this.f42833b = i11;
        this.f42834c = i12;
        this.e = interpolator;
        this.f42835f = true;
    }
}
