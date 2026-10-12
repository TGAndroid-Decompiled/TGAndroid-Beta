package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class w0 {
    public int f44974a;
    public int f44975b;
    public int f44976c;
    public int d;
    public Interpolator e;
    public boolean f44977f;
    public int f44978g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f44977f = false;
        } else if (this.f44977f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f44976c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f44976c;
            if (i11 >= 1) {
                recyclerView.f2009r0.b(this.f44974a, this.f44975b, i11, interpolator);
                int i12 = this.f44978g + 1;
                this.f44978g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f44977f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f44978g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f44974a = i10;
        this.f44975b = i11;
        this.f44976c = i12;
        this.e = interpolator;
        this.f44977f = true;
    }
}
