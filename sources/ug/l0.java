package ug;

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
import gi.k3;
import gi.l3;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.e6;
import org.telegram.messenger.h6;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
public class l0 extends View {
    public final float E;
    public float F;
    public StaticLayout G;
    public float H;
    public float I;
    public final int J;
    public final int K;
    public boolean L;
    public boolean M;
    public float N;
    public float O;
    public final RectF P;
    public final u5 Q;
    public int f56119a;
    public String f56120b;
    public boolean f56121c;
    public final RectF d;
    public final TextPaint f56122e;
    public final Paint f56123f;
    public final Drawable h;
    public boolean f56124n;
    public final ImageReceiver f56125r;
    public final ImageReceiver f56126s;
    public TLRPC.Document f56127w;
    public TLRPC.Document f56128x;
    public boolean f56129y;

    public l0(Context context, float f10) {
        super(context);
        this.f56120b = "";
        this.d = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f56122e = textPaint;
        this.f56123f = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f56125r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f56126s = imageReceiver2;
        this.F = 1.0f;
        this.P = new RectF();
        new Path();
        this.Q = new u5(this, 350L, xq.h);
        this.E = f10;
        imageReceiver.B0 = true;
        imageReceiver.K0 = true;
        imageReceiver2.B0 = true;
        imageReceiver2.K0 = true;
        int i3 = (int) (3.0f * f10);
        this.J = i3;
        int i10 = (int) (1.0f * f10);
        this.K = i10;
        setPadding(i3, i10, i3, i10);
        this.h = k2.p1.g(context, 2131231648);
        textPaint.setTextSize(f10 * 24.0f);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        hs.i(this);
    }

    public static org.telegram.tgnet.TLRPC.Document b(org.telegram.tgnet.TLRPC.TL_messages_stickerSet r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: ug.l0.b(org.telegram.tgnet.TLRPC$TL_messages_stickerSet, java.lang.String):org.telegram.tgnet.TLRPC$Document");
    }

    public static k3 c(String str) {
        e6 f10 = i6.f(str);
        if (f10 instanceof h6) {
            ((h6) f10).f22319a = false;
        }
        if (f10 == null) {
            return null;
        }
        return new k3(f10, 8);
    }

    public final void a(Canvas canvas) {
        float f10;
        f();
        if (this.G == null) {
            return;
        }
        int i3 = this.J;
        float f11 = i3;
        int i10 = this.K;
        float f12 = i10;
        RectF rectF = this.P;
        rectF.set(f11, f12, this.N + f11, this.O + f12);
        float f13 = this.O * 0.2f;
        canvas.drawRoundRect(rectF, f13, f13, this.f56123f);
        boolean z10 = this.f56124n;
        float f14 = this.E;
        RectF rectF2 = this.d;
        if (z10) {
            float d = this.Q.d(this.M);
            if (d > 0.0f) {
                float b10 = org.telegram.messenger.camera.q.b(rectF2.left, 2.25f, f14, f11);
                float f15 = f14 * 21.33f;
                float z11 = com.google.android.recaptcha.internal.a.z(this.O, f15, 2.0f, f12);
                ImageReceiver imageReceiver = this.f56126s;
                imageReceiver.y0(b10, z11, f15, f15);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.r(), imageReceiver.s());
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                canvas.restore();
            }
            if (d < 1.0f) {
                float b11 = org.telegram.messenger.camera.q.b(rectF2.left, 2.25f, f14, f11);
                float f16 = f14 * 21.33f;
                float z12 = com.google.android.recaptcha.internal.a.z(this.O, f16, 2.0f, f12);
                ImageReceiver imageReceiver2 = this.f56125r;
                imageReceiver2.y0(b11, z12, f16, f16);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.r(), imageReceiver2.s());
                imageReceiver2.setAlpha(1.0f - d);
                imageReceiver2.h(canvas, null);
                canvas.restore();
            }
        } else if (!this.f56129y) {
            float f17 = rectF2.left;
            float f18 = this.O;
            float f19 = f14 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f17 * f14)) + i3, ((int) ((f18 - f19) / 2.0f)) + i10, i3 + ((int) ((f17 + 21.33f) * f14)), i10 + ((int) ((f19 + f18) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        float f20 = rectF2.left;
        if (!this.f56124n && !this.f56129y) {
            f10 = 0.0f;
        } else {
            f10 = 2.25f;
        }
        canvas.translate(((f20 + f10 + 21.33f + 3.25f) * f14) + f11, (this.O / 2.0f) + f12);
        float f21 = this.F;
        canvas.scale(f21, f21);
        canvas.translate(-this.I, (-this.G.getHeight()) / 2.0f);
        this.G.draw(canvas);
        canvas.restore();
    }

    public final void d(int i3, final String str) {
        boolean z10;
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.f56126s;
        ImageReceiver imageReceiver2 = this.f56125r;
        if (isEmpty) {
            this.f56124n = false;
            this.f56127w = null;
            this.f56128x = null;
            imageReceiver2.f();
            imageReceiver.f();
            z10 = true;
        } else {
            this.f56124n = true;
            this.f56127w = null;
            this.f56128x = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            li.b0(i3).l0(tL_inputStickerSetShortName, 0, false, false, new u10(this) {
                public final l0 f56115b;

                {
                    this.f56115b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r3) {
                        case 0:
                            l0 l0Var = this.f56115b;
                            l0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = l0.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            l0Var.f56127w = b10;
                            l0Var.f56125r.q0(ac.b(b10), "80_80", l0.c(str2), null, null, 0);
                            l0Var.f56126s.u0(ac.b(l0Var.f56128x), "80_80", ac.b(l0Var.f56127w), "80_80", null, null, l0.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            l0 l0Var2 = this.f56115b;
                            l0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = l0.b((TLRPC.TL_messages_stickerSet) obj, str3);
                            l0Var2.f56128x = b11;
                            if (b11 != null) {
                                l0Var2.f56126s.u0(ac.b(b11), "80_80", ac.b(l0Var2.f56127w), "80_80", null, null, l0.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            li.b0(i3).l0(tL_inputStickerSetShortName2, 0, false, false, new u10(this) {
                public final l0 f56115b;

                {
                    this.f56115b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r3) {
                        case 0:
                            l0 l0Var = this.f56115b;
                            l0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = l0.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            l0Var.f56127w = b10;
                            l0Var.f56125r.q0(ac.b(b10), "80_80", l0.c(str2), null, null, 0);
                            l0Var.f56126s.u0(ac.b(l0Var.f56128x), "80_80", ac.b(l0Var.f56127w), "80_80", null, null, l0.c(str2), 0L, null, null, 0);
                            return;
                        default:
                            l0 l0Var2 = this.f56115b;
                            l0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = l0.b((TLRPC.TL_messages_stickerSet) obj, str3);
                            l0Var2.f56128x = b11;
                            if (b11 != null) {
                                l0Var2.f56126s.u0(ac.b(b11), "80_80", ac.b(l0Var2.f56127w), "80_80", null, null, l0.c(str3), 0L, null, null, 0);
                                return;
                            }
                            return;
                    }
                }
            });
            z10 = true;
            imageReceiver2.q0(ac.b(this.f56127w), "80_80", c(str), null, null, 0);
            imageReceiver.u0(ac.b(this.f56128x), "80_80", ac.b(this.f56127w), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.f56121c = z10;
        requestLayout();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i3, int i10) {
        int i11 = -16777216;
        Drawable drawable = this.h;
        TextPaint textPaint = this.f56122e;
        Paint paint = this.f56123f;
        if (i3 == 0) {
            paint.setColor(-16777216);
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i3 == 1) {
            paint.setColor(1275068416);
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else if (i3 == 2) {
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
        if (!this.f56121c) {
            return;
        }
        String str = this.f56120b;
        TextPaint textPaint = this.f56122e;
        float measureText = textPaint.measureText(str);
        int i3 = this.f56119a;
        int i10 = this.J;
        float f12 = (i3 - i10) - i10;
        RectF rectF = this.d;
        float f13 = rectF.left;
        float f14 = 2.25f;
        if (!this.f56124n && !this.f56129y) {
            f10 = 0.0f;
        } else {
            f10 = 2.25f;
        }
        float f15 = this.E;
        float f16 = f12 - (((((f13 + f10) + 21.33f) + 3.25f) + rectF.right) * f15);
        float min = Math.min(1.0f, f16 / measureText);
        this.F = min;
        if (min < 0.4f) {
            f11 = 1.0f;
            String str2 = this.f56120b;
            this.G = new StaticLayout(str2, textPaint, l3.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        } else {
            f11 = 1.0f;
            this.G = new StaticLayout(this.f56120b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.H = 0.0f;
        this.I = Float.MAX_VALUE;
        for (int i11 = 0; i11 < this.G.getLineCount(); i11++) {
            this.H = Math.max(this.H, this.G.getLineWidth(i11));
            this.I = Math.min(this.I, this.G.getLineLeft(i11));
        }
        if (this.G.getLineCount() > 2) {
            this.F = 0.3f;
        } else {
            this.F = Math.min(f11, f16 / this.H);
        }
        float f17 = rectF.left;
        if (!this.f56124n && !this.f56129y) {
            f14 = 0.0f;
        }
        this.N = (this.H * this.F) + ((f17 + f14 + 21.33f + 3.25f + rectF.right) * f15);
        this.O = Math.max(f15 * 21.33f, this.G.getHeight() * this.F) + ((rectF.top + rectF.bottom) * f15);
        this.f56121c = false;
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        if (this.M && (document = this.f56128x) != null) {
            return document;
        }
        return this.f56127w;
    }

    public int getHeightInternal() {
        int round = Math.round(this.O);
        int i3 = this.K;
        return round + i3 + i3;
    }

    public float getRadius() {
        return this.O * 0.2f;
    }

    public String getText() {
        return this.f56120b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.N);
        int i3 = this.J;
        return round + i3 + i3;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
        if (this.M) {
            this.f56126s.P();
        } else {
            this.f56125r.P();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L = false;
        this.f56125r.R();
        this.f56126s.R();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z10) {
        if (this.M != z10 && this.L) {
            ImageReceiver imageReceiver = this.f56126s;
            ImageReceiver imageReceiver2 = this.f56125r;
            if (z10) {
                imageReceiver2.R();
                imageReceiver.P();
            } else {
                imageReceiver2.P();
                imageReceiver.R();
            }
        }
        this.M = z10;
        invalidate();
    }

    public void setMaxWidth(int i3) {
        this.f56119a = i3;
        this.f56121c = true;
    }

    public void setText(String str) {
        this.f56120b = str;
        this.f56121c = true;
        requestLayout();
    }
}
