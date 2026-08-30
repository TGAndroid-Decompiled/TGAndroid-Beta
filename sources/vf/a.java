package vf;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.y3;
public final class a extends g {
    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final xf.f h(wf.a aVar) {
        return new xf.a(aVar, this.T0);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: vf.a.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        float f11;
        ArrayList arrayList2;
        float f12;
        int measuredHeight = getMeasuredHeight();
        int i13 = g.f45691n1;
        int i14 = measuredHeight - i13;
        int measuredHeight2 = (getMeasuredHeight() - this.f45744y0) - i13;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f45715e0 != null) {
            int i15 = 0;
            while (i15 < size) {
                xf.a aVar = (xf.a) arrayList3.get(i15);
                boolean z4 = aVar.f46959n;
                Paint paint = aVar.f46951c;
                float[] fArr = aVar.f46956k;
                if (!z4 && aVar.f46960o == 0.0f) {
                    i10 = i14;
                    arrayList = arrayList3;
                    i11 = i15;
                } else {
                    aVar.e.reset();
                    float[] fArr2 = this.f45715e0.f46538b;
                    int length = fArr2.length;
                    if (fArr2.length < 2) {
                        f10 = 1.0f;
                    } else {
                        f10 = fArr2[1] * this.f45745z0;
                    }
                    long[] jArr = aVar.f46949a.f46531a;
                    float f13 = aVar.f46960o;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length) {
                        int i18 = i15;
                        long j10 = jArr[i16];
                        if (j10 < 0) {
                            i12 = i14;
                            arrayList2 = arrayList3;
                        } else {
                            wf.b bVar = this.f45715e0;
                            i12 = i14;
                            float f14 = this.f45745z0 * bVar.f46538b[i16];
                            if (g.f45702y1) {
                                f12 = this.f45720g0;
                                f11 = f14;
                                arrayList2 = arrayList3;
                            } else {
                                f11 = f14;
                                arrayList2 = arrayList3;
                                f12 = (float) bVar.e;
                            }
                            float A = y3.A((float) j10, f12, f13, 1.0f) * (i12 - measuredHeight2);
                            fArr[i17] = f11;
                            fArr[i17 + 1] = A;
                            int i19 = i17 + 3;
                            fArr[i17 + 2] = f11;
                            i17 += 4;
                            fArr[i19] = getMeasuredHeight() - this.f45734s;
                        }
                        i16++;
                        i15 = i18;
                        i14 = i12;
                        arrayList3 = arrayList2;
                    }
                    i10 = i14;
                    arrayList = arrayList3;
                    i11 = i15;
                    paint.setStrokeWidth(f10 + 2.0f);
                    canvas.drawLines(fArr, 0, i17, paint);
                }
                i15 = i11 + 1;
                i14 = i10;
                arrayList3 = arrayList;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f45707b;
        this.f45724j0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f45725k0 = i10;
            int i11 = this.f45725k0;
            if (i11 < this.f45724j0) {
                l(canvas, (xf.d) arrayList.get(i11));
                p(canvas, (xf.d) arrayList.get(this.f45725k0));
                i10 = this.f45725k0 + 1;
            } else {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
