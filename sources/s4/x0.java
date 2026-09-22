package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f43130a;
    public int f43131b;
    public int f43132c;
    public int d;
    public Interpolator e;
    public boolean f43133f;
    public int f43134g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.d0(i10);
            this.f43133f = false;
        } else if (this.f43133f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f43132c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f43132c;
            if (i11 >= 1) {
                recyclerView.f2857q0.b(this.f43130a, this.f43131b, i11, interpolator);
                int i12 = this.f43134g + 1;
                this.f43134g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f43133f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f43134g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f43130a = i10;
        this.f43131b = i11;
        this.f43132c = i12;
        this.e = interpolator;
        this.f43133f = true;
    }
}
