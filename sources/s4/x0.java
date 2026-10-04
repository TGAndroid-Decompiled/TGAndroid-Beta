package s4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
public final class x0 {
    public int f46675a;
    public int f46676b;
    public int f46677c;
    public int d;
    public Interpolator f46678e;
    public boolean f46679f;
    public int f46680g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.d;
        if (i10 >= 0) {
            this.d = -1;
            recyclerView.d0(i10);
            this.f46679f = false;
        } else if (this.f46679f) {
            Interpolator interpolator = this.f46678e;
            if (interpolator != null && this.f46677c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f46677c;
            if (i11 >= 1) {
                recyclerView.f3080q0.b(this.f46675a, this.f46676b, i11, interpolator);
                int i12 = this.f46680g + 1;
                this.f46680g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f46679f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f46680g = 0;
        }
    }

    public final void b(int i10, int i11, int i12, Interpolator interpolator) {
        this.f46675a = i10;
        this.f46676b = i11;
        this.f46677c = i12;
        this.f46678e = interpolator;
        this.f46679f = true;
    }
}
