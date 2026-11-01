package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f48042a;
    public int f48043b;
    public int f48044c;
    public int d;
    public Interpolator e;
    public boolean f48045f;
    public int f48046g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.d0(i10);
            this.f48045f = false;
        } else if (this.f48045f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f48044c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f48044c;
            if (i11 >= 1) {
                recyclerView.f1914r0.b(this.f48042a, this.f48043b, i11, interpolator);
                int i12 = this.f48046g + 1;
                this.f48046g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f48045f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f48046g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f48042a = i10;
        this.f48043b = i11;
        this.f48044c = i12;
        this.e = interpolator;
        this.f48045f = true;
    }
}
