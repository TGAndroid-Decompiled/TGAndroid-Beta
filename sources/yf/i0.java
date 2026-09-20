package yf;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0 extends ViewOutlineProvider {
    public final boolean f47134a;
    public final int f47135b;
    public final boolean f47136c;
    public final boolean d;
    public final boolean e;

    public i0(int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f47134a = z10;
        this.f47135b = i10;
        this.f47136c = z11;
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
        boolean z10 = this.f47134a;
        int i13 = 0;
        int i14 = this.f47135b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = i14;
        }
        int i15 = -i10;
        if (this.f47136c) {
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
