package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f46689a;
    public int f46690b;
    public int f46691c;
    public int d;
    public Interpolator f46692e;
    public boolean f46693f;
    public int f46694g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.d0(i10);
            this.f46693f = false;
        } else if (this.f46693f) {
            Interpolator interpolator = this.f46692e;
            if (interpolator != null && this.f46691c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f46691c;
            if (i11 >= 1) {
                recyclerView.f3080q0.b(this.f46689a, this.f46690b, i11, interpolator);
                int i12 = this.f46694g + 1;
                this.f46694g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f46693f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f46694g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f46689a = i10;
        this.f46690b = i11;
        this.f46691c = i12;
        this.f46692e = interpolator;
        this.f46693f = true;
    }
}
