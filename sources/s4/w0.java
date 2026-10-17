package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class w0 {
    public int f46074a;
    public int f46075b;
    public int f46076c;
    public int d;
    public Interpolator e;
    public boolean f46077f;
    public int f46078g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f46077f = false;
        } else if (this.f46077f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f46076c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f46076c;
            if (i11 >= 1) {
                recyclerView.f3626r0.b(this.f46074a, this.f46075b, i11, interpolator);
                int i12 = this.f46078g + 1;
                this.f46078g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f46077f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f46078g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f46074a = i10;
        this.f46075b = i11;
        this.f46076c = i12;
        this.e = interpolator;
        this.f46077f = true;
    }
}
