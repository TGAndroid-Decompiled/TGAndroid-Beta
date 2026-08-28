package qf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class l extends g {
    @Override
    public final sf.f h(rf.a aVar) {
        return new sf.f(aVar, true, null);
    }

    @Override
    public final void k(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: qf.l.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        boolean z10;
        ArrayList arrayList;
        int i9;
        ArrayList arrayList2;
        int i10;
        float f11;
        float f12;
        float f13;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        rf.b bVar = this.f46202d0;
        if (bVar != null) {
            float[] fArr = bVar.f47161b;
            if (fArr.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = fArr[1] * this.f46233y0;
            }
            int i11 = 0;
            while (i11 < size) {
                sf.f fVar = (sf.f) arrayList3.get(i11);
                boolean z11 = fVar.f47557n;
                Paint paint = fVar.f47547b;
                float[] fArr2 = fVar.f47555l;
                Path path = fVar.f47549e;
                if (!z11 && fVar.f47558o == 0.0f) {
                    arrayList = arrayList3;
                    i9 = size;
                } else {
                    path.reset();
                    int length = this.f46202d0.f47161b.length;
                    long[] jArr = fVar.f47546a.f47153a;
                    fVar.f47550f.reset();
                    int i12 = 0;
                    int i13 = 0;
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
                        } else {
                            rf.b bVar2 = this.f46202d0;
                            arrayList2 = arrayList3;
                            float f14 = this.f46233y0 * bVar2.f47161b[i13];
                            boolean z12 = g.f46191x1;
                            if (z12) {
                                f11 = this.f46208f0;
                                i10 = size;
                            } else {
                                i10 = size;
                                f11 = (float) bVar2.f47163e;
                            }
                            if (z12) {
                                f13 = this.f46210g0;
                                f12 = f11;
                            } else {
                                f12 = f11;
                                f13 = (float) bVar2.f47164f;
                            }
                            float f15 = (1.0f - ((((float) j10) - f13) / (f12 - f13))) * this.f46231x0;
                            if (z10) {
                                if (i12 == 0) {
                                    float f16 = f10 / 2.0f;
                                    fArr2[i12] = f14 - f16;
                                    fArr2[i12 + 1] = f15;
                                    float f17 = f14 + f16;
                                    fArr2[i12 + 2] = f17;
                                    fArr2[i12 + 3] = f15;
                                    int i14 = i12 + 5;
                                    fArr2[i12 + 4] = f17;
                                    i12 += 6;
                                    fArr2[i14] = f15;
                                } else if (i13 == length - 1) {
                                    float f18 = f10 / 2.0f;
                                    float f19 = f14 - f18;
                                    fArr2[i12] = f19;
                                    fArr2[i12 + 1] = f15;
                                    fArr2[i12 + 2] = f19;
                                    fArr2[i12 + 3] = f15;
                                    float f20 = f14 + f18;
                                    fArr2[i12 + 4] = f20;
                                    fArr2[i12 + 5] = f15;
                                    fArr2[i12 + 6] = f20;
                                    fArr2[i12 + 7] = f15;
                                    int i15 = i12 + 9;
                                    fArr2[i12 + 8] = f20;
                                    i12 += 10;
                                    fArr2[i15] = 0.0f;
                                } else {
                                    float f21 = f10 / 2.0f;
                                    float f22 = f14 - f21;
                                    fArr2[i12] = f22;
                                    fArr2[i12 + 1] = f15;
                                    fArr2[i12 + 2] = f22;
                                    fArr2[i12 + 3] = f15;
                                    float f23 = f14 + f21;
                                    fArr2[i12 + 4] = f23;
                                    fArr2[i12 + 5] = f15;
                                    int i16 = i12 + 7;
                                    fArr2[i12 + 6] = f23;
                                    i12 += 8;
                                    fArr2[i16] = f15;
                                }
                            } else {
                                if (i13 == 0) {
                                    path.moveTo(f14 - (f10 / 2.0f), f15);
                                } else {
                                    path.lineTo(f14 - (f10 / 2.0f), f15);
                                }
                                path.lineTo((f10 / 2.0f) + f14, f15);
                            }
                        }
                        i13++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i10;
                    }
                    arrayList = arrayList3;
                    i9 = size;
                    fVar.f47553j = i12;
                    if (fVar.f47557n || fVar.f47558o != 0.0f) {
                        paint.setAlpha((int) (fVar.f47558o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr2, 0, fVar.f47553j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                }
                i11++;
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
