package wf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class m extends g {
    @Override
    public final yf.f h(xf.a aVar) {
        return new yf.f(aVar, false, null);
    }

    @Override
    public final void k(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: wf.m.k(android.graphics.Canvas):void");
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
        if (this.f49554e0 != null) {
            int i13 = 0;
            while (i13 < size) {
                yf.f fVar = (yf.f) arrayList3.get(i13);
                boolean z10 = fVar.f50933n;
                Paint paint2 = fVar.f50923b;
                float[] fArr = fVar.f50931l;
                Path path = fVar.f50925e;
                if (!z10 && fVar.f50934o == 0.0f) {
                    arrayList = arrayList3;
                    i10 = size;
                } else {
                    path.reset();
                    int length = this.f49554e0.f50548b.length;
                    long[] jArr = fVar.f50922a.f50540a;
                    fVar.f50926f.reset();
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        z4 = g.f49539x1;
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
                            xf.b bVar = this.f49554e0;
                            arrayList2 = arrayList3;
                            float f12 = this.f49584z0 * bVar.f50548b[i14];
                            boolean z11 = g.f49540y1;
                            i11 = size;
                            if (z11) {
                                i12 = length;
                                f10 = this.f49559g0;
                                paint = paint2;
                            } else {
                                i12 = length;
                                paint = paint2;
                                f10 = (float) bVar.f50550e;
                            }
                            if (z11) {
                                f11 = this.f49561h0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f11 = (float) bVar.f50551f;
                            }
                            float f13 = (1.0f - ((((float) j10) - f11) / (f10 - f11))) * this.f49583y0;
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
                    fVar.f50929j = i15;
                    if (fVar.f50933n || fVar.f50934o != 0.0f) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (fVar.f50934o * 255.0f));
                        if (z4) {
                            canvas.drawLines(fArr, 0, fVar.f50929j, paint3);
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
