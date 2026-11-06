package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class yr0 extends org.telegram.ui.Cells.q1 {
    public final int f52316kd;
    public final int f52317ld;
    public final int f52318md;

    public yr0(Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, f6Var);
        this.f52316kd = i12;
        this.f52317ld = i10;
        this.f52318md = i11;
    }

    @Override
    public final void j1(Canvas canvas) {
        switch (this.f52316kd) {
            case 0:
                this.R4 = 0;
                this.S4 = this.P4.size() - 1;
                super.j1(canvas);
                return;
            default:
                this.R4 = 0;
                this.S4 = this.P4.size() - 1;
                super.j1(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f52316kd) {
            case 0:
                setMeasuredDimension(this.f52317ld, this.f52318md);
                return;
            default:
                setMeasuredDimension(this.f52317ld, this.f52318md);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z9) {
        int i7 = this.f52316kd;
    }

    private final void c4(boolean z9) {
    }

    private final void d4(boolean z9) {
    }
}
