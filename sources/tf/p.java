package tf;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import cg.c1;
import java.util.ArrayList;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.d91;
import org.telegram.ui.zk0;
public final class p extends g {
    public long[] f48315z1;

    public p(Context context, c6 c6Var) {
        super(context, c6Var);
        this.f48283s0 = true;
        this.f48284t0 = true;
    }

    @Override
    public final void C(int i10, int i11) {
        float f9;
        uf.b bVar = this.f48261d0;
        if (bVar != null) {
            int i12 = this.f48277o0;
            float f10 = this.C0;
            float f11 = (this.f48259c0.f48308k * f10) - g.f48234g1;
            uf.d dVar = (uf.d) bVar;
            float[] fArr = dVar.f49198b;
            if (fArr.length < 2) {
                f9 = 1.0f;
            } else {
                f9 = fArr[1] * f10;
            }
            float f12 = (i10 + f11) / (f10 - f9);
            if (f12 < 0.0f) {
                this.f48277o0 = 0;
            } else if (f12 > 1.0f) {
                this.f48277o0 = dVar.f49197a.length - 1;
            } else {
                int b10 = dVar.b(f12, this.B, this.C);
                this.f48277o0 = b10;
                int i13 = this.C;
                if (b10 > i13) {
                    this.f48277o0 = i13;
                }
                int i14 = this.f48277o0;
                int i15 = this.B;
                if (i14 < i15) {
                    this.f48277o0 = i15;
                }
            }
            if (i12 != this.f48277o0) {
                this.f48279q0 = true;
                c(true);
                x(f11);
                e eVar = this.M0;
                if (eVar != null) {
                    getSelectedDate();
                    d91 d91Var = (d91) ((zk0) eVar).f45255b;
                    d91Var.f();
                    d91Var.f37425b.f48278p0.d(false, false);
                }
                invalidate();
                B();
            }
        }
    }

    @Override
    public final void K() {
        if (g.f48250x1) {
            int length = ((uf.d) this.f48261d0).f49197a.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    vf.h hVar = (vf.h) arrayList.get(i11);
                    if (hVar.f49583n) {
                        j11 += hVar.f49572a.f49190a[i10];
                    }
                }
                if (j11 > j10) {
                    j10 = j11;
                }
            }
            if (j10 > 0) {
                float f9 = (float) j10;
                if (f9 != this.f48270h0) {
                    this.f48270h0 = f9;
                    Animator animator = this.W;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator e10 = g.e(this.f48267f0, this.f48270h0, new c1(this, 13));
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
    public final vf.f h(uf.a aVar) {
        return new vf.h(aVar, this.S0);
    }

    @Override
    public final void k(Canvas canvas) {
        float f9;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        int i10;
        Paint paint;
        float f13;
        int i11;
        int i12;
        Canvas canvas2 = canvas;
        uf.b bVar = this.f48261d0;
        if (bVar == null) {
            return;
        }
        float f14 = this.B0;
        j jVar = this.f48259c0;
        float f15 = jVar.f48309l;
        float f16 = jVar.f48308k;
        float f17 = f14 / (f15 - f16);
        float f18 = g.f48234g1;
        float f19 = (f16 * f17) - f18;
        float[] fArr = ((uf.d) bVar).f49198b;
        boolean z10 = true;
        if (fArr.length < 2) {
            f10 = 1.0f;
            f9 = 1.0f;
        } else {
            float f20 = fArr[1];
            float f21 = f20 * f17;
            f9 = (f17 - f21) * f20;
            f10 = f21;
        }
        int i13 = ((int) (f18 / f10)) + 1;
        int max = Math.max(0, (this.B - i13) - 2);
        int min = Math.min(((uf.d) this.f48261d0).f49198b.length - 1, this.C + i13 + 2);
        int i14 = 0;
        while (true) {
            arrayList = this.d;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((vf.f) arrayList.get(i14)).f49579j = 0;
            i14++;
        }
        canvas2.save();
        int i15 = this.f48285u0;
        if (i15 == 2) {
            this.f48256b0 = true;
            this.f48281r0 = 0.0f;
            vf.j jVar2 = this.f48286v0;
            float f22 = jVar2.f49593f;
            f12 = 1.0f - f22;
            f11 = 2.0f;
            canvas2.scale((f22 * 2.0f) + 1.0f, 1.0f, jVar2.d, jVar2.f49592e);
        } else {
            f11 = 2.0f;
            if (i15 == 1) {
                vf.j jVar3 = this.f48286v0;
                float f23 = jVar3.f49593f;
                canvas2.scale(f23, 1.0f, jVar3.d, jVar3.f49592e);
                f12 = f23;
            } else if (i15 == 3) {
                f12 = this.f48286v0.f49593f;
            } else {
                f12 = 1.0f;
            }
        }
        z10 = (this.f48277o0 < 0 || !this.f48279q0) ? false : false;
        while (true) {
            i10 = g.f48237j1;
            if (max > min) {
                break;
            }
            if (this.f48277o0 != max || !z10) {
                int i16 = 0;
                float f24 = 0.0f;
                while (i16 < arrayList.size()) {
                    vf.f fVar = (vf.f) arrayList.get(i16);
                    if (!fVar.f49583n && fVar.f49584o == 0.0f) {
                        i11 = min;
                        i12 = max;
                    } else {
                        long[] jArr = fVar.f49572a.f49190a;
                        float f25 = (((f17 - f10) * ((uf.d) this.f48261d0).f49198b[max]) + (f10 / f11)) - f19;
                        i11 = min;
                        i12 = max;
                        float measuredHeight = (((float) jArr[i12]) / this.v) * ((getMeasuredHeight() - this.f48282s) - i10) * fVar.f49584o;
                        float measuredHeight2 = (getMeasuredHeight() - this.f48282s) - measuredHeight;
                        float[] fArr2 = fVar.f49580k;
                        int i17 = fVar.f49579j;
                        int i18 = i17 + 1;
                        fVar.f49579j = i18;
                        fArr2[i17] = f25;
                        int i19 = i17 + 2;
                        fVar.f49579j = i19;
                        fArr2[i18] = measuredHeight2 - f24;
                        int i20 = i17 + 3;
                        fVar.f49579j = i20;
                        fArr2[i19] = f25;
                        fVar.f49579j = i17 + 4;
                        fArr2[i20] = (getMeasuredHeight() - this.f48282s) - f24;
                        f24 += measuredHeight;
                    }
                    i16++;
                    min = i11;
                    max = i12;
                }
            }
            max++;
            min = min;
        }
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            vf.h hVar = (vf.h) arrayList.get(i21);
            if (!z10 && !this.f48256b0) {
                paint = hVar.f49574c;
            } else {
                paint = hVar.f49586q;
            }
            if (z10) {
                f13 = 255.0f;
                hVar.f49586q.setColor(i0.a.d(this.f48281r0, hVar.f49582m, hVar.f49587r));
            } else {
                f13 = 255.0f;
            }
            if (this.f48256b0) {
                hVar.f49586q.setColor(i0.a.d(1.0f, hVar.f49582m, hVar.f49587r));
            }
            paint.setAlpha((int) (f12 * f13));
            paint.setStrokeWidth(f9);
            canvas2.drawLines(hVar.f49580k, 0, hVar.f49579j, paint);
        }
        if (z10) {
            int i22 = 0;
            float f26 = 0.0f;
            while (i22 < arrayList.size()) {
                vf.f fVar2 = (vf.f) arrayList.get(i22);
                boolean z11 = fVar2.f49583n;
                Paint paint2 = fVar2.f49574c;
                if (z11 || fVar2.f49584o != 0.0f) {
                    long[] jArr2 = fVar2.f49572a.f49190a;
                    float[] fArr3 = ((uf.d) this.f48261d0).f49198b;
                    int i23 = this.f48277o0;
                    float f27 = (((f17 - f10) * fArr3[i23]) + (f10 / f11)) - f19;
                    float measuredHeight3 = (((float) jArr2[i23]) / this.v) * ((getMeasuredHeight() - this.f48282s) - i10) * fVar2.f49584o;
                    paint2.setStrokeWidth(f9);
                    paint2.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawLine(f27, ((getMeasuredHeight() - this.f48282s) - measuredHeight3) - f26, f27, (getMeasuredHeight() - this.f48282s) - f26, paint2);
                    f26 += measuredHeight3;
                }
                i22++;
                canvas2 = canvas;
            }
        }
        canvas.restore();
    }

    @Override
    public final void n(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        int i10;
        int i11;
        uf.b bVar = this.f48261d0;
        if (bVar != null) {
            int length = ((uf.d) bVar).f49198b.length;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((vf.f) arrayList.get(i12)).f49579j = 0;
            }
            int max = Math.max(1, Math.round(length / 200.0f));
            long[] jArr = this.f48315z1;
            if (jArr == null || jArr.length < size) {
                this.f48315z1 = new long[size];
            }
            int i13 = 0;
            while (i13 < length) {
                float f12 = ((uf.d) this.f48261d0).f49198b[i13] * this.f48292y0;
                int i14 = 0;
                while (true) {
                    f10 = 0.0f;
                    if (i14 >= size) {
                        break;
                    }
                    vf.f fVar = (vf.f) arrayList.get(i14);
                    if (fVar.f49583n || fVar.f49584o != 0.0f) {
                        long j10 = fVar.f49572a.f49190a[i13];
                        long[] jArr2 = this.f48315z1;
                        if (j10 > jArr2[i14]) {
                            jArr2[i14] = j10;
                        }
                    }
                    i14++;
                }
                if (i13 % max == 0) {
                    int i15 = 0;
                    float f13 = 0.0f;
                    while (i15 < size) {
                        vf.f fVar2 = (vf.f) arrayList.get(i15);
                        if (!fVar2.f49583n && fVar2.f49584o == f10) {
                            i11 = length;
                            i10 = i13;
                        } else {
                            if (g.f48250x1) {
                                f11 = this.f48267f0;
                            } else {
                                f11 = (float) ((uf.d) this.f48261d0).f49200e;
                            }
                            long[] jArr3 = this.f48315z1;
                            i10 = i13;
                            float f14 = (((float) jArr3[i15]) / f11) * fVar2.f49584o;
                            int i16 = this.f48290x0;
                            float f15 = f14 * i16;
                            float[] fArr = fVar2.f49580k;
                            int i17 = fVar2.f49579j;
                            int i18 = i17 + 1;
                            fVar2.f49579j = i18;
                            fArr[i17] = f12;
                            int i19 = i17 + 2;
                            fVar2.f49579j = i19;
                            i11 = length;
                            fArr[i18] = (i16 - f15) - f13;
                            int i20 = i17 + 3;
                            fVar2.f49579j = i20;
                            fArr[i19] = f12;
                            fVar2.f49579j = i17 + 4;
                            fArr[i20] = i16 - f13;
                            f13 += f15;
                            jArr3[i15] = 0;
                        }
                        i15++;
                        i13 = i10;
                        length = i11;
                        f10 = 0.0f;
                    }
                }
                i13++;
                length = length;
            }
            uf.b bVar2 = this.f48261d0;
            if (((uf.d) bVar2).f49198b.length < 2) {
                f9 = 1.0f;
            } else {
                f9 = ((uf.d) bVar2).f49198b[1] * this.f48292y0;
            }
            for (int i21 = 0; i21 < size; i21++) {
                vf.f fVar3 = (vf.f) arrayList.get(i21);
                Paint paint = fVar3.f49574c;
                Paint paint2 = fVar3.f49574c;
                paint.setStrokeWidth(max * f9);
                paint2.setAlpha(255);
                canvas.drawLines(fVar3.f49580k, 0, fVar3.f49579j, paint2);
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
    public final long r(int i10, int i11) {
        return ((uf.d) this.f48261d0).f49208m.rMaxQ(i10, i11);
    }

    @Override
    public final void u() {
        super.u();
        this.f48267f0 = 0.0f;
        int length = ((uf.d) this.f48261d0).f49197a.length;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                vf.h hVar = (vf.h) arrayList.get(i11);
                if (hVar.f49583n) {
                    j10 += hVar.f49572a.f49190a[i10];
                }
            }
            float f9 = (float) j10;
            if (f9 > this.f48267f0) {
                this.f48267f0 = f9;
            }
        }
    }

    @Override
    public final void z() {
        int length = ((uf.a) ((uf.d) this.f48261d0).d.get(0)).f49190a.length;
        int size = ((uf.d) this.f48261d0).d.size();
        ((uf.d) this.f48261d0).f49207l = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            ((uf.d) this.f48261d0).f49207l[i10] = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((vf.h) this.d.get(i11)).f49583n) {
                    uf.b bVar = this.f48261d0;
                    long[] jArr = ((uf.d) bVar).f49207l;
                    jArr[i10] = jArr[i10] + ((uf.a) ((uf.d) bVar).d.get(i11)).f49190a[i10];
                }
            }
        }
        uf.b bVar2 = this.f48261d0;
        ((uf.d) bVar2).f49208m = new SegmentTree(((uf.d) bVar2).f49207l);
        super.z();
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
