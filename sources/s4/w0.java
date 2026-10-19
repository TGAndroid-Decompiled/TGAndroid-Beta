package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class w0 {
    public int f46048a;
    public int f46049b;
    public int f46050c;
    public int d;
    public Interpolator e;
    public boolean f46051f;
    public int f46052g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f46051f = false;
        } else if (this.f46051f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f46050c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f46050c;
            if (i11 >= 1) {
                recyclerView.f3623r0.b(this.f46048a, this.f46049b, i11, interpolator);
                int i12 = this.f46052g + 1;
                this.f46052g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f46051f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f46052g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f46048a = i10;
        this.f46049b = i11;
        this.f46050c = i12;
        this.e = interpolator;
        this.f46051f = true;
    }
}
