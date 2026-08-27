package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class t11 extends View {
    public static final float P = AndroidUtilities.dp(2.0f);
    public static final float Q = AndroidUtilities.dp(20.0f);
    public final Paint A;
    public org.telegram.ui.Components.oi0 B;
    public String C;
    public boolean D;
    public String E;
    public int F;
    public boolean G;
    public final float[] H;
    public boolean I;
    public final q11 J;
    public Integer K;
    public Integer L;
    public String M;
    public String N;
    public boolean O;

    public final org.telegram.ui.Components.nb0 f42753a;

    public final Paint f42754b;

    public final BitmapShader f42755c;
    public final BitmapShader d;

    public k11 f42756e;

    public Bitmap f42757f;
    public Bitmap h;

    public Bitmap f42758n;

    public boolean f42759r;

    public final org.telegram.ui.Components.tn0 f42760s;
    public TextPaint v;

    public StaticLayout f42761w;

    public final org.telegram.ui.Components.y5 f42762x;

    public final Paint f42763y;

    public t11(Context context) {
        super(context);
        org.telegram.ui.Components.nb0 nb0Var = new org.telegram.ui.Components.nb0();
        this.f42753a = nb0Var;
        Paint paint = new Paint(1);
        this.f42754b = paint;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.f42762x = new org.telegram.ui.Components.y5(1.0f, this, 0L, 2000L, erVar);
        Paint paint2 = new Paint(1);
        this.f42763y = paint2;
        Paint paint3 = new Paint(1);
        this.A = paint3;
        this.H = new float[8];
        this.J = new q11(this, 0);
        this.O = true;
        nb0Var.N = true;
        nb0Var.r(this);
        Bitmap bitmap = nb0Var.f30929k;
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f42755c = bitmapShader;
        BitmapShader bitmapShader2 = new BitmapShader(nb0Var.f30929k, tileMode, tileMode);
        this.d = bitmapShader2;
        paint.setShader(bitmapShader);
        org.telegram.ui.Components.tn0 tn0Var = new org.telegram.ui.Components.tn0(this);
        this.f42760s = tn0Var;
        tn0Var.k(0.35f, 300L, erVar);
        tn0Var.setCallback(this);
        tn0Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        tn0Var.f29238a.setShader(bitmapShader2);
        tn0Var.f29239b = 17;
        tn0Var.t(AndroidUtilities.dp(35.0f));
        tn0Var.q("", true, true);
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode2));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode2));
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(Canvas canvas) {
        k11 k11Var;
        if (this.B != null) {
            int iX = org.telegram.messenger.rl.x(60.0f, getWidth(), 33);
            int i10 = iX * 33;
            int i11 = i10 + 32;
            int width = (getWidth() - i11) / 2;
            int height = (int) (getHeight() * 0.15f);
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                height = (int) (getHeight() * 0.09f);
            }
            int i12 = height;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, 255, 31);
            int i13 = width + 16;
            int i14 = i12 + 16;
            float width2 = (getWidth() - width) - 16;
            float width3 = (((getWidth() + i12) - width) - width) - 16;
            Paint paint = this.f42754b;
            canvas.drawRect(i13, i14, width2, width3, paint);
            canvas.save();
            this.B.setBounds(i13, i14, (getWidth() - width) - 16, (((getWidth() + i12) - width) - width) - 16);
            this.B.draw(canvas);
            canvas.restore();
            canvas.restore();
            float width4 = getWidth() / 2.0f;
            float f10 = i12;
            float f11 = width;
            float width5 = ((getWidth() / 2.0f) + f10) - f11;
            float f12 = iX;
            float fRound = ((Math.round((i10 / 4.65f) / f12) * iX) / 2) * 0.75f;
            canvas.drawCircle(width4, width5, fRound, paint);
            TelegramQRCodeWriter.drawSideQuads(canvas, f11, f10, paint, 7.0f, f12, 16, i11, 0.75f, this.H, true);
            if (this.I || (k11Var = this.f42756e) == null) {
                return;
            }
            y11 y11Var = k11Var.f39572a;
            y11Var.f44668c.set((int) (width4 - fRound), (int) (width5 - fRound), (int) (width4 + fRound), (int) (width5 + fRound));
            y11Var.A.requestLayout();
            this.I = true;
        }
    }

    public final void b(int i10, int i11) {
        String upperCase;
        int i12;
        float f10;
        int imageSize;
        StaticLayout staticLayoutC;
        int i13;
        Drawable drawable;
        Integer num;
        if (i10 == 0 || i11 == 0) {
            return;
        }
        if ((TextUtils.isEmpty(this.C) && !this.f42759r) || TextUtils.isEmpty(this.E)) {
            AndroidUtilities.runOnUIThread(new q11(this, 1));
            return;
        }
        if (this.f42759r) {
            upperCase = null;
        } else {
            upperCase = this.D ? this.C : this.C.toUpperCase();
        }
        if (TextUtils.equals(upperCase, this.M) && TextUtils.equals(this.E, this.N) && (num = this.K) != null && this.L != null && num.intValue() == i10 && this.L.intValue() == i11) {
            return;
        }
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        TextPaint textPaint = new TextPaint(65);
        int i14 = -16777216;
        textPaint.setColor(-16777216);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        int i15 = 2;
        int iZ = org.telegram.messenger.rl.z(20.0f, 2, bitmapCreateBitmap.getWidth());
        if (this.f42759r) {
            i12 = 2;
            f10 = 30.0f;
            imageSize = 0;
            staticLayoutC = null;
        } else {
            int i16 = 0;
            while (true) {
                if (i16 <= i15) {
                    if (i16 == 0) {
                        drawable = getContext().getDrawable(R.drawable.qr_at_large);
                        textPaint.setTextSize(AndroidUtilities.dp(30.0f));
                    } else if (i16 == 1) {
                        drawable = getContext().getDrawable(R.drawable.qr_at_medium);
                        textPaint.setTextSize(AndroidUtilities.dp(25.0f));
                    } else {
                        drawable = getContext().getDrawable(R.drawable.qr_at_small);
                        textPaint.setTextSize(AndroidUtilities.dp(19.0f));
                    }
                    if (drawable != null) {
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        drawable.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s3.c.e(" ", upperCase));
                    if (!this.D) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.s6(drawable), 0, 1, 33);
                    }
                    float fMeasureText = textPaint.measureText(spannableStringBuilder, 1, spannableStringBuilder.length()) + drawable.getBounds().width();
                    if (i16 > 1 || fMeasureText <= iZ) {
                        int i17 = fMeasureText > ((float) iZ) ? 2 : 1;
                        int iDp = i17 > 1 ? AndroidUtilities.dp(2.0f) + (((int) (drawable.getBounds().width() + fMeasureText)) / 2) : iZ;
                        if (iDp > iZ) {
                            iDp = AndroidUtilities.dp(4.0f) + (((int) (fMeasureText + drawable.getBounds().width())) / 3);
                            i17 = 3;
                        }
                        int i18 = iDp;
                        imageSize = 0;
                        i12 = 2;
                        f10 = 30.0f;
                        staticLayoutC = org.telegram.ui.Components.tv0.c(spannableStringBuilder, textPaint, i18, Layout.Alignment.ALIGN_CENTER, 0.0f, false, null, Math.min(AndroidUtilities.dp(10.0f) + i18, bitmapCreateBitmap.getWidth()), i17, true);
                    } else {
                        i16++;
                        i14 = -16777216;
                        i15 = 2;
                    }
                } else {
                    i12 = 2;
                    f10 = 30.0f;
                    imageSize = 0;
                    staticLayoutC = null;
                }
            }
        }
        float lineCount = (staticLayoutC == null ? 0 : staticLayoutC.getLineCount()) * (textPaint.descent() - textPaint.ascent());
        int iZ2 = org.telegram.messenger.rl.z(f10, i12, i10);
        HashMap map = new HashMap();
        map.put(lb.b.f15507a, qb.b.M);
        map.put(lb.b.f15509c, Integer.valueOf(imageSize));
        TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
        int i19 = 3;
        Bitmap bitmapEncode = null;
        while (true) {
            if (i19 >= 5) {
                i13 = -16777216;
                break;
            }
            try {
                map.put(lb.b.d, Integer.valueOf(i19));
                bitmapEncode = telegramQRCodeWriter.encode(this.E, iZ2, iZ2, map, null, 0.75f, 16777215, -16777216);
                i13 = -16777216;
                try {
                    imageSize = telegramQRCodeWriter.getImageSize();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                i13 = -16777216;
            }
            if (bitmapEncode != null) {
                break;
            } else {
                i19++;
            }
        }
        final int i20 = imageSize;
        if (bitmapEncode == null) {
            return;
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(16777215);
        float width = (i10 - bitmapEncode.getWidth()) / 2.0f;
        float f11 = i11;
        float f12 = 0.15f * f11;
        if (staticLayoutC != null && staticLayoutC.getLineCount() == 3) {
            f12 = 0.13f * f11;
        }
        if (((ViewGroup) getParent()).getMeasuredWidth() >= ((ViewGroup) getParent()).getMeasuredHeight()) {
            f12 = 0.09f * f11;
        }
        canvas.drawBitmap(bitmapEncode, width, f12, new Paint(3));
        Paint paint = new Paint(1);
        paint.setColor(i13);
        final float width2 = (bitmapEncode.getWidth() * 0.5f) + width;
        final float width3 = (bitmapEncode.getWidth() * 0.5f) + f12;
        canvas.drawCircle(width2, width3, i20 * 0.5f, paint);
        if (staticLayoutC != null) {
            float width4 = (canvas.getWidth() - staticLayoutC.getWidth()) * 0.5f;
            float height = ((((canvas.getHeight() - (f12 + bitmapEncode.getHeight())) - lineCount) * 0.5f) + (bitmapEncode.getHeight() + f12)) - AndroidUtilities.dp(4.0f);
            canvas.save();
            canvas.translate(width4, height);
            staticLayoutC.draw(canvas);
            canvas.restore();
            bitmapEncode.recycle();
        }
        this.K = Integer.valueOf(i10);
        this.L = Integer.valueOf(i11);
        this.M = upperCase;
        this.N = this.E;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                t11 t11Var = this.f42392a;
                Bitmap bitmap = t11Var.h;
                t11Var.h = bitmapCreateBitmap.extractAlpha();
                if (!t11Var.O) {
                    t11Var.f42762x.d(0.0f, true);
                }
                t11Var.O = false;
                Bitmap bitmap2 = t11Var.f42758n;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                t11Var.f42758n = bitmap;
                k11 k11Var = t11Var.f42756e;
                if (k11Var != null) {
                    float f13 = i20 * 0.5f;
                    float f14 = width2;
                    float f15 = width3;
                    y11 y11Var = k11Var.f39572a;
                    y11Var.f44668c.set((int) (f14 - f13), (int) (f15 - f13), (int) (f14 + f13), (int) (f15 + f13));
                    y11Var.A.requestLayout();
                    t11Var.I = true;
                }
                t11Var.invalidate();
            }
        });
    }

    public final void c(String str, String str2, boolean z10, boolean z11) {
        this.G = true;
        this.C = str2;
        this.D = z10;
        if (z11) {
            TLRPC.TL_exportedContactToken cachedContactToken = MessagesController.getInstance(UserConfig.selectedAccount).getCachedContactToken();
            if (cachedContactToken != null) {
                this.E = cachedContactToken.url;
                this.F = cachedContactToken.expires;
            } else {
                this.E = null;
            }
        } else {
            this.E = str;
        }
        this.f42759r = z11;
        Utilities.themeQueue.postRunnable(new r11(this, getWidth(), getHeight(), 0));
        invalidate();
        this.J.run();
    }

    public final void d(boolean z10) {
        if (this.f42759r) {
            if (!z10) {
                this.f42761w = null;
                return;
            }
            if (this.v == null) {
                this.v = new TextPaint(1);
            }
            this.v.setShader(this.d);
            this.v.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            this.v.setTextSize(AndroidUtilities.dp(25.0f));
            String str = this.C;
            if (str == null) {
                str = "";
            }
            this.f42761w = org.telegram.ui.Components.tv0.c(Emoji.replaceEmoji(str, this.v.getFontMetricsInt(), false), this.v, getWidth(), Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, getWidth() - AndroidUtilities.dp(60.0f), 1, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J.run();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.oi0 oi0Var = this.B;
        if (oi0Var != null) {
            oi0Var.stop();
            this.B.A(false);
            this.B = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        super.onDraw(canvas);
        Bitmap bitmap = this.f42757f;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        float fD = this.f42762x.d(1.0f, false);
        boolean z10 = fD > 0.0f && fD < 1.0f;
        Paint paint = this.f42754b;
        if (fD >= 1.0f) {
            i10 = 255;
            i11 = 31;
            f10 = 120.0f;
        } else {
            if (z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, 255, 31);
            }
            Bitmap bitmap2 = this.f42758n;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
            } else {
                a(canvas);
            }
            if (z10) {
                float fDp = AndroidUtilities.dp(120.0f);
                canvas.save();
                canvas.translate(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, fD, getHeight() + fDp, -fDp));
                i10 = 255;
                i11 = 31;
                f10 = 120.0f;
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight() + fDp, this.A);
                canvas.restore();
                canvas.restore();
            } else {
                i10 = 255;
                i11 = 31;
                f10 = 120.0f;
            }
        }
        if (fD > 0.0f) {
            if (z10) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF2, i10, i11);
            }
            Bitmap bitmap3 = this.h;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
                this.f42753a.z();
            } else {
                a(canvas);
            }
            if (z10) {
                float fDp2 = AndroidUtilities.dp(f10);
                canvas.save();
                float f11 = -fDp2;
                canvas.translate(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, fD, getHeight() + fDp2, f11));
                canvas.drawRect(0.0f, f11 - getHeight(), getWidth(), getHeight() + fDp2, this.f42763y);
                canvas.restore();
                canvas.restore();
            }
        }
        if (this.f42759r) {
            float fDp3 = AndroidUtilities.dp(6.0f) + getWidth();
            if (this.f42761w != null) {
                canvas.save();
                canvas.translate(0.0f, fDp3);
                if (this.f42761w.getWidth() != getWidth()) {
                    d(true);
                }
                this.f42761w.draw(canvas);
                canvas.restore();
                return;
            }
            int i12 = (int) fDp3;
            int width = getWidth();
            int iDp = AndroidUtilities.dp(40.0f) + i12;
            org.telegram.ui.Components.tn0 tn0Var = this.f42760s;
            tn0Var.setBounds(0, i12, width, iDp);
            tn0Var.draw(canvas);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        Bitmap bitmap = this.f42757f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f42757f = null;
        }
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float fDp = AndroidUtilities.dp(4.0f);
        float f10 = P;
        paint.setShadowLayer(fDp, 0.0f, f10, 251658240);
        this.f42757f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f42757f);
        float f11 = i10;
        RectF rectF = new RectF(f10, f10, f11 - f10, getHeight() - f10);
        float f12 = Q;
        canvas.drawRoundRect(rectF, f12, f12, paint);
        if (this.G) {
            Utilities.themeQueue.postRunnable(new r11(this, i10, i11, 1));
        }
        float fMax = Math.max((getWidth() * 1.0f) / this.f42753a.f30929k.getWidth(), (getHeight() * 1.0f) / this.f42753a.f30929k.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(fMax, fMax);
        this.f42755c.setLocalMatrix(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(fMax, fMax);
        matrix2.postTranslate(f11 / 2.0f, AndroidUtilities.dp(6.0f) + getWidth());
        this.d.setLocalMatrix(matrix2);
    }
}
