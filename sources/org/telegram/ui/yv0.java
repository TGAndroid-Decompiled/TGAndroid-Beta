package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class yv0 extends org.telegram.ui.Cells.s1 {
    public final int He;
    public final int Ie;
    public final int Je;

    public yv0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, u6Var);
        this.He = i13;
        this.Ie = i11;
        this.Je = i12;
    }

    @Override
    public final void Y1(Canvas canvas) {
        switch (this.He) {
            case 0:
                this.f25136i6 = 0;
                this.f25149j6 = this.Y5.size() - 1;
                super.Y1(canvas);
                return;
            default:
                this.f25136i6 = 0;
                this.f25149j6 = this.Y5.size() - 1;
                super.Y1(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.He) {
            case 0:
                setMeasuredDimension(this.Ie, this.Je);
                return;
            default:
                setMeasuredDimension(this.Ie, this.Je);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        int i10 = this.He;
    }

    private final void D4(boolean z10) {
    }

    private final void E4(boolean z10) {
    }
}
