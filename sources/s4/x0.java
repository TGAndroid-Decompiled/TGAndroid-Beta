package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f45918a;
    public int f45919b;
    public int f45920c;
    public int d;
    public Interpolator f45921e;
    public boolean f45922f;
    public int f45923g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f45922f = false;
        } else if (this.f45922f) {
            Interpolator interpolator = this.f45921e;
            if (interpolator != null && this.f45920c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f45920c;
            if (i11 >= 1) {
                recyclerView.f1913q0.b(this.f45918a, this.f45919b, i11, interpolator);
                int i12 = this.f45923g + 1;
                this.f45923g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f45922f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f45923g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f45918a = i10;
        this.f45919b = i11;
        this.f45920c = i12;
        this.f45921e = interpolator;
        this.f45922f = true;
    }
}
