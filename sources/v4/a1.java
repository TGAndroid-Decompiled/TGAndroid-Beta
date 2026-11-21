package v4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class a1 {
    public int f59093a;
    public int f59094b;
    public int f59095c;
    public int d;
    public Interpolator f59096e;
    public boolean f59097f;
    public int f59098g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.d0(i7);
            this.f59097f = false;
        } else if (this.f59097f) {
            Interpolator interpolator = this.f59096e;
            if (interpolator != null && this.f59095c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f59095c;
            if (i10 >= 1) {
                recyclerView.f2826s0.b(this.f59093a, this.f59094b, i10, interpolator);
                int i11 = this.f59098g + 1;
                this.f59098g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f59097f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f59098g = 0;
        }
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        this.f59093a = i7;
        this.f59094b = i10;
        this.f59095c = i11;
        this.f59096e = interpolator;
        this.f59097f = true;
    }
}
