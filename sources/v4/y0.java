package v4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class y0 {
    public int f57197a;
    public int f57198b;
    public int f57199c;
    public int d;
    public Interpolator f57200e;
    public boolean f57201f;
    public int f57202g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.d0(i7);
            this.f57201f = false;
        } else if (this.f57201f) {
            Interpolator interpolator = this.f57200e;
            if (interpolator != null && this.f57199c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f57199c;
            if (i10 >= 1) {
                recyclerView.f2863r0.b(this.f57197a, this.f57198b, i10, interpolator);
                int i11 = this.f57202g + 1;
                this.f57202g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f57201f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f57202g = 0;
        }
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        this.f57197a = i7;
        this.f57198b = i10;
        this.f57199c = i11;
        this.f57200e = interpolator;
        this.f57201f = true;
    }
}
