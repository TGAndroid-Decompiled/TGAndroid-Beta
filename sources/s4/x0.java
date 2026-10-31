package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f48031a;
    public int f48032b;
    public int f48033c;
    public int d;
    public Interpolator e;
    public boolean f48034f;
    public int f48035g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.d0(i10);
            this.f48034f = false;
        } else if (this.f48034f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f48033c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f48033c;
            if (i11 >= 1) {
                recyclerView.f1914r0.b(this.f48031a, this.f48032b, i11, interpolator);
                int i12 = this.f48035g + 1;
                this.f48035g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f48034f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f48035g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f48031a = i10;
        this.f48032b = i11;
        this.f48033c = i12;
        this.e = interpolator;
        this.f48034f = true;
    }
}
