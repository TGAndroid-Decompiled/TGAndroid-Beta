package uh;

import a8.ng;
import ag.v;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import oe.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.t;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.r6;
public final class b extends Drawable implements DownloadController.FileDownloadProgressListener {
    public final RadialProgress2 E;
    public MessageObject F;
    public final ng G;
    public String H;
    public final int I;
    public boolean J;
    public int K;
    public int L;
    public final r6 f49937a;
    public final o9 f49938b;
    public final ImageReceiver f49939c;
    public final s1 d;
    public final int e;
    public boolean f49940f;
    public boolean h;
    public boolean f49941n;
    public boolean f49942r;
    public Drawable f49943s;
    public boolean v;
    public final Paint f49944w;
    public final Paint f49945x;
    public final oe.b f49946y;

    public b(int i10, s1 s1Var) {
        Paint paint = new Paint(1);
        this.f49944w = paint;
        this.f49945x = new Paint(1);
        this.G = new ng((char) 0, 17);
        this.e = i10;
        this.d = s1Var;
        this.f49946y = new oe.b(s1Var, ds.h, 380L);
        r6 r6Var = new r6(false, false, false);
        this.f49937a = r6Var;
        r6Var.f32142b = 21;
        r6Var.w(AndroidUtilities.dp(11.0f));
        r6Var.setCallback(s1Var);
        this.f49938b = new o9(i10, s1Var, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dpf2(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.f49939c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(s1Var, null);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(18.0f));
        radialProgress2.d = -1;
        this.I = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        long j10;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true);
        ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize2, photo);
        ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize, photo);
        if (closestPhotoSizeWithSize2 != null) {
            j10 = closestPhotoSizeWithSize2.size;
        } else {
            j10 = 0;
        }
        this.f49939c.setImage(forObject, "36_36", forObject2, "36_36_b", null, j10, null, obj, 1);
    }

    public final void b(boolean z10) {
        int i10;
        if (!this.F.isSending() && !this.F.isEditing()) {
            if (!TextUtils.isEmpty(this.H) && FileLoader.getInstance(this.e).isLoadingFile(this.H)) {
                g(3, z10);
                return;
            }
            if (this.v) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            g(i10, z10);
        }
    }

    public final void c(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        int x02;
        Rect bounds = getBounds();
        if (this.f49940f) {
            f7 = 56.33f;
        } else {
            f7 = 19.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (this.f49946y.e > 0.0f) {
            i iVar = this.f49938b.f31237c.d;
            float f10 = iVar.f19342c.f19350a;
            int i12 = (int) iVar.f19343f.f19350a;
            int lerp = (bounds.right - dp) - AndroidUtilities.lerp(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + i12, f10);
            if (f10 > 0.0f) {
                o9 o9Var = this.f49938b;
                o9Var.f31240i = (int) (this.f49946y.e * 255.0f);
                o9Var.setBounds((bounds.right - dp) - i12, bounds.bottom - AndroidUtilities.dp(31.33f), bounds.right - dp, bounds.bottom);
                this.f49938b.c(canvas);
            }
            int dp2 = bounds.bottom - AndroidUtilities.dp(21.33f);
            r6 r6Var = this.f49937a;
            r6Var.B = (int) (this.f49946y.e * 255.0f);
            r6Var.setBounds(bounds.left, AndroidUtilities.dp(15.0f) + dp2, lerp, dp2 - AndroidUtilities.dp(15.0f));
            this.f49937a.draw(canvas);
        }
        if (this.h) {
            int dp3 = AndroidUtilities.dp(36.0f);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(t.C(9.0f, bounds.right, dp3), t.C(4.0f, bounds.bottom, dp3), bounds.right - AndroidUtilities.dp(9.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.E;
            radialProgress2.f26245a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f49939c.setImageCoords(rect);
            if (!this.f49941n || this.f49942r) {
                this.f49939c.draw(canvas);
            }
            if (this.v || this.f49941n) {
                if (this.f49941n && !this.f49942r) {
                    Paint paint = this.f49945x;
                    if (this.F.isOutOwner()) {
                        i10 = y6.f23399fc;
                    } else {
                        i10 = y6.f23381ec;
                    }
                    paint.setColor(i0.a.o(y6.x0(null, i10, false), 16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f49945x);
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f49944w);
                }
            }
            if (this.f49941n) {
                if (this.f49943s == null) {
                    this.f49943s = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
                }
                Drawable drawable = this.f49943s;
                ng ngVar = this.G;
                if (this.f49942r) {
                    x02 = -1;
                } else {
                    if (this.F.isOutOwner()) {
                        i11 = y6.f23640sb;
                    } else {
                        i11 = y6.f23548nd;
                    }
                    x02 = y6.x0(null, i11, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ngVar.getClass();
                if (((PorterDuffColorFilter) ngVar.f640c) == null || ngVar.f639b != x02 || ((PorterDuff.Mode) ngVar.d) != mode) {
                    ngVar.f640c = new PorterDuffColorFilter(x02, mode);
                    ngVar.f639b = x02;
                    ngVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) ngVar.f640c);
                v.e(this.f49943s, rectF.centerX(), rectF.centerY(), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
                this.f49943s.draw(canvas);
            }
            b(true);
            if (this.J) {
                this.E.draw(canvas);
            }
        }
    }

    public final float d(float f7) {
        o9 o9Var = this.f49938b;
        float c10 = this.f49937a.c() + o9Var.f31237c.d.f19343f.f19350a;
        float dp = o9Var.f31237c.d.f19342c.f19350a * AndroidUtilities.dp(4.0f);
        float f10 = this.f49946y.e;
        return (f7 * f10) + (dp * f10) + c10;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i10;
        float f7 = this.f49937a.d;
        int i11 = this.K;
        if (i11 > 0) {
            i10 = AndroidUtilities.dp((i11 * 9.34f) + 8.66f);
        } else {
            i10 = 0;
        }
        return f7 + i10;
    }

    public final void f(boolean z10) {
        this.f49940f = z10;
    }

    public final void g(int i10, boolean z10) {
        if (this.L != i10) {
            this.L = i10;
            this.E.setIcon(i10, true, z10);
        }
    }

    @Override
    public final int getObserverTag() {
        return this.I;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final void h(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.MessageMedia r18, org.telegram.messenger.MessageObject r19, java.lang.String r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: uh.b.h(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.MessageObject, java.lang.String, boolean):void");
    }

    public final void i(ArrayList arrayList, boolean z10) {
        int i10;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        this.K = i10;
        this.f49938b.d(arrayList, z10);
    }

    public final void j(int i10, boolean z10) {
        String str = null;
        if (i10 > 0) {
            str = LocaleController.formatShortNumber(i10, null);
        }
        this.f49937a.t(str, z10, true);
    }

    public final void k(int i10) {
        this.f49937a.u(i10);
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float min;
        int i10;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.E.p(min, true);
        if (min < 1.0f) {
            i10 = 3;
        } else if (this.v) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        g(i10, true);
        this.d.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float min;
        int i10;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.E.p(min, true);
        if (min < 1.0f) {
            i10 = 3;
        } else if (this.v) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        g(i10, true);
        this.d.invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }
}
