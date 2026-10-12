package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class y0 {
    public int f48041a;
    public int f48042b;
    public int f48043c;
    public int d;
    public Interpolator f48044e;
    public boolean f48045f;
    public int f48046g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f48045f = false;
        } else if (this.f48045f) {
            Interpolator interpolator = this.f48044e;
            if (interpolator != null && this.f48043c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f48043c;
            if (i11 >= 1) {
                recyclerView.f3159r0.b(this.f48041a, this.f48042b, i11, interpolator);
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
        this.f48041a = i10;
        this.f48042b = i11;
        this.f48043c = i12;
        this.f48044e = interpolator;
        this.f48045f = true;
    }
}
