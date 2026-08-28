package qf;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.ll;
public final class a extends g {
    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final sf.f h(rf.a aVar) {
        return new sf.a(aVar, this.S0);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: qf.a.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        int i9;
        ArrayList arrayList;
        int i10;
        int i11;
        float f11;
        ArrayList arrayList2;
        float f12;
        int measuredHeight = getMeasuredHeight();
        int i12 = g.f46180m1;
        int i13 = measuredHeight - i12;
        int measuredHeight2 = (getMeasuredHeight() - this.f46231x0) - i12;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f46202d0 != null) {
            int i14 = 0;
            while (i14 < size) {
                sf.a aVar = (sf.a) arrayList3.get(i14);
                boolean z10 = aVar.f47557n;
                Paint paint = aVar.f47548c;
                float[] fArr = aVar.f47554k;
                if (!z10 && aVar.f47558o == 0.0f) {
                    i9 = i13;
                    arrayList = arrayList3;
                    i10 = i14;
                } else {
                    aVar.f47549e.reset();
                    float[] fArr2 = this.f46202d0.f47161b;
                    int length = fArr2.length;
                    if (fArr2.length < 2) {
                        f10 = 1.0f;
                    } else {
                        f10 = fArr2[1] * this.f46233y0;
                    }
                    long[] jArr = aVar.f47546a.f47153a;
                    float f13 = aVar.f47558o;
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < length) {
                        int i17 = i14;
                        long j10 = jArr[i15];
                        if (j10 < 0) {
                            i11 = i13;
                            arrayList2 = arrayList3;
                        } else {
                            rf.b bVar = this.f46202d0;
                            i11 = i13;
                            float f14 = this.f46233y0 * bVar.f47161b[i15];
                            if (g.f46191x1) {
                                f12 = this.f46208f0;
                                f11 = f14;
                                arrayList2 = arrayList3;
                            } else {
                                f11 = f14;
                                arrayList2 = arrayList3;
                                f12 = (float) bVar.f47163e;
                            }
                            float c10 = ll.c((float) j10, f12, f13, 1.0f) * (i11 - measuredHeight2);
                            fArr[i16] = f11;
                            fArr[i16 + 1] = c10;
                            int i18 = i16 + 3;
                            fArr[i16 + 2] = f11;
                            i16 += 4;
                            fArr[i18] = getMeasuredHeight() - this.f46223s;
                        }
                        i15++;
                        i14 = i17;
                        i13 = i11;
                        arrayList3 = arrayList2;
                    }
                    i9 = i13;
                    arrayList = arrayList3;
                    i10 = i14;
                    paint.setStrokeWidth(f10 + 2.0f);
                    canvas.drawLines(fArr, 0, i16, paint);
                }
                i14 = i10 + 1;
                i13 = i9;
                arrayList3 = arrayList;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f46196b;
        this.f46212i0 = arrayList.size();
        int i9 = 0;
        while (true) {
            this.f46213j0 = i9;
            int i10 = this.f46213j0;
            if (i10 < this.f46212i0) {
                l(canvas, (sf.d) arrayList.get(i10));
                p(canvas, (sf.d) arrayList.get(this.f46213j0));
                i9 = this.f46213j0 + 1;
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
