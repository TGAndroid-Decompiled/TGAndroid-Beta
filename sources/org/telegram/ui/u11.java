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
public final class u11 extends View {
    public static final float P = AndroidUtilities.dp(2.0f);
    public static final float Q = AndroidUtilities.dp(20.0f);
    public final Paint A;
    public org.telegram.ui.Components.mi0 B;
    public String C;
    public boolean D;
    public String E;
    public int F;
    public boolean G;
    public final float[] H;
    public boolean I;
    public final r11 J;
    public Integer K;
    public Integer L;
    public String M;
    public String N;
    public boolean O;
    public final org.telegram.ui.Components.jb0 f43100a;
    public final Paint f43101b;
    public final BitmapShader f43102c;
    public final BitmapShader d;
    public l11 f43103e;
    public Bitmap f43104f;
    public Bitmap h;
    public Bitmap f43105n;
    public boolean f43106r;
    public final org.telegram.ui.Components.sn0 f43107s;
    public TextPaint v;
    public StaticLayout f43108w;
    public final org.telegram.ui.Components.y5 f43109x;
    public final Paint f43110y;

    public u11(Context context) {
        super(context);
        org.telegram.ui.Components.jb0 jb0Var = new org.telegram.ui.Components.jb0();
        this.f43100a = jb0Var;
        Paint paint = new Paint(1);
        this.f43101b = paint;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f43109x = new org.telegram.ui.Components.y5(1.0f, this, 0L, 2000L, grVar);
        Paint paint2 = new Paint(1);
        this.f43110y = paint2;
        Paint paint3 = new Paint(1);
        this.A = paint3;
        this.H = new float[8];
        this.J = new r11(this, 0);
        this.O = true;
        jb0Var.N = true;
        jb0Var.r(this);
        Bitmap bitmap = jb0Var.f29698k;
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f43102c = bitmapShader;
        BitmapShader bitmapShader2 = new BitmapShader(jb0Var.f29698k, tileMode, tileMode);
        this.d = bitmapShader2;
        paint.setShader(bitmapShader);
        org.telegram.ui.Components.sn0 sn0Var = new org.telegram.ui.Components.sn0(this);
        this.f43107s = sn0Var;
        sn0Var.k(0.35f, 300L, grVar);
        sn0Var.setCallback(this);
        sn0Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        sn0Var.f29332a.setShader(bitmapShader2);
        sn0Var.f29333b = 17;
        sn0Var.t(AndroidUtilities.dp(35.0f));
        sn0Var.q("", true, true);
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode2));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode2));
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(Canvas canvas) {
        int i9;
        float f10;
        l11 l11Var;
        if (this.B != null) {
            int y10 = org.telegram.messenger.ll.y(60.0f, getWidth(), 33);
            int i10 = (y10 * 33) + 32;
            int width = (getWidth() - i10) / 2;
            int height = (int) (getHeight() * 0.15f);
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                height = (int) (getHeight() * 0.09f);
            }
            int i11 = height;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, 255, 31);
            int i12 = width + 16;
            int i13 = i11 + 16;
            Paint paint = this.f43101b;
            canvas.drawRect(i12, i13, (getWidth() - width) - 16, (((getWidth() + i11) - width) - width) - 16, paint);
            canvas.save();
            this.B.setBounds(i12, i13, (getWidth() - width) - 16, (((getWidth() + i11) - width) - width) - 16);
            this.B.draw(canvas);
            canvas.restore();
            canvas.restore();
            float width2 = getWidth() / 2.0f;
            float f11 = i11;
            float f12 = width;
            float width3 = ((getWidth() / 2.0f) + f11) - f12;
            float round = ((Math.round((i9 / 4.65f) / f10) * y10) / 2) * 0.75f;
            canvas.drawCircle(width2, width3, round, paint);
            TelegramQRCodeWriter.drawSideQuads(canvas, f12, f11, paint, 7.0f, y10, 16, i10, 0.75f, this.H, true);
            if (!this.I && (l11Var = this.f43103e) != null) {
                z11 z11Var = l11Var.f39969a;
                z11Var.f45002c.set((int) (width2 - round), (int) (width3 - round), (int) (width2 + round), (int) (width3 + round));
                z11Var.A.requestLayout();
                this.I = true;
            }
        }
    }

    public final void b(int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u11.b(int, int):void");
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
        this.f43106r = z11;
        Utilities.themeQueue.postRunnable(new s11(this, getWidth(), getHeight(), 0));
        invalidate();
        this.J.run();
    }

    public final void d(boolean z10) {
        if (!this.f43106r) {
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
            this.f43108w = org.telegram.ui.Components.rv0.c(Emoji.replaceEmoji(str, this.v.getFontMetricsInt(), false), this.v, getWidth(), Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, getWidth() - AndroidUtilities.dp(60.0f), 1, true);
            return;
        }
        this.f43108w = null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J.run();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.mi0 mi0Var = this.B;
        if (mi0Var != null) {
            mi0Var.stop();
            this.B.A(false);
            this.B = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u11.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 == i11 && i10 == i12) {
            return;
        }
        Bitmap bitmap = this.f43104f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f43104f = null;
        }
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f10 = P;
        paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, f10, 251658240);
        this.f43104f = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f43104f);
        float f11 = i9;
        RectF rectF = new RectF(f10, f10, f11 - f10, getHeight() - f10);
        float f12 = Q;
        canvas.drawRoundRect(rectF, f12, f12, paint);
        if (this.G) {
            Utilities.themeQueue.postRunnable(new s11(this, i9, i10, 1));
        }
        float max = Math.max((getWidth() * 1.0f) / this.f43100a.f29698k.getWidth(), (getHeight() * 1.0f) / this.f43100a.f29698k.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        this.f43102c.setLocalMatrix(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(max, max);
        matrix2.postTranslate(f11 / 2.0f, AndroidUtilities.dp(6.0f) + getWidth());
        this.d.setLocalMatrix(matrix2);
    }
}
