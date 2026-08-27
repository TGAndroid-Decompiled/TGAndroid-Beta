package rf;

import ag.q1;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;

public final class k extends g {
    @Override
    public final void K() {
        if (g.f46950x1) {
            ArrayList arrayList = this.d;
            int i10 = 0;
            if (((tf.f) arrayList.get(0)).f48206n) {
                super.K();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tf.f fVar = (tf.f) obj;
                if (fVar.f48206n) {
                    long j11 = fVar.f48195a.f47877e;
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
            }
            if (arrayList.size() > 1) {
                j10 = (long) (j10 * ((sf.c) this.f46961d0).f47890l[1]);
            }
            if (j10 > 0) {
                float f10 = j10;
                if (f10 != this.f46970h0) {
                    this.f46970h0 = f10;
                    Animator animator = this.W;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator valueAnimatorE = g.e(this.f46967f0, this.f46970h0, new q1(this, 12));
                    this.W = valueAnimatorE;
                    valueAnimatorE.start();
                }
            }
        }
    }

    @Override
    public final tf.d f(int i10, long j10, long j11) {
        float f10;
        float[] fArr = ((sf.c) this.f46961d0).f47890l;
        if (fArr.length < 2) {
            f10 = 1.0f;
        } else {
            f10 = fArr[fArr[0] == 1.0f ? (char) 1 : (char) 0];
        }
        return new tf.d(j10, j11, this.L0, f10, i10, this.J, this.K);
    }

    @Override
    public final tf.f h(sf.a aVar) {
        return new tf.f(aVar, false, this.S0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f10;
        boolean z10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10;
        boolean z11;
        if (this.f46961d0 == null) {
            return;
        }
        float f15 = this.B0;
        j jVar = this.f46959c0;
        float f16 = jVar.f47009l;
        float f17 = jVar.f47008k;
        float f18 = f15 / (f16 - f17);
        float f19 = g.f46934g1;
        float f20 = (f17 * f18) - f19;
        canvas.save();
        int i11 = this.f46985u0;
        int i12 = 2;
        if (i11 == 2) {
            tf.j jVar2 = this.f46986v0;
            float f21 = jVar2.f48216f;
            f10 = f21 > 0.5f ? 0.0f : 1.0f - (f21 * 2.0f);
            canvas.scale((f21 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f48215e);
        } else if (i11 == 1) {
            float f22 = this.f46986v0.f48216f;
            f10 = f22 < 0.3f ? 0.0f : f22;
            canvas.save();
            tf.j jVar3 = this.f46986v0;
            float f23 = jVar3.f48216f;
            canvas.scale(f23, f23, jVar3.d, jVar3.f48215e);
        } else {
            f10 = i11 == 3 ? this.f46986v0.f48216f : 1.0f;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i14 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            tf.f fVar = (tf.f) arrayList.get(i14);
            boolean z12 = fVar.f48206n;
            float[] fArr = fVar.f48203k;
            Path path = fVar.f48199f;
            Paint paint = fVar.f48197c;
            if (z12 || fVar.f48207o != 0.0f) {
                long[] jArr = fVar.f48195a.f47874a;
                path.reset();
                float[] fArr2 = ((sf.c) this.f46961d0).f47882b;
                int i15 = ((int) (f19 / (fArr2.length < i12 ? 1.0f : fArr2[1] * f18))) + 1;
                int iMax = Math.max(i13, this.B - i15);
                int iMin = Math.min(((sf.c) this.f46961d0).f47882b.length - 1, this.C + i15);
                boolean z13 = true;
                int i16 = 0;
                while (true) {
                    z10 = g.f46949w1;
                    if (iMax > iMin) {
                        break;
                    }
                    float f24 = f18;
                    float f25 = f20;
                    long j10 = jArr[iMax];
                    if (j10 < 0) {
                        f14 = f19;
                        i10 = iMin;
                        z11 = z13;
                    } else {
                        f14 = f19;
                        sf.c cVar = (sf.c) this.f46961d0;
                        i10 = iMin;
                        float f26 = (cVar.f47882b[iMax] * f24) - f25;
                        float f27 = j10 * cVar.f47890l[i14];
                        float f28 = this.f46987w;
                        float f29 = (f27 - f28) / (this.v - f28);
                        float strokeWidth = paint.getStrokeWidth() / 2.0f;
                        z11 = z13;
                        float fB = pa.b((getMeasuredHeight() - this.f46982s) - g.f46937j1, strokeWidth, f29, (getMeasuredHeight() - this.f46982s) - strokeWidth);
                        if (!z10) {
                            if (z11) {
                                path.moveTo(f26, fB);
                                z13 = false;
                            } else {
                                path.lineTo(f26, fB);
                            }
                            iMax++;
                            f18 = f24;
                            f20 = f25;
                            f19 = f14;
                            iMin = i10;
                        } else if (i16 == 0) {
                            int i17 = i16 + 1;
                            fArr[i16] = f26;
                            i16 += 2;
                            fArr[i17] = fB;
                        } else {
                            fArr[i16] = f26;
                            fArr[i16 + 1] = fB;
                            int i18 = i16 + 3;
                            fArr[i16 + 2] = f26;
                            i16 += 4;
                            fArr[i18] = fB;
                        }
                    }
                    z13 = z11;
                    iMax++;
                    f18 = f24;
                    f20 = f25;
                    f19 = f14;
                    iMin = i10;
                }
                f11 = f18;
                f12 = f20;
                f13 = f19;
                if (this.C - this.B > 100) {
                    paint.setStrokeCap(Paint.Cap.SQUARE);
                } else {
                    paint.setStrokeCap(Paint.Cap.ROUND);
                }
                paint.setAlpha((int) (fVar.f48207o * 255.0f * f10));
                if (z10) {
                    canvas.drawLines(fArr, 0, i16, paint);
                } else {
                    canvas.drawPath(path, paint);
                }
            } else {
                f11 = f18;
                f12 = f20;
                f13 = f19;
            }
            i14++;
            f18 = f11;
            f20 = f12;
            f19 = f13;
            i13 = 0;
            i12 = 2;
        }
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z10;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        int measuredHeight = getMeasuredHeight();
        int i14 = g.f46939m1;
        int i15 = measuredHeight - i14;
        int measuredHeight2 = (getMeasuredHeight() - this.f46990x0) - i14;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        if (this.f46961d0 != null) {
            int i16 = 0;
            while (i16 < size) {
                tf.f fVar = (tf.f) arrayList2.get(i16);
                boolean z11 = fVar.f48206n;
                Paint paint = fVar.f48196b;
                float[] fArr = fVar.f48204l;
                Path path = fVar.f48198e;
                if (z11 || fVar.f48207o != 0.0f) {
                    path.reset();
                    int length = ((sf.c) this.f46961d0).f47882b.length;
                    long[] jArr = fVar.f48195a.f47874a;
                    fVar.f48199f.reset();
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        z10 = g.f46949w1;
                        if (i18 >= length) {
                            break;
                        }
                        int i19 = i16;
                        long j10 = jArr[i18];
                        if (j10 < 0) {
                            i13 = i15;
                            arrayList2 = arrayList2;
                            measuredHeight2 = measuredHeight2;
                        } else {
                            i13 = i15;
                            sf.b bVar = this.f46961d0;
                            float f10 = this.f46992y0 * ((sf.c) bVar).f47882b[i18];
                            float f11 = (1.0f - ((j10 * ((sf.c) bVar).f47890l[i19]) / (g.f46950x1 ? this.f46967f0 : ((sf.c) bVar).f47884e))) * (i13 - measuredHeight2);
                            if (z10) {
                                if (i17 == 0) {
                                    int i20 = i17 + 1;
                                    fArr[i17] = f10;
                                    i17 += 2;
                                    fArr[i20] = f11;
                                } else {
                                    fArr[i17] = f10;
                                    fArr[i17 + 1] = f11;
                                    int i21 = i17 + 3;
                                    fArr[i17 + 2] = f10;
                                    i17 += 4;
                                    fArr[i21] = f11;
                                }
                            } else if (i18 == 0) {
                                path.moveTo(f10, f11);
                            } else {
                                path.lineTo(f10, f11);
                            }
                        }
                        i18++;
                        i16 = i19;
                        i15 = i13;
                        arrayList2 = arrayList2;
                        measuredHeight2 = measuredHeight2;
                    }
                    i10 = i15;
                    arrayList = arrayList2;
                    i11 = measuredHeight2;
                    i12 = i16;
                    fVar.f48202j = i17;
                    if (fVar.f48206n || fVar.f48207o != 0.0f) {
                        paint.setAlpha((int) (fVar.f48207o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f48202j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                    i16 = i12 + 1;
                    i15 = i10;
                    arrayList2 = arrayList;
                    measuredHeight2 = i11;
                } else {
                    i10 = i15;
                    arrayList = arrayList2;
                    i11 = measuredHeight2;
                    i12 = i16;
                }
                i16 = i12 + 1;
                i15 = i10;
                arrayList2 = arrayList;
                measuredHeight2 = i11;
            }
        }
    }

    @Override
    public final void o(Canvas canvas) {
        int i10 = this.f46977o0;
        if (i10 < 0 || !this.f46979q0) {
            return;
        }
        int i11 = (int) (this.f46980r * this.f46981r0);
        float f10 = this.B0;
        j jVar = this.f46959c0;
        float f11 = jVar.f47009l;
        float f12 = jVar.f47008k;
        float f13 = f10 / (f11 - f12);
        float f14 = (((sf.c) this.f46961d0).f47882b[i10] * f13) - ((f12 * f13) - g.f46934g1);
        Paint paint = this.I;
        paint.setAlpha(i11);
        canvas.drawLine(f14, 0.0f, f14, this.D0.bottom, paint);
        ArrayList arrayList = this.d;
        this.f46971i0 = arrayList.size();
        int i12 = 0;
        while (true) {
            this.f46972j0 = i12;
            int i13 = this.f46972j0;
            if (i13 >= this.f46971i0) {
                return;
            }
            tf.f fVar = (tf.f) arrayList.get(i13);
            boolean z10 = fVar.f48206n;
            Paint paint2 = fVar.d;
            if (z10 || fVar.f48207o != 0.0f) {
                float f15 = fVar.f48195a.f47874a[this.f46977o0] * ((sf.c) this.f46961d0).f47890l[this.f46972j0];
                float f16 = this.f46987w;
                float measuredHeight = (getMeasuredHeight() - this.f46982s) - (((f15 - f16) / (this.v - f16)) * ((getMeasuredHeight() - this.f46982s) - g.f46937j1));
                paint2.setAlpha((int) (fVar.f48207o * 255.0f * this.f46981r0));
                int i14 = (int) (fVar.f48207o * 255.0f * this.f46981r0);
                Paint paint3 = this.O;
                paint3.setAlpha(i14);
                canvas.drawPoint(f14, measuredHeight, paint2);
                canvas.drawPoint(f14, measuredHeight, paint3);
            }
            i12 = this.f46972j0 + 1;
        }
    }

    @Override
    public final void p(Canvas canvas, tf.d dVar) {
        float f10;
        float f11;
        float f12;
        int i10;
        TextPaint textPaint;
        int textSize;
        int i11;
        CharSequence[] charSequenceArr;
        int i12;
        int i13;
        int i14;
        tf.d dVar2 = dVar;
        long[] jArr = dVar2.f48178a;
        CharSequence[] charSequenceArr2 = dVar2.f48180c;
        int length = jArr.length;
        int i15 = 0;
        int i16 = ((sf.c) this.f46961d0).f47890l[0] == 1.0f ? 1 : 0;
        int i17 = (i16 + 1) % 2;
        if (length > 2) {
            float f13 = (jArr[1] - jArr[0]) / (this.v - this.f46987w);
            if (f13 < 0.1d) {
                f10 = f13 / 0.1f;
            } else {
                f10 = 1.0f;
            }
        } else {
            f10 = 1.0f;
        }
        int i18 = this.f46985u0;
        if (i18 != 2) {
            if (i18 == 1 || i18 == 3) {
                f12 = this.f46986v0.f48216f;
            } else {
                f11 = 1.0f;
            }
            this.H.setAlpha((int) (dVar2.f48182f * 0.1f * f11));
            int measuredHeight = getMeasuredHeight() - this.f46982s;
            int i19 = g.f46937j1;
            i10 = measuredHeight - i19;
            textPaint = this.J;
            textSize = (int) (i19 - textPaint.getTextSize());
            while (i15 < length) {
                float measuredHeight2 = getMeasuredHeight() - this.f46982s;
                i11 = i17;
                float f14 = dVar2.f48178a[i15];
                float f15 = this.f46987w;
                int i20 = (int) (measuredHeight2 - (((f14 - f15) / (this.v - f15)) * i10));
                charSequenceArr = dVar2.f48179b;
                ArrayList arrayList = this.d;
                if (charSequenceArr != null || arrayList.size() <= 0) {
                    i12 = textSize;
                    i13 = i11;
                } else {
                    if (charSequenceArr2 == null || arrayList.size() < 2) {
                        i14 = i11;
                        textPaint.setColor(g6.v0(g6.Yi, this.S0));
                        textPaint.setAlpha((int) com.google.android.recaptcha.internal.a.C(dVar2.f48182f, this.f46966f, f11, f10));
                    } else {
                        i14 = i11;
                        textPaint.setColor(((tf.f) arrayList.get(i14)).f48205m);
                        textPaint.setAlpha((int) com.google.android.recaptcha.internal.a.C(dVar2.f48182f, ((tf.f) arrayList.get(i14)).f48207o, f11, f10));
                    }
                    i13 = i14;
                    i12 = textSize;
                    dVar2.a(canvas, 0, i15, g.f46934g1, i20 - textSize, textPaint);
                }
                if (charSequenceArr2 == null && arrayList.size() > 1) {
                    int i21 = ((tf.f) arrayList.get(i16)).f48205m;
                    TextPaint textPaint2 = this.K;
                    textPaint2.setColor(i21);
                    textPaint2.setAlpha((int) com.google.android.recaptcha.internal.a.C(dVar2.f48182f, ((tf.f) arrayList.get(i16)).f48207o, f11, f10));
                    dVar2.a(canvas, 1, i15, getMeasuredWidth() - g.f46934g1, i20 - i12, textPaint2);
                }
                i15++;
                dVar2 = dVar;
                i10 = i10;
                i17 = i13;
                textSize = i12;
                textPaint = textPaint;
            }
        }
        f12 = 1.0f - this.f46986v0.f48216f;
        f11 = f12;
        this.H.setAlpha((int) (dVar2.f48182f * 0.1f * f11));
        int measuredHeight3 = getMeasuredHeight() - this.f46982s;
        int i110 = g.f46937j1;
        i10 = measuredHeight3 - i110;
        textPaint = this.J;
        textSize = (int) (i110 - textPaint.getTextSize());
        while (i15 < length) {
            float measuredHeight4 = getMeasuredHeight() - this.f46982s;
            i11 = i17;
            float f16 = dVar2.f48178a[i15];
            float f17 = this.f46987w;
            int i22 = (int) (measuredHeight4 - (((f16 - f17) / (this.v - f17)) * i10));
            charSequenceArr = dVar2.f48179b;
            ArrayList arrayList2 = this.d;
            if (charSequenceArr != null) {
                i12 = textSize;
                i13 = i11;
            } else {
                i12 = textSize;
                i13 = i11;
            }
            if (charSequenceArr2 == null) {
            }
            i15++;
            dVar2 = dVar;
            i10 = i10;
            i17 = i13;
            textSize = i12;
            textPaint = textPaint;
        }
    }

    @Override
    public final long r(int i10, int i11) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j10 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            long jRMaxQ = ((tf.f) arrayList.get(i12)).f48206n ? (long) (((sf.a) ((sf.c) this.f46961d0).d.get(i12)).f47875b.rMaxQ(i10, i11) * ((sf.c) this.f46961d0).f47890l[i12]) : 0L;
            if (jRMaxQ > j10) {
                j10 = jRMaxQ;
            }
        }
        return j10;
    }

    @Override
    public final long s(int i10, int i11) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            long jRMinQ = ((tf.f) arrayList.get(i12)).f48206n ? (int) (((sf.a) ((sf.c) this.f46961d0).d.get(i12)).f47875b.rMinQ(i10, i11) * ((sf.c) this.f46961d0).f47890l[i12]) : 2147483647L;
            if (jRMinQ < j10) {
                j10 = jRMinQ;
            }
        }
        return j10;
    }

    @Override
    public final void t() {
        this.L0 = true;
        super.t();
    }
}
