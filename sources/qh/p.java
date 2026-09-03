package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.q70;
import org.telegram.ui.yh;
public abstract class p extends k {
    public static final int[] N1 = {21600, 43200, 86400, 172800};
    public n A1;
    public float B1;
    public float C1;
    public final org.telegram.ui.Components.z5 D1;
    public final org.telegram.ui.Components.z5 E1;
    public final org.telegram.ui.Components.z5 F1;
    public final org.telegram.ui.Components.z5 G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public boolean K1;
    public boolean L1;
    public final l M1;
    public final ImageView P0;
    public final ImageView Q0;
    public final j R0;
    public q70 S0;
    public boolean T0;
    public int U0;
    public Drawable V0;
    public boolean W0;
    public final o X0;
    public final org.telegram.ui.Components.j6 Y0;
    public float Z0;
    public float f45851a1;
    public long f45852b1;
    public final Paint f45853c1;
    public final Paint f45854d1;
    public final org.telegram.ui.Components.u9 f45855e1;
    public final org.telegram.ui.Components.u9 f45856f1;
    public final Drawable f45857g1;
    public float f45858h1;
    public final org.telegram.ui.Components.z5 f45859i1;
    public final Path f45860j1;
    public final Path f45861k1;
    public final Paint l1;
    public final Paint f45862m1;
    public final Paint f45863n1;
    public final Paint f45864o1;
    public final org.telegram.ui.Components.z5 f45865p1;
    public final RectF f45866q1;
    public final RectF f45867r1;
    public final RectF f45868s1;
    public final Path f45869t1;
    public k01 f45870u1;
    public Path f45871v1;
    public Paint f45872w1;
    public k01 f45873x1;
    public Utilities.Callback f45874y1;
    public Utilities.Callback f45875z1;

    public p(Context context, FrameLayout frameLayout, pv0 pv0Var, FrameLayout frameLayout2, oh.b bVar, org.telegram.ui.Components.ba baVar) {
        super(context, frameLayout, pv0Var, frameLayout2, bVar, baVar);
        this.T0 = true;
        this.U0 = 0;
        q9 q9Var = (q9) this;
        this.X0 = new o(q9Var, q9Var);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.Y0 = j6Var;
        pr prVar = pr.f30168f;
        j6Var.k(0.16f, 50L, prVar);
        j6Var.t(AndroidUtilities.dp(15.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.q("0:00.0", true, true);
        j6Var.r(-1);
        Paint paint = new Paint(1);
        this.f45853c1 = paint;
        Paint paint2 = new Paint(1);
        this.f45854d1 = paint2;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(11, 360928);
        this.f45855e1 = u9Var;
        org.telegram.ui.Components.u9 u9Var2 = new org.telegram.ui.Components.u9(12, 360928);
        this.f45856f1 = u9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        u9Var.f31560a = AndroidUtilities.dp(47.0f);
        u9Var.f31561b = AndroidUtilities.dp(55.0f);
        u9Var.b();
        u9Var2.f31560a = AndroidUtilities.dp(47.0f);
        u9Var2.f31561b = AndroidUtilities.dp(55.0f);
        u9Var2.b();
        this.f45857g1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.f45859i1 = new org.telegram.ui.Components.z5(new l(q9Var, 0), 200L, prVar, 0);
        this.f45860j1 = new Path();
        this.f45861k1 = new Path();
        this.l1 = new Paint(1);
        this.f45862m1 = new Paint(1);
        this.f45863n1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f45864o1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        l lVar = new l(q9Var, 0);
        pr prVar2 = pr.h;
        this.f45865p1 = new org.telegram.ui.Components.z5(lVar, 350L, prVar2);
        this.f45866q1 = new RectF();
        this.f45867r1 = new RectF();
        this.f45868s1 = new RectF();
        this.f45869t1 = new Path();
        this.D1 = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar2);
        this.E1 = new org.telegram.ui.Components.z5(new l(q9Var, 0), 420L, prVar2, 0);
        this.F1 = new org.telegram.ui.Components.z5(this, 0L, 350L, prVar2);
        this.G1 = new org.telegram.ui.Components.z5(new l(q9Var, 0), 350L, prVar2, 0);
        this.M1 = new l(q9Var, 1);
        ImageView imageView = new ImageView(context);
        this.P0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        addView(imageView, k7.c6.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new org.telegram.ui.Components.voip.o(q9Var, 7));
        ImageView imageView2 = new ImageView(context);
        this.Q0 = imageView2;
        j jVar = new j(5);
        this.R0 = jVar;
        imageView2.setImageDrawable(jVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(LocaleController.getString(R.string.StoryPeriodHint));
        A(86400, false);
        addView(imageView2, k7.c6.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new q31(q9Var, frameLayout, bVar, 2));
    }

    public final void A(int i10, boolean z4) {
        int i11 = 0;
        while (true) {
            if (i11 < 4) {
                if (N1[i11] == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = 2;
                break;
            }
        }
        if (this.U0 == i11) {
            return;
        }
        this.U0 = i11;
        this.R0.d(i10 / 3600, false, z4);
    }

    public final void B() {
        if (this.W0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f45565a);
            alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.StoryRemoveRoundTitle);
            alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.StoryRemoveRoundMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new mh.m5(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21897q7, this.f45565a));
            }
        }
    }

    @Override
    public final int b() {
        return 36;
    }

    @Override
    public final void c(boolean z4) {
        int i10;
        int i11 = 0;
        if (!z4 && this.T0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.Q0;
        imageView.setVisibility(i10);
        if (z4) {
            i11 = 8;
        }
        this.P0.setVisibility(i11);
        if (z4) {
            imageView.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z4) {
        int i10;
        if (!z4) {
            if (this.T0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.Q0.setVisibility(i10);
            this.P0.setVisibility(0);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: qh.p.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.R).storyCaptionLengthLimitDefault;
    }

    @Override
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.R).storyCaptionLengthLimitPremium;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override
    public final void j(Canvas canvas, RectF rectF) {
        String str;
        float f10;
        Paint paint;
        float f11;
        float f12;
        float f13;
        float f14;
        Canvas canvas2;
        int i10;
        Canvas canvas3 = canvas;
        if (this.A1 != null) {
            float e6 = this.D1.e(this.H1);
            float e10 = this.F1.e(this.J1);
            if (this.f45852b1 <= 0) {
                this.f45852b1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin((((float) (System.currentTimeMillis() - this.f45852b1)) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float dp = rectF.left + AndroidUtilities.dp(21.0f);
            float dp2 = rectF.bottom - AndroidUtilities.dp(20.0f);
            o oVar = this.X0;
            oVar.setBounds((int) (dp - AndroidUtilities.dp(12.0f)), (int) (dp2 - AndroidUtilities.dp(12.0f)), (int) (dp + AndroidUtilities.dp(12.0f)), (int) (dp2 + AndroidUtilities.dp(12.0f)));
            oVar.draw(canvas3);
            int dp3 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) + AndroidUtilities.dp(9.0f));
            org.telegram.ui.Components.j6 j6Var = this.Y0;
            j6Var.setBounds((int) ((rectF.left + AndroidUtilities.dp(33.3f)) - (AndroidUtilities.dp(10.0f) * e6)), (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(9.0f)), (int) (rectF.left + AndroidUtilities.dp(133.3f)), dp3);
            long b10 = this.A1.b();
            int i11 = (int) (b10 / 1000);
            int i12 = (int) ((b10 - (i11 * 1000)) / 100);
            int i13 = i11 / 60;
            int i14 = i11 % 60;
            StringBuilder sb = new StringBuilder();
            sb.append(i13);
            sb.append(":");
            if (i14 < 10) {
                str = "0";
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(i14);
            sb.append(".");
            sb.append(i12);
            j6Var.q(sb.toString(), true, true);
            j6Var.f28017w = (int) ((1.0f - e6) * 255.0f);
            j6Var.draw(canvas3);
            float f15 = 1.0f - e10;
            float f16 = (1.0f - this.Z0) * f15;
            Paint c3 = this.M.c(1.0f);
            if (c3 != null) {
                f10 = f16;
                paint = c3;
                f11 = 10.0f;
                f12 = 12.0f;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                f10 = f16;
                paint = c3;
                f11 = 10.0f;
                f12 = 12.0f;
            }
            int i15 = -2130706433;
            if (f10 > 0.0f) {
                if (this.f45870u1 == null) {
                    this.f45870u1 = new k01(LocaleController.getString(R.string.SlideToCancel2), 15.0f, null);
                }
                if (this.f45871v1 == null) {
                    Path path = new Path();
                    this.f45871v1 = path;
                    path.moveTo(AndroidUtilities.dp(3.83f), 0.0f);
                    this.f45871v1.lineTo(0.0f, AndroidUtilities.dp(5.0f));
                    this.f45871v1.lineTo(AndroidUtilities.dp(3.83f), AndroidUtilities.dp(f11));
                    Paint paint2 = new Paint(1);
                    this.f45872w1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.f45872w1.setStrokeCap(Paint.Cap.ROUND);
                    this.f45872w1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.f45872w1.setStrokeWidth(AndroidUtilities.dp(1.33f));
                this.f45870u1.f28238p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - j6Var.d());
                float centerX = (rectF.centerX() - ((this.f45870u1.l() + AndroidUtilities.dp(11.33f)) / 2.0f)) - (AndroidUtilities.lerp(this.Z0, 1.0f, e10) * (rectF.width() / 6.0f));
                float c10 = yh.c(1.0f, this.Z0, AndroidUtilities.dp(6.0f) * sin, centerX);
                if (paint != null) {
                    i10 = -1;
                } else {
                    i10 = -2130706433;
                }
                int l1 = org.telegram.ui.ActionBar.k6.l1(f10, i10);
                canvas3.save();
                canvas3.translate(c10, rectF.centerY() - AndroidUtilities.dp(5.0f));
                this.f45872w1.setColor(l1);
                canvas3.drawPath(this.f45871v1, this.f45872w1);
                canvas3.restore();
                f13 = 15.0f;
                f14 = 0.0f;
                this.f45870u1.c(c10 + AndroidUtilities.dp(11.33f), rectF.centerY(), 1.0f, l1, canvas3);
            } else {
                f13 = 15.0f;
                f14 = 0.0f;
            }
            if (e10 > f14) {
                if (this.f45873x1 == null) {
                    this.f45873x1 = new k01(LocaleController.getString(R.string.CancelRound), f13, AndroidUtilities.bold());
                }
                this.f45873x1.f28238p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - j6Var.d());
                float width = ((rectF.width() / 4.0f) * f15) + (rectF.centerX() - (this.f45873x1.l() / 2.0f));
                if (paint != null) {
                    i15 = -1;
                }
                canvas2 = canvas;
                this.f45873x1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.k6.l1(e10, i15), canvas2);
                this.f45867r1.set(width - AndroidUtilities.dp(f12), rectF.top, this.f45873x1.l() + width + AndroidUtilities.dp(f12), rectF.bottom);
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
    public final void k(Canvas canvas, RectF rectF, float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z4;
        if (f10 <= 0.0f) {
            return;
        }
        boolean z10 = this.H1;
        org.telegram.ui.Components.z5 z5Var = this.E1;
        float e6 = z5Var.e(z10);
        boolean z11 = this.J1;
        org.telegram.ui.Components.z5 z5Var2 = this.G1;
        float e10 = z5Var2.e(z11);
        float d = this.f45859i1.d(this.f45858h1, false);
        float w10 = e2.c.w(1.0f, this.Z0, AndroidUtilities.dp(30.0f) * d, AndroidUtilities.dp(41.0f));
        float f19 = 1.0f - e6;
        float f20 = w10 * f19 * f10;
        float lerp = AndroidUtilities.lerp(yh.c(1.0f, e10, getWidth() * 0.35f * this.Z0, rectF.right - AndroidUtilities.dp(20.0f)), rectF.left + AndroidUtilities.dp(20.0f), e6);
        float dp = rectF.bottom - AndroidUtilities.dp(20.0f);
        boolean isEnabled = LiteMode.isEnabled(360928);
        Paint paint = this.f45854d1;
        if (isEnabled) {
            org.telegram.ui.Components.u9 u9Var = this.f45855e1;
            u9Var.f31560a = AndroidUtilities.dp(47.0f);
            Paint paint2 = u9Var.d;
            f13 = 0.0f;
            u9Var.f31561b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
            f11 = e10;
            org.telegram.ui.Components.u9 u9Var2 = this.f45856f1;
            u9Var2.f31560a = AndroidUtilities.dp(50.0f);
            Paint paint3 = u9Var2.d;
            f12 = f19;
            u9Var2.f31561b = (AndroidUtilities.dp(12.0f) * 0.6f) + AndroidUtilities.dp(50.0f);
            u9Var2.e(d, 1.01f);
            u9Var.e(d, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.k6.l1(0.15f * f10, paint.getColor()));
            canvas.save();
            float f21 = f20 / u9Var2.f31560a;
            canvas.scale(f21, f21, lerp, dp);
            u9Var2.a(lerp, dp, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.k6.l1(0.3f * f10, paint.getColor()));
            canvas.save();
            float f22 = f20 / u9Var.f31560a;
            canvas.scale(f22, f22, lerp, dp);
            u9Var.a(lerp, dp, canvas, paint2);
            canvas.restore();
        } else {
            f11 = e10;
            f12 = f19;
            f13 = 0.0f;
        }
        float min = Math.min(f20, AndroidUtilities.dp(55.0f));
        float f23 = f10 * 255.0f;
        paint.setAlpha((int) f23);
        canvas.drawCircle(lerp, dp, min, paint);
        canvas.save();
        Path path = this.f45860j1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(lerp, dp, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.f45857g1;
        float intrinsicWidth = (drawable.getIntrinsicWidth() / 2.0f) * f12;
        if (this.I1) {
            f14 = f10;
        } else {
            f14 = 1.0f;
        }
        int i10 = (int) (lerp - (intrinsicWidth * f14));
        float intrinsicHeight = (drawable.getIntrinsicHeight() / 2.0f) * f12;
        if (this.I1) {
            f15 = f10;
        } else {
            f15 = 1.0f;
        }
        int i11 = (int) (dp - (intrinsicHeight * f15));
        float intrinsicWidth2 = (drawable.getIntrinsicWidth() / 2.0f) * f12;
        if (this.I1) {
            f16 = f10;
        } else {
            f16 = 1.0f;
        }
        int i12 = (int) ((intrinsicWidth2 * f16) + lerp);
        float intrinsicHeight2 = (drawable.getIntrinsicHeight() / 2.0f) * f12;
        if (this.I1) {
            f17 = f10;
        } else {
            f17 = 1.0f;
        }
        drawable.setBounds(i10, i11, i12, (int) ((intrinsicHeight2 * f17) + dp));
        float f24 = f12 * 255.0f;
        if (this.I1) {
            f18 = f10;
        } else {
            f18 = 1.0f;
        }
        drawable.setAlpha((int) (f24 * f18));
        drawable.draw(canvas);
        if (f11 > f13) {
            float dpf2 = (AndroidUtilities.dpf2(19.33f) / 2.0f) * f11 * f10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(lerp - dpf2, dp - dpf2, lerp + dpf2, dp + dpf2);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.33f), AndroidUtilities.dp(5.33f), this.f45853c1);
        }
        canvas.restore();
        float f25 = z5Var.f33763c;
        float f26 = z5Var2.f33763c;
        if (this.Z0 < 0.4f) {
            z4 = true;
        } else {
            z4 = false;
        }
        float y10 = org.telegram.messenger.y3.y(1.0f, f25, AndroidUtilities.lerp(this.f45865p1.e(z4), 0.0f, f26), f10);
        float dp2 = rectF.right - AndroidUtilities.dp(20.0f);
        float lerp2 = (AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(36.0f), f26) * y10) / 2.0f;
        float f27 = 1.0f - f26;
        float lerp3 = AndroidUtilities.lerp(((rectF.bottom - AndroidUtilities.dp(80.0f)) - lerp2) - ((AndroidUtilities.dp(120.0f) * this.f45851a1) * f27), rectF.bottom - AndroidUtilities.dp(20.0f), 1.0f - y10);
        float dp3 = (AndroidUtilities.dp(36.0f) * y10) / 2.0f;
        RectF rectF3 = this.f45866q1;
        rectF3.set(dp2 - dp3, lerp3 - lerp2, dp3 + dp2, lerp2 + lerp3);
        float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), f26);
        int l1 = org.telegram.ui.ActionBar.k6.l1(y10, 536870912);
        Paint paint4 = this.f45862m1;
        paint4.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), l1);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, lerp4, lerp4, paint4);
        Paint c3 = this.O.c(y10);
        if (c3 == null) {
            Paint paint5 = this.l1;
            paint5.setColor(1073741824);
            paint5.setAlpha((int) (64.0f * y10));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint5);
        } else {
            canvas.drawRoundRect(rectF3, lerp4, lerp4, c3);
            Paint paint6 = this.f45572e;
            paint6.setAlpha((int) (51.0f * y10));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint6);
        }
        canvas.save();
        canvas.scale(y10, y10, dp2, lerp3);
        int l12 = org.telegram.ui.ActionBar.k6.l1(y10, -1);
        Paint paint7 = this.f45863n1;
        paint7.setColor(l12);
        int l13 = org.telegram.ui.ActionBar.k6.l1(y10 * f27, -1);
        Paint paint8 = this.f45864o1;
        paint8.setColor(l13);
        float dp4 = (AndroidUtilities.dp(4.0f) * f27) + lerp3;
        canvas.rotate(this.f45851a1 * 12.0f * f27, dp2, dp4);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(15.33f), AndroidUtilities.dp(13.0f), f26) / 2.0f;
        float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(13.0f), f26) / 2.0f;
        float f28 = dp4 - lerp6;
        RectF rectF4 = this.f45868s1;
        rectF4.set(dp2 - lerp5, f28, lerp5 + dp2, dp4 + lerp6);
        canvas.drawRoundRect(rectF4, AndroidUtilities.dp(3.66f), AndroidUtilities.dp(3.66f), paint7);
        if (f26 < 1.0f) {
            canvas.save();
            canvas.rotate(this.f45851a1 * 12.0f * f27, dp2, f28);
            canvas.translate(0.0f, lerp6 * f26);
            canvas.scale(f27, f27, dp2, f28);
            Path path2 = this.f45869t1;
            path2.rewind();
            float dp5 = AndroidUtilities.dp(4.33f);
            float dp6 = f28 - AndroidUtilities.dp(3.66f);
            float f29 = dp2 + dp5;
            path2.moveTo(f29, AndroidUtilities.dp(3.66f) + dp6);
            path2.lineTo(f29, dp6);
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f30 = dp2 - dp5;
            rectF5.set(f30, dp6 - dp5, f29, dp5 + dp6);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f30, (AndroidUtilities.lerp(AndroidUtilities.lerp(0.4f, 0.0f, this.f45851a1), 1.0f, f26) * AndroidUtilities.dp(3.66f)) + dp6);
            paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.H1) {
            ImageView imageView = this.P0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.z5 z5Var3 = this.J0;
            ImageView imageView2 = this.Q0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || z5Var3.f33763c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.f45581l0) * 255.0f), 31);
                Path path3 = this.f45861k1;
                path3.rewind();
                path3.addRoundRect(rectF, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || z5Var3.f33763c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f12) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || z5Var3.f33763c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f12) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.V0 == null) {
            this.V0 = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.V0.setAlpha((int) (f23 * f12));
        float timelineHeight = getTimelineHeight();
        this.V0.setBounds(AndroidUtilities.dp(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(48.0f)), (int) (rectF.left + AndroidUtilities.dp(40.0f)), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(12.0f)));
        this.V0.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o oVar = this.X0;
        hj0 hj0Var = oVar.h;
        oVar.f45822f = true;
        if (oVar.f45823g) {
            hj0Var.start();
        }
        hj0Var.f27542s0 = oVar.f45824i;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o oVar = this.X0;
        oVar.f45822f = false;
        hj0 hj0Var = oVar.h;
        hj0Var.stop();
        hj0Var.f27542s0 = null;
    }

    public void setAmplitude(double d) {
        this.f45858h1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z4) {
        int i10;
        int i11;
        if (z4) {
            i10 = R.drawable.input_video_story_remove;
        } else {
            i10 = R.drawable.input_video_story;
        }
        ImageView imageView = this.P0;
        imageView.setImageResource(i10);
        if (z4) {
            i11 = R.string.AccDescrRemoveRoundVideo;
        } else {
            i11 = R.string.AccDescrVideoMessage;
        }
        imageView.setContentDescription(LocaleController.getString(i11));
        this.W0 = z4;
    }

    public void setOnPeriodUpdate(Utilities.Callback<Integer> callback) {
        this.f45874y1 = callback;
    }

    public void setOnPremiumHint(Utilities.Callback<Integer> callback) {
        this.f45875z1 = callback;
    }

    public void setPeriod(int i10) {
        A(i10, true);
    }

    public void setPeriodVisible(boolean z4) {
        int i10;
        this.T0 = z4;
        if (z4 && !this.m0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.Q0.setVisibility(i10);
    }

    @Override
    public final void u(float f10) {
        float f11 = 1.0f - f10;
        this.Q0.setAlpha(f11);
        this.P0.setAlpha(f11);
    }

    public final void z(boolean z4, boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.M1);
        this.I1 = true;
        this.L1 = false;
        this.H0 = false;
        this.I0 = (int) ((getBounds().right - AndroidUtilities.dp(20.0f)) - ((getWidth() * 0.35f) * this.Z0));
        invalidate();
        n nVar = this.A1;
        if (nVar != null) {
            if (!z4) {
                if (z10) {
                    nVar.f46219x = true;
                    AndroidUtilities.cancelRunOnUIThread(nVar.h);
                    CameraController.getInstance().stopVideoRecording(nVar.f46210a.getCameraSessionRecording(), false, false);
                    nVar.a(false);
                } else {
                    nVar.c();
                }
            }
            this.A1 = null;
        }
        n();
    }
}
