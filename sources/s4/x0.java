package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f43095a;
    public int f43096b;
    public int f43097c;
    public int d;
    public Interpolator e;
    public boolean f43098f;
    public int f43099g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f43098f = false;
        } else if (this.f43098f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f43097c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f43097c;
            if (i11 >= 1) {
                recyclerView.f2850q0.b(this.f43095a, this.f43096b, i11, interpolator);
                int i12 = this.f43099g + 1;
                this.f43099g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f43098f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f43099g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f43095a = i10;
        this.f43096b = i11;
        this.f43097c = i12;
        this.e = interpolator;
        this.f43098f = true;
    }
}
