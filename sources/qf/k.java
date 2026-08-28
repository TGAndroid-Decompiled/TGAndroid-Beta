package qf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import f2.f0;
import j3.r0;
import java.util.ArrayList;
public final class k extends g {
    @Override
    public final void K() {
        if (g.f46191x1) {
            ArrayList arrayList = this.d;
            int i9 = 0;
            if (((sf.f) arrayList.get(0)).f47557n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                sf.f fVar = (sf.f) obj;
                if (fVar.f47557n) {
                    long j11 = fVar.f47546a.f47156e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j10 = ((float) j10) * ((rf.c) this.f46202d0).f47169l[1];
            }
            if (j10 > 0) {
                float f10 = (float) j10;
                if (f10 != this.f46211h0) {
                    this.f46211h0 = f10;
                    Animator animator = this.W;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.f46208f0, this.f46211h0, new f0(this, 10));
                    this.W = e10;
                    e10.start();
                }
            }
        }
    }

    @Override
    public final sf.d f(int i9, long j10, long j11) {
        float f10;
        float[] fArr = ((rf.c) this.f46202d0).f47169l;
        if (fArr.length < 2) {
            f10 = 1.0f;
        } else {
            char c10 = 0;
            if (fArr[0] == 1.0f) {
                c10 = 1;
            }
            f10 = fArr[c10];
        }
        return new sf.d(j10, j11, this.L0, f10, i9, this.J, this.K);
    }

    @Override
    public final sf.f h(rf.a aVar) {
        return new sf.f(aVar, false, this.S0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        float f12;
        float f13;
        float f14;
        float f15;
        int i9;
        boolean z11;
        if (this.f46202d0 != null) {
            float f16 = this.B0;
            j jVar = this.f46200c0;
            float f17 = jVar.f46250l;
            float f18 = jVar.f46249k;
            float f19 = f16 / (f17 - f18);
            float f20 = g.f46175g1;
            float f21 = (f18 * f19) - f20;
            canvas.save();
            int i10 = this.f46226u0;
            int i11 = 2;
            if (i10 == 2) {
                sf.j jVar2 = this.f46227v0;
                float f22 = jVar2.f47567f;
                if (f22 > 0.5f) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f - (f22 * 2.0f);
                }
                canvas.scale((f22 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f47566e);
            } else if (i10 == 1) {
                float f23 = this.f46227v0.f47567f;
                if (f23 < 0.3f) {
                    f10 = 0.0f;
                } else {
                    f10 = f23;
                }
                canvas.save();
                sf.j jVar3 = this.f46227v0;
                float f24 = jVar3.f47567f;
                canvas.scale(f24, f24, jVar3.d, jVar3.f47566e);
            } else if (i10 == 3) {
                f10 = this.f46227v0.f47567f;
            } else {
                f10 = 1.0f;
            }
            int i12 = 0;
            int i13 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i13 < arrayList.size()) {
                    sf.f fVar = (sf.f) arrayList.get(i13);
                    boolean z12 = fVar.f47557n;
                    float[] fArr = fVar.f47554k;
                    Path path = fVar.f47550f;
                    Paint paint = fVar.f47548c;
                    if (!z12 && fVar.f47558o == 0.0f) {
                        f12 = f19;
                        f13 = f21;
                        f14 = f20;
                    } else {
                        long[] jArr = fVar.f47546a.f47153a;
                        path.reset();
                        float[] fArr2 = ((rf.c) this.f46202d0).f47161b;
                        if (fArr2.length < i11) {
                            f11 = 1.0f;
                        } else {
                            f11 = fArr2[1] * f19;
                        }
                        int i14 = ((int) (f20 / f11)) + 1;
                        int max = Math.max(i12, this.B - i14);
                        int min = Math.min(((rf.c) this.f46202d0).f47161b.length - 1, this.C + i14);
                        boolean z13 = true;
                        int i15 = 0;
                        while (true) {
                            z10 = g.f46190w1;
                            if (max > min) {
                                break;
                            }
                            float f25 = f19;
                            float f26 = f21;
                            long j10 = jArr[max];
                            if (j10 < 0) {
                                f15 = f20;
                                i9 = min;
                                z11 = z13;
                            } else {
                                f15 = f20;
                                rf.c cVar = (rf.c) this.f46202d0;
                                i9 = min;
                                float f27 = (cVar.f47161b[max] * f25) - f26;
                                float f28 = ((float) j10) * cVar.f47169l[i13];
                                float f29 = this.f46228w;
                                float strokeWidth = paint.getStrokeWidth() / 2.0f;
                                z11 = z13;
                                float C = r0.C((getMeasuredHeight() - this.f46223s) - g.f46178j1, strokeWidth, (f28 - f29) / (this.v - f29), (getMeasuredHeight() - this.f46223s) - strokeWidth);
                                if (z10) {
                                    if (i15 == 0) {
                                        int i16 = i15 + 1;
                                        fArr[i15] = f27;
                                        i15 += 2;
                                        fArr[i16] = C;
                                    } else {
                                        fArr[i15] = f27;
                                        fArr[i15 + 1] = C;
                                        int i17 = i15 + 3;
                                        fArr[i15 + 2] = f27;
                                        i15 += 4;
                                        fArr[i17] = C;
                                    }
                                } else if (z11) {
                                    path.moveTo(f27, C);
                                    z13 = false;
                                    max++;
                                    f19 = f25;
                                    f21 = f26;
                                    f20 = f15;
                                    min = i9;
                                } else {
                                    path.lineTo(f27, C);
                                }
                            }
                            z13 = z11;
                            max++;
                            f19 = f25;
                            f21 = f26;
                            f20 = f15;
                            min = i9;
                        }
                        f12 = f19;
                        f13 = f21;
                        f14 = f20;
                        if (this.C - this.B > 100) {
                            paint.setStrokeCap(Paint.Cap.SQUARE);
                        } else {
                            paint.setStrokeCap(Paint.Cap.ROUND);
                        }
                        paint.setAlpha((int) (fVar.f47558o * 255.0f * f10));
                        if (!z10) {
                            canvas.drawPath(path, paint);
                        } else {
                            canvas.drawLines(fArr, 0, i15, paint);
                        }
                    }
                    i13++;
                    f19 = f12;
                    f21 = f13;
                    f20 = f14;
                    i12 = 0;
                    i11 = 2;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z10;
        int i9;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2;
        int i13;
        float f10;
        int measuredHeight = getMeasuredHeight();
        int i14 = g.f46180m1;
        int i15 = measuredHeight - i14;
        int measuredHeight2 = (getMeasuredHeight() - this.f46231x0) - i14;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f46202d0 != null) {
            int i16 = 0;
            while (i16 < size) {
                sf.f fVar = (sf.f) arrayList3.get(i16);
                boolean z11 = fVar.f47557n;
                Paint paint = fVar.f47547b;
                float[] fArr = fVar.f47555l;
                Path path = fVar.f47549e;
                if (!z11 && fVar.f47558o == 0.0f) {
                    i9 = i15;
                    arrayList = arrayList3;
                    i10 = measuredHeight2;
                    i11 = i16;
                } else {
                    path.reset();
                    int length = ((rf.c) this.f46202d0).f47161b.length;
                    long[] jArr = fVar.f47546a.f47153a;
                    fVar.f47550f.reset();
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        z10 = g.f46190w1;
                        if (i18 >= length) {
                            break;
                        }
                        int i19 = i16;
                        long j10 = jArr[i18];
                        if (j10 < 0) {
                            i12 = i15;
                            arrayList2 = arrayList3;
                            i13 = measuredHeight2;
                        } else {
                            i12 = i15;
                            rf.b bVar = this.f46202d0;
                            float f11 = this.f46233y0 * ((rf.c) bVar).f47161b[i18];
                            if (g.f46191x1) {
                                arrayList2 = arrayList3;
                                f10 = this.f46208f0;
                                i13 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i13 = measuredHeight2;
                                f10 = (float) ((rf.c) bVar).f47163e;
                            }
                            float f12 = (1.0f - ((((float) j10) * ((rf.c) bVar).f47169l[i19]) / f10)) * (i12 - i13);
                            if (z10) {
                                if (i17 == 0) {
                                    int i20 = i17 + 1;
                                    fArr[i17] = f11;
                                    i17 += 2;
                                    fArr[i20] = f12;
                                } else {
                                    fArr[i17] = f11;
                                    fArr[i17 + 1] = f12;
                                    int i21 = i17 + 3;
                                    fArr[i17 + 2] = f11;
                                    i17 += 4;
                                    fArr[i21] = f12;
                                }
                            } else if (i18 == 0) {
                                path.moveTo(f11, f12);
                            } else {
                                path.lineTo(f11, f12);
                            }
                        }
                        i18++;
                        i16 = i19;
                        i15 = i12;
                        arrayList3 = arrayList2;
                        measuredHeight2 = i13;
                    }
                    i9 = i15;
                    arrayList = arrayList3;
                    i10 = measuredHeight2;
                    i11 = i16;
                    fVar.f47553j = i17;
                    if (fVar.f47557n || fVar.f47558o != 0.0f) {
                        paint.setAlpha((int) (fVar.f47558o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f47553j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i16 = i11 + 1;
                        i15 = i9;
                        arrayList3 = arrayList;
                        measuredHeight2 = i10;
                    }
                }
                i16 = i11 + 1;
                i15 = i9;
                arrayList3 = arrayList;
                measuredHeight2 = i10;
            }
        }
    }

    @Override
    public final void o(Canvas canvas) {
        int i9 = this.f46218o0;
        if (i9 >= 0 && this.f46220q0) {
            float f10 = this.B0;
            j jVar = this.f46200c0;
            float f11 = jVar.f46250l;
            float f12 = jVar.f46249k;
            float f13 = f10 / (f11 - f12);
            float f14 = (((rf.c) this.f46202d0).f47161b[i9] * f13) - ((f12 * f13) - g.f46175g1);
            Paint paint = this.I;
            paint.setAlpha((int) (this.f46221r * this.f46222r0));
            canvas.drawLine(f14, 0.0f, f14, this.D0.bottom, paint);
            ArrayList arrayList = this.d;
            this.f46212i0 = arrayList.size();
            int i10 = 0;
            while (true) {
                this.f46213j0 = i10;
                int i11 = this.f46213j0;
                if (i11 < this.f46212i0) {
                    sf.f fVar = (sf.f) arrayList.get(i11);
                    boolean z10 = fVar.f47557n;
                    Paint paint2 = fVar.d;
                    if (z10 || fVar.f47558o != 0.0f) {
                        float f15 = ((float) fVar.f47546a.f47153a[this.f46218o0]) * ((rf.c) this.f46202d0).f47169l[this.f46213j0];
                        float f16 = this.f46228w;
                        float measuredHeight = (getMeasuredHeight() - this.f46223s) - (((f15 - f16) / (this.v - f16)) * ((getMeasuredHeight() - this.f46223s) - g.f46178j1));
                        paint2.setAlpha((int) (fVar.f47558o * 255.0f * this.f46222r0));
                        Paint paint3 = this.O;
                        paint3.setAlpha((int) (fVar.f47558o * 255.0f * this.f46222r0));
                        canvas.drawPoint(f14, measuredHeight, paint2);
                        canvas.drawPoint(f14, measuredHeight, paint3);
                    }
                    i10 = this.f46213j0 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void p(android.graphics.Canvas r22, sf.d r23) {
        throw new UnsupportedOperationException("Method not decompiled: qf.k.p(android.graphics.Canvas, sf.d):void");
    }

    @Override
    public final long r(int i9, int i10) {
        long j10;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (((sf.f) arrayList.get(i11)).f47557n) {
                j10 = ((float) ((rf.a) ((rf.c) this.f46202d0).d.get(i11)).f47154b.rMaxQ(i9, i10)) * ((rf.c) this.f46202d0).f47169l[i11];
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
    public final long s(int i9, int i10) {
        long j10;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j11 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            if (((sf.f) arrayList.get(i11)).f47557n) {
                j10 = (int) (((float) ((rf.a) ((rf.c) this.f46202d0).d.get(i11)).f47154b.rMinQ(i9, i10)) * ((rf.c) this.f46202d0).f47169l[i11]);
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
        this.L0 = true;
        super.t();
    }
}
