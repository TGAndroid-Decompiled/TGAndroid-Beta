package v4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class a1 {
    public int f59055a;
    public int f59056b;
    public int f59057c;
    public int d;
    public Interpolator f59058e;
    public boolean f59059f;
    public int f59060g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.d0(i7);
            this.f59059f = false;
        } else if (this.f59059f) {
            Interpolator interpolator = this.f59058e;
            if (interpolator != null && this.f59057c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f59057c;
            if (i10 >= 1) {
                recyclerView.f2814s0.b(this.f59055a, this.f59056b, i10, interpolator);
                int i11 = this.f59060g + 1;
                this.f59060g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f59059f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f59060g = 0;
        }
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        this.f59055a = i7;
        this.f59056b = i10;
        this.f59057c = i11;
        this.f59058e = interpolator;
        this.f59059f = true;
    }
}
