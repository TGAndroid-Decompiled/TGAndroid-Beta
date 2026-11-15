package v4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class z0 {
    public int f58696a;
    public int f58697b;
    public int f58698c;
    public int d;
    public Interpolator f58699e;
    public boolean f58700f;
    public int f58701g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.d0(i7);
            this.f58700f = false;
        } else if (this.f58700f) {
            Interpolator interpolator = this.f58699e;
            if (interpolator != null && this.f58698c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f58698c;
            if (i10 >= 1) {
                recyclerView.f2822s0.b(this.f58696a, this.f58697b, i10, interpolator);
                int i11 = this.f58701g + 1;
                this.f58701g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f58700f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f58701g = 0;
        }
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        this.f58696a = i7;
        this.f58697b = i10;
        this.f58698c = i11;
        this.f58699e = interpolator;
        this.f58700f = true;
    }
}
