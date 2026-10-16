package th;

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
import ne.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.r6;
import zf.q;
public final class b extends Drawable implements DownloadController.FileDownloadProgressListener {
    public final RadialProgress2 E;
    public MessageObject F;
    public final a5.a G;
    public String H;
    public final int I;
    public boolean J;
    public int K;
    public int L;
    public final r6 f45821a;
    public final p9 f45822b;
    public final ImageReceiver f45823c;
    public final u1 d;
    public final int e;
    public boolean f45824f;
    public boolean h;
    public boolean f45825n;
    public boolean f45826r;
    public Drawable f45827s;
    public boolean v;
    public final Paint f45828w;
    public final Paint f45829x;
    public final ne.b f45830y;

    public b(int i10, u1 u1Var) {
        Paint paint = new Paint(1);
        this.f45828w = paint;
        this.f45829x = new Paint(1);
        this.G = new a5.a((char) 0, 15);
        this.e = i10;
        this.d = u1Var;
        this.f45830y = new ne.b(u1Var, es.h, 380L);
        r6 r6Var = new r6(false, false, false);
        this.f45821a = r6Var;
        r6Var.f28435b = 21;
        r6Var.w(AndroidUtilities.dp(11.0f));
        r6Var.setCallback(u1Var);
        this.f45822b = new p9(i10, u1Var, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dpf2(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(u1Var);
        this.f45823c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(u1Var, null);
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
        this.f45823c.setImage(forObject, "36_36", forObject2, "36_36_b", null, j10, null, obj, 1);
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
        if (this.f45824f) {
            f7 = 56.33f;
        } else {
            f7 = 19.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (this.f45830y.e > 0.0f) {
            i iVar = this.f45822b.f27931c.d;
            float f10 = iVar.f16019c.f16027a;
            int i12 = (int) iVar.f16020f.f16027a;
            int lerp = (bounds.right - dp) - AndroidUtilities.lerp(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + i12, f10);
            if (f10 > 0.0f) {
                p9 p9Var = this.f45822b;
                p9Var.f27934i = (int) (this.f45830y.e * 255.0f);
                p9Var.setBounds((bounds.right - dp) - i12, bounds.bottom - AndroidUtilities.dp(31.33f), bounds.right - dp, bounds.bottom);
                this.f45822b.c(canvas);
            }
            int dp2 = bounds.bottom - AndroidUtilities.dp(21.33f);
            r6 r6Var = this.f45821a;
            r6Var.B = (int) (this.f45830y.e * 255.0f);
            r6Var.setBounds(bounds.left, AndroidUtilities.dp(15.0f) + dp2, lerp, dp2 - AndroidUtilities.dp(15.0f));
            this.f45821a.draw(canvas);
        }
        if (this.h) {
            int dp3 = AndroidUtilities.dp(36.0f);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(g0.B(9.0f, bounds.right, dp3), g0.B(4.0f, bounds.bottom, dp3), bounds.right - AndroidUtilities.dp(9.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.E;
            radialProgress2.f22945a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f45823c.setImageCoords(rect);
            if (!this.f45825n || this.f45826r) {
                this.f45823c.draw(canvas);
            }
            if (this.v || this.f45825n) {
                if (this.f45825n && !this.f45826r) {
                    Paint paint = this.f45829x;
                    if (this.F.isOutOwner()) {
                        i10 = g6.fc;
                    } else {
                        i10 = g6.f19623ec;
                    }
                    paint.setColor(i0.a.k(g6.x0(null, i10, false), 16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f45829x);
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f45828w);
                }
            }
            if (this.f45825n) {
                if (this.f45827s == null) {
                    this.f45827s = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
                }
                Drawable drawable = this.f45827s;
                a5.a aVar = this.G;
                if (this.f45826r) {
                    x02 = -1;
                } else {
                    if (this.F.isOutOwner()) {
                        i11 = g6.f19883sb;
                    } else {
                        i11 = g6.f19791nd;
                    }
                    x02 = g6.x0(null, i11, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                aVar.getClass();
                if (((PorterDuffColorFilter) aVar.f282c) == null || aVar.f281b != x02 || ((PorterDuff.Mode) aVar.d) != mode) {
                    aVar.f282c = new PorterDuffColorFilter(x02, mode);
                    aVar.f281b = x02;
                    aVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) aVar.f282c);
                q.e(this.f45827s, rectF.centerX(), rectF.centerY(), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
                this.f45827s.draw(canvas);
            }
            b(true);
            if (this.J) {
                this.E.draw(canvas);
            }
        }
    }

    public final float d(float f7) {
        p9 p9Var = this.f45822b;
        float c10 = this.f45821a.c() + p9Var.f27931c.d.f16020f.f16027a;
        float dp = p9Var.f27931c.d.f16019c.f16027a * AndroidUtilities.dp(4.0f);
        float f10 = this.f45830y.e;
        return (f7 * f10) + (dp * f10) + c10;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i10;
        float f7 = this.f45821a.d;
        int i11 = this.K;
        if (i11 > 0) {
            i10 = AndroidUtilities.dp((i11 * 9.34f) + 8.66f);
        } else {
            i10 = 0;
        }
        return f7 + i10;
    }

    public final void f(boolean z10) {
        this.f45824f = z10;
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
        throw new UnsupportedOperationException("Method not decompiled: th.b.h(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.MessageObject, java.lang.String, boolean):void");
    }

    public final void i(ArrayList arrayList, boolean z10) {
        int i10;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        this.K = i10;
        this.f45822b.d(arrayList, z10);
    }

    public final void j(int i10, boolean z10) {
        String str = null;
        if (i10 > 0) {
            str = LocaleController.formatShortNumber(i10, null);
        }
        this.f45821a.t(str, z10, true);
    }

    public final void k(int i10) {
        this.f45821a.u(i10);
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
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float min;
        int i10;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
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
