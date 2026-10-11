package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class y0 {
    public int f47934a;
    public int f47935b;
    public int f47936c;
    public int d;
    public Interpolator f47937e;
    public boolean f47938f;
    public int f47939g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f47938f = false;
        } else if (this.f47938f) {
            Interpolator interpolator = this.f47937e;
            if (interpolator != null && this.f47936c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f47936c;
            if (i11 >= 1) {
                recyclerView.f3161r0.b(this.f47934a, this.f47935b, i11, interpolator);
                int i12 = this.f47939g + 1;
                this.f47939g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f47938f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f47939g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f47934a = i10;
        this.f47935b = i11;
        this.f47936c = i12;
        this.f47937e = interpolator;
        this.f47938f = true;
    }
}
