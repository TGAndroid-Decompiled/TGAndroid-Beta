package v4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class a1 {
    public int f59179a;
    public int f59180b;
    public int f59181c;
    public int d;
    public Interpolator f59182e;
    public boolean f59183f;
    public int f59184g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.d0(i7);
            this.f59183f = false;
        } else if (this.f59183f) {
            Interpolator interpolator = this.f59182e;
            if (interpolator != null && this.f59181c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f59181c;
            if (i10 >= 1) {
                recyclerView.f2785s0.b(this.f59179a, this.f59180b, i10, interpolator);
                int i11 = this.f59184g + 1;
                this.f59184g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f59183f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f59184g = 0;
        }
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        this.f59179a = i7;
        this.f59180b = i10;
        this.f59181c = i11;
        this.f59182e = interpolator;
        this.f59183f = true;
    }
}
