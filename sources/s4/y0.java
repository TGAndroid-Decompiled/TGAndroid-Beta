package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class y0 {
    public int f47810a;
    public int f47811b;
    public int f47812c;
    public int d;
    public Interpolator f47813e;
    public boolean f47814f;
    public int f47815g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f47814f = false;
        } else if (this.f47814f) {
            Interpolator interpolator = this.f47813e;
            if (interpolator != null && this.f47812c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f47812c;
            if (i11 >= 1) {
                recyclerView.f3161r0.b(this.f47810a, this.f47811b, i11, interpolator);
                int i12 = this.f47815g + 1;
                this.f47815g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f47814f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f47815g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f47810a = i10;
        this.f47811b = i11;
        this.f47812c = i12;
        this.f47813e = interpolator;
        this.f47814f = true;
    }
}
