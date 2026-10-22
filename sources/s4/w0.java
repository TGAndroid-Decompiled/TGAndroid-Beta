package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class w0 {
    public int f46056a;
    public int f46057b;
    public int f46058c;
    public int d;
    public Interpolator e;
    public boolean f46059f;
    public int f46060g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f46059f = false;
        } else if (this.f46059f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f46058c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f46058c;
            if (i11 >= 1) {
                recyclerView.f3623r0.b(this.f46056a, this.f46057b, i11, interpolator);
                int i12 = this.f46060g + 1;
                this.f46060g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f46059f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f46060g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f46056a = i10;
        this.f46057b = i11;
        this.f46058c = i12;
        this.e = interpolator;
        this.f46059f = true;
    }
}
