package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f42837a;
    public int f42838b;
    public int f42839c;
    public int d;
    public Interpolator e;
    public boolean f42840f;
    public int f42841g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.d0(i10);
            this.f42840f = false;
        } else if (this.f42840f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f42839c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f42839c;
            if (i11 >= 1) {
                recyclerView.f2858q0.b(this.f42837a, this.f42838b, i11, interpolator);
                int i12 = this.f42841g + 1;
                this.f42841g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f42840f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f42841g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f42837a = i10;
        this.f42838b = i11;
        this.f42839c = i12;
        this.e = interpolator;
        this.f42840f = true;
    }
}
