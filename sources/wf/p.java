package wf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import f2.d0;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.kl0;
import org.telegram.ui.x91;
public final class p extends g {
    public long[] A1;

    public p(Context context, g6 g6Var) {
        super(context, g6Var);
        this.f49611t0 = true;
        this.f49612u0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        float f10;
        xf.b bVar = this.f49590e0;
        if (bVar != null) {
            int i12 = this.f49605p0;
            float f11 = this.D0;
            float f12 = (this.f49587d0.f49635k * f11) - g.f49560h1;
            xf.d dVar = (xf.d) bVar;
            float[] fArr = dVar.f50584b;
            if (fArr.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = fArr[1] * f11;
            }
            float f13 = (i10 + f12) / (f11 - f10);
            if (f13 < 0.0f) {
                this.f49605p0 = 0;
            } else if (f13 > 1.0f) {
                this.f49605p0 = dVar.f50583a.length - 1;
            } else {
                int b10 = dVar.b(f13, this.C, this.D);
                this.f49605p0 = b10;
                int i13 = this.D;
                if (b10 > i13) {
                    this.f49605p0 = i13;
                }
                int i14 = this.f49605p0;
                int i15 = this.C;
                if (i14 < i15) {
                    this.f49605p0 = i15;
                }
            }
            if (i12 != this.f49605p0) {
                this.f49608r0 = true;
                c(true);
                x(f12);
                e eVar = this.N0;
                if (eVar != null) {
                    getSelectedDate();
                    x91 x91Var = (x91) ((kl0) eVar).f38342b;
                    x91Var.f();
                    x91Var.f42966b.f49606q0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.f49576y1) {
            int length = ((xf.d) this.f49590e0).f50583a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    yf.h hVar = (yf.h) arrayList.get(i11);
                    if (hVar.f50969n) {
                        j11 += hVar.f50958a.f50576a[i10];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f10 = (float) j10;
                if (f10 != this.f49598i0) {
                    this.f49598i0 = f10;
                    Animator animator = this.f49579a0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e6 = g.e(this.f49595g0, this.f49598i0, new d0(this, 13));
                    this.f49579a0 = e6;
                    e6.start();
                }
            }
        }
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final yf.f h(xf.a aVar) {
        return new yf.h(aVar, this.T0);
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
        xf.b bVar = this.f49590e0;
        if (bVar == null) {
            return;
        }
        float f15 = this.C0;
        j jVar = this.f49587d0;
        float f16 = jVar.f49636l;
        float f17 = jVar.f49635k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.f49560h1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((xf.d) bVar).f50584b;
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
        int min = Math.min(((xf.d) this.f49590e0).f50584b.length - 1, this.D + i13 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((yf.f) arrayList.get(i14)).f50965j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.f49613v0;
        if (i15 == 2) {
            this.f49585c0 = true;
            this.f49610s0 = 0.0f;
            yf.j jVar2 = this.f49615w0;
            float f23 = jVar2.f50979f;
            f13 = 1.0f - f23;
            f12 = 2.0f;
            canvas2.scale((f23 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f50978e);
        } else {
            f12 = 2.0f;
            if (i15 == 1) {
                yf.j jVar3 = this.f49615w0;
                float f24 = jVar3.f50979f;
                canvas2.scale(f24, 1.0f, jVar3.d, jVar3.f50978e);
                f13 = f24;
            } else if (i15 == 3) {
                f13 = this.f49615w0.f50979f;
            } else {
                f13 = 1.0f;
            }
        }
        z4 = (this.f49605p0 < 0 || !this.f49608r0) ? false : false;
        while (true) {
            i10 = g.f49563k1;
            if (max > min) {
                break;
            }
            if (this.f49605p0 != max || !z4) {
                int i16 = 0;
                float f25 = 0.0f;
                while (i16 < arrayList.size()) {
                    yf.f fVar = (yf.f) arrayList.get(i16);
                    if (!fVar.f50969n && fVar.f50970o == 0.0f) {
                        i11 = min;
                        i12 = max;
                    } else {
                        long[] jArr = fVar.f50958a.f50576a;
                        float f26 = (((f18 - f11) * ((xf.d) this.f49590e0).f50584b[max]) + (f11 / f12)) - f20;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (((float) jArr[i12]) / this.v) * ((getMeasuredHeight() - this.f49609s) - i10) * fVar.f50970o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f49609s) - measuredHeight;
                        float[] fArr2 = fVar.f50966k;
                        int i17 = fVar.f50965j;
                        int i18 = i17 + 1;
                        fVar.f50965j = i18;
                        fArr2[i17] = f26;
                        int i19 = i17 + 2;
                        fVar.f50965j = i19;
                        fArr2[i18] = measuredHeight2 - f25;
                        int i20 = i17 + 3;
                        fVar.f50965j = i20;
                        fArr2[i19] = f26;
                        fVar.f50965j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.f49609s) - f25;
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
            yf.h hVar = (yf.h) arrayList.get(i21);
            if (!z4 && !this.f49585c0) {
                paint = hVar.f50960c;
            } else {
                paint = hVar.f50972q;
            }
            if (z4) {
                f14 = 255.0f;
                hVar.f50972q.setColor(i0.a.d(this.f49610s0, hVar.f50968m, hVar.f50973r));
            } else {
                f14 = 255.0f;
            }
            if (this.f49585c0) {
                hVar.f50972q.setColor(i0.a.d(1.0f, hVar.f50968m, hVar.f50973r));
            }
            paint.setAlpha((int) (f13 * f14));
            paint.setStrokeWidth(f10);
            canvas2.drawLines(hVar.f50966k, 0, hVar.f50965j, paint);
        }
        if (z4) {
            int i22 = 0;
            float f27 = 0.0f;
            while (i22 < arrayList.size()) {
                yf.f fVar2 = (yf.f) arrayList.get(i22);
                boolean z10 = fVar2.f50969n;
                Paint paint2 = fVar2.f50960c;
                if (z10 || fVar2.f50970o != 0.0f) {
                    long[] jArr2 = fVar2.f50958a.f50576a;
                    float[] fArr3 = ((xf.d) this.f49590e0).f50584b;
                    int i23 = this.f49605p0;
                    float f28 = (((f18 - f11) * fArr3[i23]) + (f11 / f12)) - f20;
                    float measuredHeight3 = (((float) jArr2[i23]) / this.v) * ((getMeasuredHeight() - this.f49609s) - i10) * fVar2.f50970o;
                    paint2.setStrokeWidth(f10);
                    paint2.setAlpha((int) (f13 * 255.0f));
                    canvas2.drawLine(f28, ((getMeasuredHeight() - this.f49609s) - measuredHeight3) - f27, f28, (getMeasuredHeight() - this.f49609s) - f27, paint2);
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
        xf.b bVar = this.f49590e0;
        if (bVar != null) {
            int length = ((xf.d) bVar).f50584b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((yf.f) arrayList.get(i12)).f50965j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.A1;
            if (jArr == null || jArr.length < size) {
                this.A1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f13 = ((xf.d) this.f49590e0).f50584b[i13] * this.f49620z0;
                int i14 = 0;
                while (true) {
                    f11 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    yf.f fVar = (yf.f) arrayList.get(i14);
                    if (fVar.f50969n || fVar.f50970o != 0.0f) {
                        long j10 = fVar.f50958a.f50576a[i13];
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
                        yf.f fVar2 = (yf.f) arrayList.get(i15);
                        if (!fVar2.f50969n && fVar2.f50970o == f11) {
                            i11 = length;
                            i10 = i13;
                        } else {
                            if (g.f49576y1) {
                                f12 = this.f49595g0;
                            } else {
                                f12 = (float) ((xf.d) this.f49590e0).f50586e;
                            }
                            long[] jArr3 = this.A1;
                            i10 = i13;
                            float f15 = (((float) jArr3[i15]) / f12) * fVar2.f50970o;
                            int i16 = this.f49619y0;
                            float f16 = f15 * i16;
                            float[] fArr = fVar2.f50966k;
                            int i17 = fVar2.f50965j;
                            int i18 = i17 + 1;
                            fVar2.f50965j = i18;
                            fArr[i17] = f13;
                            int i19 = i17 + 2;
                            fVar2.f50965j = i19;
                            i11 = length;
                            fArr[i18] = (i16 - f16) - f14;
                            int i20 = i17 + 3;
                            fVar2.f50965j = i20;
                            fArr[i19] = f13;
                            fVar2.f50965j = i17 + 4;
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
            xf.b bVar2 = this.f49590e0;
            if (((xf.d) bVar2).f50584b.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = ((xf.d) bVar2).f50584b[1] * this.f49620z0;
            }
            for (int i21 = 0; i21 < size; i21++) {
                yf.f fVar3 = (yf.f) arrayList.get(i21);
                Paint paint = fVar3.f50960c;
                Paint paint2 = fVar3.f50960c;
                paint.setStrokeWidth(max * f10);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f50966k, 0, fVar3.f50965j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f49581b;
        this.f49599j0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f49600k0 = i10;
            int i11 = this.f49600k0;
            if (i11 < this.f49599j0) {
                l(canvas, (yf.d) arrayList.get(i11));
                p(canvas, (yf.d) arrayList.get(this.f49600k0));
                i10 = this.f49600k0 + 1;
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
        return ((xf.d) this.f49590e0).f50594m.rMaxQ(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f49595g0 = 0.0f;
        int length = ((xf.d) this.f49590e0).f50583a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                yf.h hVar = (yf.h) arrayList.get(i11);
                if (hVar.f50969n) {
                    j10 += hVar.f50958a.f50576a[i10];
                }
            }
            float f10 = (float) j10;
            if (f10 > this.f49595g0) {
                this.f49595g0 = f10;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((xf.a) ((xf.d) this.f49590e0).d.get(0)).f50576a.length;
        int size = ((xf.d) this.f49590e0).d.size();
        ((xf.d) this.f49590e0).f50593l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((xf.d) this.f49590e0).f50593l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((yf.h) this.d.get(i11)).f50969n) {
                    xf.b bVar = this.f49590e0;
                    long[] jArr = ((xf.d) bVar).f50593l;
                    jArr[i10] = jArr[i10] + ((xf.a) ((xf.d) bVar).d.get(i11)).f50576a[i10];
                }
            }
        }
        xf.b bVar2 = this.f49590e0;
        ((xf.d) bVar2).f50594m = new SegmentTree(((xf.d) bVar2).f50593l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
