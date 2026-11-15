package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class wr0 extends org.telegram.ui.Cells.q1 {
    public final int Ad;
    public final int Bd;
    public final int f52988zd;

    public wr0(Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, e6Var);
        this.f52988zd = i12;
        this.Ad = i10;
        this.Bd = i11;
    }

    @Override
    public final void j1(Canvas canvas) {
        switch (this.f52988zd) {
            case 0:
                this.S4 = 0;
                this.T4 = this.Q4.size() - 1;
                super.j1(canvas);
                return;
            default:
                this.S4 = 0;
                this.T4 = this.Q4.size() - 1;
                super.j1(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f52988zd) {
            case 0:
                setMeasuredDimension(this.Ad, this.Bd);
                return;
            default:
                setMeasuredDimension(this.Ad, this.Bd);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        int i7 = this.f52988zd;
    }

    private final void e4(boolean z10) {
    }

    private final void f4(boolean z10) {
    }
}
