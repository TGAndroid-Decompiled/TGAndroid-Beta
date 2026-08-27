package zf;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.y5;

public class n0 extends View {
    public final Paint A;
    public boolean B;
    public pz0 C;
    public final Paint D;
    public boolean E;
    public pz0 F;
    public boolean G;
    public pz0 H;
    public boolean I;
    public final TextPaint J;
    public StaticLayout K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final ImageReceiver P;
    public boolean Q;
    public int R;
    public m0 S;
    public float T;
    public float U;
    public float V;
    public float W;

    public int f50580a;

    public int f50581a0;

    public int f50582b;

    public final RectF f50583b0;

    public boolean f50584c;

    public final RectF f50585c0;
    public boolean d;

    public final Path f50586d0;

    public final float f50587e;

    public final Path f50588e0;

    public final int f50589f;

    public final RectF f50590f0;

    public final RectF f50591g0;
    public final int h;

    public final y5 f50592h0;

    public final y5 f50593i0;

    public final y5 f50594j0;

    public final y5 f50595k0;

    public final y5 f50596l0;
    public final y5 m0;

    public float f50597n;

    public final y5 f50598n0;

    public final y5 f50599o0;

    public final TextPaint f50600r;

    public StaticLayout f50601s;
    public float v;

    public float f50602w;

    public final RectF f50603x;

    public final Drawable f50604y;

    public n0(Context context, float f10) {
        super(context);
        this.f50584c = true;
        this.f50597n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f50600r = textPaint;
        this.f50603x = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.A = new Paint(1);
        this.D = new Paint(1);
        this.J = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        this.f50583b0 = new RectF();
        this.f50585c0 = new RectF();
        this.f50586d0 = new Path();
        this.f50588e0 = new Path();
        this.f50590f0 = new RectF();
        this.f50591g0 = new RectF();
        er erVar = er.h;
        this.f50592h0 = new y5(this, 0L, 350L, erVar);
        this.f50593i0 = new y5(this, 0L, 350L, erVar);
        this.f50594j0 = new y5(this, 0L, 350L, erVar);
        this.f50595k0 = new y5(this, 0L, 350L, erVar);
        this.f50596l0 = new y5(this, 0L, 350L, erVar);
        this.m0 = new y5(this, 0L, 350L, erVar);
        this.f50598n0 = new y5(this, 0L, 350L, erVar);
        this.f50599o0 = new y5(this, 0L, 350L, erVar);
        this.f50587e = f10;
        imageReceiver.setInvalidateAll(true);
        this.f50589f = (int) (f10 * 3.0f);
        this.h = (int) (f10 * 1.0f);
        this.f50604y = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f10);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        pz0 pz0Var;
        pz0 pz0Var2;
        Canvas canvas2 = canvas;
        d();
        float fD = this.f50598n0.d(this.T, false);
        float fD2 = this.f50599o0.d(this.U, false);
        float fE = this.f50596l0.e(this.R == 0);
        float fE2 = this.f50595k0.e(e());
        float f13 = this.f50587e;
        float fLerp = AndroidUtilities.lerp(0.2f * fD2, 16.66f * f13, fE2);
        int i10 = this.f50589f;
        int i11 = this.h;
        RectF rectF = this.f50583b0;
        rectF.set(i10, i11, i10 + fD, i11 + fD2);
        int iD = i0.b.d(fE2, this.f50581a0, i0.b.d(fE, -1, -14670807));
        Paint paint = this.A;
        paint.setColor(iD);
        Path path = this.f50588e0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fLerp, fLerp, direction);
        canvas2.drawPath(path, paint);
        if (fE2 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i10, i11);
            float fE3 = this.f50592h0.e(this.B);
            float fJ = (7.33f * f13) + 0.0f;
            pz0 pz0Var3 = this.C;
            if (pz0Var3 == null || fE3 <= 0.0f) {
                f11 = fE3;
                f10 = 1.0f;
            } else {
                f11 = fE3;
                f10 = 1.0f;
                pz0Var3.c(f13 * 10.0f, pa.b(1.0f, fE3, (15.0f * f13) + this.C.j(), (pz0Var3.j() / 2.0f) + fJ), fE2, -15033089, canvas2);
                fJ = (((7.0f * f13) + this.C.j()) * f11) + fJ;
            }
            float f14 = fJ;
            float fD3 = this.m0.d(this.V, false);
            Paint paint2 = this.D;
            paint2.setAlpha(25);
            float f15 = fD3 + f14;
            RectF rectF2 = this.f50585c0;
            rectF2.set(f13 * 10.0f, f14, fD - (f13 * 10.0f), f15);
            Path path2 = this.f50586d0;
            path2.rewind();
            path2.addRoundRect(rectF2, f13 * 5.0f, f13 * 5.0f, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(255);
            canvas2.drawRect(f13 * 10.0f, f14, 13.0f * f13, f15, paint2);
            canvas.restore();
            float fD4 = (5.66f * f13) + f14;
            if (!this.G || (pz0Var2 = this.H) == null) {
                fE2 = fE2;
                f12 = 2.66f;
            } else {
                float fJ2 = (pz0Var2.j() / 2.0f) + fD4;
                int color = paint2.getColor();
                fE2 = fE2;
                f12 = 2.66f;
                pz0Var2.c(f13 * 20.0f, fJ2, fE2, color, canvas);
                fD4 = com.google.android.recaptcha.internal.a.d(f13, 2.66f, this.H.j(), fD4);
            }
            if (!this.E || (pz0Var = this.F) == null) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                pz0Var.c(f13 * 20.0f, (pz0Var.j() / 2.0f) + fD4, fE2, i0.b.d(fE, -13421773, -1), canvas2);
                fD4 = com.google.android.recaptcha.internal.a.d(f13, f12, this.F.j(), fD4);
            }
            if (this.I && this.K != null) {
                canvas2.save();
                canvas2.translate((f13 * 20.0f) - this.M, fD4);
                this.J.setColor(i0.b.d(fE, -13421773, -1));
                this.J.setAlpha((int) (255.0f * fE2));
                this.K.draw(canvas2);
                canvas2.restore();
                fD4 = com.google.android.recaptcha.internal.a.d(f13, f12, this.K.getHeight(), fD4);
            }
            float fE4 = this.f50593i0.e(this.N);
            if (fE4 > 0.0f) {
                float fE5 = this.f50594j0.e(this.O);
                this.f50590f0.set(f13 * 20.0f, (f13 * f12) + fD4, fD - (20.0f * f13), (f13 * f12) + fD4 + this.W);
                this.f50591g0.set(((fD - (f13 * 10.0f)) - (f13 * 6.0f)) - (48.0f * f13), (f13 * 6.0f) + f14, (fD - (f13 * 10.0f)) - (f13 * 6.0f), (48.0f * f13) + (6.0f * f13) + f14);
                AndroidUtilities.lerp(this.f50590f0, this.f50591g0, fE5, rectF2);
                float f16 = rectF2.left;
                float f17 = rectF2.top;
                float fWidth = rectF2.width();
                float fHeight = rectF2.height();
                ImageReceiver imageReceiver = this.P;
                imageReceiver.setImageCoords(f16, f17, fWidth, fHeight);
                imageReceiver.setAlpha(fE4 * fE2);
                imageReceiver.draw(canvas2);
                fD4 += ((f13 * 2.66f) + this.W) * (f10 - fE5);
            }
            float f18 = (5.0f * f13) + (7.0f * f13) + fD4;
            pz0 pz0Var4 = this.C;
            if (pz0Var4 != null && f10 - f11 > 0.0f) {
                pz0Var4.c(f13 * 10.0f, (pz0Var4.j() / 2.0f) + f18 + (((15.0f * f13) + this.C.j()) * f11), fE2, -15033089, canvas2);
                this.C.j();
            }
            canvas2.restore();
        } else {
            f10 = 1.0f;
        }
        if (fE2 < f10) {
            float f19 = this.f50603x.left;
            int iY = ((int) com.google.android.recaptcha.internal.a.y(f13, 30.0f, fD2, 2.0f)) + i11;
            Drawable drawable = this.f50604y;
            drawable.setBounds(((int) (f19 * f13)) + i10, ((int) com.google.android.recaptcha.internal.a.w(f13, 30.0f, fD2, 2.0f)) + i11, ((int) ((f19 + 30.0f) * f13)) + i10, iY);
            int i12 = (int) ((f10 - fE2) * 255.0f);
            drawable.setAlpha(i12);
            drawable.draw(canvas2);
            if (this.f50601s != null) {
                canvas2.save();
                canvas2.translate(((this.f50603x.left + 30.0f + 3.25f) * f13) + i10, (fD2 / 2.0f) + i11);
                float f20 = this.f50597n;
                canvas2.scale(f20, f20);
                canvas2.translate(-this.f50602w, (-this.f50601s.getHeight()) / 2.0f);
                this.f50600r.setAlpha(i12);
                this.f50601s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i10, m0 m0Var, boolean z10) {
        this.f50580a = i10;
        if (this.S != m0Var || z10) {
            this.S = m0Var;
            this.f50584c = true;
            this.d = z10;
            requestLayout();
        }
    }

    public final void c(int i10, int i11) {
        Drawable drawable = this.f50604y;
        TextPaint textPaint = this.f50600r;
        if (i10 == 0) {
            this.f50581a0 = i11;
            int i12 = AndroidUtilities.computePerceivedBrightness(i11) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            this.f50581a0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 2) {
            this.f50581a0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f50581a0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String upperCase;
        int color1;
        float f10;
        int i10;
        int i11;
        int lineCount;
        float f11;
        float f12;
        if (!this.f50584c || this.S == null) {
            return;
        }
        boolean zE = e();
        int i12 = this.f50589f;
        float f13 = this.f50587e;
        if (zE) {
            String str = TextUtils.isEmpty(this.S.f50569b) ? this.S.f50570c : this.S.f50569b;
            TLRPC.WebPage webPage = this.S.d;
            float f14 = (this.f50582b - i12) - i12;
            this.U = 0.0f;
            this.T = 0.0f;
            this.V = 0.0f;
            int colorId = UserObject.getColorId(UserConfig.getInstance(this.f50580a).getCurrentUser());
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f50580a).peerColors;
            MessagesController.PeerColor color = (peerColors == null || colorId < 7) ? null : peerColors.getColor(colorId);
            if (color == null) {
                int[] iArr = g6.f23303r8;
                color1 = g6.w0(null, iArr[colorId % iArr.length], false);
            } else {
                color1 = color.getColor1();
            }
            this.D.setColor(color1);
            this.U = (7.33f * f13) + this.U;
            this.B = this.S.f50572f;
            pz0 pz0Var = new pz0(str, 16.0f, null);
            pz0Var.f31695a.setTextSize(16.0f * f13);
            float f15 = 20.0f * f13;
            pz0Var.q(f14 - f15);
            this.C = pz0Var;
            this.T = Math.max(this.T, Math.min(f15 + pz0Var.f31697c, f14));
            float f16 = 7.0f * f13;
            this.U = this.C.j() + this.U + f16;
            this.N = webPage.photo != null || MessageObject.isVideoDocument(webPage.document);
            m0 m0Var = this.S;
            boolean z10 = m0Var.f50571e;
            this.O = !z10;
            int i13 = (!this.Q || (m0Var.f50568a & 4) == 0) ? ((int) (!z10 ? 48.0f : (f14 / f13) - 40.0f)) * 2 : m0Var.f50573i;
            ImageReceiver imageReceiver = this.P;
            imageReceiver.setRoundRadius((int) (4.0f * f13));
            TLRPC.Photo photo = webPage.photo;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1, false, null, false);
                f10 = 48.0f;
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, (int) (i13 * f13), false, closestPhotoSizeWithSize, false);
                if (closestPhotoSizeWithSize2 != null) {
                    i11 = closestPhotoSizeWithSize2.f22405w;
                    i10 = closestPhotoSizeWithSize2.h;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo), com.google.android.recaptcha.internal.a.l(i13, "_", i13), this.Q ? null : ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo), this.Q ? null : com.google.android.recaptcha.internal.a.l(i13, "_", i13), 0L, null, null, 0);
            } else {
                f10 = 48.0f;
                TLRPC.Document document = webPage.document;
                if (document != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1, false, null, false);
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(webPage.document.thumbs, (int) (i13 * f13), false, closestPhotoSizeWithSize3, false);
                    if (closestPhotoSizeWithSize4 != null) {
                        i11 = closestPhotoSizeWithSize4.f22405w;
                        i10 = closestPhotoSizeWithSize4.h;
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                    imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document), com.google.android.recaptcha.internal.a.l(i13, "_", i13), this.Q ? null : ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document), this.Q ? null : com.google.android.recaptcha.internal.a.l(i13, "_", i13), 0L, null, null, 0);
                } else {
                    i10 = 0;
                    i11 = 0;
                }
            }
            this.V = (5.66f * f13) + this.V;
            boolean zIsEmpty = TextUtils.isEmpty(webPage.site_name);
            this.G = !zIsEmpty;
            if (zIsEmpty) {
                lineCount = 0;
            } else {
                pz0 pz0Var2 = new pz0(webPage.site_name, 14.0f, AndroidUtilities.bold());
                pz0Var2.f31695a.setTextSize(f13 * 14.0f);
                float f17 = f13 * 40.0f;
                pz0Var2.q((int) Math.ceil((f14 - f17) - ((this.N && this.O) ? f13 * 60.0f : 0.0f)));
                this.H = pz0Var2;
                this.T = Math.max(this.T, Math.min(f17 + pz0Var2.f31697c + ((this.N && this.O) ? f13 * 60.0f : 0.0f), f14));
                this.V = (f13 * 2.66f) + this.H.j() + this.V;
                lineCount = this.H.f31696b.getLineCount();
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(webPage.title);
            this.E = !zIsEmpty2;
            if (zIsEmpty2) {
                f11 = f13;
                f12 = 2.66f;
            } else {
                pz0 pz0Var3 = new pz0(webPage.title, 14.0f, AndroidUtilities.bold());
                pz0Var3.f31695a.setTextSize(f13 * 14.0f);
                float f18 = f13 * 40.0f;
                f12 = 2.66f;
                f11 = f13;
                pz0Var3.q((int) Math.ceil((f14 - f18) - ((this.N && this.O) ? f13 * 60.0f : 0.0f)));
                this.F = pz0Var3;
                this.T = Math.max(this.T, Math.min(f18 + pz0Var3.f31697c + ((this.N && this.O) ? 60.0f * f11 : 0.0f), f14));
                this.V = (f11 * 2.66f) + this.F.j() + this.V;
                lineCount += this.F.f31696b.getLineCount();
            }
            boolean zIsEmpty3 = TextUtils.isEmpty(webPage.description);
            this.I = !zIsEmpty3;
            if (!zIsEmpty3) {
                TextPaint textPaint = this.J;
                textPaint.setTextSize(f11 * 14.0f);
                float f19 = f11 * 40.0f;
                int i14 = 3 - lineCount;
                this.K = org.telegram.ui.Cells.s1.t2(webPage.description, textPaint, (int) Math.ceil(Math.max(1.0f, f14 - f19)), (int) Math.ceil(Math.max(1.0f, f14 - ((40 + ((this.N && this.O) ? 60 : 0)) * f11))), i14, 4);
                this.L = 0.0f;
                this.M = Float.MAX_VALUE;
                int i15 = 0;
                while (i15 < this.K.getLineCount()) {
                    this.L = Math.max(this.L, this.K.getLineWidth(i15) + (this.N && this.O && i15 < i14 ? f11 * f10 : 0.0f));
                    this.M = Math.min(this.M, this.K.getLineLeft(i15));
                    i15++;
                }
                this.T = Math.max(this.T, Math.min(f19 + this.L, f14));
                this.V = (f11 * f12) + this.V + this.K.getHeight();
            }
            if (this.N && !this.O) {
                if (i11 <= 0 || i10 <= 0) {
                    this.W = f11 * 120.0f;
                } else {
                    this.W = Math.min((Math.max(0.0f, this.T - (f11 * 40.0f)) / i11) * i10, f11 * 200.0f);
                }
                this.V = (f11 * f12) + this.V + this.W;
            }
            float f20 = f16 + this.V;
            this.V = f20;
            this.U = (f11 * 11.0f) + this.U + f20;
        } else {
            if (TextUtils.isEmpty(this.S.f50569b)) {
                String strSubstring = this.S.f50570c;
                if (strSubstring.startsWith("https://")) {
                    strSubstring = strSubstring.substring(8);
                }
                upperCase = strSubstring.toUpperCase();
            } else {
                upperCase = this.S.f50569b;
            }
            float f21 = (this.f50582b - i12) - i12;
            RectF rectF = this.f50603x;
            float f22 = f21 - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f13);
            this.f50597n = 1.0f;
            double d = f22;
            float fCeil = (int) Math.ceil(d);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            TextPaint textPaint2 = this.f50600r;
            this.f50601s = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint2, fCeil, truncateAt), textPaint2, (int) Math.ceil(d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.v = 0.0f;
            this.f50602w = Float.MAX_VALUE;
            for (int i16 = 0; i16 < this.f50601s.getLineCount(); i16++) {
                this.v = Math.max(this.v, this.f50601s.getLineWidth(i16));
                this.f50602w = Math.min(this.f50602w, this.f50601s.getLineLeft(i16));
            }
            if (this.f50601s.getLineCount() > 2) {
                this.f50597n = 0.3f;
            } else {
                this.f50597n = Math.min(1.0f, f22 / this.v);
            }
            this.T = (this.v * this.f50597n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f13);
            this.U = Math.max(f13 * 30.0f, this.f50601s.getHeight() * this.f50597n) + ((rectF.top + rectF.bottom) * f13);
        }
        if (this.d) {
            invalidate();
        } else {
            this.f50592h0.f(this.B, true);
            this.f50594j0.f(this.O, true);
            this.f50593i0.f(this.N, true);
            this.m0.d(this.V, true);
        }
        this.f50584c = false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        m0 m0Var = this.S;
        return (m0Var == null || m0Var.d == null) ? false : true;
    }

    public int getPhotoSide() {
        float f10;
        if (this.O) {
            f10 = 48.0f;
        } else {
            int i10 = this.f50582b;
            int i11 = this.f50589f;
            f10 = (((i10 - i11) - i11) / this.f50587e) - 40.0f;
        }
        return ((int) f10) * 2;
    }

    public int getPreviewType() {
        return this.R;
    }

    public float getRadius() {
        float f10;
        float f11;
        if (e()) {
            f10 = 16.66f;
            f11 = this.f50587e;
        } else {
            f10 = 0.2f;
            f11 = this.U;
        }
        return f11 * f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d();
        int iCeil = (int) Math.ceil(this.T);
        int i12 = this.f50589f;
        int i13 = iCeil + i12 + i12;
        int iCeil2 = (int) Math.ceil(this.U);
        int i14 = this.h;
        setMeasuredDimension(i13, iCeil2 + i14 + i14);
    }

    public void setMaxWidth(int i10) {
        this.f50582b = i10;
        this.f50584c = true;
    }

    public void setPreviewType(int i10) {
        this.R = i10;
        invalidate();
    }
}
