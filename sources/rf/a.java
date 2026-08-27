package rf;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.rl;

public final class a extends g {
    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final tf.f h(sf.a aVar) {
        return new tf.a(aVar, this.S0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        int i10;
        ArrayList arrayList;
        tf.a aVar;
        boolean z10;
        float[] fArr;
        Paint paint;
        Paint paint2;
        float[] fArr2;
        float f12;
        long[] jArr;
        float f13;
        int i11;
        int i12;
        float f14;
        int i13;
        boolean z11;
        float f15;
        float f16;
        float f17;
        float f18;
        Paint paint3;
        int i14;
        float f19;
        float f20;
        float measuredHeight;
        Canvas canvas2 = canvas;
        sf.b bVar = this.f46961d0;
        if (bVar == null) {
            return;
        }
        float f21 = this.B0;
        j jVar = this.f46959c0;
        float f22 = jVar.f47009l;
        float f23 = jVar.f47008k;
        float f24 = f21 / (f22 - f23);
        float f25 = (f23 * f24) - g.f46934g1;
        int i15 = this.B - 1;
        int i16 = i15 < 0 ? 0 : i15;
        int length = this.C + 1;
        if (length > ((sf.a) bVar.d.get(0)).f47874a.length - 1) {
            length = ((sf.a) this.f46961d0.d.get(0)).f47874a.length - 1;
        }
        int i17 = length;
        canvas2.save();
        float f26 = 0.0f;
        canvas2.clipRect(this.f46993z0, 0.0f, this.A0, getMeasuredHeight() - this.f46982s);
        canvas2.save();
        int i18 = this.f46985u0;
        int i19 = 2;
        if (i18 == 2) {
            this.f46956b0 = true;
            this.f46981r0 = 0.0f;
            tf.j jVar2 = this.f46986v0;
            float f27 = jVar2.f48216f;
            f11 = 1.0f - f27;
            canvas2.scale((f27 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f48215e);
        } else {
            if (i18 == 1) {
                tf.j jVar3 = this.f46986v0;
                f11 = jVar3.f48216f;
                canvas2.scale(f11, 1.0f, jVar3.d, jVar3.f48215e);
            } else {
                f10 = 1.0f;
            }
            i10 = 0;
            while (true) {
                arrayList = this.d;
                if (i10 < arrayList.size()) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                aVar = (tf.a) arrayList.get(i10);
                z10 = aVar.f48206n;
                fArr = aVar.f48203k;
                paint = aVar.f48165r;
                paint2 = aVar.f48197c;
                if (z10 && aVar.f48207o == f26) {
                    i11 = i10;
                    f17 = f24;
                    f18 = f25;
                } else {
                    fArr2 = this.f46961d0.f47882b;
                    if (fArr2.length < i19) {
                        f12 = 1.0f;
                    } else {
                        f12 = fArr2[1] * f24;
                    }
                    jArr = aVar.f48195a.f47874a;
                    f13 = aVar.f48207o;
                    i11 = i10;
                    i12 = i16;
                    f14 = 0.0f;
                    i13 = 0;
                    z11 = false;
                    f15 = 0.0f;
                    while (i12 <= i17) {
                        f19 = f14;
                        f20 = ((this.f46961d0.f47882b[i12] * f24) + (f12 / 2.0f)) - f25;
                        float f28 = f24;
                        float f29 = f25;
                        measuredHeight = (getMeasuredHeight() - this.f46982s) - (((jArr[i12] / this.v) * f13) * ((getMeasuredHeight() - this.f46982s) - g.f46937j1));
                        if (i12 == this.f46977o0 || !this.f46979q0) {
                            fArr[i13] = f20;
                            fArr[i13 + 1] = measuredHeight;
                            int i20 = i13 + 3;
                            fArr[i13 + 2] = f20;
                            i13 += 4;
                            fArr[i20] = getMeasuredHeight() - this.f46982s;
                            f14 = f19;
                        } else {
                            f15 = measuredHeight;
                            f14 = f20;
                            z11 = true;
                        }
                        i12++;
                        f24 = f28;
                        f25 = f29;
                    }
                    f16 = f14;
                    f17 = f24;
                    f18 = f25;
                    if (!z11 || this.f46956b0) {
                        paint3 = paint;
                    } else {
                        paint3 = paint2;
                    }
                    paint3.setStrokeWidth(f12);
                    if (z11) {
                        paint.setColor(i0.b.d(1.0f - this.f46981r0, aVar.f48205m, aVar.f48166s));
                    }
                    if (this.f46956b0) {
                        paint.setColor(i0.b.d(0.0f, aVar.f48205m, aVar.f48166s));
                    }
                    i14 = (int) (255.0f * f10);
                    paint3.setAlpha(i14);
                    canvas2.drawLines(fArr, 0, i13, paint3);
                    if (z11) {
                        paint2.setStrokeWidth(f12);
                        paint2.setAlpha(i14);
                        canvas2.drawLine(f16, f15, f16, getMeasuredHeight() - this.f46982s, paint2);
                        paint2.setAlpha(255);
                    }
                }
                i10 = i11 + 1;
                canvas2 = canvas;
                f24 = f17;
                f25 = f18;
                f26 = 0.0f;
                i19 = 2;
            }
        }
        f10 = f11;
        i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 < arrayList.size()) {
                canvas.restore();
                canvas.restore();
                return;
            }
            aVar = (tf.a) arrayList.get(i10);
            z10 = aVar.f48206n;
            fArr = aVar.f48203k;
            paint = aVar.f48165r;
            paint2 = aVar.f48197c;
            if (z10) {
                fArr2 = this.f46961d0.f47882b;
                if (fArr2.length < i19) {
                    f12 = 1.0f;
                } else {
                    f12 = fArr2[1] * f24;
                }
                jArr = aVar.f48195a.f47874a;
                f13 = aVar.f48207o;
                i11 = i10;
                i12 = i16;
                f14 = 0.0f;
                i13 = 0;
                z11 = false;
                f15 = 0.0f;
                while (i12 <= i17) {
                    f19 = f14;
                    f20 = ((this.f46961d0.f47882b[i12] * f24) + (f12 / 2.0f)) - f25;
                    float f210 = f24;
                    float f211 = f25;
                    measuredHeight = (getMeasuredHeight() - this.f46982s) - (((jArr[i12] / this.v) * f13) * ((getMeasuredHeight() - this.f46982s) - g.f46937j1));
                    if (i12 == this.f46977o0) {
                        fArr[i13] = f20;
                        fArr[i13 + 1] = measuredHeight;
                        int i21 = i13 + 3;
                        fArr[i13 + 2] = f20;
                        i13 += 4;
                        fArr[i21] = getMeasuredHeight() - this.f46982s;
                        f14 = f19;
                    } else {
                        fArr[i13] = f20;
                        fArr[i13 + 1] = measuredHeight;
                        int i22 = i13 + 3;
                        fArr[i13 + 2] = f20;
                        i13 += 4;
                        fArr[i22] = getMeasuredHeight() - this.f46982s;
                        f14 = f19;
                    }
                    i12++;
                    f24 = f210;
                    f25 = f211;
                }
                f16 = f14;
                f17 = f24;
                f18 = f25;
                if (z11) {
                    paint3 = paint;
                } else {
                    paint3 = paint;
                }
                paint3.setStrokeWidth(f12);
                if (z11) {
                    paint.setColor(i0.b.d(1.0f - this.f46981r0, aVar.f48205m, aVar.f48166s));
                }
                if (this.f46956b0) {
                    paint.setColor(i0.b.d(0.0f, aVar.f48205m, aVar.f48166s));
                }
                i14 = (int) (255.0f * f10);
                paint3.setAlpha(i14);
                canvas2.drawLines(fArr, 0, i13, paint3);
                if (z11) {
                    paint2.setStrokeWidth(f12);
                    paint2.setAlpha(i14);
                    canvas2.drawLine(f16, f15, f16, getMeasuredHeight() - this.f46982s, paint2);
                    paint2.setAlpha(255);
                }
            } else {
                fArr2 = this.f46961d0.f47882b;
                if (fArr2.length < i19) {
                    f12 = 1.0f;
                } else {
                    f12 = fArr2[1] * f24;
                }
                jArr = aVar.f48195a.f47874a;
                f13 = aVar.f48207o;
                i11 = i10;
                i12 = i16;
                f14 = 0.0f;
                i13 = 0;
                z11 = false;
                f15 = 0.0f;
                while (i12 <= i17) {
                    f19 = f14;
                    f20 = ((this.f46961d0.f47882b[i12] * f24) + (f12 / 2.0f)) - f25;
                    float f212 = f24;
                    float f213 = f25;
                    measuredHeight = (getMeasuredHeight() - this.f46982s) - (((jArr[i12] / this.v) * f13) * ((getMeasuredHeight() - this.f46982s) - g.f46937j1));
                    if (i12 == this.f46977o0) {
                        fArr[i13] = f20;
                        fArr[i13 + 1] = measuredHeight;
                        int i23 = i13 + 3;
                        fArr[i13 + 2] = f20;
                        i13 += 4;
                        fArr[i23] = getMeasuredHeight() - this.f46982s;
                        f14 = f19;
                    } else {
                        fArr[i13] = f20;
                        fArr[i13 + 1] = measuredHeight;
                        int i24 = i13 + 3;
                        fArr[i13 + 2] = f20;
                        i13 += 4;
                        fArr[i24] = getMeasuredHeight() - this.f46982s;
                        f14 = f19;
                    }
                    i12++;
                    f24 = f212;
                    f25 = f213;
                }
                f16 = f14;
                f17 = f24;
                f18 = f25;
                if (z11) {
                    paint3 = paint;
                } else {
                    paint3 = paint;
                }
                paint3.setStrokeWidth(f12);
                if (z11) {
                    paint.setColor(i0.b.d(1.0f - this.f46981r0, aVar.f48205m, aVar.f48166s));
                }
                if (this.f46956b0) {
                    paint.setColor(i0.b.d(0.0f, aVar.f48205m, aVar.f48166s));
                }
                i14 = (int) (255.0f * f10);
                paint3.setAlpha(i14);
                canvas2.drawLines(fArr, 0, i13, paint3);
                if (z11) {
                    paint2.setStrokeWidth(f12);
                    paint2.setAlpha(i14);
                    canvas2.drawLine(f16, f15, f16, getMeasuredHeight() - this.f46982s, paint2);
                    paint2.setAlpha(255);
                }
            }
            i10 = i11 + 1;
            canvas2 = canvas;
            f24 = f17;
            f25 = f18;
            f26 = 0.0f;
            i19 = 2;
        }
    }

    @Override
    public final void n(Canvas canvas) {
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int measuredHeight = getMeasuredHeight();
        int i13 = g.f46939m1;
        int i14 = measuredHeight - i13;
        int measuredHeight2 = (getMeasuredHeight() - this.f46990x0) - i13;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        if (this.f46961d0 != null) {
            int i15 = 0;
            while (i15 < size) {
                tf.a aVar = (tf.a) arrayList2.get(i15);
                boolean z10 = aVar.f48206n;
                Paint paint = aVar.f48197c;
                float[] fArr = aVar.f48203k;
                if (z10 || aVar.f48207o != 0.0f) {
                    aVar.f48198e.reset();
                    float[] fArr2 = this.f46961d0.f47882b;
                    int length = fArr2.length;
                    float f10 = fArr2.length < 2 ? 1.0f : fArr2[1] * this.f46992y0;
                    long[] jArr = aVar.f48195a.f47874a;
                    float f11 = aVar.f48207o;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length) {
                        int i18 = i15;
                        long j10 = jArr[i16];
                        if (j10 < 0) {
                            i12 = i14;
                            arrayList2 = arrayList2;
                        } else {
                            sf.b bVar = this.f46961d0;
                            i12 = i14;
                            float f12 = this.f46992y0 * bVar.f47882b[i16];
                            float fC = rl.c(j10, g.f46950x1 ? this.f46967f0 : bVar.f47884e, f11, 1.0f) * (i12 - measuredHeight2);
                            fArr[i17] = f12;
                            fArr[i17 + 1] = fC;
                            int i19 = i17 + 3;
                            fArr[i17 + 2] = f12;
                            i17 += 4;
                            fArr[i19] = getMeasuredHeight() - this.f46982s;
                        }
                        i16++;
                        i15 = i18;
                        i14 = i12;
                        arrayList2 = arrayList2;
                    }
                    i10 = i14;
                    arrayList = arrayList2;
                    i11 = i15;
                    paint.setStrokeWidth(f10 + 2.0f);
                    canvas.drawLines(fArr, 0, i17, paint);
                } else {
                    i10 = i14;
                    arrayList = arrayList2;
                    i11 = i15;
                }
                i15 = i11 + 1;
                i14 = i10;
                arrayList2 = arrayList;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f46955b;
        this.f46971i0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f46972j0 = i10;
            int i11 = this.f46972j0;
            if (i11 >= this.f46971i0) {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            } else {
                l(canvas, (tf.d) arrayList.get(i11));
                p(canvas, (tf.d) arrayList.get(this.f46972j0));
                i10 = this.f46972j0 + 1;
            }
        }
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
