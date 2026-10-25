package sg;

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
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.q11;
public class p0 extends View {
    public final Paint E;
    public boolean F;
    public q11 G;
    public final Paint H;
    public boolean I;
    public q11 J;
    public boolean K;
    public q11 L;
    public boolean M;
    public final TextPaint N;
    public StaticLayout O;
    public float P;
    public float Q;
    public boolean R;
    public boolean S;
    public final ImageReceiver T;
    public boolean U;
    public int V;
    public o0 W;
    public int f48402a;
    public float f48403a0;
    public int f48404b;
    public float f48405b0;
    public boolean f48406c;
    public float f48407c0;
    public boolean d;
    public float f48408d0;
    public final float e;
    public int f48409e0;
    public final int f48410f;
    public final RectF f48411f0;
    public final RectF f48412g0;
    public final int h;
    public final Path f48413h0;
    public final Path f48414i0;
    public final RectF f48415j0;
    public final RectF f48416k0;
    public final h6 f48417l0;
    public final h6 m0;
    public float f48418n;
    public final h6 f48419n0;
    public final h6 f48420o0;
    public final h6 f48421p0;
    public final h6 f48422q0;
    public final TextPaint f48423r;
    public final h6 f48424r0;
    public StaticLayout f48425s;
    public final h6 f48426s0;
    public float v;
    public float f48427w;
    public final RectF f48428x;
    public final Drawable f48429y;

    public p0(Context context, float f7) {
        super(context);
        this.f48406c = true;
        this.f48418n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f48423r = textPaint;
        this.f48428x = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.E = new Paint(1);
        this.H = new Paint(1);
        this.N = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.T = imageReceiver;
        this.f48411f0 = new RectF();
        this.f48412g0 = new RectF();
        this.f48413h0 = new Path();
        this.f48414i0 = new Path();
        this.f48415j0 = new RectF();
        this.f48416k0 = new RectF();
        ds dsVar = ds.h;
        this.f48417l0 = new h6(this, 0L, 350L, dsVar);
        this.m0 = new h6(this, 0L, 350L, dsVar);
        this.f48419n0 = new h6(this, 0L, 350L, dsVar);
        this.f48420o0 = new h6(this, 0L, 350L, dsVar);
        this.f48421p0 = new h6(this, 0L, 350L, dsVar);
        this.f48422q0 = new h6(this, 0L, 350L, dsVar);
        this.f48424r0 = new h6(this, 0L, 350L, dsVar);
        this.f48426s0 = new h6(this, 0L, 350L, dsVar);
        this.e = f7;
        imageReceiver.setInvalidateAll(true);
        this.f48410f = (int) (f7 * 3.0f);
        this.h = (int) (f7 * 1.0f);
        this.f48429y = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f7);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    public final void a(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: sg.p0.a(android.graphics.Canvas):void");
    }

    public final void b(int i10, o0 o0Var, boolean z10) {
        this.f48402a = i10;
        if (this.W == o0Var && !z10) {
            return;
        }
        this.W = o0Var;
        this.f48406c = true;
        this.d = z10;
        requestLayout();
    }

    public final void c(int i10, int i11) {
        int i12 = -16777216;
        Drawable drawable = this.f48429y;
        TextPaint textPaint = this.f48423r;
        if (i10 == 0) {
            this.f48409e0 = i11;
            if (AndroidUtilities.computePerceivedBrightness(i11) < 0.721f) {
                i12 = -1;
            }
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            this.f48409e0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 2) {
            this.f48409e0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f48409e0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        double d;
        String str2;
        MessagesController.PeerColor peerColor;
        int color1;
        boolean z10;
        float f7;
        int i10;
        float f10;
        int i11;
        int i12;
        ImageLocation forDocument;
        int i13;
        float f11;
        float f12;
        int i14;
        boolean z11;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        ImageLocation forPhoto;
        if (this.f48406c && this.W != null) {
            boolean e = e();
            int i15 = this.f48410f;
            float f18 = this.e;
            if (e) {
                if (TextUtils.isEmpty(this.W.f48392b)) {
                    str2 = this.W.f48393c;
                } else {
                    str2 = this.W.f48392b;
                }
                TLRPC.WebPage webPage = this.W.d;
                float f19 = (this.f48404b - i15) - i15;
                this.f48405b0 = 0.0f;
                this.f48403a0 = 0.0f;
                this.f48407c0 = 0.0f;
                int colorId = UserObject.getColorId(UserConfig.getInstance(this.f48402a).getCurrentUser());
                MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f48402a).peerColors;
                String str3 = null;
                if (peerColors != null && colorId >= 7) {
                    peerColor = peerColors.getColor(colorId);
                } else {
                    peerColor = null;
                }
                if (peerColor == null) {
                    int[] iArr = y6.f23614r8;
                    color1 = y6.x0(null, iArr[colorId % iArr.length], false);
                } else {
                    color1 = peerColor.getColor1();
                }
                this.H.setColor(color1);
                this.f48405b0 = (7.33f * f18) + this.f48405b0;
                this.F = this.W.f48394f;
                q11 q11Var = new q11(str2, 16.0f, null);
                q11Var.f31786a.setTextSize(16.0f * f18);
                float f20 = 20.0f * f18;
                q11Var.q(f19 - f20);
                this.G = q11Var;
                this.f48403a0 = Math.max(this.f48403a0, Math.min(f20 + q11Var.f31788c, f19));
                float f21 = 7.0f * f18;
                this.f48405b0 = this.G.j() + this.f48405b0 + f21;
                if (webPage.photo == null && !MessageObject.isVideoDocument(webPage.document)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.R = z10;
                o0 o0Var = this.W;
                boolean z12 = o0Var.e;
                this.S = !z12;
                if (this.U && (o0Var.f48391a & 4) != 0) {
                    i10 = o0Var.f48395i;
                } else {
                    if (!z12) {
                        f7 = 48.0f;
                    } else {
                        f7 = (f19 / f18) - 40.0f;
                    }
                    i10 = 2 * ((int) f7);
                }
                ImageReceiver imageReceiver = this.T;
                imageReceiver.setRoundRadius((int) (4.0f * f18));
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1, false, null, false);
                    f10 = 48.0f;
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, (int) (i10 * f18), false, closestPhotoSizeWithSize, false);
                    if (closestPhotoSizeWithSize2 != null) {
                        i12 = closestPhotoSizeWithSize2.f22052w;
                        i11 = closestPhotoSizeWithSize2.h;
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                    ImageLocation forPhoto2 = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo);
                    String k10 = a1.g.k(i10, i10, "_");
                    if (this.U) {
                        forPhoto = null;
                    } else {
                        forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo);
                    }
                    if (!this.U) {
                        str3 = a1.g.k(i10, i10, "_");
                    }
                    imageReceiver.setImage(forPhoto2, k10, forPhoto, str3, 0L, null, null, 0);
                } else {
                    f10 = 48.0f;
                    TLRPC.Document document = webPage.document;
                    if (document != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1, false, null, false);
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(webPage.document.thumbs, (int) (i10 * f18), false, closestPhotoSizeWithSize3, false);
                        if (closestPhotoSizeWithSize4 != null) {
                            i12 = closestPhotoSizeWithSize4.f22052w;
                            i11 = closestPhotoSizeWithSize4.h;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document);
                        String k11 = a1.g.k(i10, i10, "_");
                        if (this.U) {
                            forDocument = null;
                        } else {
                            forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document);
                        }
                        if (!this.U) {
                            str3 = a1.g.k(i10, i10, "_");
                        }
                        imageReceiver.setImage(forDocument2, k11, forDocument, str3, 0L, null, null, 0);
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                }
                this.f48407c0 = (5.66f * f18) + this.f48407c0;
                boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
                this.K = !isEmpty;
                if (!isEmpty) {
                    q11 q11Var2 = new q11(webPage.site_name, 14.0f, AndroidUtilities.bold());
                    q11Var2.f31786a.setTextSize(f18 * 14.0f);
                    float f22 = f18 * 40.0f;
                    float f23 = f19 - f22;
                    if (this.R && this.S) {
                        f16 = f18 * 60.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    q11Var2.q((int) Math.ceil(f23 - f16));
                    this.L = q11Var2;
                    float f24 = this.f48403a0;
                    float f25 = f22 + q11Var2.f31788c;
                    if (this.R && this.S) {
                        f17 = f18 * 60.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    this.f48403a0 = Math.max(f24, Math.min(f25 + f17, f19));
                    this.f48407c0 = (f18 * 2.66f) + this.L.j() + this.f48407c0;
                    i13 = this.L.f31787b.getLineCount();
                } else {
                    i13 = 0;
                }
                boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
                this.I = !isEmpty2;
                if (!isEmpty2) {
                    q11 q11Var3 = new q11(webPage.title, 14.0f, AndroidUtilities.bold());
                    q11Var3.f31786a.setTextSize(f18 * 14.0f);
                    float f26 = f18 * 40.0f;
                    float f27 = f19 - f26;
                    f11 = 2.66f;
                    if (this.R && this.S) {
                        f14 = f18 * 60.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    f12 = f18;
                    q11Var3.q((int) Math.ceil(f27 - f14));
                    this.J = q11Var3;
                    float f28 = this.f48403a0;
                    float f29 = f26 + q11Var3.f31788c;
                    if (this.R && this.S) {
                        f15 = 60.0f * f12;
                    } else {
                        f15 = 0.0f;
                    }
                    this.f48403a0 = Math.max(f28, Math.min(f29 + f15, f19));
                    this.f48407c0 = (f12 * 2.66f) + this.J.j() + this.f48407c0;
                    i13 += this.J.f31787b.getLineCount();
                } else {
                    f11 = 2.66f;
                    f12 = f18;
                }
                boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
                this.M = !isEmpty3;
                if (!isEmpty3) {
                    TextPaint textPaint = this.N;
                    textPaint.setTextSize(f12 * 14.0f);
                    String str4 = webPage.description;
                    float f30 = f12 * 40.0f;
                    int ceil = (int) Math.ceil(Math.max(1.0f, f19 - f30));
                    if (this.R && this.S) {
                        i14 = 60;
                    } else {
                        i14 = 0;
                    }
                    int i16 = 3 - i13;
                    this.O = org.telegram.ui.Cells.s1.u2(str4, textPaint, ceil, (int) Math.ceil(Math.max(1.0f, f19 - ((40 + i14) * f12))), i16, 4);
                    this.P = 0.0f;
                    this.Q = Float.MAX_VALUE;
                    for (int i17 = 0; i17 < this.O.getLineCount(); i17++) {
                        if (this.R && this.S && i17 < i16) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f31 = this.P;
                        float lineWidth = this.O.getLineWidth(i17);
                        if (z11) {
                            f13 = f12 * f10;
                        } else {
                            f13 = 0.0f;
                        }
                        this.P = Math.max(f31, lineWidth + f13);
                        this.Q = Math.min(this.Q, this.O.getLineLeft(i17));
                    }
                    this.f48403a0 = Math.max(this.f48403a0, Math.min(f30 + this.P, f19));
                    this.f48407c0 = (f12 * f11) + this.f48407c0 + this.O.getHeight();
                }
                if (this.R && !this.S) {
                    if (i12 > 0 && i11 > 0) {
                        this.f48408d0 = Math.min((Math.max(0.0f, this.f48403a0 - (f12 * 40.0f)) / i12) * i11, f12 * 200.0f);
                    } else {
                        this.f48408d0 = f12 * 120.0f;
                    }
                    this.f48407c0 = (f12 * f11) + this.f48407c0 + this.f48408d0;
                }
                float f32 = f21 + this.f48407c0;
                this.f48407c0 = f32;
                this.f48405b0 = (f12 * 11.0f) + this.f48405b0 + f32;
            } else {
                if (TextUtils.isEmpty(this.W.f48392b)) {
                    String str5 = this.W.f48393c;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    str = str5.toUpperCase();
                } else {
                    str = this.W.f48392b;
                }
                RectF rectF = this.f48428x;
                float f33 = ((this.f48404b - i15) - i15) - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f18);
                this.f48418n = 1.0f;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f48423r;
                this.f48425s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, (int) Math.ceil(d), truncateAt), textPaint2, (int) Math.ceil(f33), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.v = 0.0f;
                this.f48427w = Float.MAX_VALUE;
                for (int i18 = 0; i18 < this.f48425s.getLineCount(); i18++) {
                    this.v = Math.max(this.v, this.f48425s.getLineWidth(i18));
                    this.f48427w = Math.min(this.f48427w, this.f48425s.getLineLeft(i18));
                }
                if (this.f48425s.getLineCount() > 2) {
                    this.f48418n = 0.3f;
                } else {
                    this.f48418n = Math.min(1.0f, f33 / this.v);
                }
                this.f48403a0 = (this.v * this.f48418n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f18);
                this.f48405b0 = Math.max(f18 * 30.0f, this.f48425s.getHeight() * this.f48418n) + ((rectF.top + rectF.bottom) * f18);
            }
            if (!this.d) {
                this.f48417l0.f(this.F, true);
                this.f48419n0.f(this.S, true);
                this.m0.f(this.R, true);
                this.f48422q0.d(this.f48407c0, true);
            } else {
                invalidate();
            }
            this.f48406c = false;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        o0 o0Var = this.W;
        if (o0Var != null && o0Var.d != null) {
            return true;
        }
        return false;
    }

    public int getPhotoSide() {
        float f7;
        if (this.S) {
            f7 = 48.0f;
        } else {
            int i10 = this.f48404b;
            int i11 = this.f48410f;
            f7 = (((i10 - i11) - i11) / this.e) - 40.0f;
        }
        return ((int) f7) * 2;
    }

    public int getPreviewType() {
        return this.V;
    }

    public float getRadius() {
        float f7;
        float f10;
        if (e()) {
            f7 = 16.66f;
            f10 = this.e;
        } else {
            f7 = 0.2f;
            f10 = this.f48405b0;
        }
        return f10 * f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d();
        int i12 = this.f48410f;
        int ceil = ((int) Math.ceil(this.f48403a0)) + i12 + i12;
        int ceil2 = (int) Math.ceil(this.f48405b0);
        int i13 = this.h;
        setMeasuredDimension(ceil, ceil2 + i13 + i13);
    }

    public void setMaxWidth(int i10) {
        this.f48404b = i10;
        this.f48406c = true;
    }

    public void setPreviewType(int i10) {
        this.V = i10;
        invalidate();
    }
}
