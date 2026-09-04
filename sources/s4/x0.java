package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f45889a;
    public int f45890b;
    public int f45891c;
    public int d;
    public Interpolator f45892e;
    public boolean f45893f;
    public int f45894g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f45893f = false;
        } else if (this.f45893f) {
            Interpolator interpolator = this.f45892e;
            if (interpolator != null && this.f45891c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f45891c;
            if (i11 >= 1) {
                recyclerView.f1886q0.b(this.f45889a, this.f45890b, i11, interpolator);
                int i12 = this.f45894g + 1;
                this.f45894g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f45893f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f45894g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f45889a = i10;
        this.f45890b = i11;
        this.f45891c = i12;
        this.f45892e = interpolator;
        this.f45893f = true;
    }
}
