package wf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class l extends g {
    @Override
    public final yf.f h(xf.a aVar) {
        return new yf.f(aVar, true, null);
    }

    @Override
    public final void k(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: wf.l.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        boolean z4;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        int i11;
        float f11;
        float f12;
        float f13;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        xf.b bVar = this.f49590e0;
        if (bVar != null) {
            float[] fArr = bVar.f50584b;
            if (fArr.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = fArr[1] * this.f49620z0;
            }
            int i12 = 0;
            while (i12 < size) {
                yf.f fVar = (yf.f) arrayList3.get(i12);
                boolean z10 = fVar.f50969n;
                Paint paint = fVar.f50959b;
                float[] fArr2 = fVar.f50967l;
                Path path = fVar.f50961e;
                if (!z10 && fVar.f50970o == 0.0f) {
                    arrayList = arrayList3;
                    i10 = size;
                } else {
                    path.reset();
                    int length = this.f49590e0.f50584b.length;
                    long[] jArr = fVar.f50958a.f50576a;
                    fVar.f50962f.reset();
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        z4 = g.f49575x1;
                        if (i14 >= length) {
                            break;
                        }
                        long[] jArr2 = jArr;
                        long j10 = jArr2[i14];
                        if (j10 < 0) {
                            arrayList2 = arrayList3;
                            i11 = size;
                        } else {
                            xf.b bVar2 = this.f49590e0;
                            arrayList2 = arrayList3;
                            float f14 = this.f49620z0 * bVar2.f50584b[i14];
                            boolean z11 = g.f49576y1;
                            if (z11) {
                                f11 = this.f49595g0;
                                i11 = size;
                            } else {
                                i11 = size;
                                f11 = (float) bVar2.f50586e;
                            }
                            if (z11) {
                                f13 = this.f49597h0;
                                f12 = f11;
                            } else {
                                f12 = f11;
                                f13 = (float) bVar2.f50587f;
                            }
                            float f15 = (1.0f - ((((float) j10) - f13) / (f12 - f13))) * this.f49619y0;
                            if (z4) {
                                if (i13 == 0) {
                                    float f16 = f10 / 2.0f;
                                    fArr2[i13] = f14 - f16;
                                    fArr2[i13 + 1] = f15;
                                    float f17 = f14 + f16;
                                    fArr2[i13 + 2] = f17;
                                    fArr2[i13 + 3] = f15;
                                    int i15 = i13 + 5;
                                    fArr2[i13 + 4] = f17;
                                    i13 += 6;
                                    fArr2[i15] = f15;
                                } else if (i14 == length - 1) {
                                    float f18 = f10 / 2.0f;
                                    float f19 = f14 - f18;
                                    fArr2[i13] = f19;
                                    fArr2[i13 + 1] = f15;
                                    fArr2[i13 + 2] = f19;
                                    fArr2[i13 + 3] = f15;
                                    float f20 = f14 + f18;
                                    fArr2[i13 + 4] = f20;
                                    fArr2[i13 + 5] = f15;
                                    fArr2[i13 + 6] = f20;
                                    fArr2[i13 + 7] = f15;
                                    int i16 = i13 + 9;
                                    fArr2[i13 + 8] = f20;
                                    i13 += 10;
                                    fArr2[i16] = 0.0f;
                                } else {
                                    float f21 = f10 / 2.0f;
                                    float f22 = f14 - f21;
                                    fArr2[i13] = f22;
                                    fArr2[i13 + 1] = f15;
                                    fArr2[i13 + 2] = f22;
                                    fArr2[i13 + 3] = f15;
                                    float f23 = f14 + f21;
                                    fArr2[i13 + 4] = f23;
                                    fArr2[i13 + 5] = f15;
                                    int i17 = i13 + 7;
                                    fArr2[i13 + 6] = f23;
                                    i13 += 8;
                                    fArr2[i17] = f15;
                                }
                            } else {
                                if (i14 == 0) {
                                    path.moveTo(f14 - (f10 / 2.0f), f15);
                                } else {
                                    path.lineTo(f14 - (f10 / 2.0f), f15);
                                }
                                path.lineTo((f10 / 2.0f) + f14, f15);
                            }
                        }
                        i14++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i11;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    fVar.f50965j = i13;
                    if (fVar.f50969n || fVar.f50970o != 0.0f) {
                        paint.setAlpha((int) (fVar.f50970o * 255.0f));
                        if (z4) {
                            canvas.drawLines(fArr2, 0, fVar.f50965j, paint);
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
        this.M0 = true;
        super.t();
    }
}
