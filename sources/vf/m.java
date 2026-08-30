package vf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class m extends g {
    @Override
    public final xf.f h(wf.a aVar) {
        return new xf.f(aVar, false, null);
    }

    @Override
    public final void k(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: vf.m.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z4;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        int i11;
        int i12;
        Paint paint;
        float f10;
        float f11;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f45715e0 != null) {
            int i13 = 0;
            while (i13 < size) {
                xf.f fVar = (xf.f) arrayList3.get(i13);
                boolean z10 = fVar.f46959n;
                Paint paint2 = fVar.f46950b;
                float[] fArr = fVar.f46957l;
                Path path = fVar.e;
                if (!z10 && fVar.f46960o == 0.0f) {
                    arrayList = arrayList3;
                    i10 = size;
                } else {
                    path.reset();
                    int length = this.f45715e0.f46538b.length;
                    long[] jArr = fVar.f46949a.f46531a;
                    fVar.f46952f.reset();
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        z4 = g.f45701x1;
                        if (i14 >= length) {
                            break;
                        }
                        long[] jArr2 = jArr;
                        long j10 = jArr2[i14];
                        if (j10 < 0) {
                            arrayList2 = arrayList3;
                            i11 = size;
                            i12 = length;
                        } else {
                            wf.b bVar = this.f45715e0;
                            arrayList2 = arrayList3;
                            float f12 = this.f45745z0 * bVar.f46538b[i14];
                            boolean z11 = g.f45702y1;
                            i11 = size;
                            if (z11) {
                                i12 = length;
                                f10 = this.f45720g0;
                                paint = paint2;
                            } else {
                                i12 = length;
                                paint = paint2;
                                f10 = (float) bVar.e;
                            }
                            if (z11) {
                                f11 = this.f45722h0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f11 = (float) bVar.f46540f;
                            }
                            float f13 = (1.0f - ((((float) j10) - f11) / (f10 - f11))) * this.f45744y0;
                            if (z4) {
                                if (i15 == 0) {
                                    int i16 = i15 + 1;
                                    fArr[i15] = f12;
                                    i15 += 2;
                                    fArr[i16] = f13;
                                } else {
                                    fArr[i15] = f12;
                                    fArr[i15 + 1] = f13;
                                    int i17 = i15 + 3;
                                    fArr[i15 + 2] = f12;
                                    i15 += 4;
                                    fArr[i17] = f13;
                                }
                            } else if (i14 == 0) {
                                path.moveTo(f12, f13);
                            } else {
                                path.lineTo(f12, f13);
                            }
                        }
                        i14++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i11;
                        length = i12;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    fVar.f46955j = i15;
                    if (fVar.f46959n || fVar.f46960o != 0.0f) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (fVar.f46960o * 255.0f));
                        if (z4) {
                            canvas.drawLines(fArr, 0, fVar.f46955j, paint3);
                        } else {
                            canvas.drawPath(path, paint3);
                        }
                        i13++;
                        arrayList3 = arrayList;
                        size = i10;
                    }
                }
                i13++;
                arrayList3 = arrayList;
                size = i10;
            }
        }
    }

    @Override
    public final void t() {
        this.M0 = true;
        super.t();
    }
}
