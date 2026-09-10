package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f41745a;
    public int f41746b;
    public int f41747c;
    public int d;
    public Interpolator e;
    public boolean f41748f;
    public int f41749g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f41748f = false;
        } else if (this.f41748f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.f41747c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f41747c;
            if (i11 >= 1) {
                recyclerView.f1550q0.b(this.f41745a, this.f41746b, i11, interpolator);
                int i12 = this.f41749g + 1;
                this.f41749g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f41748f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f41749g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f41745a = i10;
        this.f41746b = i11;
        this.f41747c = i12;
        this.e = interpolator;
        this.f41748f = true;
    }
}
