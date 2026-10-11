package qg;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.n11;
public class o0 extends View {
    public final Paint E;
    public boolean F;
    public n11 G;
    public final Paint H;
    public boolean I;
    public n11 J;
    public boolean K;
    public n11 L;
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
    public n0 W;
    public int f46538a;
    public float f46539a0;
    public int f46540b;
    public float f46541b0;
    public boolean f46542c;
    public float f46543c0;
    public boolean d;
    public float f46544d0;
    public final float f46545e;
    public int f46546e0;
    public final int f46547f;
    public final RectF f46548f0;
    public final RectF f46549g0;
    public final int h;
    public final Path f46550h0;
    public final Path f46551i0;
    public final RectF f46552j0;
    public final RectF f46553k0;
    public final g6 f46554l0;
    public final g6 m0;
    public float f46555n;
    public final g6 f46556n0;
    public final g6 f46557o0;
    public final g6 f46558p0;
    public final g6 f46559q0;
    public final TextPaint f46560r;
    public final g6 f46561r0;
    public StaticLayout f46562s;
    public final g6 f46563s0;
    public float v;
    public float f46564w;
    public final RectF f46565x;
    public final Drawable f46566y;

    public o0(Context context, float f7) {
        super(context);
        this.f46542c = true;
        this.f46555n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f46560r = textPaint;
        this.f46565x = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.E = new Paint(1);
        this.H = new Paint(1);
        this.N = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.T = imageReceiver;
        this.f46548f0 = new RectF();
        this.f46549g0 = new RectF();
        this.f46550h0 = new Path();
        this.f46551i0 = new Path();
        this.f46552j0 = new RectF();
        this.f46553k0 = new RectF();
        is isVar = is.h;
        this.f46554l0 = new g6(this, 0L, 350L, isVar);
        this.m0 = new g6(this, 0L, 350L, isVar);
        this.f46556n0 = new g6(this, 0L, 350L, isVar);
        this.f46557o0 = new g6(this, 0L, 350L, isVar);
        this.f46558p0 = new g6(this, 0L, 350L, isVar);
        this.f46559q0 = new g6(this, 0L, 350L, isVar);
        this.f46561r0 = new g6(this, 0L, 350L, isVar);
        this.f46563s0 = new g6(this, 0L, 350L, isVar);
        this.f46545e = f7;
        imageReceiver.setInvalidateAll(true);
        this.f46547f = (int) (f7 * 3.0f);
        this.h = (int) (f7 * 1.0f);
        this.f46566y = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f7);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    public final void a(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: qg.o0.a(android.graphics.Canvas):void");
    }

    public final void b(int i10, n0 n0Var, boolean z10) {
        this.f46538a = i10;
        if (this.W == n0Var && !z10) {
            return;
        }
        this.W = n0Var;
        this.f46542c = true;
        this.d = z10;
        requestLayout();
    }

    public final void c(int i10, int i11) {
        int i12 = -16777216;
        Drawable drawable = this.f46566y;
        TextPaint textPaint = this.f46560r;
        if (i10 == 0) {
            this.f46546e0 = i11;
            if (AndroidUtilities.computePerceivedBrightness(i11) < 0.721f) {
                i12 = -1;
            }
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            this.f46546e0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 2) {
            this.f46546e0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f46546e0 = -1;
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
        if (this.f46542c && this.W != null) {
            boolean e7 = e();
            int i15 = this.f46547f;
            float f18 = this.f46545e;
            if (e7) {
                if (TextUtils.isEmpty(this.W.f46501b)) {
                    str2 = this.W.f46502c;
                } else {
                    str2 = this.W.f46501b;
                }
                TLRPC.WebPage webPage = this.W.d;
                float f19 = (this.f46540b - i15) - i15;
                this.f46541b0 = 0.0f;
                this.f46539a0 = 0.0f;
                this.f46543c0 = 0.0f;
                int colorId = UserObject.getColorId(UserConfig.getInstance(this.f46538a).getCurrentUser());
                MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f46538a).peerColors;
                String str3 = null;
                if (peerColors != null && colorId >= 7) {
                    peerColor = peerColors.getColor(colorId);
                } else {
                    peerColor = null;
                }
                if (peerColor == null) {
                    int[] iArr = h6.f21047r8;
                    color1 = h6.x0(null, iArr[colorId % iArr.length], false);
                } else {
                    color1 = peerColor.getColor1();
                }
                this.H.setColor(color1);
                this.f46541b0 = (7.33f * f18) + this.f46541b0;
                this.F = this.W.f46504f;
                n11 n11Var = new n11(str2, 16.0f, null);
                n11Var.f28900a.setTextSize(16.0f * f18);
                float f20 = 20.0f * f18;
                n11Var.q(f19 - f20);
                this.G = n11Var;
                this.f46539a0 = Math.max(this.f46539a0, Math.min(f20 + n11Var.f28902c, f19));
                float f21 = 7.0f * f18;
                this.f46541b0 = this.G.j() + this.f46541b0 + f21;
                if (webPage.photo == null && !MessageObject.isVideoDocument(webPage.document)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.R = z10;
                n0 n0Var = this.W;
                boolean z12 = n0Var.f46503e;
                this.S = !z12;
                if (this.U && (n0Var.f46500a & 4) != 0) {
                    i10 = n0Var.f46505i;
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
                        i12 = closestPhotoSizeWithSize2.f20057w;
                        i11 = closestPhotoSizeWithSize2.h;
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                    ImageLocation forPhoto2 = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo);
                    String l4 = a1.g.l(i10, i10, "_");
                    if (this.U) {
                        forPhoto = null;
                    } else {
                        forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo);
                    }
                    if (!this.U) {
                        str3 = a1.g.l(i10, i10, "_");
                    }
                    imageReceiver.setImage(forPhoto2, l4, forPhoto, str3, 0L, null, null, 0);
                } else {
                    f10 = 48.0f;
                    TLRPC.Document document = webPage.document;
                    if (document != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1, false, null, false);
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(webPage.document.thumbs, (int) (i10 * f18), false, closestPhotoSizeWithSize3, false);
                        if (closestPhotoSizeWithSize4 != null) {
                            i12 = closestPhotoSizeWithSize4.f20057w;
                            i11 = closestPhotoSizeWithSize4.h;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document);
                        String l10 = a1.g.l(i10, i10, "_");
                        if (this.U) {
                            forDocument = null;
                        } else {
                            forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document);
                        }
                        if (!this.U) {
                            str3 = a1.g.l(i10, i10, "_");
                        }
                        imageReceiver.setImage(forDocument2, l10, forDocument, str3, 0L, null, null, 0);
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                }
                this.f46543c0 = (5.66f * f18) + this.f46543c0;
                boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
                this.K = !isEmpty;
                if (!isEmpty) {
                    n11 n11Var2 = new n11(webPage.site_name, 14.0f, AndroidUtilities.bold());
                    n11Var2.f28900a.setTextSize(f18 * 14.0f);
                    float f22 = f18 * 40.0f;
                    float f23 = f19 - f22;
                    if (this.R && this.S) {
                        f16 = f18 * 60.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    n11Var2.q((int) Math.ceil(f23 - f16));
                    this.L = n11Var2;
                    float f24 = this.f46539a0;
                    float f25 = f22 + n11Var2.f28902c;
                    if (this.R && this.S) {
                        f17 = f18 * 60.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    this.f46539a0 = Math.max(f24, Math.min(f25 + f17, f19));
                    this.f46543c0 = (f18 * 2.66f) + this.L.j() + this.f46543c0;
                    i13 = this.L.f28901b.getLineCount();
                } else {
                    i13 = 0;
                }
                boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
                this.I = !isEmpty2;
                if (!isEmpty2) {
                    n11 n11Var3 = new n11(webPage.title, 14.0f, AndroidUtilities.bold());
                    n11Var3.f28900a.setTextSize(f18 * 14.0f);
                    float f26 = f18 * 40.0f;
                    float f27 = f19 - f26;
                    f11 = 2.66f;
                    if (this.R && this.S) {
                        f14 = f18 * 60.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    f12 = f18;
                    n11Var3.q((int) Math.ceil(f27 - f14));
                    this.J = n11Var3;
                    float f28 = this.f46539a0;
                    float f29 = f26 + n11Var3.f28902c;
                    if (this.R && this.S) {
                        f15 = 60.0f * f12;
                    } else {
                        f15 = 0.0f;
                    }
                    this.f46539a0 = Math.max(f28, Math.min(f29 + f15, f19));
                    this.f46543c0 = (f12 * 2.66f) + this.J.j() + this.f46543c0;
                    i13 += this.J.f28901b.getLineCount();
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
                    this.O = org.telegram.ui.Cells.u1.u2(str4, textPaint, ceil, (int) Math.ceil(Math.max(1.0f, f19 - ((40 + i14) * f12))), i16, 4);
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
                    this.f46539a0 = Math.max(this.f46539a0, Math.min(f30 + this.P, f19));
                    this.f46543c0 = (f12 * f11) + this.f46543c0 + this.O.getHeight();
                }
                if (this.R && !this.S) {
                    if (i12 > 0 && i11 > 0) {
                        this.f46544d0 = Math.min((Math.max(0.0f, this.f46539a0 - (f12 * 40.0f)) / i12) * i11, f12 * 200.0f);
                    } else {
                        this.f46544d0 = f12 * 120.0f;
                    }
                    this.f46543c0 = (f12 * f11) + this.f46543c0 + this.f46544d0;
                }
                float f32 = f21 + this.f46543c0;
                this.f46543c0 = f32;
                this.f46541b0 = (f12 * 11.0f) + this.f46541b0 + f32;
            } else {
                if (TextUtils.isEmpty(this.W.f46501b)) {
                    String str5 = this.W.f46502c;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    str = str5.toUpperCase();
                } else {
                    str = this.W.f46501b;
                }
                RectF rectF = this.f46565x;
                float f33 = ((this.f46540b - i15) - i15) - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f18);
                this.f46555n = 1.0f;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f46560r;
                this.f46562s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, (int) Math.ceil(d), truncateAt), textPaint2, (int) Math.ceil(f33), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.v = 0.0f;
                this.f46564w = Float.MAX_VALUE;
                for (int i18 = 0; i18 < this.f46562s.getLineCount(); i18++) {
                    this.v = Math.max(this.v, this.f46562s.getLineWidth(i18));
                    this.f46564w = Math.min(this.f46564w, this.f46562s.getLineLeft(i18));
                }
                if (this.f46562s.getLineCount() > 2) {
                    this.f46555n = 0.3f;
                } else {
                    this.f46555n = Math.min(1.0f, f33 / this.v);
                }
                this.f46539a0 = (this.v * this.f46555n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f18);
                this.f46541b0 = Math.max(f18 * 30.0f, this.f46562s.getHeight() * this.f46555n) + ((rectF.top + rectF.bottom) * f18);
            }
            if (!this.d) {
                this.f46554l0.f(this.F, true);
                this.f46556n0.f(this.S, true);
                this.m0.f(this.R, true);
                this.f46559q0.d(this.f46543c0, true);
            } else {
                invalidate();
            }
            this.f46542c = false;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        n0 n0Var = this.W;
        if (n0Var != null && n0Var.d != null) {
            return true;
        }
        return false;
    }

    public int getPhotoSide() {
        float f7;
        if (this.S) {
            f7 = 48.0f;
        } else {
            int i10 = this.f46540b;
            int i11 = this.f46547f;
            f7 = (((i10 - i11) - i11) / this.f46545e) - 40.0f;
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
            f10 = this.f46545e;
        } else {
            f7 = 0.2f;
            f10 = this.f46541b0;
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
        int i12 = this.f46547f;
        int ceil = ((int) Math.ceil(this.f46539a0)) + i12 + i12;
        int ceil2 = (int) Math.ceil(this.f46541b0);
        int i13 = this.h;
        setMeasuredDimension(ceil, ceil2 + i13 + i13);
    }

    public void setMaxWidth(int i10) {
        this.f46540b = i10;
        this.f46542c = true;
    }

    public void setPreviewType(int i10) {
        this.V = i10;
        invalidate();
    }
}
