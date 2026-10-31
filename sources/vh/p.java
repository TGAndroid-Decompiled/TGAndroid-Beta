package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.messenger.sc;
import org.telegram.messenger.vp;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.z60;
public abstract class p extends k {
    public static final int[] P1 = {21600, 43200, 86400, 172800};
    public q20 A1;
    public q20 B1;
    public n C1;
    public float D1;
    public float E1;
    public final org.telegram.ui.Components.t5 F1;
    public final org.telegram.ui.Components.t5 G1;
    public final org.telegram.ui.Components.t5 H1;
    public final org.telegram.ui.Components.t5 I1;
    public boolean J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public final l O1;
    public final ImageView R0;
    public final ImageView S0;
    public final j T0;
    public z60 U0;
    public boolean V0;
    public int W0;
    public Drawable X0;
    public boolean Y0;
    public final o Z0;
    public final org.telegram.ui.Components.e6 f51689a1;
    public float f51690b1;
    public float f51691c1;
    public long f51692d1;
    public final Paint f51693e1;
    public final Paint f51694f1;
    public final m9 f51695g1;
    public final m9 f51696h1;
    public final Drawable f51697i1;
    public float f51698j1;
    public final org.telegram.ui.Components.t5 f51699k1;
    public final Path l1;
    public final Path f51700m1;
    public final Paint f51701n1;
    public final Paint f51702o1;
    public final Paint f51703p1;
    public final Paint f51704q1;
    public final org.telegram.ui.Components.t5 f51705r1;
    public final RectF f51706s1;
    public final RectF f51707t1;
    public final RectF f51708u1;
    public final Path f51709v1;
    public qz0 f51710w1;
    public Path f51711x1;
    public Paint f51712y1;
    public qz0 f51713z1;

    public p(Context context, FrameLayout frameLayout, uu0 uu0Var, FrameLayout frameLayout2, th.b bVar, s9 s9Var) {
        super(context, frameLayout, uu0Var, frameLayout2, bVar, s9Var);
        this.V0 = true;
        this.W0 = 0;
        e8 e8Var = (e8) this;
        this.Z0 = new o(e8Var, e8Var);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.f51689a1 = e6Var;
        gr grVar = gr.f26495f;
        e6Var.n(0.16f, 50L, grVar);
        e6Var.w(org.telegram.messenger.i0.L(15.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.t("0:00.0", true, true);
        e6Var.u(-1);
        Paint paint = new Paint(1);
        this.f51693e1 = paint;
        Paint paint2 = new Paint(1);
        this.f51694f1 = paint2;
        m9 m9Var = new m9(11, 360928);
        this.f51695g1 = m9Var;
        m9 m9Var2 = new m9(12, 360928);
        this.f51696h1 = m9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        m9Var.f28380a = org.telegram.messenger.i0.L(47.0f);
        m9Var.f28381b = org.telegram.messenger.i0.L(55.0f);
        m9Var.b();
        m9Var2.f28380a = org.telegram.messenger.i0.L(47.0f);
        m9Var2.f28381b = org.telegram.messenger.i0.L(55.0f);
        m9Var2.b();
        this.f51697i1 = getContext().getResources().getDrawable(2131231516).mutate();
        this.f51699k1 = new org.telegram.ui.Components.t5(new l(e8Var, 0), 200L, grVar, 0);
        this.l1 = new Path();
        this.f51700m1 = new Path();
        this.f51701n1 = new Paint(1);
        this.f51702o1 = new Paint(1);
        this.f51703p1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f51704q1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        l lVar = new l(e8Var, 0);
        gr grVar2 = gr.h;
        this.f51705r1 = new org.telegram.ui.Components.t5(lVar, 350L, grVar2);
        this.f51706s1 = new RectF();
        this.f51707t1 = new RectF();
        this.f51708u1 = new RectF();
        this.f51709v1 = new Path();
        this.F1 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar2);
        this.G1 = new org.telegram.ui.Components.t5(new l(e8Var, 0), 420L, grVar2, 0);
        this.H1 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar2);
        this.I1 = new org.telegram.ui.Components.t5(new l(e8Var, 0), 350L, grVar2, 0);
        this.O1 = new l(e8Var, 1);
        ImageView imageView = new ImageView(context);
        this.R0 = imageView;
        imageView.setImageResource(2131231517);
        imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, org.telegram.messenger.i0.L(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(cd.L0(2131754736, null));
        addView(imageView, w7.b6.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new rh.s(e8Var, 18));
        ImageView imageView2 = new ImageView(context);
        this.S0 = imageView2;
        j jVar = new j(5);
        this.T0 = jVar;
        imageView2.setImageDrawable(jVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, org.telegram.messenger.i0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(cd.L0(2131744609, null));
        A(86400, false);
        addView(imageView2, w7.b6.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new rh.e7(e8Var, frameLayout, bVar, 6));
    }

    public final void A(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            if (i11 < 4) {
                if (P1[i11] == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = 2;
                break;
            }
        }
        if (this.W0 == i11) {
            return;
        }
        this.W0 = i11;
        this.T0.d(i10 / 3600, false, z10);
    }

    public final void B() {
        if (this.Y0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f51332a);
            String L0 = cd.L0(2131744524, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = cd.L0(2131744525, null);
            alertDialog$Builder.k(cd.L0(2131746336, null), new rh.d0(this, 23));
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, this.f51332a);
            }
        }
    }

    @Override
    public final int b() {
        return 36;
    }

    @Override
    public final void c(boolean z10) {
        int i10;
        int i11 = 0;
        if (!z10 && this.V0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.S0;
        imageView.setVisibility(i10);
        if (z10) {
            i11 = 8;
        }
        this.R0.setVisibility(i11);
        if (z10) {
            imageView.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z10) {
        int i10;
        if (!z10) {
            if (this.V0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.S0.setVisibility(i10);
            this.R0.setVisibility(0);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: vh.p.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getCaptionDefaultLimit() {
        return vp.r1(this.U).W4;
    }

    @Override
    public int getCaptionPremiumLimit() {
        return vp.r1(this.U).X4;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override
    public final void j(Canvas canvas, RectF rectF) {
        String str;
        float f7;
        float f10;
        float f11;
        Paint paint;
        float f12;
        String str2;
        Canvas canvas2;
        int i10;
        int i11;
        Canvas canvas3 = canvas;
        if (this.C1 != null) {
            float d = this.F1.d(this.J1);
            float d10 = this.H1.d(this.L1);
            if (this.f51692d1 <= 0) {
                this.f51692d1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin((((float) (System.currentTimeMillis() - this.f51692d1)) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float L = rectF.left + org.telegram.messenger.i0.L(21.0f);
            float L2 = rectF.bottom - org.telegram.messenger.i0.L(20.0f);
            o oVar = this.Z0;
            oVar.setBounds((int) (L - org.telegram.messenger.i0.L(12.0f)), (int) (L2 - org.telegram.messenger.i0.L(12.0f)), (int) (L + org.telegram.messenger.i0.L(12.0f)), (int) (L2 + org.telegram.messenger.i0.L(12.0f)));
            oVar.draw(canvas3);
            int L3 = (int) ((rectF.bottom - org.telegram.messenger.i0.L(20.0f)) + org.telegram.messenger.i0.L(9.0f));
            org.telegram.ui.Components.e6 e6Var = this.f51689a1;
            e6Var.setBounds((int) ((rectF.left + org.telegram.messenger.i0.L(33.3f)) - (org.telegram.messenger.i0.L(10.0f) * d)), (int) ((rectF.bottom - org.telegram.messenger.i0.L(20.0f)) - org.telegram.messenger.i0.L(9.0f)), (int) (rectF.left + org.telegram.messenger.i0.L(133.3f)), L3);
            long b10 = this.C1.b();
            int i12 = (int) (b10 / 1000);
            int i13 = (int) ((b10 - (i12 * 1000)) / 100);
            int i14 = i12 / 60;
            int i15 = i12 % 60;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i14);
            sb2.append(":");
            if (i15 < 10) {
                str = "0";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(i15);
            sb2.append(".");
            sb2.append(i13);
            e6Var.t(sb2.toString(), true, true);
            e6Var.B = (int) ((1.0f - d) * 255.0f);
            e6Var.draw(canvas3);
            float f13 = 1.0f - d10;
            float f14 = (1.0f - this.f51690b1) * f13;
            Paint c10 = this.P.c(1.0f);
            if (c10 != null) {
                f10 = 10.0f;
                paint = c10;
                f7 = 12.0f;
                f11 = f14;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                f7 = 12.0f;
                f10 = 10.0f;
                f11 = f14;
                paint = c10;
            }
            if (f11 > 0.0f) {
                if (this.f51710w1 == null) {
                    this.f51710w1 = new qz0(cd.L0(2131745331, null), 15.0f, null);
                }
                if (this.f51711x1 == null) {
                    Path path = new Path();
                    this.f51711x1 = path;
                    path.moveTo(org.telegram.messenger.i0.L(3.83f), 0.0f);
                    this.f51711x1.lineTo(0.0f, org.telegram.messenger.i0.L(5.0f));
                    this.f51711x1.lineTo(org.telegram.messenger.i0.L(3.83f), org.telegram.messenger.i0.L(f10));
                    Paint paint2 = new Paint(1);
                    this.f51712y1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.f51712y1.setStrokeCap(Paint.Cap.ROUND);
                    this.f51712y1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.f51712y1.setStrokeWidth(org.telegram.messenger.i0.L(1.33f));
                this.f51710w1.f29784p = (int) ((rectF.width() - org.telegram.messenger.i0.L(116.0f)) - e6Var.c());
                float z10 = sc.e.z(1.0f, this.f51690b1, org.telegram.messenger.i0.L(6.0f) * sin, (rectF.centerX() - ((this.f51710w1.k() + org.telegram.messenger.i0.L(11.33f)) / 2.0f)) - (org.telegram.messenger.i0.T1(this.f51690b1, 1.0f, d10) * (rectF.width() / 6.0f)));
                if (paint != null) {
                    i11 = -1;
                } else {
                    i11 = -2130706433;
                }
                int r12 = org.telegram.ui.ActionBar.t6.r1(f11, i11);
                canvas3.save();
                canvas3.translate(z10, rectF.centerY() - org.telegram.messenger.i0.L(5.0f));
                this.f51712y1.setColor(r12);
                canvas3.drawPath(this.f51711x1, this.f51712y1);
                canvas3.restore();
                str2 = null;
                f12 = 15.0f;
                this.f51710w1.c(z10 + org.telegram.messenger.i0.L(11.33f), rectF.centerY(), 1.0f, r12, canvas3);
            } else {
                f12 = 15.0f;
                str2 = null;
            }
            if (d10 > 0.0f) {
                if (this.f51713z1 == null) {
                    this.f51713z1 = new qz0(cd.L0(2131752570, str2), f12, org.telegram.messenger.i0.o());
                }
                this.f51713z1.f29784p = (int) ((rectF.width() - org.telegram.messenger.i0.L(116.0f)) - e6Var.c());
                float width = ((rectF.width() / 4.0f) * f13) + (rectF.centerX() - (this.f51713z1.k() / 2.0f));
                if (paint != null) {
                    i10 = -1;
                } else {
                    i10 = -2130706433;
                }
                canvas2 = canvas;
                this.f51713z1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.t6.r1(d10, i10), canvas2);
                this.f51707t1.set(width - org.telegram.messenger.i0.L(f7), rectF.top, this.f51713z1.k() + width + org.telegram.messenger.i0.L(f7), rectF.bottom);
            } else {
                canvas2 = canvas;
            }
            if (paint != null) {
                canvas2.drawRect(rectF, paint);
                canvas2.restore();
            }
            invalidate();
        }
    }

    @Override
    public final void k(Canvas canvas, RectF rectF, float f7) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z10;
        if (f7 <= 0.0f) {
            return;
        }
        boolean z11 = this.J1;
        org.telegram.ui.Components.t5 t5Var = this.G1;
        float d = t5Var.d(z11);
        boolean z12 = this.L1;
        org.telegram.ui.Components.t5 t5Var2 = this.I1;
        float d10 = t5Var2.d(z12);
        float e = this.f51699k1.e(false, this.f51698j1);
        float z13 = c3.i0.z(1.0f, this.f51690b1, org.telegram.messenger.i0.L(30.0f) * e, org.telegram.messenger.i0.L(41.0f));
        float f18 = 1.0f - d;
        float f19 = z13 * f18 * f7;
        float T1 = org.telegram.messenger.i0.T1(sc.e.z(1.0f, d10, getWidth() * 0.35f * this.f51690b1, rectF.right - org.telegram.messenger.i0.L(20.0f)), rectF.left + org.telegram.messenger.i0.L(20.0f), d);
        float L = rectF.bottom - org.telegram.messenger.i0.L(20.0f);
        boolean e7 = sc.e(360928);
        Paint paint = this.f51694f1;
        if (e7) {
            m9 m9Var = this.f51695g1;
            m9Var.f28380a = org.telegram.messenger.i0.L(47.0f);
            Paint paint2 = m9Var.d;
            f10 = 0.0f;
            m9Var.f28381b = (org.telegram.messenger.i0.L(15.0f) * 0.6f) + org.telegram.messenger.i0.L(47.0f);
            f11 = d10;
            m9 m9Var2 = this.f51696h1;
            m9Var2.f28380a = org.telegram.messenger.i0.L(50.0f);
            Paint paint3 = m9Var2.d;
            f12 = f18;
            m9Var2.f28381b = (org.telegram.messenger.i0.L(12.0f) * 0.6f) + org.telegram.messenger.i0.L(50.0f);
            m9Var2.e(e, 1.01f);
            m9Var.e(e, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.t6.r1(0.15f * f7, paint.getColor()));
            canvas.save();
            float f20 = f19 / m9Var2.f28380a;
            canvas.scale(f20, f20, T1, L);
            m9Var2.a(T1, L, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f * f7, paint.getColor()));
            canvas.save();
            float f21 = f19 / m9Var.f28380a;
            canvas.scale(f21, f21, T1, L);
            m9Var.a(T1, L, canvas, paint2);
            canvas.restore();
        } else {
            f10 = 0.0f;
            f11 = d10;
            f12 = f18;
        }
        float min = Math.min(f19, org.telegram.messenger.i0.L(55.0f));
        float f22 = f7 * 255.0f;
        paint.setAlpha((int) f22);
        canvas.drawCircle(T1, L, min, paint);
        canvas.save();
        Path path = this.l1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(T1, L, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.f51697i1;
        float intrinsicWidth = (drawable.getIntrinsicWidth() / 2.0f) * f12;
        if (this.K1) {
            f13 = f7;
        } else {
            f13 = 1.0f;
        }
        int i10 = (int) (T1 - (intrinsicWidth * f13));
        float intrinsicHeight = (drawable.getIntrinsicHeight() / 2.0f) * f12;
        if (this.K1) {
            f14 = f7;
        } else {
            f14 = 1.0f;
        }
        int i11 = (int) (L - (intrinsicHeight * f14));
        float intrinsicWidth2 = (drawable.getIntrinsicWidth() / 2.0f) * f12;
        if (this.K1) {
            f15 = f7;
        } else {
            f15 = 1.0f;
        }
        int i12 = (int) ((intrinsicWidth2 * f15) + T1);
        float intrinsicHeight2 = (drawable.getIntrinsicHeight() / 2.0f) * f12;
        if (this.K1) {
            f16 = f7;
        } else {
            f16 = 1.0f;
        }
        drawable.setBounds(i10, i11, i12, (int) ((intrinsicHeight2 * f16) + L));
        float f23 = f12 * 255.0f;
        if (this.K1) {
            f17 = f7;
        } else {
            f17 = 1.0f;
        }
        drawable.setAlpha((int) (f23 * f17));
        drawable.draw(canvas);
        if (f11 > f10) {
            float N = (org.telegram.messenger.i0.N(19.33f) / 2.0f) * f11 * f7;
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(T1 - N, L - N, T1 + N, L + N);
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(5.33f), org.telegram.messenger.i0.L(5.33f), this.f51693e1);
        }
        canvas.restore();
        float f24 = t5Var.f30445c;
        float f25 = t5Var2.f30445c;
        if (this.f51690b1 < 0.4f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float A = org.telegram.messenger.m5.A(1.0f, f24, org.telegram.messenger.i0.T1(this.f51705r1.d(z10), f10, f25), f7);
        float L2 = rectF.right - org.telegram.messenger.i0.L(20.0f);
        float W1 = (org.telegram.messenger.i0.W1(f25, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(36.0f)) * A) / 2.0f;
        float f26 = 1.0f - f25;
        float T12 = org.telegram.messenger.i0.T1(((rectF.bottom - org.telegram.messenger.i0.L(80.0f)) - W1) - ((org.telegram.messenger.i0.L(120.0f) * this.f51691c1) * f26), rectF.bottom - org.telegram.messenger.i0.L(20.0f), 1.0f - A);
        float L3 = (org.telegram.messenger.i0.L(36.0f) * A) / 2.0f;
        RectF rectF3 = this.f51706s1;
        rectF3.set(L2 - L3, T12 - W1, L3 + L2, W1 + T12);
        float W12 = org.telegram.messenger.i0.W1(f25, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(14.0f));
        int r12 = org.telegram.ui.ActionBar.t6.r1(A, 536870912);
        Paint paint4 = this.f51702o1;
        paint4.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), r12);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, W12, W12, paint4);
        Paint c10 = this.R.c(A);
        if (c10 == null) {
            Paint paint5 = this.f51701n1;
            paint5.setColor(1073741824);
            paint5.setAlpha((int) (64.0f * A));
            canvas.drawRoundRect(rectF3, W12, W12, paint5);
        } else {
            canvas.drawRoundRect(rectF3, W12, W12, c10);
            Paint paint6 = this.e;
            paint6.setAlpha((int) (51.0f * A));
            canvas.drawRoundRect(rectF3, W12, W12, paint6);
        }
        canvas.save();
        canvas.scale(A, A, L2, T12);
        int r13 = org.telegram.ui.ActionBar.t6.r1(A, -1);
        Paint paint7 = this.f51703p1;
        paint7.setColor(r13);
        int r14 = org.telegram.ui.ActionBar.t6.r1(A * f26, -1);
        Paint paint8 = this.f51704q1;
        paint8.setColor(r14);
        float L4 = (org.telegram.messenger.i0.L(4.0f) * f26) + T12;
        canvas.rotate(this.f51691c1 * 12.0f * f26, L2, L4);
        float W13 = org.telegram.messenger.i0.W1(f25, org.telegram.messenger.i0.L(15.33f), org.telegram.messenger.i0.L(13.0f)) / 2.0f;
        float W14 = org.telegram.messenger.i0.W1(f25, org.telegram.messenger.i0.L(12.66f), org.telegram.messenger.i0.L(13.0f)) / 2.0f;
        float f27 = L4 - W14;
        RectF rectF4 = this.f51708u1;
        rectF4.set(L2 - W13, f27, W13 + L2, L4 + W14);
        canvas.drawRoundRect(rectF4, org.telegram.messenger.i0.L(3.66f), org.telegram.messenger.i0.L(3.66f), paint7);
        if (f25 < 1.0f) {
            canvas.save();
            canvas.rotate(this.f51691c1 * 12.0f * f26, L2, f27);
            canvas.translate(0.0f, W14 * f25);
            canvas.scale(f26, f26, L2, f27);
            Path path2 = this.f51709v1;
            path2.rewind();
            float L5 = org.telegram.messenger.i0.L(4.33f);
            float L6 = f27 - org.telegram.messenger.i0.L(3.66f);
            float f28 = L2 + L5;
            path2.moveTo(f28, org.telegram.messenger.i0.L(3.66f) + L6);
            path2.lineTo(f28, L6);
            RectF rectF5 = org.telegram.messenger.i0.P;
            float f29 = L2 - L5;
            rectF5.set(f29, L6 - L5, f28, L5 + L6);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f29, (org.telegram.messenger.i0.T1(org.telegram.messenger.i0.T1(0.4f, 0.0f, this.f51691c1), 1.0f, f25) * org.telegram.messenger.i0.L(3.66f)) + L6);
            paint8.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.J1) {
            ImageView imageView = this.R0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.t5 t5Var3 = this.L0;
            ImageView imageView2 = this.S0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || t5Var3.f30445c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.f51349n0) * 255.0f), 31);
                Path path3 = this.f51700m1;
                path3.rewind();
                path3.addRoundRect(rectF, org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || t5Var3.f30445c > 0.0f) {
                    canvas.save();
                    canvas.translate((org.telegram.messenger.i0.L(180.0f) * f12) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || t5Var3.f30445c > 0.0f) {
                    canvas.save();
                    canvas.translate((org.telegram.messenger.i0.L(180.0f) * f12) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.X0 == null) {
            this.X0 = getContext().getDrawable(2131230878);
        }
        this.X0.setAlpha((int) (f22 * f12));
        float timelineHeight = getTimelineHeight();
        this.X0.setBounds(org.telegram.messenger.i0.L(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - org.telegram.messenger.i0.L(48.0f)), (int) (rectF.left + org.telegram.messenger.i0.L(40.0f)), (int) ((rectF.top - timelineHeight) - org.telegram.messenger.i0.L(12.0f)));
        this.X0.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o oVar = this.Z0;
        bi0 bi0Var = oVar.h;
        oVar.f51582f = true;
        if (oVar.f51583g) {
            bi0Var.start();
        }
        bi0Var.R(oVar.f51584i);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o oVar = this.Z0;
        oVar.f51582f = false;
        bi0 bi0Var = oVar.h;
        bi0Var.stop();
        bi0Var.R(null);
    }

    public void setAmplitude(double d) {
        this.f51698j1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = 2131231518;
        } else {
            i10 = 2131231517;
        }
        ImageView imageView = this.R0;
        imageView.setImageResource(i10);
        if (z10) {
            i11 = 2131754788;
        } else {
            i11 = 2131754736;
        }
        imageView.setContentDescription(cd.L0(i11, null));
        this.Y0 = z10;
    }

    public void setOnPeriodUpdate(q20 q20Var) {
        this.A1 = q20Var;
    }

    public void setOnPremiumHint(q20 q20Var) {
        this.B1 = q20Var;
    }

    public void setPeriod(int i10) {
        A(i10, true);
    }

    public void setPeriodVisible(boolean z10) {
        int i10;
        this.V0 = z10;
        if (z10 && !this.f51350o0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.S0.setVisibility(i10);
    }

    @Override
    public final void u(float f7) {
        float f10 = 1.0f - f7;
        this.S0.setAlpha(f10);
        this.R0.setAlpha(f10);
    }

    public final void z(boolean z10, boolean z11) {
        org.telegram.messenger.i0.r(this.O1);
        this.K1 = true;
        this.N1 = false;
        this.J0 = false;
        this.K0 = (int) ((getBounds().right - org.telegram.messenger.i0.L(20.0f)) - ((getWidth() * 0.35f) * this.f51690b1));
        invalidate();
        n nVar = this.C1;
        if (nVar != null) {
            if (!z10) {
                if (z11) {
                    nVar.f52051y = true;
                    org.telegram.messenger.i0.r(nVar.h);
                    CameraController.getInstance().stopVideoRecording(nVar.f52042a.getCameraSessionRecording(), false, false);
                    nVar.a(false);
                } else {
                    nVar.c();
                }
            }
            this.C1 = null;
        }
        n();
    }
}
