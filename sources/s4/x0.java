package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f43081a;
    public int f43082b;
    public int f43083c;
    public int d;
    public Interpolator e;
    public boolean f43084f;
    public int f43085g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f43084f = false;
        } else if (this.f43084f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f43083c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f43083c;
            if (i11 >= 1) {
                recyclerView.f2850q0.b(this.f43081a, this.f43082b, i11, interpolator);
                int i12 = this.f43085g + 1;
                this.f43085g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f43084f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f43085g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f43081a = i10;
        this.f43082b = i11;
        this.f43083c = i12;
        this.e = interpolator;
        this.f43084f = true;
    }
}
