package u4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class y0 {
    public int f55688a;
    public int f55689b;
    public int f55690c;
    public int d;
    public Interpolator f55691e;
    public boolean f55692f;
    public int f55693g;

    public final void a(RecyclerView recyclerView) {
        int i3 = this.d;
        if (i3 >= 0) {
            this.d = -1;
            recyclerView.d0(i3);
            this.f55692f = false;
        } else if (this.f55692f) {
            Interpolator interpolator = this.f55691e;
            if (interpolator != null && this.f55690c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f55690c;
            if (i10 >= 1) {
                recyclerView.f2297s0.b(this.f55688a, this.f55689b, i10, interpolator);
                int i11 = this.f55693g + 1;
                this.f55693g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f55692f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f55693g = 0;
        }
    }

    public final void b(int i3, int i10, int i11, Interpolator interpolator) {
        this.f55688a = i3;
        this.f55689b = i10;
        this.f55690c = i11;
        this.f55691e = interpolator;
        this.f55692f = true;
    }
}
