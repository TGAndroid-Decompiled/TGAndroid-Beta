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
import org.telegram.ui.il0;
import org.telegram.ui.q91;
public final class p extends g {
    public long[] A1;

    public p(Context context, f6 f6Var) {
        super(context, f6Var);
        this.f45736t0 = true;
        this.f45737u0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        float f10;
        wf.b bVar = this.f45715e0;
        if (bVar != null) {
            int i12 = this.f45730p0;
            float f11 = this.D0;
            float f12 = (this.f45713d0.f45758k * f11) - g.f45686h1;
            wf.d dVar = (wf.d) bVar;
            float[] fArr = dVar.f46538b;
            if (fArr.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = fArr[1] * f11;
            }
            float f13 = (i10 + f12) / (f11 - f10);
            if (f13 < 0.0f) {
                this.f45730p0 = 0;
            } else if (f13 > 1.0f) {
                this.f45730p0 = dVar.f46537a.length - 1;
            } else {
                int b10 = dVar.b(f13, this.C, this.D);
                this.f45730p0 = b10;
                int i13 = this.D;
                if (b10 > i13) {
                    this.f45730p0 = i13;
                }
                int i14 = this.f45730p0;
                int i15 = this.C;
                if (i14 < i15) {
                    this.f45730p0 = i15;
                }
            }
            if (i12 != this.f45730p0) {
                this.f45733r0 = true;
                c(true);
                x(f12);
                e eVar = this.N0;
                if (eVar != null) {
                    getSelectedDate();
                    q91 q91Var = (q91) ((il0) eVar).f35137b;
                    q91Var.f();
                    q91Var.f37680b.f45731q0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.f45702y1) {
            int length = ((wf.d) this.f45715e0).f46537a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    xf.h hVar = (xf.h) arrayList.get(i11);
                    if (hVar.f46959n) {
                        j11 += hVar.f46949a.f46531a[i10];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f10 = (float) j10;
                if (f10 != this.f45723i0) {
                    this.f45723i0 = f10;
                    Animator animator = this.f45705a0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = g.e(this.f45720g0, this.f45723i0, new b1(this, 13));
                    this.f45705a0 = e;
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
        wf.b bVar = this.f45715e0;
        if (bVar == null) {
            return;
        }
        float f15 = this.C0;
        j jVar = this.f45713d0;
        float f16 = jVar.f45759l;
        float f17 = jVar.f45758k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.f45686h1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((wf.d) bVar).f46538b;
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
        int min = Math.min(((wf.d) this.f45715e0).f46538b.length - 1, this.D + i13 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((xf.f) arrayList.get(i14)).f46955j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.f45738v0;
        if (i15 == 2) {
            this.f45711c0 = true;
            this.f45735s0 = 0.0f;
            xf.j jVar2 = this.f45740w0;
            float f23 = jVar2.f46968f;
            f13 = 1.0f - f23;
            f12 = 2.0f;
            canvas2.scale((f23 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
        } else {
            f12 = 2.0f;
            if (i15 == 1) {
                xf.j jVar3 = this.f45740w0;
                float f24 = jVar3.f46968f;
                canvas2.scale(f24, 1.0f, jVar3.d, jVar3.e);
                f13 = f24;
            } else if (i15 == 3) {
                f13 = this.f45740w0.f46968f;
            } else {
                f13 = 1.0f;
            }
        }
        z4 = (this.f45730p0 < 0 || !this.f45733r0) ? false : false;
        while (true) {
            i10 = g.f45689k1;
            if (max > min) {
                break;
            }
            if (this.f45730p0 != max || !z4) {
                int i16 = 0;
                float f25 = 0.0f;
                while (i16 < arrayList.size()) {
                    xf.f fVar = (xf.f) arrayList.get(i16);
                    if (!fVar.f46959n && fVar.f46960o == 0.0f) {
                        i11 = min;
                        i12 = max;
                    } else {
                        long[] jArr = fVar.f46949a.f46531a;
                        float f26 = (((f18 - f11) * ((wf.d) this.f45715e0).f46538b[max]) + (f11 / f12)) - f20;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (((float) jArr[i12]) / this.v) * ((getMeasuredHeight() - this.f45734s) - i10) * fVar.f46960o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f45734s) - measuredHeight;
                        float[] fArr2 = fVar.f46956k;
                        int i17 = fVar.f46955j;
                        int i18 = i17 + 1;
                        fVar.f46955j = i18;
                        fArr2[i17] = f26;
                        int i19 = i17 + 2;
                        fVar.f46955j = i19;
                        fArr2[i18] = measuredHeight2 - f25;
                        int i20 = i17 + 3;
                        fVar.f46955j = i20;
                        fArr2[i19] = f26;
                        fVar.f46955j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.f45734s) - f25;
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
            if (!z4 && !this.f45711c0) {
                paint = hVar.f46951c;
            } else {
                paint = hVar.f46962q;
            }
            if (z4) {
                f14 = 255.0f;
                hVar.f46962q.setColor(i0.a.d(this.f45735s0, hVar.f46958m, hVar.f46963r));
            } else {
                f14 = 255.0f;
            }
            if (this.f45711c0) {
                hVar.f46962q.setColor(i0.a.d(1.0f, hVar.f46958m, hVar.f46963r));
            }
            paint.setAlpha((int) (f13 * f14));
            paint.setStrokeWidth(f10);
            canvas2.drawLines(hVar.f46956k, 0, hVar.f46955j, paint);
        }
        if (z4) {
            int i22 = 0;
            float f27 = 0.0f;
            while (i22 < arrayList.size()) {
                xf.f fVar2 = (xf.f) arrayList.get(i22);
                boolean z10 = fVar2.f46959n;
                Paint paint2 = fVar2.f46951c;
                if (z10 || fVar2.f46960o != 0.0f) {
                    long[] jArr2 = fVar2.f46949a.f46531a;
                    float[] fArr3 = ((wf.d) this.f45715e0).f46538b;
                    int i23 = this.f45730p0;
                    float f28 = (((f18 - f11) * fArr3[i23]) + (f11 / f12)) - f20;
                    float measuredHeight3 = (((float) jArr2[i23]) / this.v) * ((getMeasuredHeight() - this.f45734s) - i10) * fVar2.f46960o;
                    paint2.setStrokeWidth(f10);
                    paint2.setAlpha((int) (f13 * 255.0f));
                    canvas2.drawLine(f28, ((getMeasuredHeight() - this.f45734s) - measuredHeight3) - f27, f28, (getMeasuredHeight() - this.f45734s) - f27, paint2);
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
        wf.b bVar = this.f45715e0;
        if (bVar != null) {
            int length = ((wf.d) bVar).f46538b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((xf.f) arrayList.get(i12)).f46955j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.A1;
            if (jArr == null || jArr.length < size) {
                this.A1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f13 = ((wf.d) this.f45715e0).f46538b[i13] * this.f45745z0;
                int i14 = 0;
                while (true) {
                    f11 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    xf.f fVar = (xf.f) arrayList.get(i14);
                    if (fVar.f46959n || fVar.f46960o != 0.0f) {
                        long j10 = fVar.f46949a.f46531a[i13];
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
                        if (!fVar2.f46959n && fVar2.f46960o == f11) {
                            i11 = length;
                            i10 = i13;
                        } else {
                            if (g.f45702y1) {
                                f12 = this.f45720g0;
                            } else {
                                f12 = (float) ((wf.d) this.f45715e0).e;
                            }
                            long[] jArr3 = this.A1;
                            i10 = i13;
                            float f15 = (((float) jArr3[i15]) / f12) * fVar2.f46960o;
                            int i16 = this.f45744y0;
                            float f16 = f15 * i16;
                            float[] fArr = fVar2.f46956k;
                            int i17 = fVar2.f46955j;
                            int i18 = i17 + 1;
                            fVar2.f46955j = i18;
                            fArr[i17] = f13;
                            int i19 = i17 + 2;
                            fVar2.f46955j = i19;
                            i11 = length;
                            fArr[i18] = (i16 - f16) - f14;
                            int i20 = i17 + 3;
                            fVar2.f46955j = i20;
                            fArr[i19] = f13;
                            fVar2.f46955j = i17 + 4;
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
            wf.b bVar2 = this.f45715e0;
            if (((wf.d) bVar2).f46538b.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = ((wf.d) bVar2).f46538b[1] * this.f45745z0;
            }
            for (int i21 = 0; i21 < size; i21++) {
                xf.f fVar3 = (xf.f) arrayList.get(i21);
                Paint paint = fVar3.f46951c;
                Paint paint2 = fVar3.f46951c;
                paint.setStrokeWidth(max * f10);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f46956k, 0, fVar3.f46955j, paint2);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f45707b;
        this.f45724j0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f45725k0 = i10;
            int i11 = this.f45725k0;
            if (i11 < this.f45724j0) {
                l(canvas, (xf.d) arrayList.get(i11));
                p(canvas, (xf.d) arrayList.get(this.f45725k0));
                i10 = this.f45725k0 + 1;
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
        return ((wf.d) this.f45715e0).f46547m.rMaxQ(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f45720g0 = 0.0f;
        int length = ((wf.d) this.f45715e0).f46537a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                xf.h hVar = (xf.h) arrayList.get(i11);
                if (hVar.f46959n) {
                    j10 += hVar.f46949a.f46531a[i10];
                }
            }
            float f10 = (float) j10;
            if (f10 > this.f45720g0) {
                this.f45720g0 = f10;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((wf.a) ((wf.d) this.f45715e0).d.get(0)).f46531a.length;
        int size = ((wf.d) this.f45715e0).d.size();
        ((wf.d) this.f45715e0).f46546l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((wf.d) this.f45715e0).f46546l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((xf.h) this.d.get(i11)).f46959n) {
                    wf.b bVar = this.f45715e0;
                    long[] jArr = ((wf.d) bVar).f46546l;
                    jArr[i10] = jArr[i10] + ((wf.a) ((wf.d) bVar).d.get(i11)).f46531a[i10];
                }
            }
        }
        wf.b bVar2 = this.f45715e0;
        ((wf.d) bVar2).f46547m = new SegmentTree(((wf.d) bVar2).f46546l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
