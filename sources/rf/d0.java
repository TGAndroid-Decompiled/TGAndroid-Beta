package rf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class d0 extends ViewOutlineProvider {
    public final boolean f46512a;
    public final int f46513b;
    public final boolean f46514c;
    public final boolean d;
    public final boolean e;

    public d0(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f46512a = z10;
        this.f46513b = i10;
        this.f46514c = z11;
        this.d = z12;
        this.e = z13;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        int i10;
        int i11;
        int i12;
        int width = view.getWidth();
        int height = view.getHeight();
        boolean z10 = this.f46512a;
        int i13 = 0;
        int i14 = this.f46513b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = i14;
        }
        int i15 = -i10;
        if (this.f46514c) {
            i11 = 0;
        } else {
            i11 = i14;
        }
        int i16 = -i11;
        if (this.d) {
            i12 = 0;
        } else {
            i12 = i14;
        }
        int i17 = width + i12;
        if (!this.e) {
            i13 = i14;
        }
        outline.setRoundRect(i15, i16, i17, height + i13, i14);
    }
}
