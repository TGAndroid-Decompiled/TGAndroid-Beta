package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f45890a;
    public int f45891b;
    public int f45892c;
    public int d;
    public Interpolator f45893e;
    public boolean f45894f;
    public int f45895g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f45894f = false;
        } else if (this.f45894f) {
            Interpolator interpolator = this.f45893e;
            if (interpolator != null && this.f45892c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f45892c;
            if (i11 >= 1) {
                recyclerView.f1886q0.b(this.f45890a, this.f45891b, i11, interpolator);
                int i12 = this.f45895g + 1;
                this.f45895g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f45894f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f45895g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f45890a = i10;
        this.f45891b = i11;
        this.f45892c = i12;
        this.f45893e = interpolator;
        this.f45894f = true;
    }
}
