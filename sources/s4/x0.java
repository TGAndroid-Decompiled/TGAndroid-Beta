package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f45917a;
    public int f45918b;
    public int f45919c;
    public int d;
    public Interpolator f45920e;
    public boolean f45921f;
    public int f45922g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f45921f = false;
        } else if (this.f45921f) {
            Interpolator interpolator = this.f45920e;
            if (interpolator != null && this.f45919c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f45919c;
            if (i11 >= 1) {
                recyclerView.f1913q0.b(this.f45917a, this.f45918b, i11, interpolator);
                int i12 = this.f45922g + 1;
                this.f45922g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f45921f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f45922g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f45917a = i10;
        this.f45918b = i11;
        this.f45919c = i12;
        this.f45920e = interpolator;
        this.f45921f = true;
    }
}
