package vf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import eg.b1;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.kl0;
import org.telegram.ui.y91;
public final class p extends g {
    public long[] A1;

    public p(Context context, f6 f6Var) {
        super(context, f6Var);
        this.f45814t0 = true;
        this.f45815u0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        float f10;
        wf.b bVar = this.f45793e0;
        if (bVar != null) {
            int i12 = this.f45808p0;
            float f11 = this.D0;
            float f12 = (this.f45791d0.f45836k * f11) - g.f45764h1;
            wf.d dVar = (wf.d) bVar;
            float[] fArr = dVar.f46607b;
            if (fArr.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = fArr[1] * f11;
            }
            float f13 = (i10 + f12) / (f11 - f10);
            if (f13 < 0.0f) {
                this.f45808p0 = 0;
            } else if (f13 > 1.0f) {
                this.f45808p0 = dVar.f46606a.length - 1;
            } else {
                int b10 = dVar.b(f13, this.C, this.D);
                this.f45808p0 = b10;
                int i13 = this.D;
                if (b10 > i13) {
                    this.f45808p0 = i13;
                }
                int i14 = this.f45808p0;
                int i15 = this.C;
                if (i14 < i15) {
                    this.f45808p0 = i15;
                }
            }
            if (i12 != this.f45808p0) {
                this.f45811r0 = true;
                c(true);
                x(f12);
                e eVar = this.N0;
                if (eVar != null) {
                    getSelectedDate();
                    y91 y91Var = (y91) ((kl0) eVar).f35555b;
                    y91Var.f();
                    y91Var.f40190b.f45809q0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.f45780y1) {
            int length = ((wf.d) this.f45793e0).f46606a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    xf.h hVar = (xf.h) arrayList.get(i11);
                    if (hVar.f47055n) {
                        j11 += hVar.f47045a.f46600a[i10];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f10 = (float) j10;
                if (f10 != this.f45801i0) {
                    this.f45801i0 = f10;
                    Animator animator = this.f45783a0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = g.e(this.f45798g0, this.f45801i0, new b1(this, 13));
                    this.f45783a0 = e;
                    e.start();
                }
            }
        }
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final xf.f h(wf.a aVar) {
        return new xf.h(aVar, this.T0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        int i10;
        Paint paint;
        float f14;
        int i11;
        int i12;
        Canvas canvas2 = canvas;
        wf.b bVar = this.f45793e0;
        if (bVar == null) {
            return;
        }
        float f15 = this.C0;
        j jVar = this.f45791d0;
        float f16 = jVar.f45837l;
        float f17 = jVar.f45836k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.f45764h1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((wf.d) bVar).f46607b;
        boolean z4 = true;
        if (fArr.length < 2) {
            f11 = 1.0f;
            f10 = 1.0f;
        } else {
            float f21 = fArr[1];
            float f22 = f21 * f18;
            f10 = (f18 - f22) * f21;
            f11 = f22;
        }
        int i13 = ((int) (f19 / f11)) + 1;
        int max = Math.max(0, (this.C - i13) - 2);
        int min = Math.min(((wf.d) this.f45793e0).f46607b.length - 1, this.D + i13 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((xf.f) arrayList.get(i14)).f47051j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.f45816v0;
        if (i15 == 2) {
            this.f45789c0 = true;
            this.f45813s0 = 0.0f;
            xf.j jVar2 = this.f45818w0;
            float f23 = jVar2.f47064f;
            f13 = 1.0f - f23;
            f12 = 2.0f;
            canvas2.scale((f23 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f12 = 2.0f;
            if (i15 == 1) {
                xf.j jVar3 = this.f45818w0;
                float f24 = jVar3.f47064f;
                canvas2.scale(f24, 1.0f, jVar3.d, jVar3.e);
                f13 = f24;
            } else if (i15 == 3) {
                f13 = this.f45818w0.f47064f;
            } else {
                f13 = 1.0f;
            }
        }
        z4 = (this.f45808p0 < 0 || !this.f45811r0) ? false : false;
        while (true) {
            i10 = g.f45767k1;
            if (max > min) {
                break;
            }
            if (this.f45808p0 != max || !z4) {
                int i16 = 0;
                float f25 = 0.0f;
                while (i16 < arrayList.size()) {
                    xf.f fVar = (xf.f) arrayList.get(i16);
                    if (!fVar.f47055n && fVar.f47056o == 0.0f) {
                        i11 = min;
                        i12 = max;
                    } else {
                        long[] jArr = fVar.f47045a.f46600a;
                        float f26 = (((f18 - f11) * ((wf.d) this.f45793e0).f46607b[max]) + (f11 / f12)) - f20;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (((float) jArr[i12]) / this.v) * ((getMeasuredHeight() - this.f45812s) - i10) * fVar.f47056o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f45812s) - measuredHeight;
                        float[] fArr2 = fVar.f47052k;
                        int i17 = fVar.f47051j;
                        int i18 = i17 + 1;
                        fVar.f47051j = i18;
                        fArr2[i17] = f26;
                        int i19 = i17 + 2;
                        fVar.f47051j = i19;
                        fArr2[i18] = measuredHeight2 - f25;
                        int i20 = i17 + 3;
                        fVar.f47051j = i20;
                        fArr2[i19] = f26;
                        fVar.f47051j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.f45812s) - f25;
                        f25 += measuredHeight;
                    }
                    i16++;
                    min = i11;
                    max = i12;
                }
            }
            max++;
            min = min;
        }
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            xf.h hVar = (xf.h) arrayList.get(i21);
            if (!z4 && !this.f45789c0) {
                paint = hVar.f47047c;
            } else {
                paint = hVar.f47058q;
            }
            if (z4) {
                f14 = 255.0f;
                hVar.f47058q.setColor(i0.a.d(this.f45813s0, hVar.f47054m, hVar.f47059r));
            } else {
                f14 = 255.0f;
            }
            if (this.f45789c0) {
                hVar.f47058q.setColor(i0.a.d(1.0f, hVar.f47054m, hVar.f47059r));
            }
            paint.setAlpha((int) (f13 * f14));
            paint.setStrokeWidth(f10);
            canvas2.drawLines(hVar.f47052k, 0, hVar.f47051j, paint);
        }
        if (z4) {
            int i22 = 0;
            float f27 = 0.0f;
            while (i22 < arrayList.size()) {
                xf.f fVar2 = (xf.f) arrayList.get(i22);
                boolean z10 = fVar2.f47055n;
                Paint paint2 = fVar2.f47047c;
                if (z10 || fVar2.f47056o != 0.0f) {
                    long[] jArr2 = fVar2.f47045a.f46600a;
                    float[] fArr3 = ((wf.d) this.f45793e0).f46607b;
                    int i23 = this.f45808p0;
                    float f28 = (((f18 - f11) * fArr3[i23]) + (f11 / f12)) - f20;
                    float measuredHeight3 = (((float) jArr2[i23]) / this.v) * ((getMeasuredHeight() - this.f45812s) - i10) * fVar2.f47056o;
                    paint2.setStrokeWidth(f10);
                    paint2.setAlpha((int) (f13 * 255.0f));
                    canvas2.drawLine(f28, ((getMeasuredHeight() - this.f45812s) - measuredHeight3) - f27, f28, (getMeasuredHeight() - this.f45812s) - f27, paint2);
                    f27 += measuredHeight3;
                }
                i22++;
                canvas2 = canvas;
            }
        }
        canvas.restore();
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i10;
        int i11;
        wf.b bVar = this.f45793e0;
        if (bVar != null) {
            int length = ((wf.d) bVar).f46607b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((xf.f) arrayList.get(i12)).f47051j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.A1;
            if (jArr == null || jArr.length < size) {
                this.A1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f13 = ((wf.d) this.f45793e0).f46607b[i13] * this.f45823z0;
                int i14 = 0;
                while (true) {
                    f11 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    xf.f fVar = (xf.f) arrayList.get(i14);
                    if (fVar.f47055n || fVar.f47056o != 0.0f) {
                        long j10 = fVar.f47045a.f46600a[i13];
                        long[] jArr2 = this.A1;
                        if (j10 > jArr2[i14]) {
                            jArr2[i14] = j10;
                        }
                    }
                    i14++;
                }
                if (i13 % max == 0) {
                    int i15 = 0;
                    float f14 = 0.0f;
                    while (i15 < size) {
                        xf.f fVar2 = (xf.f) arrayList.get(i15);
                        if (!fVar2.f47055n && fVar2.f47056o == f11) {
                            i11 = length;
                            i10 = i13;
                        } else {
                            if (g.f45780y1) {
                                f12 = this.f45798g0;
                            } else {
                                f12 = (float) ((wf.d) this.f45793e0).e;
                            }
                            long[] jArr3 = this.A1;
                            i10 = i13;
                            float f15 = (((float) jArr3[i15]) / f12) * fVar2.f47056o;
                            int i16 = this.f45822y0;
                            float f16 = f15 * i16;
                            float[] fArr = fVar2.f47052k;
                            int i17 = fVar2.f47051j;
                            int i18 = i17 + 1;
                            fVar2.f47051j = i18;
                            fArr[i17] = f13;
                            int i19 = i17 + 2;
                            fVar2.f47051j = i19;
                            i11 = length;
                            fArr[i18] = (i16 - f16) - f14;
                            int i20 = i17 + 3;
                            fVar2.f47051j = i20;
                            fArr[i19] = f13;
                            fVar2.f47051j = i17 + 4;
                            fArr[i20] = i16 - f14;
                            f14 += f16;
                            jArr3[i15] = 0;
                        }
                        i15++;
                        i13 = i10;
                        length = i11;
                        f11 = 0.0f;
                    }
                }
                i13++;
                length = length;
            }
            wf.b bVar2 = this.f45793e0;
            if (((wf.d) bVar2).f46607b.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = ((wf.d) bVar2).f46607b[1] * this.f45823z0;
            }
            for (int i21 = 0; i21 < size; i21++) {
                xf.f fVar3 = (xf.f) arrayList.get(i21);
                Paint paint = fVar3.f47047c;
                Paint paint2 = fVar3.f47047c;
                paint.setStrokeWidth(max * f10);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f47052k, 0, fVar3.f47051j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f45785b;
        this.f45802j0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f45803k0 = i10;
            int i11 = this.f45803k0;
            if (i11 < this.f45802j0) {
                l(canvas, (xf.d) arrayList.get(i11));
                p(canvas, (xf.d) arrayList.get(this.f45803k0));
                i10 = this.f45803k0 + 1;
            } else {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public final long r(int i10, int i11) {
        return ((wf.d) this.f45793e0).f46616m.rMaxQ(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f45798g0 = 0.0f;
        int length = ((wf.d) this.f45793e0).f46606a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                xf.h hVar = (xf.h) arrayList.get(i11);
                if (hVar.f47055n) {
                    j10 += hVar.f47045a.f46600a[i10];
                }
            }
            float f10 = (float) j10;
            if (f10 > this.f45798g0) {
                this.f45798g0 = f10;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((wf.a) ((wf.d) this.f45793e0).d.get(0)).f46600a.length;
        int size = ((wf.d) this.f45793e0).d.size();
        ((wf.d) this.f45793e0).f46615l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((wf.d) this.f45793e0).f46615l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((xf.h) this.d.get(i11)).f47055n) {
                    wf.b bVar = this.f45793e0;
                    long[] jArr = ((wf.d) bVar).f46615l;
                    jArr[i10] = jArr[i10] + ((wf.a) ((wf.d) bVar).d.get(i11)).f46600a[i10];
                }
            }
        }
        wf.b bVar2 = this.f45793e0;
        ((wf.d) bVar2).f46616m = new SegmentTree(((wf.d) bVar2).f46615l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
