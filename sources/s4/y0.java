package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class y0 {
    public int f47900a;
    public int f47901b;
    public int f47902c;
    public int d;
    public Interpolator f47903e;
    public boolean f47904f;
    public int f47905g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f47904f = false;
        } else if (this.f47904f) {
            Interpolator interpolator = this.f47903e;
            if (interpolator != null && this.f47902c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f47902c;
            if (i11 >= 1) {
                recyclerView.f3161r0.b(this.f47900a, this.f47901b, i11, interpolator);
                int i12 = this.f47905g + 1;
                this.f47905g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f47904f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f47905g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f47900a = i10;
        this.f47901b = i11;
        this.f47902c = i12;
        this.f47903e = interpolator;
        this.f47904f = true;
    }
}
