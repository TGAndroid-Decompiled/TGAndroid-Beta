package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class w0 {
    public int f46479a;
    public int f46480b;
    public int f46481c;
    public int d;
    public Interpolator e;
    public boolean f46482f;
    public int f46483g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f46482f = false;
        } else if (this.f46482f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f46481c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f46481c;
            if (i11 >= 1) {
                recyclerView.f3630r0.b(this.f46479a, this.f46480b, i11, interpolator);
                int i12 = this.f46483g + 1;
                this.f46483g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f46482f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f46483g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f46479a = i10;
        this.f46480b = i11;
        this.f46481c = i12;
        this.e = interpolator;
        this.f46482f = true;
    }
}
