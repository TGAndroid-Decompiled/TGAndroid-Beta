package tf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import cg.c1;
import java.util.ArrayList;
import org.telegram.ui.th;
public final class k extends g {
    @Override
    public final void K() {
        if (g.f48250x1) {
            ArrayList arrayList = this.d;
            int i10 = 0;
            if (((vf.f) arrayList.get(0)).f49583n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                vf.f fVar = (vf.f) obj;
                if (fVar.f49583n) {
                    long j11 = fVar.f49572a.f49193e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j10 = ((float) j10) * ((uf.c) this.f48261d0).f49206l[1];
            }
            if (j10 > 0) {
                float f9 = (float) j10;
                if (f9 != this.f48270h0) {
                    this.f48270h0 = f9;
                    Animator animator = this.W;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.f48267f0, this.f48270h0, new c1(this, 12));
                    this.W = e10;
                    e10.start();
                }
            }
        }
    }

    @Override
    public final vf.d f(int i10, long j10, long j11) {
        float f9;
        float[] fArr = ((uf.c) this.f48261d0).f49206l;
        if (fArr.length < 2) {
            f9 = 1.0f;
        } else {
            char c3 = 0;
            if (fArr[0] == 1.0f) {
                c3 = 1;
            }
            f9 = fArr[c3];
        }
        return new vf.d(j10, j11, this.L0, f9, i10, this.J, this.K);
    }

    @Override
    public final vf.f h(uf.a aVar) {
        return new vf.f(aVar, false, this.S0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f9;
        float f10;
        boolean z10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10;
        boolean z11;
        if (this.f48261d0 != null) {
            float f15 = this.B0;
            j jVar = this.f48259c0;
            float f16 = jVar.f48309l;
            float f17 = jVar.f48308k;
            float f18 = f15 / (f16 - f17);
            float f19 = g.f48234g1;
            float f20 = (f17 * f18) - f19;
            canvas.save();
            int i11 = this.f48285u0;
            int i12 = 2;
            if (i11 == 2) {
                vf.j jVar2 = this.f48286v0;
                float f21 = jVar2.f49593f;
                if (f21 > 0.5f) {
                    f9 = 0.0f;
                } else {
                    f9 = 1.0f - (f21 * 2.0f);
                }
                canvas.scale((f21 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f49592e);
            } else if (i11 == 1) {
                float f22 = this.f48286v0.f49593f;
                if (f22 < 0.3f) {
                    f9 = 0.0f;
                } else {
                    f9 = f22;
                }
                canvas.save();
                vf.j jVar3 = this.f48286v0;
                float f23 = jVar3.f49593f;
                canvas.scale(f23, f23, jVar3.d, jVar3.f49592e);
            } else if (i11 == 3) {
                f9 = this.f48286v0.f49593f;
            } else {
                f9 = 1.0f;
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i14 < arrayList.size()) {
                    vf.f fVar = (vf.f) arrayList.get(i14);
                    boolean z12 = fVar.f49583n;
                    float[] fArr = fVar.f49580k;
                    Path path = fVar.f49576f;
                    Paint paint = fVar.f49574c;
                    if (!z12 && fVar.f49584o == 0.0f) {
                        f11 = f18;
                        f12 = f20;
                        f13 = f19;
                    } else {
                        long[] jArr = fVar.f49572a.f49190a;
                        path.reset();
                        float[] fArr2 = ((uf.c) this.f48261d0).f49198b;
                        if (fArr2.length < i12) {
                            f10 = 1.0f;
                        } else {
                            f10 = fArr2[1] * f18;
                        }
                        int i15 = ((int) (f19 / f10)) + 1;
                        int max = Math.max(i13, this.B - i15);
                        int min = Math.min(((uf.c) this.f48261d0).f49198b.length - 1, this.C + i15);
                        boolean z13 = true;
                        int i16 = 0;
                        while (true) {
                            z10 = g.f48249w1;
                            if (max > min) {
                                break;
                            }
                            float f24 = f18;
                            float f25 = f20;
                            long j10 = jArr[max];
                            if (j10 < 0) {
                                f14 = f19;
                                i10 = min;
                                z11 = z13;
                            } else {
                                f14 = f19;
                                uf.c cVar = (uf.c) this.f48261d0;
                                i10 = min;
                                float f26 = (cVar.f49198b[max] * f24) - f25;
                                float f27 = ((float) j10) * cVar.f49206l[i14];
                                float f28 = this.f48287w;
                                float strokeWidth = paint.getStrokeWidth() / 2.0f;
                                z11 = z13;
                                float b10 = th.b((getMeasuredHeight() - this.f48282s) - g.f48237j1, strokeWidth, (f27 - f28) / (this.v - f28), (getMeasuredHeight() - this.f48282s) - strokeWidth);
                                if (z10) {
                                    if (i16 == 0) {
                                        int i17 = i16 + 1;
                                        fArr[i16] = f26;
                                        i16 += 2;
                                        fArr[i17] = b10;
                                    } else {
                                        fArr[i16] = f26;
                                        fArr[i16 + 1] = b10;
                                        int i18 = i16 + 3;
                                        fArr[i16 + 2] = f26;
                                        i16 += 4;
                                        fArr[i18] = b10;
                                    }
                                } else if (z11) {
                                    path.moveTo(f26, b10);
                                    z13 = false;
                                    max++;
                                    f18 = f24;
                                    f20 = f25;
                                    f19 = f14;
                                    min = i10;
                                } else {
                                    path.lineTo(f26, b10);
                                }
                            }
                            z13 = z11;
                            max++;
                            f18 = f24;
                            f20 = f25;
                            f19 = f14;
                            min = i10;
                        }
                        f11 = f18;
                        f12 = f20;
                        f13 = f19;
                        if (this.C - this.B > 100) {
                            paint.setStrokeCap(Paint.Cap.SQUARE);
                        } else {
                            paint.setStrokeCap(Paint.Cap.ROUND);
                        }
                        paint.setAlpha((int) (fVar.f49584o * 255.0f * f9));
                        if (!z10) {
                            canvas.drawPath(path, paint);
                        } else {
                            canvas.drawLines(fArr, 0, i16, paint);
                        }
                    }
                    i14++;
                    f18 = f11;
                    f20 = f12;
                    f19 = f13;
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
        boolean z10;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList2;
        int i14;
        float f9;
        int measuredHeight = getMeasuredHeight();
        int i15 = g.f48239m1;
        int i16 = measuredHeight - i15;
        int measuredHeight2 = (getMeasuredHeight() - this.f48290x0) - i15;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f48261d0 != null) {
            int i17 = 0;
            while (i17 < size) {
                vf.f fVar = (vf.f) arrayList3.get(i17);
                boolean z11 = fVar.f49583n;
                Paint paint = fVar.f49573b;
                float[] fArr = fVar.f49581l;
                Path path = fVar.f49575e;
                if (!z11 && fVar.f49584o == 0.0f) {
                    i10 = i16;
                    arrayList = arrayList3;
                    i11 = measuredHeight2;
                    i12 = i17;
                } else {
                    path.reset();
                    int length = ((uf.c) this.f48261d0).f49198b.length;
                    long[] jArr = fVar.f49572a.f49190a;
                    fVar.f49576f.reset();
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        z10 = g.f48249w1;
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
                            uf.b bVar = this.f48261d0;
                            float f10 = this.f48292y0 * ((uf.c) bVar).f49198b[i19];
                            if (g.f48250x1) {
                                arrayList2 = arrayList3;
                                f9 = this.f48267f0;
                                i14 = measuredHeight2;
                            } else {
                                arrayList2 = arrayList3;
                                i14 = measuredHeight2;
                                f9 = (float) ((uf.c) bVar).f49200e;
                            }
                            float f11 = (1.0f - ((((float) j10) * ((uf.c) bVar).f49206l[i20]) / f9)) * (i13 - i14);
                            if (z10) {
                                if (i18 == 0) {
                                    int i21 = i18 + 1;
                                    fArr[i18] = f10;
                                    i18 += 2;
                                    fArr[i21] = f11;
                                } else {
                                    fArr[i18] = f10;
                                    fArr[i18 + 1] = f11;
                                    int i22 = i18 + 3;
                                    fArr[i18 + 2] = f10;
                                    i18 += 4;
                                    fArr[i22] = f11;
                                }
                            } else if (i19 == 0) {
                                path.moveTo(f10, f11);
                            } else {
                                path.lineTo(f10, f11);
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
                    fVar.f49579j = i18;
                    if (fVar.f49583n || fVar.f49584o != 0.0f) {
                        paint.setAlpha((int) (fVar.f49584o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f49579j, paint);
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
        int i10 = this.f48277o0;
        if (i10 >= 0 && this.f48279q0) {
            float f9 = this.B0;
            j jVar = this.f48259c0;
            float f10 = jVar.f48309l;
            float f11 = jVar.f48308k;
            float f12 = f9 / (f10 - f11);
            float f13 = (((uf.c) this.f48261d0).f49198b[i10] * f12) - ((f11 * f12) - g.f48234g1);
            Paint paint = this.I;
            paint.setAlpha((int) (this.f48280r * this.f48281r0));
            canvas.drawLine(f13, 0.0f, f13, this.D0.bottom, paint);
            ArrayList arrayList = this.d;
            this.f48271i0 = arrayList.size();
            int i11 = 0;
            while (true) {
                this.f48272j0 = i11;
                int i12 = this.f48272j0;
                if (i12 < this.f48271i0) {
                    vf.f fVar = (vf.f) arrayList.get(i12);
                    boolean z10 = fVar.f49583n;
                    Paint paint2 = fVar.d;
                    if (z10 || fVar.f49584o != 0.0f) {
                        float f14 = ((float) fVar.f49572a.f49190a[this.f48277o0]) * ((uf.c) this.f48261d0).f49206l[this.f48272j0];
                        float f15 = this.f48287w;
                        float measuredHeight = (getMeasuredHeight() - this.f48282s) - (((f14 - f15) / (this.v - f15)) * ((getMeasuredHeight() - this.f48282s) - g.f48237j1));
                        paint2.setAlpha((int) (fVar.f49584o * 255.0f * this.f48281r0));
                        Paint paint3 = this.O;
                        paint3.setAlpha((int) (fVar.f49584o * 255.0f * this.f48281r0));
                        canvas.drawPoint(f13, measuredHeight, paint2);
                        canvas.drawPoint(f13, measuredHeight, paint3);
                    }
                    i11 = this.f48272j0 + 1;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void p(android.graphics.Canvas r22, vf.d r23) {
        throw new UnsupportedOperationException("Method not decompiled: tf.k.p(android.graphics.Canvas, vf.d):void");
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
            if (((vf.f) arrayList.get(i12)).f49583n) {
                j10 = ((float) ((uf.a) ((uf.c) this.f48261d0).d.get(i12)).f49191b.rMaxQ(i10, i11)) * ((uf.c) this.f48261d0).f49206l[i12];
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
            if (((vf.f) arrayList.get(i12)).f49583n) {
                j10 = (int) (((float) ((uf.a) ((uf.c) this.f48261d0).d.get(i12)).f49191b.rMinQ(i10, i11)) * ((uf.c) this.f48261d0).f49206l[i12]);
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
