package yf;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.y5;
public class n0 extends View {
    public final Paint A;
    public boolean B;
    public nz0 C;
    public final Paint D;
    public boolean E;
    public nz0 F;
    public boolean G;
    public nz0 H;
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
    public int f50007a;
    public int f50008a0;
    public int f50009b;
    public final RectF f50010b0;
    public boolean f50011c;
    public final RectF f50012c0;
    public boolean d;
    public final Path f50013d0;
    public final float f50014e;
    public final Path f50015e0;
    public final int f50016f;
    public final RectF f50017f0;
    public final RectF f50018g0;
    public final int h;
    public final y5 f50019h0;
    public final y5 f50020i0;
    public final y5 f50021j0;
    public final y5 f50022k0;
    public final y5 f50023l0;
    public final y5 m0;
    public float f50024n;
    public final y5 f50025n0;
    public final y5 f50026o0;
    public final TextPaint f50027r;
    public StaticLayout f50028s;
    public float v;
    public float f50029w;
    public final RectF f50030x;
    public final Drawable f50031y;

    public n0(Context context, float f10) {
        super(context);
        this.f50011c = true;
        this.f50024n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f50027r = textPaint;
        this.f50030x = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.A = new Paint(1);
        this.D = new Paint(1);
        this.J = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        this.f50010b0 = new RectF();
        this.f50012c0 = new RectF();
        this.f50013d0 = new Path();
        this.f50015e0 = new Path();
        this.f50017f0 = new RectF();
        this.f50018g0 = new RectF();
        gr grVar = gr.h;
        this.f50019h0 = new y5(this, 0L, 350L, grVar);
        this.f50020i0 = new y5(this, 0L, 350L, grVar);
        this.f50021j0 = new y5(this, 0L, 350L, grVar);
        this.f50022k0 = new y5(this, 0L, 350L, grVar);
        this.f50023l0 = new y5(this, 0L, 350L, grVar);
        this.m0 = new y5(this, 0L, 350L, grVar);
        this.f50025n0 = new y5(this, 0L, 350L, grVar);
        this.f50026o0 = new y5(this, 0L, 350L, grVar);
        this.f50014e = f10;
        imageReceiver.setInvalidateAll(true);
        this.f50016f = (int) (f10 * 3.0f);
        this.h = (int) (f10 * 1.0f);
        this.f50031y = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f10);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    public final void a(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        Path.Direction direction;
        float f13;
        float f14;
        nz0 nz0Var;
        nz0 nz0Var2;
        Canvas canvas2 = canvas;
        d();
        float d = this.f50025n0.d(this.T, false);
        float d9 = this.f50026o0.d(this.U, false);
        if (this.R == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e10 = this.f50023l0.e(z10);
        float e11 = this.f50022k0.e(e());
        float f15 = this.f50014e;
        float lerp = AndroidUtilities.lerp(0.2f * d9, 16.66f * f15, e11);
        int i9 = this.f50016f;
        int i10 = this.h;
        RectF rectF = this.f50010b0;
        rectF.set(i9, i10, i9 + d, i10 + d9);
        int d10 = i0.a.d(e11, this.f50008a0, i0.a.d(e10, -1, -14670807));
        Paint paint = this.A;
        paint.setColor(d10);
        Path path = this.f50015e0;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, lerp, lerp, direction2);
        canvas2.drawPath(path, paint);
        if (e11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i9, i10);
            float e12 = this.f50019h0.e(this.B);
            float f16 = (7.33f * f15) + 0.0f;
            nz0 nz0Var3 = this.C;
            if (nz0Var3 != null && e12 > 0.0f) {
                direction = direction2;
                f11 = e12;
                f10 = 1.0f;
                nz0Var3.c(f15 * 10.0f, j3.r0.C(1.0f, e12, (15.0f * f15) + this.C.j(), (nz0Var3.j() / 2.0f) + f16), e11, -15033089, canvas2);
                f12 = e11;
                f16 = (((7.0f * f15) + this.C.j()) * f11) + f16;
            } else {
                f11 = e12;
                f12 = e11;
                direction = direction2;
                f10 = 1.0f;
            }
            float f17 = f16;
            float d11 = this.m0.d(this.V, false);
            Paint paint2 = this.D;
            paint2.setAlpha(25);
            float f18 = d11 + f17;
            RectF rectF2 = this.f50012c0;
            rectF2.set(f15 * 10.0f, f17, d - (f15 * 10.0f), f18);
            Path path2 = this.f50013d0;
            path2.rewind();
            path2.addRoundRect(rectF2, f15 * 5.0f, f15 * 5.0f, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(255);
            canvas2.drawRect(f15 * 10.0f, f17, 13.0f * f15, f18, paint2);
            canvas.restore();
            float f19 = (5.66f * f15) + f17;
            if (this.G && (nz0Var2 = this.H) != null) {
                float j10 = (nz0Var2.j() / 2.0f) + f19;
                int color = paint2.getColor();
                f13 = d;
                e11 = f12;
                f14 = 2.66f;
                nz0Var2.c(f15 * 20.0f, j10, e11, color, canvas);
                f19 = aa.d.w(f15, 2.66f, this.H.j(), f19);
            } else {
                f13 = d;
                e11 = f12;
                f14 = 2.66f;
            }
            if (this.E && (nz0Var = this.F) != null) {
                canvas2 = canvas;
                nz0Var.c(f15 * 20.0f, (nz0Var.j() / 2.0f) + f19, e11, i0.a.d(e10, -13421773, -1), canvas2);
                f19 = aa.d.w(f15, f14, this.F.j(), f19);
            } else {
                canvas2 = canvas;
            }
            if (this.I && this.K != null) {
                canvas2.save();
                canvas2.translate((f15 * 20.0f) - this.M, f19);
                this.J.setColor(i0.a.d(e10, -13421773, -1));
                this.J.setAlpha((int) (255.0f * e11));
                this.K.draw(canvas2);
                canvas2.restore();
                f19 = aa.d.w(f15, f14, this.K.getHeight(), f19);
            }
            float e13 = this.f50020i0.e(this.N);
            if (e13 > 0.0f) {
                float e14 = this.f50021j0.e(this.O);
                this.f50017f0.set(f15 * 20.0f, (f15 * f14) + f19, f13 - (20.0f * f15), (f15 * f14) + f19 + this.W);
                this.f50018g0.set(((f13 - (f15 * 10.0f)) - (f15 * 6.0f)) - (48.0f * f15), (f15 * 6.0f) + f17, (f13 - (f15 * 10.0f)) - (f15 * 6.0f), (48.0f * f15) + (6.0f * f15) + f17);
                AndroidUtilities.lerp(this.f50017f0, this.f50018g0, e14, rectF2);
                float f20 = rectF2.left;
                float f21 = rectF2.top;
                float width = rectF2.width();
                float height = rectF2.height();
                ImageReceiver imageReceiver = this.P;
                imageReceiver.setImageCoords(f20, f21, width, height);
                imageReceiver.setAlpha(e13 * e11);
                imageReceiver.draw(canvas2);
                f19 += ((f15 * 2.66f) + this.W) * (f10 - e14);
            }
            float f22 = (5.0f * f15) + (7.0f * f15) + f19;
            nz0 nz0Var4 = this.C;
            if (nz0Var4 != null && f10 - f11 > 0.0f) {
                nz0Var4.c(f15 * 10.0f, (nz0Var4.j() / 2.0f) + f22 + (((15.0f * f15) + this.C.j()) * f11), e11, -15033089, canvas2);
                this.C.j();
            }
            canvas2.restore();
        } else {
            f10 = 1.0f;
        }
        if (e11 < f10) {
            float f23 = this.f50030x.left;
            Drawable drawable = this.f50031y;
            drawable.setBounds(((int) (f23 * f15)) + i9, ((int) e2.c.d(f15, 30.0f, d9, 2.0f)) + i10, ((int) ((f23 + 30.0f) * f15)) + i9, ((int) e2.c.y(f15, 30.0f, d9, 2.0f)) + i10);
            int i11 = (int) ((f10 - e11) * 255.0f);
            drawable.setAlpha(i11);
            drawable.draw(canvas2);
            if (this.f50028s != null) {
                canvas2.save();
                canvas2.translate(((this.f50030x.left + 30.0f + 3.25f) * f15) + i9, (d9 / 2.0f) + i10);
                float f24 = this.f50024n;
                canvas2.scale(f24, f24);
                canvas2.translate(-this.f50029w, (-this.f50028s.getHeight()) / 2.0f);
                this.f50027r.setAlpha(i11);
                this.f50028s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i9, m0 m0Var, boolean z10) {
        this.f50007a = i9;
        if (this.S == m0Var && !z10) {
            return;
        }
        this.S = m0Var;
        this.f50011c = true;
        this.d = z10;
        requestLayout();
    }

    public final void c(int i9, int i10) {
        int i11 = -16777216;
        Drawable drawable = this.f50031y;
        TextPaint textPaint = this.f50027r;
        if (i9 == 0) {
            this.f50008a0 = i10;
            if (AndroidUtilities.computePerceivedBrightness(i10) < 0.721f) {
                i11 = -1;
            }
            textPaint.setColor(i11);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        } else if (i9 == 1) {
            this.f50008a0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i9 == 2) {
            this.f50008a0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f50008a0 = -1;
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
        float f10;
        int i9;
        float f11;
        int i10;
        int i11;
        ImageLocation forDocument;
        int i12;
        float f12;
        float f13;
        int i13;
        boolean z11;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        ImageLocation forPhoto;
        if (this.f50011c && this.S != null) {
            boolean e10 = e();
            int i14 = this.f50016f;
            float f19 = this.f50014e;
            if (e10) {
                if (TextUtils.isEmpty(this.S.f49976b)) {
                    str2 = this.S.f49977c;
                } else {
                    str2 = this.S.f49976b;
                }
                TLRPC.WebPage webPage = this.S.d;
                float f20 = (this.f50009b - i14) - i14;
                this.U = 0.0f;
                this.T = 0.0f;
                this.V = 0.0f;
                int colorId = UserObject.getColorId(UserConfig.getInstance(this.f50007a).getCurrentUser());
                MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f50007a).peerColors;
                String str3 = null;
                if (peerColors != null && colorId >= 7) {
                    peerColor = peerColors.getColor(colorId);
                } else {
                    peerColor = null;
                }
                if (peerColor == null) {
                    int[] iArr = f6.f23250r8;
                    color1 = f6.w0(null, iArr[colorId % iArr.length], false);
                } else {
                    color1 = peerColor.getColor1();
                }
                this.D.setColor(color1);
                this.U = (7.33f * f19) + this.U;
                this.B = this.S.f49979f;
                nz0 nz0Var = new nz0(str2, 16.0f, null);
                nz0Var.f31221a.setTextSize(16.0f * f19);
                float f21 = 20.0f * f19;
                nz0Var.q(f20 - f21);
                this.C = nz0Var;
                this.T = Math.max(this.T, Math.min(f21 + nz0Var.f31223c, f20));
                float f22 = 7.0f * f19;
                this.U = this.C.j() + this.U + f22;
                if (webPage.photo == null && !MessageObject.isVideoDocument(webPage.document)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.N = z10;
                m0 m0Var = this.S;
                boolean z12 = m0Var.f49978e;
                this.O = !z12;
                if (this.Q && (m0Var.f49975a & 4) != 0) {
                    i9 = m0Var.f49980i;
                } else {
                    if (!z12) {
                        f10 = 48.0f;
                    } else {
                        f10 = (f20 / f19) - 40.0f;
                    }
                    i9 = ((int) f10) * 2;
                }
                ImageReceiver imageReceiver = this.P;
                imageReceiver.setRoundRadius((int) (4.0f * f19));
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1, false, null, false);
                    f11 = 48.0f;
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, (int) (i9 * f19), false, closestPhotoSizeWithSize, false);
                    if (closestPhotoSizeWithSize2 != null) {
                        i11 = closestPhotoSizeWithSize2.f22405w;
                        i10 = closestPhotoSizeWithSize2.h;
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                    ImageLocation forPhoto2 = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo);
                    String l10 = e2.c.l(i9, "_", i9);
                    if (this.Q) {
                        forPhoto = null;
                    } else {
                        forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo);
                    }
                    if (!this.Q) {
                        str3 = e2.c.l(i9, "_", i9);
                    }
                    imageReceiver.setImage(forPhoto2, l10, forPhoto, str3, 0L, null, null, 0);
                } else {
                    f11 = 48.0f;
                    TLRPC.Document document = webPage.document;
                    if (document != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1, false, null, false);
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(webPage.document.thumbs, (int) (i9 * f19), false, closestPhotoSizeWithSize3, false);
                        if (closestPhotoSizeWithSize4 != null) {
                            i11 = closestPhotoSizeWithSize4.f22405w;
                            i10 = closestPhotoSizeWithSize4.h;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document);
                        String l11 = e2.c.l(i9, "_", i9);
                        if (this.Q) {
                            forDocument = null;
                        } else {
                            forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document);
                        }
                        if (!this.Q) {
                            str3 = e2.c.l(i9, "_", i9);
                        }
                        imageReceiver.setImage(forDocument2, l11, forDocument, str3, 0L, null, null, 0);
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                }
                this.V = (5.66f * f19) + this.V;
                boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
                this.G = !isEmpty;
                if (!isEmpty) {
                    nz0 nz0Var2 = new nz0(webPage.site_name, 14.0f, AndroidUtilities.bold());
                    nz0Var2.f31221a.setTextSize(f19 * 14.0f);
                    float f23 = f19 * 40.0f;
                    float f24 = f20 - f23;
                    if (this.N && this.O) {
                        f17 = f19 * 60.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    nz0Var2.q((int) Math.ceil(f24 - f17));
                    this.H = nz0Var2;
                    float f25 = this.T;
                    float f26 = f23 + nz0Var2.f31223c;
                    if (this.N && this.O) {
                        f18 = f19 * 60.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    this.T = Math.max(f25, Math.min(f26 + f18, f20));
                    this.V = (f19 * 2.66f) + this.H.j() + this.V;
                    i12 = this.H.f31222b.getLineCount();
                } else {
                    i12 = 0;
                }
                boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
                this.E = !isEmpty2;
                if (!isEmpty2) {
                    nz0 nz0Var3 = new nz0(webPage.title, 14.0f, AndroidUtilities.bold());
                    nz0Var3.f31221a.setTextSize(f19 * 14.0f);
                    float f27 = f19 * 40.0f;
                    float f28 = f20 - f27;
                    f13 = 2.66f;
                    if (this.N && this.O) {
                        f15 = f19 * 60.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    f12 = f19;
                    nz0Var3.q((int) Math.ceil(f28 - f15));
                    this.F = nz0Var3;
                    float f29 = this.T;
                    float f30 = f27 + nz0Var3.f31223c;
                    if (this.N && this.O) {
                        f16 = 60.0f * f12;
                    } else {
                        f16 = 0.0f;
                    }
                    this.T = Math.max(f29, Math.min(f30 + f16, f20));
                    this.V = (f12 * 2.66f) + this.F.j() + this.V;
                    i12 += this.F.f31222b.getLineCount();
                } else {
                    f12 = f19;
                    f13 = 2.66f;
                }
                boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
                this.I = !isEmpty3;
                if (!isEmpty3) {
                    TextPaint textPaint = this.J;
                    textPaint.setTextSize(f12 * 14.0f);
                    String str4 = webPage.description;
                    float f31 = f12 * 40.0f;
                    int ceil = (int) Math.ceil(Math.max(1.0f, f20 - f31));
                    if (this.N && this.O) {
                        i13 = 60;
                    } else {
                        i13 = 0;
                    }
                    int i15 = 3 - i12;
                    this.K = org.telegram.ui.Cells.t1.u2(str4, textPaint, ceil, (int) Math.ceil(Math.max(1.0f, f20 - ((40 + i13) * f12))), i15, 4);
                    this.L = 0.0f;
                    this.M = Float.MAX_VALUE;
                    for (int i16 = 0; i16 < this.K.getLineCount(); i16++) {
                        if (this.N && this.O && i16 < i15) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f32 = this.L;
                        float lineWidth = this.K.getLineWidth(i16);
                        if (z11) {
                            f14 = f12 * f11;
                        } else {
                            f14 = 0.0f;
                        }
                        this.L = Math.max(f32, lineWidth + f14);
                        this.M = Math.min(this.M, this.K.getLineLeft(i16));
                    }
                    this.T = Math.max(this.T, Math.min(f31 + this.L, f20));
                    this.V = (f12 * f13) + this.V + this.K.getHeight();
                }
                if (this.N && !this.O) {
                    if (i11 > 0 && i10 > 0) {
                        this.W = Math.min((Math.max(0.0f, this.T - (f12 * 40.0f)) / i11) * i10, f12 * 200.0f);
                    } else {
                        this.W = f12 * 120.0f;
                    }
                    this.V = (f12 * f13) + this.V + this.W;
                }
                float f33 = f22 + this.V;
                this.V = f33;
                this.U = (f12 * 11.0f) + this.U + f33;
            } else {
                if (TextUtils.isEmpty(this.S.f49976b)) {
                    String str5 = this.S.f49977c;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    str = str5.toUpperCase();
                } else {
                    str = this.S.f49976b;
                }
                RectF rectF = this.f50030x;
                float f34 = ((this.f50009b - i14) - i14) - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f19);
                this.f50024n = 1.0f;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f50027r;
                this.f50028s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, (int) Math.ceil(d), truncateAt), textPaint2, (int) Math.ceil(f34), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.v = 0.0f;
                this.f50029w = Float.MAX_VALUE;
                for (int i17 = 0; i17 < this.f50028s.getLineCount(); i17++) {
                    this.v = Math.max(this.v, this.f50028s.getLineWidth(i17));
                    this.f50029w = Math.min(this.f50029w, this.f50028s.getLineLeft(i17));
                }
                if (this.f50028s.getLineCount() > 2) {
                    this.f50024n = 0.3f;
                } else {
                    this.f50024n = Math.min(1.0f, f34 / this.v);
                }
                this.T = (this.v * this.f50024n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f19);
                this.U = Math.max(f19 * 30.0f, this.f50028s.getHeight() * this.f50024n) + ((rectF.top + rectF.bottom) * f19);
            }
            if (!this.d) {
                this.f50019h0.f(this.B, true);
                this.f50021j0.f(this.O, true);
                this.f50020i0.f(this.N, true);
                this.m0.d(this.V, true);
            } else {
                invalidate();
            }
            this.f50011c = false;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        m0 m0Var = this.S;
        if (m0Var != null && m0Var.d != null) {
            return true;
        }
        return false;
    }

    public int getPhotoSide() {
        float f10;
        if (this.O) {
            f10 = 48.0f;
        } else {
            int i9 = this.f50009b;
            int i10 = this.f50016f;
            f10 = (((i9 - i10) - i10) / this.f50014e) - 40.0f;
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
            f11 = this.f50014e;
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
    public final void onMeasure(int i9, int i10) {
        d();
        int i11 = this.f50016f;
        int ceil = ((int) Math.ceil(this.T)) + i11 + i11;
        int ceil2 = (int) Math.ceil(this.U);
        int i12 = this.h;
        setMeasuredDimension(ceil, ceil2 + i12 + i12);
    }

    public void setMaxWidth(int i9) {
        this.f50009b = i9;
        this.f50011c = true;
    }

    public void setPreviewType(int i9) {
        this.R = i9;
        invalidate();
    }
}
