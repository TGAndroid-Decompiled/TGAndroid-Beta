package rf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.ui.Cells.pa;

public final class l extends g {
    @Override
    public final tf.f h(sf.a aVar) {
        return new tf.f(aVar, true, null);
    }

    @Override
    public final void k(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        int i11;
        if (this.f46961d0 == null) {
            return;
        }
        float f15 = this.B0;
        j jVar = this.f46959c0;
        float f16 = jVar.f47009l;
        float f17 = jVar.f47008k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.f46934g1;
        float f20 = (f17 * f18) - f19;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i13 >= arrayList.size()) {
                return;
            }
            tf.f fVar = (tf.f) arrayList.get(i13);
            boolean z11 = fVar.f48206n;
            float[] fArr = fVar.f48203k;
            Path path = fVar.f48199f;
            Paint paint = fVar.f48197c;
            if (z11 || fVar.f48207o != 0.0f) {
                float[] fArr2 = this.f46961d0.f47882b;
                float f21 = fArr2.length < 2 ? 0.0f : fArr2[1] * f18;
                long[] jArr = fVar.f48195a.f47874a;
                int i14 = ((int) (f19 / f21)) + 1;
                path.reset();
                int iMax = Math.max(i12, this.B - i14);
                int iMin = Math.min(this.f46961d0.f47882b.length - 1, this.C + i14);
                boolean z12 = true;
                int i15 = 0;
                while (true) {
                    z10 = g.f46949w1;
                    if (iMax > iMin) {
                        break;
                    }
                    float f22 = f18;
                    float f23 = f20;
                    long j10 = jArr[iMax];
                    if (j10 < 0) {
                        f14 = f19;
                        i11 = i13;
                    } else {
                        f14 = f19;
                        float f24 = (this.f46961d0.f47882b[iMax] * f22) - f23;
                        float f25 = this.f46987w;
                        float f26 = (j10 - f25) / (this.v - f25);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        i11 = i13;
                        float fB = pa.b((getMeasuredHeight() - this.f46982s) - g.f46937j1, strokeWidth, f26, (getMeasuredHeight() - this.f46982s) - strokeWidth);
                        if (!z10) {
                            if (z12) {
                                path.moveTo(f24 - (f21 / 2.0f), fB);
                                z12 = false;
                            } else {
                                path.lineTo(f24 - (f21 / 2.0f), fB);
                            }
                            path.lineTo((f21 / 2.0f) + f24, fB);
                        } else if (i15 == 0) {
                            float f27 = f21 / 2.0f;
                            fArr[i15] = f24 - f27;
                            fArr[i15 + 1] = fB;
                            float f28 = f24 + f27;
                            fArr[i15 + 2] = f28;
                            fArr[i15 + 3] = fB;
                            int i16 = i15 + 5;
                            fArr[i15 + 4] = f28;
                            i15 += 6;
                            fArr[i16] = fB;
                        } else if (iMax == iMin) {
                            float f29 = f21 / 2.0f;
                            float f30 = f24 - f29;
                            fArr[i15] = f30;
                            fArr[i15 + 1] = fB;
                            fArr[i15 + 2] = f30;
                            fArr[i15 + 3] = fB;
                            float f31 = f24 + f29;
                            fArr[i15 + 4] = f31;
                            fArr[i15 + 5] = fB;
                            fArr[i15 + 6] = f31;
                            fArr[i15 + 7] = fB;
                            int i17 = i15 + 9;
                            fArr[i15 + 8] = f31;
                            i15 += 10;
                            fArr[i17] = (getMeasuredHeight() - this.f46982s) - strokeWidth;
                        } else {
                            float f32 = f21 / 2.0f;
                            float f33 = f24 - f32;
                            fArr[i15] = f33;
                            fArr[i15 + 1] = fB;
                            fArr[i15 + 2] = f33;
                            fArr[i15 + 3] = fB;
                            float f34 = f24 + f32;
                            fArr[i15 + 4] = f34;
                            fArr[i15 + 5] = fB;
                            int i18 = i15 + 7;
                            fArr[i15 + 6] = f34;
                            i15 += 8;
                            fArr[i18] = fB;
                        }
                    }
                    iMax++;
                    f18 = f22;
                    f20 = f23;
                    f19 = f14;
                    i13 = i11;
                }
                f10 = f18;
                f11 = f20;
                f12 = f19;
                i10 = i13;
                canvas.save();
                int i19 = this.f46985u0;
                float f35 = 1.0f;
                if (i19 == 2) {
                    tf.j jVar2 = this.f46986v0;
                    float f36 = jVar2.f48216f;
                    f13 = f36 > 0.5f ? 0.0f : 1.0f - (f36 * 2.0f);
                    canvas.scale((f36 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f48215e);
                } else {
                    if (i19 == 1) {
                        float f37 = this.f46986v0.f48216f;
                        f13 = f37 < 0.3f ? 0.0f : f37;
                        canvas.save();
                        tf.j jVar3 = this.f46986v0;
                        float f38 = jVar3.f48216f;
                        canvas.scale(f38, f38, jVar3.d, jVar3.f48215e);
                    } else if (i19 == 3) {
                        f35 = this.f46986v0.f48216f;
                    }
                    paint.setAlpha((int) (fVar.f48207o * 255.0f * f35));
                    if (this.C - this.B > 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z10) {
                        canvas.drawLines(fArr, 0, i15, paint);
                    } else {
                        canvas.drawPath(path, paint);
                    }
                    canvas.restore();
                }
                f35 = f13;
                paint.setAlpha((int) (fVar.f48207o * 255.0f * f35));
                if (this.C - this.B > 100) {
                    paint.setStrokeCap(Paint.Cap.SQUARE);
                } else {
                    paint.setStrokeCap(Paint.Cap.ROUND);
                }
                if (z10) {
                    canvas.drawPath(path, paint);
                } else {
                    canvas.drawLines(fArr, 0, i15, paint);
                }
                canvas.restore();
            } else {
                f10 = f18;
                f11 = f20;
                f12 = f19;
                i10 = i13;
            }
            i13 = i10 + 1;
            f18 = f10;
            f20 = f11;
            f19 = f12;
            i12 = 0;
        }
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z10;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        sf.b bVar = this.f46961d0;
        if (bVar != null) {
            float[] fArr = bVar.f47882b;
            float f10 = fArr.length < 2 ? 1.0f : fArr[1] * this.f46992y0;
            int i11 = 0;
            while (i11 < size) {
                tf.f fVar = (tf.f) arrayList3.get(i11);
                boolean z11 = fVar.f48206n;
                Paint paint = fVar.f48196b;
                float[] fArr2 = fVar.f48204l;
                Path path = fVar.f48198e;
                if (z11 || fVar.f48207o != 0.0f) {
                    path.reset();
                    int length = this.f46961d0.f47882b.length;
                    long[] jArr = fVar.f48195a.f47874a;
                    fVar.f48199f.reset();
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        z10 = g.f46949w1;
                        if (i13 >= length) {
                            break;
                        }
                        long[] jArr2 = jArr;
                        long j10 = jArr2[i13];
                        if (j10 < 0) {
                            arrayList2 = arrayList3;
                            size = size;
                        } else {
                            sf.b bVar2 = this.f46961d0;
                            arrayList2 = arrayList3;
                            float f11 = this.f46992y0 * bVar2.f47882b[i13];
                            boolean z12 = g.f46950x1;
                            float f12 = z12 ? this.f46967f0 : bVar2.f47884e;
                            float f13 = z12 ? this.f46969g0 : bVar2.f47885f;
                            float f14 = (1.0f - ((j10 - f13) / (f12 - f13))) * this.f46990x0;
                            if (!z10) {
                                if (i13 == 0) {
                                    path.moveTo(f11 - (f10 / 2.0f), f14);
                                } else {
                                    path.lineTo(f11 - (f10 / 2.0f), f14);
                                }
                                path.lineTo((f10 / 2.0f) + f11, f14);
                            } else if (i12 == 0) {
                                float f15 = f10 / 2.0f;
                                fArr2[i12] = f11 - f15;
                                fArr2[i12 + 1] = f14;
                                float f16 = f11 + f15;
                                fArr2[i12 + 2] = f16;
                                fArr2[i12 + 3] = f14;
                                int i14 = i12 + 5;
                                fArr2[i12 + 4] = f16;
                                i12 += 6;
                                fArr2[i14] = f14;
                            } else if (i13 == length - 1) {
                                float f17 = f10 / 2.0f;
                                float f18 = f11 - f17;
                                fArr2[i12] = f18;
                                fArr2[i12 + 1] = f14;
                                fArr2[i12 + 2] = f18;
                                fArr2[i12 + 3] = f14;
                                float f19 = f11 + f17;
                                fArr2[i12 + 4] = f19;
                                fArr2[i12 + 5] = f14;
                                fArr2[i12 + 6] = f19;
                                fArr2[i12 + 7] = f14;
                                int i15 = i12 + 9;
                                fArr2[i12 + 8] = f19;
                                i12 += 10;
                                fArr2[i15] = 0.0f;
                            } else {
                                float f20 = f10 / 2.0f;
                                float f21 = f11 - f20;
                                fArr2[i12] = f21;
                                fArr2[i12 + 1] = f14;
                                fArr2[i12 + 2] = f21;
                                fArr2[i12 + 3] = f14;
                                float f22 = f11 + f20;
                                fArr2[i12 + 4] = f22;
                                fArr2[i12 + 5] = f14;
                                int i16 = i12 + 7;
                                fArr2[i12 + 6] = f22;
                                i12 += 8;
                                fArr2[i16] = f14;
                            }
                        }
                        i13++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = size;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    fVar.f48202j = i12;
                    if (fVar.f48206n || fVar.f48207o != 0.0f) {
                        paint.setAlpha((int) (fVar.f48207o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr2, 0, fVar.f48202j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                } else {
                    arrayList = arrayList3;
                    i10 = size;
                }
                i11++;
                arrayList3 = arrayList;
                size = i10;
            }
        }
    }

    @Override
    public final void t() {
        this.L0 = true;
        super.t();
    }
}
