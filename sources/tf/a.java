package tf;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.x3;
public final class a extends g {
    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final vf.f h(uf.a aVar) {
        return new vf.a(aVar, this.S0);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: tf.a.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f9;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        float f10;
        ArrayList arrayList2;
        float f11;
        int measuredHeight = getMeasuredHeight();
        int i13 = g.f48239m1;
        int i14 = measuredHeight - i13;
        int measuredHeight2 = (getMeasuredHeight() - this.f48290x0) - i13;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f48261d0 != null) {
            int i15 = 0;
            while (i15 < size) {
                vf.a aVar = (vf.a) arrayList3.get(i15);
                boolean z10 = aVar.f49583n;
                Paint paint = aVar.f49574c;
                float[] fArr = aVar.f49580k;
                if (!z10 && aVar.f49584o == 0.0f) {
                    i10 = i14;
                    arrayList = arrayList3;
                    i11 = i15;
                } else {
                    aVar.f49575e.reset();
                    float[] fArr2 = this.f48261d0.f49198b;
                    int length = fArr2.length;
                    if (fArr2.length < 2) {
                        f9 = 1.0f;
                    } else {
                        f9 = fArr2[1] * this.f48292y0;
                    }
                    long[] jArr = aVar.f49572a.f49190a;
                    float f12 = aVar.f49584o;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length) {
                        int i18 = i15;
                        long j10 = jArr[i16];
                        if (j10 < 0) {
                            i12 = i14;
                            arrayList2 = arrayList3;
                        } else {
                            uf.b bVar = this.f48261d0;
                            i12 = i14;
                            float f13 = this.f48292y0 * bVar.f49198b[i16];
                            if (g.f48250x1) {
                                f11 = this.f48267f0;
                                f10 = f13;
                                arrayList2 = arrayList3;
                            } else {
                                f10 = f13;
                                arrayList2 = arrayList3;
                                f11 = (float) bVar.f49200e;
                            }
                            float A = x3.A((float) j10, f11, f12, 1.0f) * (i12 - measuredHeight2);
                            fArr[i17] = f10;
                            fArr[i17 + 1] = A;
                            int i19 = i17 + 3;
                            fArr[i17 + 2] = f10;
                            i17 += 4;
                            fArr[i19] = getMeasuredHeight() - this.f48282s;
                        }
                        i16++;
                        i15 = i18;
                        i14 = i12;
                        arrayList3 = arrayList2;
                    }
                    i10 = i14;
                    arrayList = arrayList3;
                    i11 = i15;
                    paint.setStrokeWidth(f9 + 2.0f);
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
        ArrayList arrayList = this.f48255b;
        this.f48271i0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f48272j0 = i10;
            int i11 = this.f48272j0;
            if (i11 < this.f48271i0) {
                l(canvas, (vf.d) arrayList.get(i11));
                p(canvas, (vf.d) arrayList.get(this.f48272j0));
                i10 = this.f48272j0 + 1;
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
