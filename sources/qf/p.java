package qf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import f2.f0;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.c91;
import org.telegram.ui.dl0;
public final class p extends g {
    public long[] f46256z1;

    public p(Context context, b6 b6Var) {
        super(context, b6Var);
        this.f46224s0 = true;
        this.f46225t0 = true;
    }

    @Override
    public final void C(int i9, int i10) {
        float f10;
        rf.b bVar = this.f46202d0;
        if (bVar != null) {
            int i11 = this.f46218o0;
            float f11 = this.C0;
            float f12 = (this.f46200c0.f46249k * f11) - g.f46175g1;
            rf.d dVar = (rf.d) bVar;
            float[] fArr = dVar.f47161b;
            if (fArr.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = fArr[1] * f11;
            }
            float f13 = (i9 + f12) / (f11 - f10);
            if (f13 < 0.0f) {
                this.f46218o0 = 0;
            } else if (f13 > 1.0f) {
                this.f46218o0 = dVar.f47160a.length - 1;
            } else {
                int b10 = dVar.b(f13, this.B, this.C);
                this.f46218o0 = b10;
                int i12 = this.C;
                if (b10 > i12) {
                    this.f46218o0 = i12;
                }
                int i13 = this.f46218o0;
                int i14 = this.B;
                if (i13 < i14) {
                    this.f46218o0 = i14;
                }
            }
            if (i11 != this.f46218o0) {
                this.f46220q0 = true;
                c(true);
                x(f12);
                e eVar = this.M0;
                if (eVar != null) {
                    getSelectedDate();
                    c91 c91Var = (c91) ((dl0) eVar).f37560b;
                    c91Var.f();
                    c91Var.f37128b.f46219p0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.f46191x1) {
            int length = ((rf.d) this.f46202d0).f47160a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                long j11 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    sf.h hVar = (sf.h) arrayList.get(i10);
                    if (hVar.f47557n) {
                        j11 += hVar.f47546a.f47153a[i9];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f10 = (float) j10;
                if (f10 != this.f46211h0) {
                    this.f46211h0 = f10;
                    Animator animator = this.W;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.f46208f0, this.f46211h0, new f0(this, 11));
                    this.W = e10;
                    e10.start();
                }
            }
        }
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final sf.f h(rf.a aVar) {
        return new sf.h(aVar, this.S0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        int i9;
        Paint paint;
        float f14;
        int i10;
        int i11;
        Canvas canvas2 = canvas;
        rf.b bVar = this.f46202d0;
        if (bVar == null) {
            return;
        }
        float f15 = this.B0;
        j jVar = this.f46200c0;
        float f16 = jVar.f46250l;
        float f17 = jVar.f46249k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.f46175g1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((rf.d) bVar).f47161b;
        boolean z10 = true;
        if (fArr.length < 2) {
            f11 = 1.0f;
            f10 = 1.0f;
        } else {
            float f21 = fArr[1];
            float f22 = f21 * f18;
            f10 = (f18 - f22) * f21;
            f11 = f22;
        }
        int i12 = ((int) (f19 / f11)) + 1;
        int max = Math.max(0, (this.B - i12) - 2);
        int min = Math.min(((rf.d) this.f46202d0).f47161b.length - 1, this.C + i12 + 2);
        int i13 = 0;
        while (true) {
            arrayList = this.d;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((sf.f) arrayList.get(i13)).f47553j = 0;
            i13++;
        }
        canvas2.save();
        int i14 = this.f46226u0;
        if (i14 == 2) {
            this.f46197b0 = true;
            this.f46222r0 = 0.0f;
            sf.j jVar2 = this.f46227v0;
            float f23 = jVar2.f47567f;
            f13 = 1.0f - f23;
            f12 = 2.0f;
            canvas2.scale((f23 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f47566e);
        } else {
            f12 = 2.0f;
            if (i14 == 1) {
                sf.j jVar3 = this.f46227v0;
                float f24 = jVar3.f47567f;
                canvas2.scale(f24, 1.0f, jVar3.d, jVar3.f47566e);
                f13 = f24;
            } else if (i14 == 3) {
                f13 = this.f46227v0.f47567f;
            } else {
                f13 = 1.0f;
            }
        }
        z10 = (this.f46218o0 < 0 || !this.f46220q0) ? false : false;
        while (true) {
            i9 = g.f46178j1;
            if (max > min) {
                break;
            }
            if (this.f46218o0 != max || !z10) {
                int i15 = 0;
                float f25 = 0.0f;
                while (i15 < arrayList.size()) {
                    sf.f fVar = (sf.f) arrayList.get(i15);
                    if (!fVar.f47557n && fVar.f47558o == 0.0f) {
                        i10 = min;
                        i11 = max;
                    } else {
                        long[] jArr = fVar.f47546a.f47153a;
                        float f26 = (((f18 - f11) * ((rf.d) this.f46202d0).f47161b[max]) + (f11 / f12)) - f20;
                        i10 = min;
                        i11 = max;
                        float measuredHeight = (((float) jArr[i11]) / this.v) * ((getMeasuredHeight() - this.f46223s) - i9) * fVar.f47558o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f46223s) - measuredHeight;
                        float[] fArr2 = fVar.f47554k;
                        int i16 = fVar.f47553j;
                        int i17 = i16 + 1;
                        fVar.f47553j = i17;
                        fArr2[i16] = f26;
                        int i18 = i16 + 2;
                        fVar.f47553j = i18;
                        fArr2[i17] = measuredHeight2 - f25;
                        int i19 = i16 + 3;
                        fVar.f47553j = i19;
                        fArr2[i18] = f26;
                        fVar.f47553j = i16 + 4;
                        fArr2[i19] = (getMeasuredHeight() - this.f46223s) - f25;
                        f25 += measuredHeight;
                    }
                    i15++;
                    min = i10;
                    max = i11;
                }
            }
            max++;
            min = min;
        }
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            sf.h hVar = (sf.h) arrayList.get(i20);
            if (!z10 && !this.f46197b0) {
                paint = hVar.f47548c;
            } else {
                paint = hVar.f47560q;
            }
            if (z10) {
                f14 = 255.0f;
                hVar.f47560q.setColor(i0.a.d(this.f46222r0, hVar.f47556m, hVar.f47561r));
            } else {
                f14 = 255.0f;
            }
            if (this.f46197b0) {
                hVar.f47560q.setColor(i0.a.d(1.0f, hVar.f47556m, hVar.f47561r));
            }
            paint.setAlpha((int) (f13 * f14));
            paint.setStrokeWidth(f10);
            canvas2.drawLines(hVar.f47554k, 0, hVar.f47553j, paint);
        }
        if (z10) {
            int i21 = 0;
            float f27 = 0.0f;
            while (i21 < arrayList.size()) {
                sf.f fVar2 = (sf.f) arrayList.get(i21);
                boolean z11 = fVar2.f47557n;
                Paint paint2 = fVar2.f47548c;
                if (z11 || fVar2.f47558o != 0.0f) {
                    long[] jArr2 = fVar2.f47546a.f47153a;
                    float[] fArr3 = ((rf.d) this.f46202d0).f47161b;
                    int i22 = this.f46218o0;
                    float f28 = (((f18 - f11) * fArr3[i22]) + (f11 / f12)) - f20;
                    float measuredHeight3 = (((float) jArr2[i22]) / this.v) * ((getMeasuredHeight() - this.f46223s) - i9) * fVar2.f47558o;
                    paint2.setStrokeWidth(f10);
                    paint2.setAlpha((int) (f13 * 255.0f));
                    canvas2.drawLine(f28, ((getMeasuredHeight() - this.f46223s) - measuredHeight3) - f27, f28, (getMeasuredHeight() - this.f46223s) - f27, paint2);
                    f27 += measuredHeight3;
                }
                i21++;
                canvas2 = canvas;
            }
        }
        canvas.restore();
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        int i9;
        int i10;
        rf.b bVar = this.f46202d0;
        if (bVar != null) {
            int length = ((rf.d) bVar).f47161b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((sf.f) arrayList.get(i11)).f47553j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.f46256z1;
            if (jArr == null || jArr.length < size) {
                this.f46256z1 = new long[size];
            }
            int i12 = 0;
            while (i12 < length) {
                float f13 = ((rf.d) this.f46202d0).f47161b[i12] * this.f46233y0;
                int i13 = 0;
                while (true) {
                    f11 = 0.0f;
                    if (i13 >= size) {
                        break;
                    }
                    sf.f fVar = (sf.f) arrayList.get(i13);
                    if (fVar.f47557n || fVar.f47558o != 0.0f) {
                        long j10 = fVar.f47546a.f47153a[i12];
                        long[] jArr2 = this.f46256z1;
                        if (j10 > jArr2[i13]) {
                            jArr2[i13] = j10;
                        }
                    }
                    i13++;
                }
                if (i12 % max == 0) {
                    int i14 = 0;
                    float f14 = 0.0f;
                    while (i14 < size) {
                        sf.f fVar2 = (sf.f) arrayList.get(i14);
                        if (!fVar2.f47557n && fVar2.f47558o == f11) {
                            i10 = length;
                            i9 = i12;
                        } else {
                            if (g.f46191x1) {
                                f12 = this.f46208f0;
                            } else {
                                f12 = (float) ((rf.d) this.f46202d0).f47163e;
                            }
                            long[] jArr3 = this.f46256z1;
                            i9 = i12;
                            float f15 = (((float) jArr3[i14]) / f12) * fVar2.f47558o;
                            int i15 = this.f46231x0;
                            float f16 = f15 * i15;
                            float[] fArr = fVar2.f47554k;
                            int i16 = fVar2.f47553j;
                            int i17 = i16 + 1;
                            fVar2.f47553j = i17;
                            fArr[i16] = f13;
                            int i18 = i16 + 2;
                            fVar2.f47553j = i18;
                            i10 = length;
                            fArr[i17] = (i15 - f16) - f14;
                            int i19 = i16 + 3;
                            fVar2.f47553j = i19;
                            fArr[i18] = f13;
                            fVar2.f47553j = i16 + 4;
                            fArr[i19] = i15 - f14;
                            f14 += f16;
                            jArr3[i14] = 0;
                        }
                        i14++;
                        i12 = i9;
                        length = i10;
                        f11 = 0.0f;
                    }
                }
                i12++;
                length = length;
            }
            rf.b bVar2 = this.f46202d0;
            if (((rf.d) bVar2).f47161b.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = ((rf.d) bVar2).f47161b[1] * this.f46233y0;
            }
            for (int i20 = 0; i20 < size; i20++) {
                sf.f fVar3 = (sf.f) arrayList.get(i20);
                Paint paint = fVar3.f47548c;
                Paint paint2 = fVar3.f47548c;
                paint.setStrokeWidth(max * f10);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f47554k, 0, fVar3.f47553j, paint2);
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
    public final long r(int i9, int i10) {
        return ((rf.d) this.f46202d0).f47171m.rMaxQ(i9, i10);
    }

    @Override
    public final void u() {
        super.u();
        this.f46208f0 = 0.0f;
        int length = ((rf.d) this.f46202d0).f47160a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i9 = 0; i9 < length; i9++) {
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                sf.h hVar = (sf.h) arrayList.get(i10);
                if (hVar.f47557n) {
                    j10 += hVar.f47546a.f47153a[i9];
                }
            }
            float f10 = (float) j10;
            if (f10 > this.f46208f0) {
                this.f46208f0 = f10;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((rf.a) ((rf.d) this.f46202d0).d.get(0)).f47153a.length;
        int size = ((rf.d) this.f46202d0).d.size();
        ((rf.d) this.f46202d0).f47170l = new long[length];
        for (int i9 = 0; i9 < length; i9++) {
            ((rf.d) this.f46202d0).f47170l[i9] = 0;
            for (int i10 = 0; i10 < size; i10++) {
                if (((sf.h) this.d.get(i10)).f47557n) {
                    rf.b bVar = this.f46202d0;
                    long[] jArr = ((rf.d) bVar).f47170l;
                    jArr[i9] = jArr[i9] + ((rf.a) ((rf.d) bVar).d.get(i10)).f47153a[i9];
                }
            }
        }
        rf.b bVar2 = this.f46202d0;
        ((rf.d) bVar2).f47171m = new SegmentTree(((rf.d) bVar2).f47170l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
