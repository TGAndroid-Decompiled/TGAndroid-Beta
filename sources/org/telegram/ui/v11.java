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
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v11 extends View {
    public static final float P = AndroidUtilities.dp(2.0f);
    public static final float Q = AndroidUtilities.dp(20.0f);
    public final Paint A;
    public org.telegram.ui.Components.xi0 B;
    public String C;
    public boolean D;
    public String E;
    public int F;
    public boolean G;
    public final float[] H;
    public boolean I;
    public final s11 J;
    public Integer K;
    public Integer L;
    public String M;
    public String N;
    public boolean O;
    public final org.telegram.ui.Components.yb0 f43392a;
    public final Paint f43393b;
    public final BitmapShader f43394c;
    public final BitmapShader d;
    public m11 f43395e;
    public Bitmap f43396f;
    public Bitmap h;
    public Bitmap f43397n;
    public boolean f43398r;
    public final org.telegram.ui.Components.do0 f43399s;
    public TextPaint v;
    public StaticLayout f43400w;
    public final org.telegram.ui.Components.d6 f43401x;
    public final Paint f43402y;

    public v11(Context context) {
        super(context);
        org.telegram.ui.Components.yb0 yb0Var = new org.telegram.ui.Components.yb0();
        this.f43392a = yb0Var;
        Paint paint = new Paint(1);
        this.f43393b = paint;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.f43401x = new org.telegram.ui.Components.d6(1.0f, this, 0L, 2000L, jrVar);
        Paint paint2 = new Paint(1);
        this.f43402y = paint2;
        Paint paint3 = new Paint(1);
        this.A = paint3;
        this.H = new float[8];
        this.J = new s11(this, 0);
        this.O = true;
        yb0Var.N = true;
        yb0Var.r(this);
        Bitmap bitmap = yb0Var.f35026k;
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f43394c = bitmapShader;
        BitmapShader bitmapShader2 = new BitmapShader(yb0Var.f35026k, tileMode, tileMode);
        this.d = bitmapShader2;
        paint.setShader(bitmapShader);
        org.telegram.ui.Components.do0 do0Var = new org.telegram.ui.Components.do0(this);
        this.f43399s = do0Var;
        do0Var.k(0.35f, 300L, jrVar);
        do0Var.setCallback(this);
        do0Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        do0Var.f30861a.setShader(bitmapShader2);
        do0Var.f30862b = 17;
        do0Var.t(AndroidUtilities.dp(35.0f));
        do0Var.q("", true, true);
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode2));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode2));
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(Canvas canvas) {
        int i10;
        float f9;
        m11 m11Var;
        if (this.B != null) {
            int x4 = b.x(60.0f, getWidth(), 33);
            int i11 = (x4 * 33) + 32;
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
            Paint paint = this.f43393b;
            canvas.drawRect(i13, i14, (getWidth() - width) - 16, (((getWidth() + i12) - width) - width) - 16, paint);
            canvas.save();
            this.B.setBounds(i13, i14, (getWidth() - width) - 16, (((getWidth() + i12) - width) - width) - 16);
            this.B.draw(canvas);
            canvas.restore();
            canvas.restore();
            float width2 = getWidth() / 2.0f;
            float f10 = i12;
            float f11 = width;
            float width3 = ((getWidth() / 2.0f) + f10) - f11;
            float round = ((Math.round((i10 / 4.65f) / f9) * x4) / 2) * 0.75f;
            canvas.drawCircle(width2, width3, round, paint);
            TelegramQRCodeWriter.drawSideQuads(canvas, f11, f10, paint, 7.0f, x4, 16, i11, 0.75f, this.H, true);
            if (!this.I && (m11Var = this.f43395e) != null) {
                a21 a21Var = m11Var.f40343a;
                a21Var.f36405c.set((int) (width2 - round), (int) (width3 - round), (int) (width2 + round), (int) (width3 + round));
                a21Var.A.requestLayout();
                this.I = true;
            }
        }
    }

    public final void b(int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v11.b(int, int):void");
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
        this.f43398r = z11;
        Utilities.themeQueue.postRunnable(new t11(this, getWidth(), getHeight(), 0));
        invalidate();
        this.J.run();
    }

    public final void d(boolean z10) {
        if (!this.f43398r) {
            return;
        }
        if (z10) {
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
            this.f43400w = org.telegram.ui.Components.bw0.c(Emoji.replaceEmoji(str, this.v.getFontMetricsInt(), false), this.v, getWidth(), Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, getWidth() - AndroidUtilities.dp(60.0f), 1, true);
            return;
        }
        this.f43400w = null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J.run();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.xi0 xi0Var = this.B;
        if (xi0Var != null) {
            xi0Var.stop();
            this.B.A(false);
            this.B = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v11.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        Bitmap bitmap = this.f43396f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f43396f = null;
        }
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f9 = P;
        paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, f9, 251658240);
        this.f43396f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f43396f);
        float f10 = i10;
        RectF rectF = new RectF(f9, f9, f10 - f9, getHeight() - f9);
        float f11 = Q;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        if (this.G) {
            Utilities.themeQueue.postRunnable(new t11(this, i10, i11, 1));
        }
        float max = Math.max((getWidth() * 1.0f) / this.f43392a.f35026k.getWidth(), (getHeight() * 1.0f) / this.f43392a.f35026k.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        this.f43394c.setLocalMatrix(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(max, max);
        matrix2.postTranslate(f10 / 2.0f, AndroidUtilities.dp(6.0f) + getWidth());
        this.d.setLocalMatrix(matrix2);
    }
}
