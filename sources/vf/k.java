package vf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import eg.b1;
import java.util.ArrayList;
import org.telegram.ui.ai;
public final class k extends g {
    @Override
    public final void K() {
        if (g.f45780y1) {
            ArrayList arrayList = this.d;
            int i10 = 0;
            if (((xf.f) arrayList.get(0)).f47055n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                xf.f fVar = (xf.f) obj;
                if (fVar.f47055n) {
                    long j11 = fVar.f47045a.e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j10 = ((float) j10) * ((wf.c) this.f45793e0).f46614l[1];
            }
            if (j10 > 0) {
                float f10 = (float) j10;
                if (f10 != this.f45801i0) {
                    this.f45801i0 = f10;
                    Animator animator = this.f45783a0;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e = g.e(this.f45798g0, this.f45801i0, new b1(this, 12));
                    this.f45783a0 = e;
                    e.start();
                }
            }
        }
    }

    @Override
    public final xf.d f(int i10, long j10, long j11) {
        float f10;
        float[] fArr = ((wf.c) this.f45793e0).f46614l;
        if (fArr.length < 2) {
            f10 = 1.0f;
        } else {
            char c3 = 0;
            if (fArr[0] == 1.0f) {
                c3 = 1;
            }
            f10 = fArr[c3];
        }
        return new xf.d(j10, j11, this.M0, f10, i10, this.K, this.L);
    }

    @Override
    public final xf.f h(wf.a aVar) {
        return new xf.f(aVar, false, this.T0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        boolean z4;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10;
        boolean z10;
        if (this.f45793e0 != null) {
            float f16 = this.C0;
            j jVar = this.f45791d0;
            float f17 = jVar.f45837l;
            float f18 = jVar.f45836k;
            float f19 = f16 / (f17 - f18);
            float f20 = g.f45764h1;
            float f21 = (f18 * f19) - f20;
            canvas.save();
            int i11 = this.f45816v0;
            int i12 = 2;
            if (i11 == 2) {
                xf.j jVar2 = this.f45818w0;
                float f22 = jVar2.f47064f;
                if (f22 > 0.5f) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f - (f22 * 2.0f);
                }
                canvas.scale((f22 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.e);
            } else if (i11 == 1) {
                float f23 = this.f45818w0.f47064f;
                if (f23 < 0.3f) {
                    f10 = 0.0f;
                } else {
                    f10 = f23;
                }
                canvas.save();
                xf.j jVar3 = this.f45818w0;
                float f24 = jVar3.f47064f;
                canvas.scale(f24, f24, jVar3.d, jVar3.e);
            } else if (i11 == 3) {
                f10 = this.f45818w0.f47064f;
            } else {
                f10 = 1.0f;
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i14 < arrayList.size()) {
                    xf.f fVar = (xf.f) arrayList.get(i14);
                    boolean z11 = fVar.f47055n;
                    float[] fArr = fVar.f47052k;
                    Path path = fVar.f47048f;
                    Paint paint = fVar.f47047c;
                    if (!z11 && fVar.f47056o == 0.0f) {
                        f12 = f19;
                        f13 = f21;
                        f14 = f20;
                    } else {
                        long[] jArr = fVar.f47045a.f46600a;
                        path.reset();
                        float[] fArr2 = ((wf.c) this.f45793e0).f46607b;
                        if (fArr2.length < i12) {
                            f11 = 1.0f;
                        } else {
                            f11 = fArr2[1] * f19;
                        }
                        int i15 = ((int) (f20 / f11)) + 1;
                        int max = Math.max(i13, this.C - i15);
                        int min = Math.min(((wf.c) this.f45793e0).f46607b.length - 1, this.D + i15);
                        boolean z12 = true;
                        int i16 = 0;
                        while (true) {
                            z4 = g.f45779x1;
                            if (max > min) {
                                break;
                            }
                            float f25 = f19;
                            float f26 = f21;
                            long j10 = jArr[max];
                            if (j10 < 0) {
                                f15 = f20;
                                i10 = min;
                                z10 = z12;
                            } else {
                                f15 = f20;
                                wf.c cVar = (wf.c) this.f45793e0;
                                i10 = min;
                                float f27 = (cVar.f46607b[max] * f25) - f26;
                                float f28 = ((float) j10) * cVar.f46614l[i14];
                                float f29 = this.f45817w;
                                float strokeWidth = paint.getStrokeWidth() / 2.0f;
                                z10 = z12;
                                float c3 = ai.c((getMeasuredHeight() - this.f45812s) - g.f45767k1, strokeWidth, (f28 - f29) / (this.v - f29), (getMeasuredHeight() - this.f45812s) - strokeWidth);
                                if (z4) {
                                    if (i16 == 0) {
                                        int i17 = i16 + 1;
                                        fArr[i16] = f27;
                                        i16 += 2;
                                        fArr[i17] = c3;
                                    } else {
                                        fArr[i16] = f27;
                                        fArr[i16 + 1] = c3;
                                        int i18 = i16 + 3;
                                        fArr[i16 + 2] = f27;
                                        i16 += 4;
                                        fArr[i18] = c3;
                                    }
                                } else if (z10) {
                                    path.moveTo(f27, c3);
                                    z12 = false;
                                    max++;
                                    f19 = f25;
                                    f21 = f26;
                                    f20 = f15;
                                    min = i10;
                                } else {
                                    path.lineTo(f27, c3);
                                }
                            }
                            z12 = z10;
                            max++;
                            f19 = f25;
                            f21 = f26;
                            f20 = f15;
                            min = i10;
                        }
                        f12 = f19;
                        f13 = f21;
                        f14 = f20;
                        if (this.D - this.C > 100) {
                            paint.setStrokeCap(Paint.Cap.SQUARE);
                        } else {
                            paint.setStrokeCap(Paint.Cap.ROUND);
                        }
                        paint.setAlpha((int) (fVar.f47056o * 255.0f * f10));
                        if (!z4) {
                            canvas.drawPath(path, paint);
                        } else {
                            canvas.drawLines(fArr, 0, i16, paint);
                        }
                    }
                    i14++;
                    f19 = f12;
                    f21 = f13;
                    f20 = f14;
                    i13 = 0;
                    i12 = 2;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z4;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList2;
        int i14;
        float f10;
        int measuredHeight = getMeasuredHeight();
        int i15 = g.f45769n1;
        int i16 = measuredHeight - i15;
        int measuredHeight2 = (getMeasuredHeight() - this.f45822y0) - i15;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f45793e0 != null) {
            int i17 = 0;
            while (i17 < size) {
                xf.f fVar = (xf.f) arrayList3.get(i17);
                boolean z10 = fVar.f47055n;
                Paint paint = fVar.f47046b;
                float[] fArr = fVar.f47053l;
                Path path = fVar.e;
                if (!z10 && fVar.f47056o == 0.0f) {
                    i10 = i16;
                    arrayList = arrayList3;
                    i11 = measuredHeight2;
                    i12 = i17;
                } else {
                    path.reset();
                    int length = ((wf.c) this.f45793e0).f46607b.length;
                    long[] jArr = fVar.f47045a.f46600a;
                    fVar.f47048f.reset();
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        z4 = g.f45779x1;
                        if (i19 >= length) {
                            break;
                        }
                        int i20 = i17;
                        long j10 = jArr[i19];
                        if (j10 < 0) {
                            i13 = i16;
                            arrayList2 = arrayList3;
                            i14 = measuredHeight2;
                        } else {
                            i13 = i16;
                            wf.b bVar = this.f45793e0;
                            float f11 = this.f45823z0 * ((wf.c) bVar).f46607b[i19];
                            if (g.f45780y1) {
                                arrayList2 = arrayList3;
                                f10 = this.f45798g0;
                                i14 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i14 = measuredHeight2;
                                f10 = (float) ((wf.c) bVar).e;
                            }
                            float f12 = (1.0f - ((((float) j10) * ((wf.c) bVar).f46614l[i20]) / f10)) * (i13 - i14);
                            if (z4) {
                                if (i18 == 0) {
                                    int i21 = i18 + 1;
                                    fArr[i18] = f11;
                                    i18 += 2;
                                    fArr[i21] = f12;
                                } else {
                                    fArr[i18] = f11;
                                    fArr[i18 + 1] = f12;
                                    int i22 = i18 + 3;
                                    fArr[i18 + 2] = f11;
                                    i18 += 4;
                                    fArr[i22] = f12;
                                }
                            } else if (i19 == 0) {
                                path.moveTo(f11, f12);
                            } else {
                                path.lineTo(f11, f12);
                            }
                        }
                        i19++;
                        i17 = i20;
                        i16 = i13;
                        arrayList3 = arrayList2;
                        measuredHeight2 = i14;
                    }
                    i10 = i16;
                    arrayList = arrayList3;
                    i11 = measuredHeight2;
                    i12 = i17;
                    fVar.f47051j = i18;
                    if (fVar.f47055n || fVar.f47056o != 0.0f) {
                        paint.setAlpha((int) (fVar.f47056o * 255.0f));
                        if (z4) {
                            canvas.drawLines(fArr, 0, fVar.f47051j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i17 = i12 + 1;
                        i16 = i10;
                        arrayList3 = arrayList;
                        measuredHeight2 = i11;
                    }
                }
                i17 = i12 + 1;
                i16 = i10;
                arrayList3 = arrayList;
                measuredHeight2 = i11;
            }
        }
    }

    @Override
    public final void o(Canvas canvas) {
        int i10 = this.f45808p0;
        if (i10 >= 0 && this.f45811r0) {
            float f10 = this.C0;
            j jVar = this.f45791d0;
            float f11 = jVar.f45837l;
            float f12 = jVar.f45836k;
            float f13 = f10 / (f11 - f12);
            float f14 = (((wf.c) this.f45793e0).f46607b[i10] * f13) - ((f12 * f13) - g.f45764h1);
            Paint paint = this.J;
            paint.setAlpha((int) (this.f45810r * this.f45813s0));
            canvas.drawLine(f14, 0.0f, f14, this.E0.bottom, paint);
            ArrayList arrayList = this.d;
            this.f45802j0 = arrayList.size();
            int i11 = 0;
            while (true) {
                this.f45803k0 = i11;
                int i12 = this.f45803k0;
                if (i12 < this.f45802j0) {
                    xf.f fVar = (xf.f) arrayList.get(i12);
                    boolean z4 = fVar.f47055n;
                    Paint paint2 = fVar.d;
                    if (z4 || fVar.f47056o != 0.0f) {
                        float f15 = ((float) fVar.f47045a.f46600a[this.f45808p0]) * ((wf.c) this.f45793e0).f46614l[this.f45803k0];
                        float f16 = this.f45817w;
                        float measuredHeight = (getMeasuredHeight() - this.f45812s) - (((f15 - f16) / (this.v - f16)) * ((getMeasuredHeight() - this.f45812s) - g.f45767k1));
                        paint2.setAlpha((int) (fVar.f47056o * 255.0f * this.f45813s0));
                        Paint paint3 = this.P;
                        paint3.setAlpha((int) (fVar.f47056o * 255.0f * this.f45813s0));
                        canvas.drawPoint(f14, measuredHeight, paint2);
                        canvas.drawPoint(f14, measuredHeight, paint3);
                    }
                    i11 = this.f45803k0 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void p(android.graphics.Canvas r22, xf.d r23) {
        throw new UnsupportedOperationException("Method not decompiled: vf.k.p(android.graphics.Canvas, xf.d):void");
    }

    @Override
    public final long r(int i10, int i11) {
        long j10;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((xf.f) arrayList.get(i12)).f47055n) {
                j10 = ((float) ((wf.a) ((wf.c) this.f45793e0).d.get(i12)).f46601b.rMaxQ(i10, i11)) * ((wf.c) this.f45793e0).f46614l[i12];
            } else {
                j10 = 0;
            }
            if (j10 > j11) {
                j11 = j10;
            }
        }
        return j11;
    }

    @Override
    public final long s(int i10, int i11) {
        long j10;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j11 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            if (((xf.f) arrayList.get(i12)).f47055n) {
                j10 = (int) (((float) ((wf.a) ((wf.c) this.f45793e0).d.get(i12)).f46601b.rMinQ(i10, i11)) * ((wf.c) this.f45793e0).f46614l[i12]);
            } else {
                j10 = 2147483647L;
            }
            if (j10 < j11) {
                j11 = j10;
            }
        }
        return j11;
    }

    @Override
    public final void t() {
        this.M0 = true;
        super.t();
    }
}
