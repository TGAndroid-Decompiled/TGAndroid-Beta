package rh;

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
import le.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.a2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wr;
import xf.p;
public final class b extends Drawable implements DownloadController.FileDownloadProgressListener {
    public final RadialProgress2 E;
    public MessageObject F;
    public final a5.a G;
    public String H;
    public final int I;
    public boolean J;
    public int K;
    public int L;
    public final n6 f41524a;
    public final l9 f41525b;
    public final ImageReceiver f41526c;
    public final t1 d;
    public final int e;
    public boolean f41527f;
    public boolean h;
    public boolean f41528n;
    public boolean f41529r;
    public Drawable f41530s;
    public boolean v;
    public final Paint f41531w;
    public final Paint f41532x;
    public final le.b f41533y;

    public b(int i10, t1 t1Var) {
        Paint paint = new Paint(1);
        this.f41531w = paint;
        this.f41532x = new Paint(1);
        this.G = new a5.a((char) 0, 15);
        this.e = i10;
        this.d = t1Var;
        this.f41533y = new le.b(t1Var, wr.h, 380L);
        n6 n6Var = new n6(false, false, false, false);
        this.f41524a = n6Var;
        n6Var.f25425b = 21;
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.setCallback(t1Var);
        this.f41525b = new l9(i10, t1Var, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dpf2(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        this.f41526c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(t1Var, null);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(18.0f));
        radialProgress2.d = -1;
        this.I = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        long j3;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true);
        ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize2, photo);
        ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize, photo);
        if (closestPhotoSizeWithSize2 != null) {
            j3 = closestPhotoSizeWithSize2.size;
        } else {
            j3 = 0;
        }
        this.f41526c.setImage(forObject, "36_36", forObject2, "36_36_b", null, j3, null, obj, 1);
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
        int w02;
        Rect bounds = getBounds();
        if (this.f41527f) {
            f7 = 56.33f;
        } else {
            f7 = 19.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (this.f41533y.e > 0.0f) {
            i iVar = this.f41525b.f24907c.d;
            float f10 = iVar.f12885c.f12893a;
            int i12 = (int) iVar.f12886f.f12893a;
            int lerp = (bounds.right - dp) - AndroidUtilities.lerp(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + i12, f10);
            if (f10 > 0.0f) {
                l9 l9Var = this.f41525b;
                l9Var.f24910i = (int) (this.f41533y.e * 255.0f);
                l9Var.setBounds((bounds.right - dp) - i12, bounds.bottom - AndroidUtilities.dp(31.33f), bounds.right - dp, bounds.bottom);
                this.f41525b.c(canvas);
            }
            int dp2 = bounds.bottom - AndroidUtilities.dp(21.33f);
            n6 n6Var = this.f41524a;
            n6Var.f25442w = (int) (this.f41533y.e * 255.0f);
            n6Var.setBounds(bounds.left, AndroidUtilities.dp(15.0f) + dp2, lerp, dp2 - AndroidUtilities.dp(15.0f));
            this.f41524a.draw(canvas);
        }
        if (this.h) {
            int dp3 = AndroidUtilities.dp(36.0f);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(a2.B(9.0f, bounds.right, dp3), a2.B(4.0f, bounds.bottom, dp3), bounds.right - AndroidUtilities.dp(9.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.E;
            radialProgress2.f21210a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f41526c.setImageCoords(rect);
            if (!this.f41528n || this.f41529r) {
                this.f41526c.draw(canvas);
            }
            if (this.v || this.f41528n) {
                if (this.f41528n && !this.f41529r) {
                    Paint paint = this.f41532x;
                    if (this.F.isOutOwner()) {
                        i10 = j6.f17969fc;
                    } else {
                        i10 = j6.ec;
                    }
                    paint.setColor(i0.a.k(j6.w0(null, i10, false), 16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f41532x);
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f41531w);
                }
            }
            if (this.f41528n) {
                if (this.f41530s == null) {
                    this.f41530s = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
                }
                Drawable drawable = this.f41530s;
                a5.a aVar = this.G;
                if (this.f41529r) {
                    w02 = -1;
                } else {
                    if (this.F.isOutOwner()) {
                        i11 = j6.f18204sb;
                    } else {
                        i11 = j6.f18115nd;
                    }
                    w02 = j6.w0(null, i11, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                aVar.getClass();
                if (((PorterDuffColorFilter) aVar.f276c) == null || aVar.f275b != w02 || ((PorterDuff.Mode) aVar.d) != mode) {
                    aVar.f276c = new PorterDuffColorFilter(w02, mode);
                    aVar.f275b = w02;
                    aVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) aVar.f276c);
                p.e(this.f41530s, rectF.centerX(), rectF.centerY(), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
                this.f41530s.draw(canvas);
            }
            b(true);
            if (this.J) {
                this.E.draw(canvas);
            }
        }
    }

    public final float d(float f7) {
        l9 l9Var = this.f41525b;
        float d = this.f41524a.d() + l9Var.f24907c.d.f12886f.f12893a;
        float dp = l9Var.f24907c.d.f12885c.f12893a * AndroidUtilities.dp(4.0f);
        float f10 = this.f41533y.e;
        return (f7 * f10) + (dp * f10) + d;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i10;
        float f7 = this.f41524a.d;
        int i11 = this.K;
        if (i11 > 0) {
            i10 = AndroidUtilities.dp((i11 * 9.34f) + 8.66f);
        } else {
            i10 = 0;
        }
        return f7 + i10;
    }

    public final void f(boolean z10) {
        this.f41527f = z10;
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
        throw new UnsupportedOperationException("Method not decompiled: rh.b.h(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.MessageObject, java.lang.String, boolean):void");
    }

    public final void i(ArrayList arrayList, boolean z10) {
        int i10;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        this.K = i10;
        this.f41525b.d(arrayList, z10);
    }

    public final void j(int i10, boolean z10) {
        String str = null;
        if (i10 > 0) {
            str = LocaleController.formatShortNumber(i10, null);
        }
        this.f41524a.q(str, z10, true);
    }

    public final void k(int i10) {
        this.f41524a.r(i10);
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        float min;
        int i10;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.E.o(min, true);
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
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
        float min;
        int i10;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.E.o(min, true);
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
