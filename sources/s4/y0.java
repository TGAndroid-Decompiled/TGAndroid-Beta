package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class y0 {
    public int f48049a;
    public int f48050b;
    public int f48051c;
    public int d;
    public Interpolator f48052e;
    public boolean f48053f;
    public int f48054g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f48053f = false;
        } else if (this.f48053f) {
            Interpolator interpolator = this.f48052e;
            if (interpolator != null && this.f48051c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f48051c;
            if (i11 >= 1) {
                recyclerView.f3159r0.b(this.f48049a, this.f48050b, i11, interpolator);
                int i12 = this.f48054g + 1;
                this.f48054g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f48053f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f48054g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f48049a = i10;
        this.f48050b = i11;
        this.f48051c = i12;
        this.f48052e = interpolator;
        this.f48053f = true;
    }
}
