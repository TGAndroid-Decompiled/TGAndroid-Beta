package v4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class a1 {
    public int f59054a;
    public int f59055b;
    public int f59056c;
    public int d;
    public Interpolator f59057e;
    public boolean f59058f;
    public int f59059g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.d;
        if (i7 >= 0) {
            this.d = -1;
            recyclerView.d0(i7);
            this.f59058f = false;
        } else if (this.f59058f) {
            Interpolator interpolator = this.f59057e;
            if (interpolator != null && this.f59056c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f59056c;
            if (i10 >= 1) {
                recyclerView.f2813s0.b(this.f59054a, this.f59055b, i10, interpolator);
                int i11 = this.f59059g + 1;
                this.f59059g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f59058f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f59059g = 0;
        }
    }

    public final void b(int i7, int i10, int i11, Interpolator interpolator) {
        this.f59054a = i7;
        this.f59055b = i10;
        this.f59056c = i11;
        this.f59057e = interpolator;
        this.f59058f = true;
    }
}
