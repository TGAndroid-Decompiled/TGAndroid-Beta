package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import fi.l3;
import fi.m3;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.c20;
import org.telegram.messenger.e6;
import org.telegram.messenger.h6;
import org.telegram.messenger.hc;
import org.telegram.messenger.i6;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public class m0 extends View {
    public final float D;
    public float E;
    public StaticLayout F;
    public float G;
    public float H;
    public final int I;
    public final int J;
    public boolean K;
    public boolean L;
    public float M;
    public float N;
    public final RectF O;
    public final w5 P;
    public int f55713a;
    public String f55714b;
    public boolean f55715c;
    public final RectF d;
    public final TextPaint f55716e;
    public final Paint f55717f;
    public final Drawable h;
    public boolean f55718n;
    public final ImageReceiver f55719r;
    public final ImageReceiver f55720s;
    public TLRPC.Document f55721w;
    public TLRPC.Document f55722x;
    public boolean f55723y;

    public m0(Context context, float f10) {
        super(context);
        this.f55714b = "";
        this.d = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f55716e = textPaint;
        this.f55717f = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f55719r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f55720s = imageReceiver2;
        this.E = 1.0f;
        this.O = new RectF();
        new Path();
        this.P = new w5(this, 350L, xq.h);
        this.D = f10;
        imageReceiver.A0 = true;
        imageReceiver.J0 = true;
        imageReceiver2.A0 = true;
        imageReceiver2.J0 = true;
        int i7 = (int) (3.0f * f10);
        this.I = i7;
        int i10 = (int) (1.0f * f10);
        this.J = i10;
        setPadding(i7, i10, i7, i10);
        this.h = jg.g.h(context, 2131231648);
        textPaint.setTextSize(f10 * 24.0f);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        qs.i(this);
    }

    public static org.telegram.tgnet.TLRPC.Document b(org.telegram.tgnet.TLRPC.TL_messages_stickerSet r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: tg.m0.b(org.telegram.tgnet.TLRPC$TL_messages_stickerSet, java.lang.String):org.telegram.tgnet.TLRPC$Document");
    }

    public static l3 c(String str) {
        e6 f10 = i6.f(str);
        if (f10 instanceof h6) {
            ((h6) f10).f22160a = false;
        }
        if (f10 == null) {
            return null;
        }
        return new l3(f10, 8);
    }

    public final void a(Canvas canvas) {
        float f10;
        f();
        if (this.F == null) {
            return;
        }
        int i7 = this.I;
        float f11 = i7;
        int i10 = this.J;
        float f12 = i10;
        RectF rectF = this.O;
        rectF.set(f11, f12, this.M + f11, this.N + f12);
        float f13 = this.N * 0.2f;
        canvas.drawRoundRect(rectF, f13, f13, this.f55717f);
        boolean z9 = this.f55718n;
        float f14 = this.D;
        RectF rectF2 = this.d;
        if (z9) {
            float d = this.P.d(this.L);
            if (d > 0.0f) {
                float b10 = org.telegram.messenger.camera.q.b(rectF2.left, 2.25f, f14, f11);
                float f15 = f14 * 21.33f;
                float A = com.google.android.recaptcha.internal.a.A(this.N, f15, 2.0f, f12);
                ImageReceiver imageReceiver = this.f55720s;
                imageReceiver.y0(b10, A, f15, f15);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.r(), imageReceiver.s());
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                canvas.restore();
            }
            if (d < 1.0f) {
                float b11 = org.telegram.messenger.camera.q.b(rectF2.left, 2.25f, f14, f11);
                float f16 = f14 * 21.33f;
                float A2 = com.google.android.recaptcha.internal.a.A(this.N, f16, 2.0f, f12);
                ImageReceiver imageReceiver2 = this.f55719r;
                imageReceiver2.y0(b11, A2, f16, f16);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.r(), imageReceiver2.s());
                imageReceiver2.setAlpha(1.0f - d);
                imageReceiver2.h(canvas, null);
                canvas.restore();
            }
        } else if (!this.f55723y) {
            float f17 = rectF2.left;
            float f18 = this.N;
            float f19 = f14 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f17 * f14)) + i7, ((int) ((f18 - f19) / 2.0f)) + i10, i7 + ((int) ((f17 + 21.33f) * f14)), i10 + ((int) ((f19 + f18) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        float f20 = rectF2.left;
        if (!this.f55718n && !this.f55723y) {
            f10 = 0.0f;
        } else {
            f10 = 2.25f;
        }
        canvas.translate(((f20 + f10 + 21.33f + 3.25f) * f14) + f11, (this.N / 2.0f) + f12);
        float f21 = this.E;
        canvas.scale(f21, f21);
        canvas.translate(-this.H, (-this.F.getHeight()) / 2.0f);
        this.F.draw(canvas);
        canvas.restore();
    }

    public final void d(int i7, final String str) {
        boolean z9;
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.f55720s;
        ImageReceiver imageReceiver2 = this.f55719r;
        if (isEmpty) {
            this.f55718n = false;
            this.f55721w = null;
            this.f55722x = null;
            imageReceiver2.f();
            imageReceiver.f();
            z9 = true;
        } else {
            this.f55718n = true;
            this.f55721w = null;
            this.f55722x = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            ui.b0(i7).l0(tL_inputStickerSetShortName, 0, false, false, new c20(this) {
                public final m0 f55704b;

                {
                    this.f55704b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r3) {
                        case 0:
                            m0 m0Var = this.f55704b;
                            m0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = m0.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            m0Var.f55721w = b10;
                            m0Var.f55719r.q0(hc.b(b10), "80_80", m0.c(str2), null, null, 0);
                            m0Var.f55720s.u0(hc.b(m0Var.f55722x), "80_80", hc.b(m0Var.f55721w), "80_80", null, null, m0.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            m0 m0Var2 = this.f55704b;
                            m0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = m0.b((TLRPC.TL_messages_stickerSet) obj, str3);
                            m0Var2.f55722x = b11;
                            if (b11 != null) {
                                m0Var2.f55720s.u0(hc.b(b11), "80_80", hc.b(m0Var2.f55721w), "80_80", null, null, m0.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            ui.b0(i7).l0(tL_inputStickerSetShortName2, 0, false, false, new c20(this) {
                public final m0 f55704b;

                {
                    this.f55704b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r3) {
                        case 0:
                            m0 m0Var = this.f55704b;
                            m0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = m0.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            m0Var.f55721w = b10;
                            m0Var.f55719r.q0(hc.b(b10), "80_80", m0.c(str2), null, null, 0);
                            m0Var.f55720s.u0(hc.b(m0Var.f55722x), "80_80", hc.b(m0Var.f55721w), "80_80", null, null, m0.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            m0 m0Var2 = this.f55704b;
                            m0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = m0.b((TLRPC.TL_messages_stickerSet) obj, str3);
                            m0Var2.f55722x = b11;
                            if (b11 != null) {
                                m0Var2.f55720s.u0(hc.b(b11), "80_80", hc.b(m0Var2.f55721w), "80_80", null, null, m0.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            z9 = true;
            imageReceiver2.q0(hc.b(this.f55721w), "80_80", c(str), null, null, 0);
            imageReceiver.u0(hc.b(this.f55722x), "80_80", hc.b(this.f55721w), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.f55715c = z9;
        requestLayout();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i7, int i10) {
        int i11 = -16777216;
        Drawable drawable = this.h;
        TextPaint textPaint = this.f55716e;
        Paint paint = this.f55717f;
        if (i7 == 0) {
            paint.setColor(-16777216);
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i7 == 1) {
            paint.setColor(1275068416);
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else if (i7 == 2) {
            paint.setColor(-1);
            textPaint.setColor(-16777216);
            drawable.setColorFilter(null);
        } else {
            paint.setColor(i10);
            if (org.telegram.messenger.g0.B(i10) < 0.721f) {
                i11 = -1;
            }
            textPaint.setColor(i11);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void f() {
        float f10;
        float f11;
        if (!this.f55715c) {
            return;
        }
        String str = this.f55714b;
        TextPaint textPaint = this.f55716e;
        float measureText = textPaint.measureText(str);
        int i7 = this.f55713a;
        int i10 = this.I;
        float f12 = (i7 - i10) - i10;
        RectF rectF = this.d;
        float f13 = rectF.left;
        float f14 = 2.25f;
        if (!this.f55718n && !this.f55723y) {
            f10 = 0.0f;
        } else {
            f10 = 2.25f;
        }
        float f15 = this.D;
        float f16 = f12 - (((((f13 + f10) + 21.33f) + 3.25f) + rectF.right) * f15);
        float min = Math.min(1.0f, f16 / measureText);
        this.E = min;
        if (min < 0.4f) {
            f11 = 1.0f;
            String str2 = this.f55714b;
            this.F = new StaticLayout(str2, textPaint, m3.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } else {
            f11 = 1.0f;
            this.F = new StaticLayout(this.f55714b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.G = 0.0f;
        this.H = Float.MAX_VALUE;
        for (int i11 = 0; i11 < this.F.getLineCount(); i11++) {
            this.G = Math.max(this.G, this.F.getLineWidth(i11));
            this.H = Math.min(this.H, this.F.getLineLeft(i11));
        }
        if (this.F.getLineCount() > 2) {
            this.E = 0.3f;
        } else {
            this.E = Math.min(f11, f16 / this.G);
        }
        float f17 = rectF.left;
        if (!this.f55718n && !this.f55723y) {
            f14 = 0.0f;
        }
        this.M = (this.G * this.E) + ((f17 + f14 + 21.33f + 3.25f + rectF.right) * f15);
        this.N = Math.max(f15 * 21.33f, this.F.getHeight() * this.E) + ((rectF.top + rectF.bottom) * f15);
        this.f55715c = false;
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        if (this.L && (document = this.f55722x) != null) {
            return document;
        }
        return this.f55721w;
    }

    public int getHeightInternal() {
        int round = Math.round(this.N);
        int i7 = this.J;
        return round + i7 + i7;
    }

    public float getRadius() {
        return this.N * 0.2f;
    }

    public String getText() {
        return this.f55714b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.M);
        int i7 = this.I;
        return round + i7 + i7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        if (this.L) {
            this.f55720s.P();
        } else {
            this.f55719r.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        this.f55719r.R();
        this.f55720s.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z9) {
        if (this.L != z9 && this.K) {
            ImageReceiver imageReceiver = this.f55720s;
            ImageReceiver imageReceiver2 = this.f55719r;
            if (z9) {
                imageReceiver2.R();
                imageReceiver.P();
            } else {
                imageReceiver2.P();
                imageReceiver.R();
            }
        }
        this.L = z9;
        invalidate();
    }

    public void setMaxWidth(int i7) {
        this.f55713a = i7;
        this.f55715c = true;
    }

    public void setText(String str) {
        this.f55714b = str;
        this.f55715c = true;
        requestLayout();
    }
}
