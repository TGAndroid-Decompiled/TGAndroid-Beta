package rg;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.pr;
public class q0 extends View {
    public final Paint E;
    public boolean F;
    public f01 G;
    public final Paint H;
    public boolean I;
    public f01 J;
    public boolean K;
    public f01 L;
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
    public p0 W;
    public int f45420a;
    public float f45421a0;
    public int f45422b;
    public float f45423b0;
    public boolean f45424c;
    public float f45425c0;
    public boolean d;
    public float f45426d0;
    public final float f45427e;
    public int f45428e0;
    public final int f45429f;
    public final RectF f45430f0;
    public final RectF f45431g0;
    public final int h;
    public final Path f45432h0;
    public final Path f45433i0;
    public final RectF f45434j0;
    public final RectF f45435k0;
    public final e6 f45436l0;
    public final e6 m0;
    public float f45437n;
    public final e6 f45438n0;
    public final e6 f45439o0;
    public final e6 f45440p0;
    public final e6 f45441q0;
    public final TextPaint f45442r;
    public final e6 f45443r0;
    public StaticLayout f45444s;
    public final e6 f45445s0;
    public float v;
    public float f45446w;
    public final RectF f45447x;
    public final Drawable f45448y;

    public q0(Context context, float f7) {
        super(context);
        this.f45424c = true;
        this.f45437n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f45442r = textPaint;
        this.f45447x = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.E = new Paint(1);
        this.H = new Paint(1);
        this.N = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.T = imageReceiver;
        this.f45430f0 = new RectF();
        this.f45431g0 = new RectF();
        this.f45432h0 = new Path();
        this.f45433i0 = new Path();
        this.f45434j0 = new RectF();
        this.f45435k0 = new RectF();
        pr prVar = pr.h;
        this.f45436l0 = new e6(this, 0L, 350L, prVar);
        this.m0 = new e6(this, 0L, 350L, prVar);
        this.f45438n0 = new e6(this, 0L, 350L, prVar);
        this.f45439o0 = new e6(this, 0L, 350L, prVar);
        this.f45440p0 = new e6(this, 0L, 350L, prVar);
        this.f45441q0 = new e6(this, 0L, 350L, prVar);
        this.f45443r0 = new e6(this, 0L, 350L, prVar);
        this.f45445s0 = new e6(this, 0L, 350L, prVar);
        this.f45427e = f7;
        imageReceiver.setInvalidateAll(true);
        this.f45429f = (int) (f7 * 3.0f);
        this.h = (int) (f7 * 1.0f);
        this.f45448y = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f7);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    public final void a(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        float f11;
        Path.Direction direction;
        float f12;
        float f13;
        f01 f01Var;
        f01 f01Var2;
        Canvas canvas2 = canvas;
        d();
        float d = this.f45443r0.d(this.f45421a0, false);
        float d10 = this.f45445s0.d(this.f45423b0, false);
        if (this.V == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f45440p0.e(z10);
        float e10 = this.f45439o0.e(e());
        float f14 = this.f45427e;
        float lerp = AndroidUtilities.lerp(0.2f * d10, 16.66f * f14, e10);
        int i10 = this.f45429f;
        int i11 = this.h;
        RectF rectF = this.f45430f0;
        rectF.set(i10, i11, i10 + d, i11 + d10);
        int d11 = i0.a.d(e10, this.f45428e0, i0.a.d(e7, -1, -14670807));
        Paint paint = this.E;
        paint.setColor(d11);
        Path path = this.f45433i0;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, lerp, lerp, direction2);
        canvas2.drawPath(path, paint);
        if (e10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i10, i11);
            float e11 = this.f45436l0.e(this.F);
            float f15 = (7.33f * f14) + 0.0f;
            f01 f01Var3 = this.G;
            if (f01Var3 != null && e11 > 0.0f) {
                direction = direction2;
                f10 = e11;
                f7 = 1.0f;
                f01Var3.c(f14 * 10.0f, com.google.android.gms.internal.vision.e2.b(1.0f, e11, (15.0f * f14) + this.G.j(), (f01Var3.j() / 2.0f) + f15), e10, -15033089, canvas2);
                f11 = e10;
                f15 = (((7.0f * f14) + this.G.j()) * f10) + f15;
            } else {
                f10 = e11;
                f11 = e10;
                direction = direction2;
                f7 = 1.0f;
            }
            float f16 = f15;
            float d12 = this.f45441q0.d(this.f45425c0, false);
            Paint paint2 = this.H;
            paint2.setAlpha(25);
            float f17 = d12 + f16;
            RectF rectF2 = this.f45431g0;
            rectF2.set(f14 * 10.0f, f16, d - (f14 * 10.0f), f17);
            Path path2 = this.f45432h0;
            path2.rewind();
            path2.addRoundRect(rectF2, f14 * 5.0f, f14 * 5.0f, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(255);
            canvas2.drawRect(f14 * 10.0f, f16, 13.0f * f14, f17, paint2);
            canvas.restore();
            float f18 = (5.66f * f14) + f16;
            if (this.K && (f01Var2 = this.L) != null) {
                float j3 = (f01Var2.j() / 2.0f) + f18;
                int color = paint2.getColor();
                f12 = d;
                e10 = f11;
                f13 = 2.66f;
                f01Var2.c(f14 * 20.0f, j3, e10, color, canvas);
                f18 = p6.a(f14, 2.66f, this.L.j(), f18);
            } else {
                f12 = d;
                e10 = f11;
                f13 = 2.66f;
            }
            if (this.I && (f01Var = this.J) != null) {
                canvas2 = canvas;
                f01Var.c(f14 * 20.0f, (f01Var.j() / 2.0f) + f18, e10, i0.a.d(e7, -13421773, -1), canvas2);
                f18 = p6.a(f14, f13, this.J.j(), f18);
            } else {
                canvas2 = canvas;
            }
            if (this.M && this.O != null) {
                canvas2.save();
                canvas2.translate((f14 * 20.0f) - this.Q, f18);
                this.N.setColor(i0.a.d(e7, -13421773, -1));
                this.N.setAlpha((int) (255.0f * e10));
                this.O.draw(canvas2);
                canvas2.restore();
                f18 = p6.a(f14, f13, this.O.getHeight(), f18);
            }
            float e12 = this.m0.e(this.R);
            if (e12 > 0.0f) {
                float e13 = this.f45438n0.e(this.S);
                this.f45434j0.set(f14 * 20.0f, (f14 * f13) + f18, f12 - (20.0f * f14), (f14 * f13) + f18 + this.f45426d0);
                this.f45435k0.set(((f12 - (f14 * 10.0f)) - (f14 * 6.0f)) - (48.0f * f14), (f14 * 6.0f) + f16, (f12 - (f14 * 10.0f)) - (f14 * 6.0f), (48.0f * f14) + (6.0f * f14) + f16);
                AndroidUtilities.lerp(this.f45434j0, this.f45435k0, e13, rectF2);
                float f19 = rectF2.left;
                float f20 = rectF2.top;
                float width = rectF2.width();
                float height = rectF2.height();
                ImageReceiver imageReceiver = this.T;
                imageReceiver.setImageCoords(f19, f20, width, height);
                imageReceiver.setAlpha(e12 * e10);
                imageReceiver.draw(canvas2);
                f18 += ((f14 * 2.66f) + this.f45426d0) * (f7 - e13);
            }
            float f21 = (5.0f * f14) + (7.0f * f14) + f18;
            f01 f01Var4 = this.G;
            if (f01Var4 != null && f7 - f10 > 0.0f) {
                f01Var4.c(f14 * 10.0f, (f01Var4.j() / 2.0f) + f21 + (((15.0f * f14) + this.G.j()) * f10), e10, -15033089, canvas2);
                this.G.j();
            }
            canvas2.restore();
        } else {
            f7 = 1.0f;
        }
        if (e10 < f7) {
            float f22 = this.f45447x.left;
            Drawable drawable = this.f45448y;
            drawable.setBounds(((int) (f22 * f14)) + i10, ((int) com.google.android.gms.internal.vision.e2.v(f14, 30.0f, d10, 2.0f)) + i11, ((int) ((f22 + 30.0f) * f14)) + i10, ((int) com.google.android.gms.internal.vision.e2.y(f14, 30.0f, d10, 2.0f)) + i11);
            int i12 = (int) ((f7 - e10) * 255.0f);
            drawable.setAlpha(i12);
            drawable.draw(canvas2);
            if (this.f45444s != null) {
                canvas2.save();
                canvas2.translate(((this.f45447x.left + 30.0f + 3.25f) * f14) + i10, (d10 / 2.0f) + i11);
                float f23 = this.f45437n;
                canvas2.scale(f23, f23);
                canvas2.translate(-this.f45446w, (-this.f45444s.getHeight()) / 2.0f);
                this.f45442r.setAlpha(i12);
                this.f45444s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i10, p0 p0Var, boolean z10) {
        this.f45420a = i10;
        if (this.W == p0Var && !z10) {
            return;
        }
        this.W = p0Var;
        this.f45424c = true;
        this.d = z10;
        requestLayout();
    }

    public final void c(int i10, int i11) {
        int i12 = -16777216;
        Drawable drawable = this.f45448y;
        TextPaint textPaint = this.f45442r;
        if (i10 == 0) {
            this.f45428e0 = i11;
            if (AndroidUtilities.computePerceivedBrightness(i11) < 0.721f) {
                i12 = -1;
            }
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            this.f45428e0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 2) {
            this.f45428e0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f45428e0 = -1;
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
        if (this.f45424c && this.W != null) {
            boolean e7 = e();
            int i15 = this.f45429f;
            float f18 = this.f45427e;
            if (e7) {
                if (TextUtils.isEmpty(this.W.f45408b)) {
                    str2 = this.W.f45409c;
                } else {
                    str2 = this.W.f45408b;
                }
                TLRPC.WebPage webPage = this.W.d;
                float f19 = (this.f45422b - i15) - i15;
                this.f45423b0 = 0.0f;
                this.f45421a0 = 0.0f;
                this.f45425c0 = 0.0f;
                int colorId = UserObject.getColorId(UserConfig.getInstance(this.f45420a).getCurrentUser());
                MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f45420a).peerColors;
                String str3 = null;
                if (peerColors != null && colorId >= 7) {
                    peerColor = peerColors.getColor(colorId);
                } else {
                    peerColor = null;
                }
                if (peerColor == null) {
                    int[] iArr = j6.f20918r8;
                    color1 = j6.w0(null, iArr[colorId % iArr.length], false);
                } else {
                    color1 = peerColor.getColor1();
                }
                this.H.setColor(color1);
                this.f45423b0 = (7.33f * f18) + this.f45423b0;
                this.F = this.W.f45411f;
                f01 f01Var = new f01(str2, 16.0f, null);
                f01Var.f25845a.setTextSize(16.0f * f18);
                float f20 = 20.0f * f18;
                f01Var.q(f19 - f20);
                this.G = f01Var;
                this.f45421a0 = Math.max(this.f45421a0, Math.min(f20 + f01Var.f25847c, f19));
                float f21 = 7.0f * f18;
                this.f45423b0 = this.G.j() + this.f45423b0 + f21;
                if (webPage.photo == null && !MessageObject.isVideoDocument(webPage.document)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.R = z10;
                p0 p0Var = this.W;
                boolean z12 = p0Var.f45410e;
                this.S = !z12;
                if (this.U && (p0Var.f45407a & 4) != 0) {
                    i10 = p0Var.f45412i;
                } else {
                    if (!z12) {
                        f7 = 48.0f;
                    } else {
                        f7 = (f19 / f18) - 40.0f;
                    }
                    i10 = ((int) f7) * 2;
                }
                ImageReceiver imageReceiver = this.T;
                imageReceiver.setRoundRadius((int) (4.0f * f18));
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1, false, null, false);
                    f10 = 48.0f;
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, (int) (i10 * f18), false, closestPhotoSizeWithSize, false);
                    if (closestPhotoSizeWithSize2 != null) {
                        i12 = closestPhotoSizeWithSize2.f19894w;
                        i11 = closestPhotoSizeWithSize2.h;
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                    ImageLocation forPhoto2 = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo);
                    String k10 = a4.a.k(i10, i10, "_");
                    if (this.U) {
                        forPhoto = null;
                    } else {
                        forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo);
                    }
                    if (!this.U) {
                        str3 = a4.a.k(i10, i10, "_");
                    }
                    imageReceiver.setImage(forPhoto2, k10, forPhoto, str3, 0L, null, null, 0);
                } else {
                    f10 = 48.0f;
                    TLRPC.Document document = webPage.document;
                    if (document != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1, false, null, false);
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(webPage.document.thumbs, (int) (i10 * f18), false, closestPhotoSizeWithSize3, false);
                        if (closestPhotoSizeWithSize4 != null) {
                            i12 = closestPhotoSizeWithSize4.f19894w;
                            i11 = closestPhotoSizeWithSize4.h;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document);
                        String k11 = a4.a.k(i10, i10, "_");
                        if (this.U) {
                            forDocument = null;
                        } else {
                            forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document);
                        }
                        if (!this.U) {
                            str3 = a4.a.k(i10, i10, "_");
                        }
                        imageReceiver.setImage(forDocument2, k11, forDocument, str3, 0L, null, null, 0);
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                }
                this.f45425c0 = (5.66f * f18) + this.f45425c0;
                boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
                this.K = !isEmpty;
                if (!isEmpty) {
                    f01 f01Var2 = new f01(webPage.site_name, 14.0f, AndroidUtilities.bold());
                    f01Var2.f25845a.setTextSize(f18 * 14.0f);
                    float f22 = f18 * 40.0f;
                    float f23 = f19 - f22;
                    if (this.R && this.S) {
                        f16 = f18 * 60.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    f01Var2.q((int) Math.ceil(f23 - f16));
                    this.L = f01Var2;
                    float f24 = this.f45421a0;
                    float f25 = f22 + f01Var2.f25847c;
                    if (this.R && this.S) {
                        f17 = f18 * 60.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    this.f45421a0 = Math.max(f24, Math.min(f25 + f17, f19));
                    this.f45425c0 = (f18 * 2.66f) + this.L.j() + this.f45425c0;
                    i13 = this.L.f25846b.getLineCount();
                } else {
                    i13 = 0;
                }
                boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
                this.I = !isEmpty2;
                if (!isEmpty2) {
                    f01 f01Var3 = new f01(webPage.title, 14.0f, AndroidUtilities.bold());
                    f01Var3.f25845a.setTextSize(f18 * 14.0f);
                    float f26 = f18 * 40.0f;
                    float f27 = f19 - f26;
                    f12 = 2.66f;
                    if (this.R && this.S) {
                        f14 = f18 * 60.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    f11 = f18;
                    f01Var3.q((int) Math.ceil(f27 - f14));
                    this.J = f01Var3;
                    float f28 = this.f45421a0;
                    float f29 = f26 + f01Var3.f25847c;
                    if (this.R && this.S) {
                        f15 = 60.0f * f11;
                    } else {
                        f15 = 0.0f;
                    }
                    this.f45421a0 = Math.max(f28, Math.min(f29 + f15, f19));
                    this.f45425c0 = (f11 * 2.66f) + this.J.j() + this.f45425c0;
                    i13 += this.J.f25846b.getLineCount();
                } else {
                    f11 = f18;
                    f12 = 2.66f;
                }
                boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
                this.M = !isEmpty3;
                if (!isEmpty3) {
                    TextPaint textPaint = this.N;
                    textPaint.setTextSize(f11 * 14.0f);
                    String str4 = webPage.description;
                    float f30 = f11 * 40.0f;
                    int ceil = (int) Math.ceil(Math.max(1.0f, f19 - f30));
                    if (this.R && this.S) {
                        i14 = 60;
                    } else {
                        i14 = 0;
                    }
                    int i16 = 3 - i13;
                    this.O = org.telegram.ui.Cells.t1.u2(str4, textPaint, ceil, (int) Math.ceil(Math.max(1.0f, f19 - ((40 + i14) * f11))), i16, 4);
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
                            f13 = f11 * f10;
                        } else {
                            f13 = 0.0f;
                        }
                        this.P = Math.max(f31, lineWidth + f13);
                        this.Q = Math.min(this.Q, this.O.getLineLeft(i17));
                    }
                    this.f45421a0 = Math.max(this.f45421a0, Math.min(f30 + this.P, f19));
                    this.f45425c0 = (f11 * f12) + this.f45425c0 + this.O.getHeight();
                }
                if (this.R && !this.S) {
                    if (i12 > 0 && i11 > 0) {
                        this.f45426d0 = Math.min((Math.max(0.0f, this.f45421a0 - (f11 * 40.0f)) / i12) * i11, f11 * 200.0f);
                    } else {
                        this.f45426d0 = f11 * 120.0f;
                    }
                    this.f45425c0 = (f11 * f12) + this.f45425c0 + this.f45426d0;
                }
                float f32 = f21 + this.f45425c0;
                this.f45425c0 = f32;
                this.f45423b0 = (f11 * 11.0f) + this.f45423b0 + f32;
            } else {
                if (TextUtils.isEmpty(this.W.f45408b)) {
                    String str5 = this.W.f45409c;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    str = str5.toUpperCase();
                } else {
                    str = this.W.f45408b;
                }
                RectF rectF = this.f45447x;
                float f33 = ((this.f45422b - i15) - i15) - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f18);
                this.f45437n = 1.0f;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f45442r;
                this.f45444s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, (int) Math.ceil(d), truncateAt), textPaint2, (int) Math.ceil(f33), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.v = 0.0f;
                this.f45446w = Float.MAX_VALUE;
                for (int i18 = 0; i18 < this.f45444s.getLineCount(); i18++) {
                    this.v = Math.max(this.v, this.f45444s.getLineWidth(i18));
                    this.f45446w = Math.min(this.f45446w, this.f45444s.getLineLeft(i18));
                }
                if (this.f45444s.getLineCount() > 2) {
                    this.f45437n = 0.3f;
                } else {
                    this.f45437n = Math.min(1.0f, f33 / this.v);
                }
                this.f45421a0 = (this.v * this.f45437n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f18);
                this.f45423b0 = Math.max(f18 * 30.0f, this.f45444s.getHeight() * this.f45437n) + ((rectF.top + rectF.bottom) * f18);
            }
            if (!this.d) {
                this.f45436l0.f(this.F, true);
                this.f45438n0.f(this.S, true);
                this.m0.f(this.R, true);
                this.f45441q0.d(this.f45425c0, true);
            } else {
                invalidate();
            }
            this.f45424c = false;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        p0 p0Var = this.W;
        if (p0Var != null && p0Var.d != null) {
            return true;
        }
        return false;
    }

    public int getPhotoSide() {
        float f7;
        if (this.S) {
            f7 = 48.0f;
        } else {
            int i10 = this.f45422b;
            int i11 = this.f45429f;
            f7 = (((i10 - i11) - i11) / this.f45427e) - 40.0f;
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
            f10 = this.f45427e;
        } else {
            f7 = 0.2f;
            f10 = this.f45423b0;
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
        int i12 = this.f45429f;
        int ceil = ((int) Math.ceil(this.f45421a0)) + i12 + i12;
        int ceil2 = (int) Math.ceil(this.f45423b0);
        int i13 = this.h;
        setMeasuredDimension(ceil, ceil2 + i13 + i13);
    }

    public void setMaxWidth(int i10) {
        this.f45422b = i10;
        this.f45424c = true;
    }

    public void setPreviewType(int i10) {
        this.V = i10;
        invalidate();
    }
}
