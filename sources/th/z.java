package th;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.qz0;
public final class z extends ReplacementSpan {
    public final int f49686a;
    public final Object f49687b;
    public final Paint f49688c;
    public final qz0 d;

    public z(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f49686a = 2;
        this.f49687b = p6Var;
        this.d = new qz0(cd.L0(2131745255, null), 12.0f, org.telegram.messenger.i0.o());
        this.f49688c = new Paint(1);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        switch (this.f49686a) {
            case 0:
                float L = ((i12 + i14) / 2.0f) + org.telegram.messenger.i0.L(0.0f);
                RectF rectF = (RectF) this.f49687b;
                rectF.set(f7, L - org.telegram.messenger.i0.L(6.0f), this.d.k() + f7 + org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(6.0f) + L);
                Paint paint2 = this.f49688c;
                paint2.setColor(-572850);
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                this.d.c(org.telegram.messenger.i0.L(4.0f) + f7, L, 1.0f, -1, canvas);
                return;
            case 1:
                float L2 = ((i12 + i14) / 2.0f) + org.telegram.messenger.i0.L(1.33f);
                RectF rectF2 = (RectF) this.f49687b;
                rectF2.set(f7, L2 - org.telegram.messenger.i0.L(7.0f), this.d.k() + f7 + org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(7.0f) + L2);
                Paint paint3 = this.f49688c;
                paint3.setColor(-572850);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint3);
                this.d.c(org.telegram.messenger.i0.L(6.0f) + f7, L2, 1.0f, -1, canvas);
                return;
            default:
                float L3 = ((i12 + i14) / 2.0f) + org.telegram.messenger.i0.L(1.0f);
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, (org.telegram.ui.ActionBar.p6) this.f49687b);
                Paint paint4 = this.f49688c;
                paint4.setColor(w02);
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(f7, L3 - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(16.0f) + f7 + this.d.f29774c, org.telegram.messenger.i0.L(9.0f) + L3);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), paint4);
                this.d.c(f7 + org.telegram.messenger.i0.L(8.0f), L3, 1.0f, -1, canvas);
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float k10;
        int L;
        float f7;
        switch (this.f49686a) {
            case 0:
                k10 = this.d.k();
                L = org.telegram.messenger.i0.L(8.0f);
                f7 = L;
                break;
            case 1:
                k10 = this.d.k();
                L = org.telegram.messenger.i0.L(12.0f);
                f7 = L;
                break;
            default:
                k10 = org.telegram.messenger.i0.L(16.0f);
                f7 = this.d.f29774c;
                break;
        }
        return (int) (k10 + f7);
    }

    public z(int i10) {
        this.f49686a = i10;
        switch (i10) {
            case 1:
                this.f49687b = new RectF();
                this.f49688c = new Paint(1);
                this.d = new qz0(cd.L0(2131748835, null), 9.0f, org.telegram.messenger.i0.o());
                return;
            default:
                this.f49687b = new RectF();
                this.f49688c = new Paint(1);
                this.d = new qz0(cd.L0(2131748835, null), 8.0f, org.telegram.messenger.i0.o());
                return;
        }
    }
}
