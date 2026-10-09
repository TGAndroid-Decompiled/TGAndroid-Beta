package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class y0 {
    public int f47808a;
    public int f47809b;
    public int f47810c;
    public int d;
    public Interpolator f47811e;
    public boolean f47812f;
    public int f47813g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.c0(i10);
            this.f47812f = false;
        } else if (this.f47812f) {
            Interpolator interpolator = this.f47811e;
            if (interpolator != null && this.f47810c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f47810c;
            if (i11 >= 1) {
                recyclerView.f3161r0.b(this.f47808a, this.f47809b, i11, interpolator);
                int i12 = this.f47813g + 1;
                this.f47813g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f47812f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f47813g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f47808a = i10;
        this.f47809b = i11;
        this.f47810c = i12;
        this.f47811e = interpolator;
        this.f47812f = true;
    }
}
