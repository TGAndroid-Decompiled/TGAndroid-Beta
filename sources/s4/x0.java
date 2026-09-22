package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f42806a;
    public int f42807b;
    public int f42808c;
    public int d;
    public Interpolator e;
    public boolean f42809f;
    public int f42810g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f42809f = false;
        } else if (this.f42809f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f42808c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f42808c;
            if (i11 >= 1) {
                recyclerView.f2855q0.b(this.f42806a, this.f42807b, i11, interpolator);
                int i12 = this.f42810g + 1;
                this.f42810g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f42809f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f42810g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f42806a = i10;
        this.f42807b = i11;
        this.f42808c = i12;
        this.e = interpolator;
        this.f42809f = true;
    }
}
