package rf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.ui.Cells.pa;

public final class m extends g {
    @Override
    public final tf.f h(sf.a aVar) {
        return new tf.f(aVar, false, null);
    }

    @Override
    public final void k(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i10;
        int i11;
        if (this.f46961d0 == null) {
            return;
        }
        float f17 = this.B0;
        j jVar = this.f46959c0;
        float f18 = jVar.f47009l;
        float f19 = jVar.f47008k;
        float f20 = f17 / (f18 - f19);
        float f21 = g.f46934g1;
        float f22 = (f19 * f20) - f21;
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
                float f23 = fArr2.length < 2 ? 0.0f : fArr2[1] * f20;
                long[] jArr = fVar.f48195a.f47874a;
                int i14 = ((int) (f21 / f23)) + 1;
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
                    int i16 = i15;
                    long j10 = jArr[iMax];
                    if (j10 < 0) {
                        f14 = f20;
                        f15 = f22;
                        f16 = f21;
                        i10 = iMin;
                    } else {
                        f14 = f20;
                        float f24 = (this.f46961d0.f47882b[iMax] * f14) - f22;
                        float f25 = this.f46987w;
                        f15 = f22;
                        float f26 = (j10 - f25) / (this.v - f25);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        f16 = f21;
                        i10 = iMin;
                        float fB = pa.b((getMeasuredHeight() - this.f46982s) - g.f46937j1, strokeWidth, f26, (getMeasuredHeight() - this.f46982s) - strokeWidth);
                        if (z10) {
                            if (i16 == 0) {
                                fArr[i16] = f24;
                                i11 = i16 + 2;
                                fArr[i16 + 1] = fB;
                            } else {
                                fArr[i16] = f24;
                                fArr[i16 + 1] = fB;
                                fArr[i16 + 2] = f24;
                                i11 = i16 + 4;
                                fArr[i16 + 3] = fB;
                            }
                            i15 = i11;
                        } else if (z12) {
                            path.moveTo(f24, fB);
                            i15 = i16;
                            z12 = false;
                        } else {
                            path.lineTo(f24, fB);
                        }
                        iMax++;
                        f20 = f14;
                        f22 = f15;
                        f21 = f16;
                        iMin = i10;
                    }
                    i15 = i16;
                    iMax++;
                    f20 = f14;
                    f22 = f15;
                    f21 = f16;
                    iMin = i10;
                }
                f10 = f20;
                f11 = f22;
                f12 = f21;
                int i17 = i15;
                canvas.save();
                int i18 = this.f46985u0;
                float f27 = 1.0f;
                if (i18 == 2) {
                    tf.j jVar2 = this.f46986v0;
                    float f28 = jVar2.f48216f;
                    f13 = f28 > 0.5f ? 0.0f : 1.0f - (f28 * 2.0f);
                    canvas.scale((f28 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f48215e);
                } else {
                    if (i18 == 1) {
                        float f29 = this.f46986v0.f48216f;
                        f13 = f29 < 0.3f ? 0.0f : f29;
                        canvas.save();
                        tf.j jVar3 = this.f46986v0;
                        float f30 = jVar3.f48216f;
                        canvas.scale(f30, f30, jVar3.d, jVar3.f48215e);
                    } else if (i18 == 3) {
                        f27 = this.f46986v0.f48216f;
                    }
                    paint.setAlpha((int) (fVar.f48207o * 255.0f * f27));
                    if (this.C - this.B > 100) {
                        paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (z10) {
                        canvas.drawLines(fArr, 0, i17, paint);
                    } else {
                        canvas.drawPath(path, paint);
                    }
                    canvas.restore();
                }
                f27 = f13;
                paint.setAlpha((int) (fVar.f48207o * 255.0f * f27));
                if (this.C - this.B > 100) {
                    paint.setStrokeCap(Paint.Cap.SQUARE);
                } else {
                    paint.setStrokeCap(Paint.Cap.ROUND);
                }
                if (z10) {
                    canvas.drawPath(path, paint);
                } else {
                    canvas.drawLines(fArr, 0, i17, paint);
                }
                canvas.restore();
            } else {
                f10 = f20;
                f11 = f22;
                f12 = f21;
            }
            i13++;
            f20 = f10;
            f22 = f11;
            f21 = f12;
            i12 = 0;
        }
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z10;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        int i11;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f46961d0 != null) {
            int i12 = 0;
            while (i12 < size) {
                tf.f fVar = (tf.f) arrayList3.get(i12);
                boolean z11 = fVar.f48206n;
                Paint paint = fVar.f48196b;
                float[] fArr = fVar.f48204l;
                Path path = fVar.f48198e;
                if (z11 || fVar.f48207o != 0.0f) {
                    path.reset();
                    int length = this.f46961d0.f47882b.length;
                    long[] jArr = fVar.f48195a.f47874a;
                    fVar.f48199f.reset();
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        z10 = g.f46949w1;
                        if (i13 >= length) {
                            break;
                        }
                        long[] jArr2 = jArr;
                        long j10 = jArr2[i13];
                        if (j10 < 0) {
                            arrayList2 = arrayList3;
                            i11 = size;
                            length = length;
                        } else {
                            sf.b bVar = this.f46961d0;
                            arrayList2 = arrayList3;
                            float f10 = this.f46992y0 * bVar.f47882b[i13];
                            boolean z12 = g.f46950x1;
                            i11 = size;
                            float f11 = z12 ? this.f46967f0 : bVar.f47884e;
                            float f12 = z12 ? this.f46969g0 : bVar.f47885f;
                            float f13 = (1.0f - ((j10 - f12) / (f11 - f12))) * this.f46990x0;
                            if (z10) {
                                if (i14 == 0) {
                                    int i15 = i14 + 1;
                                    fArr[i14] = f10;
                                    i14 += 2;
                                    fArr[i15] = f13;
                                } else {
                                    fArr[i14] = f10;
                                    fArr[i14 + 1] = f13;
                                    int i16 = i14 + 3;
                                    fArr[i14 + 2] = f10;
                                    i14 += 4;
                                    fArr[i16] = f13;
                                }
                            } else if (i13 == 0) {
                                path.moveTo(f10, f13);
                            } else {
                                path.lineTo(f10, f13);
                            }
                        }
                        i13++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i11;
                        length = length;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    fVar.f48202j = i14;
                    if (fVar.f48206n || fVar.f48207o != 0.0f) {
                        Paint paint2 = paint;
                        paint2.setAlpha((int) (fVar.f48207o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f48202j, paint2);
                        } else {
                            canvas.drawPath(path, paint2);
                        }
                    }
                    i12++;
                    arrayList3 = arrayList;
                    size = i10;
                } else {
                    arrayList = arrayList3;
                    i10 = size;
                }
                i12++;
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
