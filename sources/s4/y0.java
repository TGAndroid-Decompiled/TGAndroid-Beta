package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class y0 {
    public int f47854a;
    public int f47855b;
    public int f47856c;
    public int d;
    public Interpolator f47857e;
    public boolean f47858f;
    public int f47859g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f47858f = false;
        } else if (this.f47858f) {
            Interpolator interpolator = this.f47857e;
            if (interpolator != null && this.f47856c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f47856c;
            if (i11 >= 1) {
                recyclerView.f3161r0.b(this.f47854a, this.f47855b, i11, interpolator);
                int i12 = this.f47859g + 1;
                this.f47859g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f47858f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f47859g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f47854a = i10;
        this.f47855b = i11;
        this.f47856c = i12;
        this.f47857e = interpolator;
        this.f47858f = true;
    }
}
