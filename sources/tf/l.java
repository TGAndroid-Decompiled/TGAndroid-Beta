package tf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class l extends g {
    @Override
    public final vf.f h(uf.a aVar) {
        return new vf.f(aVar, true, null);
    }

    @Override
    public final void k(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: tf.l.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f9;
        boolean z10;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        int i11;
        float f10;
        float f11;
        float f12;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        uf.b bVar = this.f48261d0;
        if (bVar != null) {
            float[] fArr = bVar.f49198b;
            if (fArr.length < 2) {
                f9 = 1.0f;
            } else {
                f9 = fArr[1] * this.f48292y0;
            }
            int i12 = 0;
            while (i12 < size) {
                vf.f fVar = (vf.f) arrayList3.get(i12);
                boolean z11 = fVar.f49583n;
                Paint paint = fVar.f49573b;
                float[] fArr2 = fVar.f49581l;
                Path path = fVar.f49575e;
                if (!z11 && fVar.f49584o == 0.0f) {
                    arrayList = arrayList3;
                    i10 = size;
                } else {
                    path.reset();
                    int length = this.f48261d0.f49198b.length;
                    long[] jArr = fVar.f49572a.f49190a;
                    fVar.f49576f.reset();
                    int i13 = 0;
                    int i14 = 0;
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
                        } else {
                            uf.b bVar2 = this.f48261d0;
                            arrayList2 = arrayList3;
                            float f13 = this.f48292y0 * bVar2.f49198b[i14];
                            boolean z12 = g.f48250x1;
                            if (z12) {
                                f10 = this.f48267f0;
                                i11 = size;
                            } else {
                                i11 = size;
                                f10 = (float) bVar2.f49200e;
                            }
                            if (z12) {
                                f12 = this.f48269g0;
                                f11 = f10;
                            } else {
                                f11 = f10;
                                f12 = (float) bVar2.f49201f;
                            }
                            float f14 = (1.0f - ((((float) j10) - f12) / (f11 - f12))) * this.f48290x0;
                            if (z10) {
                                if (i13 == 0) {
                                    float f15 = f9 / 2.0f;
                                    fArr2[i13] = f13 - f15;
                                    fArr2[i13 + 1] = f14;
                                    float f16 = f13 + f15;
                                    fArr2[i13 + 2] = f16;
                                    fArr2[i13 + 3] = f14;
                                    int i15 = i13 + 5;
                                    fArr2[i13 + 4] = f16;
                                    i13 += 6;
                                    fArr2[i15] = f14;
                                } else if (i14 == length - 1) {
                                    float f17 = f9 / 2.0f;
                                    float f18 = f13 - f17;
                                    fArr2[i13] = f18;
                                    fArr2[i13 + 1] = f14;
                                    fArr2[i13 + 2] = f18;
                                    fArr2[i13 + 3] = f14;
                                    float f19 = f13 + f17;
                                    fArr2[i13 + 4] = f19;
                                    fArr2[i13 + 5] = f14;
                                    fArr2[i13 + 6] = f19;
                                    fArr2[i13 + 7] = f14;
                                    int i16 = i13 + 9;
                                    fArr2[i13 + 8] = f19;
                                    i13 += 10;
                                    fArr2[i16] = 0.0f;
                                } else {
                                    float f20 = f9 / 2.0f;
                                    float f21 = f13 - f20;
                                    fArr2[i13] = f21;
                                    fArr2[i13 + 1] = f14;
                                    fArr2[i13 + 2] = f21;
                                    fArr2[i13 + 3] = f14;
                                    float f22 = f13 + f20;
                                    fArr2[i13 + 4] = f22;
                                    fArr2[i13 + 5] = f14;
                                    int i17 = i13 + 7;
                                    fArr2[i13 + 6] = f22;
                                    i13 += 8;
                                    fArr2[i17] = f14;
                                }
                            } else {
                                if (i14 == 0) {
                                    path.moveTo(f13 - (f9 / 2.0f), f14);
                                } else {
                                    path.lineTo(f13 - (f9 / 2.0f), f14);
                                }
                                path.lineTo((f9 / 2.0f) + f13, f14);
                            }
                        }
                        i14++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i11;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    fVar.f49579j = i13;
                    if (fVar.f49583n || fVar.f49584o != 0.0f) {
                        paint.setAlpha((int) (fVar.f49584o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr2, 0, fVar.f49579j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
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
