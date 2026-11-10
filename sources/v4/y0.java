package v4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class y0 {
    public int f57205a;
    public int f57206b;
    public int f57207c;
    public int d;
    public Interpolator f57208e;
    public boolean f57209f;
    public int f57210g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.d0(i7);
            this.f57209f = false;
        } else if (this.f57209f) {
            Interpolator interpolator = this.f57208e;
            if (interpolator != null && this.f57207c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f57207c;
            if (i10 >= 1) {
                recyclerView.f2863r0.b(this.f57205a, this.f57206b, i10, interpolator);
                int i11 = this.f57210g + 1;
                this.f57210g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f57209f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f57210g = 0;
        }
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        this.f57205a = i7;
        this.f57206b = i10;
        this.f57207c = i11;
        this.f57208e = interpolator;
        this.f57209f = true;
    }
}
