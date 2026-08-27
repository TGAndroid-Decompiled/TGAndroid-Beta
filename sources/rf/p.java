package rf;

import ag.q1;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.a91;
import org.telegram.ui.dl0;

public final class p extends g {

    public long[] f47015z1;

    public p(Context context, c6 c6Var) {
        super(context, c6Var);
        this.f46983s0 = true;
        this.f46984t0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        sf.b bVar = this.f46961d0;
        if (bVar == null) {
            return;
        }
        int i12 = this.f46977o0;
        float f10 = this.C0;
        float f11 = (this.f46959c0.f47008k * f10) - g.f46934g1;
        sf.d dVar = (sf.d) bVar;
        float[] fArr = dVar.f47882b;
        float f12 = (i10 + f11) / (f10 - (fArr.length < 2 ? 1.0f : fArr[1] * f10));
        if (f12 < 0.0f) {
            this.f46977o0 = 0;
        } else if (f12 > 1.0f) {
            this.f46977o0 = dVar.f47881a.length - 1;
        } else {
            int iB = dVar.b(f12, this.B, this.C);
            this.f46977o0 = iB;
            int i13 = this.C;
            if (iB > i13) {
                this.f46977o0 = i13;
            }
            int i14 = this.f46977o0;
            int i15 = this.B;
            if (i14 < i15) {
                this.f46977o0 = i15;
            }
        }
        if (i12 != this.f46977o0) {
            this.f46979q0 = true;
            c(true);
            x(f11);
            e eVar = this.M0;
            if (eVar != null) {
                getSelectedDate();
                a91 a91Var = (a91) ((dl0) eVar).f37438b;
                a91Var.f();
                a91Var.f36464b.f46978p0.d(false, false);
            }
            invalidate();
            B();
        }
    }

    @Override
    public final void K() {
        if (g.f46950x1) {
            int length = ((sf.d) this.f46961d0).f47881a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    tf.h hVar = (tf.h) arrayList.get(i11);
                    if (hVar.f48206n) {
                        j11 += hVar.f48195a.f47874a[i10];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f10 = j10;
                if (f10 != this.f46970h0) {
                    this.f46970h0 = f10;
                    Animator animator = this.W;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator valueAnimatorE = g.e(this.f46967f0, this.f46970h0, new q1(this, 13));
                    this.W = valueAnimatorE;
                    valueAnimatorE.start();
                }
            }
        }
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final tf.f h(sf.a aVar) {
        return new tf.h(aVar, this.S0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        int i10;
        float f14;
        int i11;
        Canvas canvas2 = canvas;
        sf.b bVar = this.f46961d0;
        if (bVar == null) {
            return;
        }
        float f15 = this.B0;
        j jVar = this.f46959c0;
        float f16 = jVar.f47009l;
        float f17 = jVar.f47008k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.f46934g1;
        float f20 = (f17 * f18) - f19;
        float[] fArr = ((sf.d) bVar).f47882b;
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
        int iMax = Math.max(0, (this.B - i12) - 2);
        int iMin = Math.min(((sf.d) this.f46961d0).f47882b.length - 1, this.C + i12 + 2);
        int i13 = 0;
        while (true) {
            arrayList = this.d;
            if (i13 >= arrayList.size()) {
                break;
            }
            ((tf.f) arrayList.get(i13)).f48202j = 0;
            i13++;
        }
        canvas2.save();
        int i14 = this.f46985u0;
        if (i14 == 2) {
            this.f46956b0 = true;
            this.f46981r0 = 0.0f;
            tf.j jVar2 = this.f46986v0;
            float f23 = jVar2.f48216f;
            f13 = 1.0f - f23;
            f12 = 2.0f;
            canvas2.scale((f23 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f48215e);
        } else {
            f12 = 2.0f;
            if (i14 == 1) {
                tf.j jVar3 = this.f46986v0;
                float f24 = jVar3.f48216f;
                canvas2.scale(f24, 1.0f, jVar3.d, jVar3.f48215e);
                f13 = f24;
            } else {
                f13 = i14 == 3 ? this.f46986v0.f48216f : 1.0f;
            }
        }
        boolean z10 = this.f46977o0 >= 0 && this.f46979q0;
        while (true) {
            i10 = g.f46937j1;
            if (iMax > iMin) {
                break;
            }
            if (this.f46977o0 != iMax || !z10) {
                int i15 = 0;
                float f25 = 0.0f;
                while (i15 < arrayList.size()) {
                    tf.f fVar = (tf.f) arrayList.get(i15);
                    if (fVar.f48206n || fVar.f48207o != 0.0f) {
                        long[] jArr = fVar.f48195a.f47874a;
                        float f26 = (((f18 - f11) * ((sf.d) this.f46961d0).f47882b[iMax]) + (f11 / f12)) - f20;
                        i11 = iMax;
                        float measuredHeight = (jArr[i11] / this.v) * ((getMeasuredHeight() - this.f46982s) - i10) * fVar.f48207o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f46982s) - measuredHeight;
                        float[] fArr2 = fVar.f48203k;
                        int i16 = fVar.f48202j;
                        int i17 = i16 + 1;
                        fVar.f48202j = i17;
                        fArr2[i16] = f26;
                        int i18 = i16 + 2;
                        fVar.f48202j = i18;
                        fArr2[i17] = measuredHeight2 - f25;
                        int i19 = i16 + 3;
                        fVar.f48202j = i19;
                        fArr2[i18] = f26;
                        fVar.f48202j = i16 + 4;
                        fArr2[i19] = (getMeasuredHeight() - this.f46982s) - f25;
                        f25 += measuredHeight;
                    } else {
                        i11 = iMax;
                    }
                    i15++;
                    iMin = iMin;
                    iMax = i11;
                }
            }
            iMax++;
            iMin = iMin;
        }
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            tf.h hVar = (tf.h) arrayList.get(i20);
            Paint paint = (z10 || this.f46956b0) ? hVar.f48209q : hVar.f48197c;
            if (z10) {
                f14 = 255.0f;
                hVar.f48209q.setColor(i0.b.d(this.f46981r0, hVar.f48205m, hVar.f48210r));
            } else {
                f14 = 255.0f;
            }
            if (this.f46956b0) {
                hVar.f48209q.setColor(i0.b.d(1.0f, hVar.f48205m, hVar.f48210r));
            }
            paint.setAlpha((int) (f13 * f14));
            paint.setStrokeWidth(f10);
            canvas2.drawLines(hVar.f48203k, 0, hVar.f48202j, paint);
        }
        if (z10) {
            int i21 = 0;
            float f27 = 0.0f;
            while (i21 < arrayList.size()) {
                tf.f fVar2 = (tf.f) arrayList.get(i21);
                boolean z11 = fVar2.f48206n;
                Paint paint2 = fVar2.f48197c;
                if (z11 || fVar2.f48207o != 0.0f) {
                    long[] jArr2 = fVar2.f48195a.f47874a;
                    float[] fArr3 = ((sf.d) this.f46961d0).f47882b;
                    int i22 = this.f46977o0;
                    float f28 = (((f18 - f11) * fArr3[i22]) + (f11 / f12)) - f20;
                    float measuredHeight3 = (jArr2[i22] / this.v) * ((getMeasuredHeight() - this.f46982s) - i10) * fVar2.f48207o;
                    float measuredHeight4 = (getMeasuredHeight() - this.f46982s) - measuredHeight3;
                    paint2.setStrokeWidth(f10);
                    paint2.setAlpha((int) (f13 * 255.0f));
                    canvas2.drawLine(f28, measuredHeight4 - f27, f28, (getMeasuredHeight() - this.f46982s) - f27, paint2);
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
        sf.b bVar = this.f46961d0;
        if (bVar != null) {
            int length = ((sf.d) bVar).f47882b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((tf.f) arrayList.get(i10)).f48202j = 0;
            }
            int iMax = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.f47015z1;
            if (jArr == null || jArr.length < size) {
                this.f47015z1 = new long[size];
            }
            int i11 = 0;
            while (i11 < length) {
                float f11 = ((sf.d) this.f46961d0).f47882b[i11] * this.f46992y0;
                int i12 = 0;
                while (true) {
                    f10 = 0.0f;
                    if (i12 >= size) {
                        break;
                    }
                    tf.f fVar = (tf.f) arrayList.get(i12);
                    if (fVar.f48206n || fVar.f48207o != 0.0f) {
                        long j10 = fVar.f48195a.f47874a[i11];
                        long[] jArr2 = this.f47015z1;
                        if (j10 > jArr2[i12]) {
                            jArr2[i12] = j10;
                        }
                    }
                    i12++;
                }
                if (i11 % iMax == 0) {
                    int i13 = 0;
                    float f12 = 0.0f;
                    while (i13 < size) {
                        tf.f fVar2 = (tf.f) arrayList.get(i13);
                        if (fVar2.f48206n || fVar2.f48207o != f10) {
                            float f13 = g.f46950x1 ? this.f46967f0 : ((sf.d) this.f46961d0).f47884e;
                            long[] jArr3 = this.f47015z1;
                            float f14 = (jArr3[i13] / f13) * fVar2.f48207o;
                            int i14 = this.f46990x0;
                            float f15 = f14 * i14;
                            float[] fArr = fVar2.f48203k;
                            int i15 = fVar2.f48202j;
                            int i16 = i15 + 1;
                            fVar2.f48202j = i16;
                            fArr[i15] = f11;
                            int i17 = i15 + 2;
                            fVar2.f48202j = i17;
                            fArr[i16] = (i14 - f15) - f12;
                            int i18 = i15 + 3;
                            fVar2.f48202j = i18;
                            fArr[i17] = f11;
                            fVar2.f48202j = i15 + 4;
                            fArr[i18] = i14 - f12;
                            f12 += f15;
                            jArr3[i13] = 0;
                        }
                        i13++;
                        i11 = i11;
                        length = length;
                        f10 = 0.0f;
                    }
                }
                i11++;
                length = length;
            }
            sf.b bVar2 = this.f46961d0;
            float f16 = ((sf.d) bVar2).f47882b.length < 2 ? 1.0f : ((sf.d) bVar2).f47882b[1] * this.f46992y0;
            for (int i19 = 0; i19 < size; i19++) {
                tf.f fVar3 = (tf.f) arrayList.get(i19);
                Paint paint = fVar3.f48197c;
                Paint paint2 = fVar3.f48197c;
                paint.setStrokeWidth(iMax * f16);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f48203k, 0, fVar3.f48202j, paint2);
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
    public final long r(int i10, int i11) {
        return ((sf.d) this.f46961d0).f47892m.rMaxQ(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f46967f0 = 0.0f;
        int length = ((sf.d) this.f46961d0).f47881a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                tf.h hVar = (tf.h) arrayList.get(i11);
                if (hVar.f48206n) {
                    j10 += hVar.f48195a.f47874a[i10];
                }
            }
            float f10 = j10;
            if (f10 > this.f46967f0) {
                this.f46967f0 = f10;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((sf.a) ((sf.d) this.f46961d0).d.get(0)).f47874a.length;
        int size = ((sf.d) this.f46961d0).d.size();
        ((sf.d) this.f46961d0).f47891l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((sf.d) this.f46961d0).f47891l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((tf.h) this.d.get(i11)).f48206n) {
                    sf.b bVar = this.f46961d0;
                    long[] jArr = ((sf.d) bVar).f47891l;
                    jArr[i10] = jArr[i10] + ((sf.a) ((sf.d) bVar).d.get(i11)).f47874a[i10];
                }
            }
        }
        sf.b bVar2 = this.f46961d0;
        ((sf.d) bVar2).f47892m = new SegmentTree(((sf.d) bVar2).f47891l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
