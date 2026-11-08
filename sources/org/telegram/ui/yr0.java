package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class yr0 extends org.telegram.ui.Cells.q1 {
    public final int f52294ld;
    public final int f52295md;
    public final int f52296nd;

    public yr0(Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, f6Var);
        this.f52294ld = i12;
        this.f52295md = i10;
        this.f52296nd = i11;
    }

    @Override
    public final void j1(Canvas canvas) {
        switch (this.f52294ld) {
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
        switch (this.f52294ld) {
            case 0:
                setMeasuredDimension(this.f52295md, this.f52296nd);
                return;
            default:
                setMeasuredDimension(this.f52295md, this.f52296nd);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z9) {
        int i7 = this.f52294ld;
    }

    private final void d4(boolean z9) {
    }

    private final void e4(boolean z9) {
    }
}
