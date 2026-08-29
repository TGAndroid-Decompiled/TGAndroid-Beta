package tf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class m extends g {
    @Override
    public final vf.f h(uf.a aVar) {
        return new vf.f(aVar, false, null);
    }

    @Override
    public final void k(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: tf.m.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z10;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        int i11;
        int i12;
        Paint paint;
        float f9;
        float f10;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f48261d0 != null) {
            int i13 = 0;
            while (i13 < size) {
                vf.f fVar = (vf.f) arrayList3.get(i13);
                boolean z11 = fVar.f49583n;
                Paint paint2 = fVar.f49573b;
                float[] fArr = fVar.f49581l;
                Path path = fVar.f49575e;
                if (!z11 && fVar.f49584o == 0.0f) {
                    arrayList = arrayList3;
                    i10 = size;
                } else {
                    path.reset();
                    int length = this.f48261d0.f49198b.length;
                    long[] jArr = fVar.f49572a.f49190a;
                    fVar.f49576f.reset();
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        z10 = g.f48249w1;
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
                            uf.b bVar = this.f48261d0;
                            arrayList2 = arrayList3;
                            float f11 = this.f48292y0 * bVar.f49198b[i14];
                            boolean z12 = g.f48250x1;
                            i11 = size;
                            if (z12) {
                                i12 = length;
                                f9 = this.f48267f0;
                                paint = paint2;
                            } else {
                                i12 = length;
                                paint = paint2;
                                f9 = (float) bVar.f49200e;
                            }
                            if (z12) {
                                f10 = this.f48269g0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f10 = (float) bVar.f49201f;
                            }
                            float f12 = (1.0f - ((((float) j10) - f10) / (f9 - f10))) * this.f48290x0;
                            if (z10) {
                                if (i15 == 0) {
                                    int i16 = i15 + 1;
                                    fArr[i15] = f11;
                                    i15 += 2;
                                    fArr[i16] = f12;
                                } else {
                                    fArr[i15] = f11;
                                    fArr[i15 + 1] = f12;
                                    int i17 = i15 + 3;
                                    fArr[i15 + 2] = f11;
                                    i15 += 4;
                                    fArr[i17] = f12;
                                }
                            } else if (i14 == 0) {
                                path.moveTo(f11, f12);
                            } else {
                                path.lineTo(f11, f12);
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
                    fVar.f49579j = i15;
                    if (fVar.f49583n || fVar.f49584o != 0.0f) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (fVar.f49584o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f49579j, paint3);
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
        this.L0 = true;
        super.t();
    }
}
