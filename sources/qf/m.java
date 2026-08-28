package qf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class m extends g {
    @Override
    public final sf.f h(rf.a aVar) {
        return new sf.f(aVar, false, null);
    }

    @Override
    public final void k(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: qf.m.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z10;
        ArrayList arrayList;
        int i9;
        ArrayList arrayList2;
        int i10;
        int i11;
        Paint paint;
        float f10;
        float f11;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f46202d0 != null) {
            int i12 = 0;
            while (i12 < size) {
                sf.f fVar = (sf.f) arrayList3.get(i12);
                boolean z11 = fVar.f47557n;
                Paint paint2 = fVar.f47547b;
                float[] fArr = fVar.f47555l;
                Path path = fVar.f47549e;
                if (!z11 && fVar.f47558o == 0.0f) {
                    arrayList = arrayList3;
                    i9 = size;
                } else {
                    path.reset();
                    int length = this.f46202d0.f47161b.length;
                    long[] jArr = fVar.f47546a.f47153a;
                    fVar.f47550f.reset();
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        z10 = g.f46190w1;
                        if (i13 >= length) {
                            break;
                        }
                        long[] jArr2 = jArr;
                        long j10 = jArr2[i13];
                        if (j10 < 0) {
                            arrayList2 = arrayList3;
                            i10 = size;
                            i11 = length;
                        } else {
                            rf.b bVar = this.f46202d0;
                            arrayList2 = arrayList3;
                            float f12 = this.f46233y0 * bVar.f47161b[i13];
                            boolean z12 = g.f46191x1;
                            i10 = size;
                            if (z12) {
                                i11 = length;
                                f10 = this.f46208f0;
                                paint = paint2;
                            } else {
                                i11 = length;
                                paint = paint2;
                                f10 = (float) bVar.f47163e;
                            }
                            if (z12) {
                                f11 = this.f46210g0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f11 = (float) bVar.f47164f;
                            }
                            float f13 = (1.0f - ((((float) j10) - f11) / (f10 - f11))) * this.f46231x0;
                            if (z10) {
                                if (i14 == 0) {
                                    int i15 = i14 + 1;
                                    fArr[i14] = f12;
                                    i14 += 2;
                                    fArr[i15] = f13;
                                } else {
                                    fArr[i14] = f12;
                                    fArr[i14 + 1] = f13;
                                    int i16 = i14 + 3;
                                    fArr[i14 + 2] = f12;
                                    i14 += 4;
                                    fArr[i16] = f13;
                                }
                            } else if (i13 == 0) {
                                path.moveTo(f12, f13);
                            } else {
                                path.lineTo(f12, f13);
                            }
                        }
                        i13++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i10;
                        length = i11;
                    }
                    arrayList = arrayList3;
                    i9 = size;
                    fVar.f47553j = i14;
                    if (fVar.f47557n || fVar.f47558o != 0.0f) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (fVar.f47558o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f47553j, paint3);
                        } else {
                            canvas.drawPath(path, paint3);
                        }
                        i12++;
                        arrayList3 = arrayList;
                        size = i9;
                    }
                }
                i12++;
                arrayList3 = arrayList;
                size = i9;
            }
        }
    }

    @Override
    public final void t() {
        this.L0 = true;
        super.t();
    }
}
