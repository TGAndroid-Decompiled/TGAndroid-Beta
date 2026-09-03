package sh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.z8;
public final class v3 extends Drawable implements s6, NotificationCenter.NotificationCenterDelegate {
    public final Paint f47785a;
    public final Paint f47786b;
    public final ImageReceiver f47787c;
    public final ImageReceiver d;
    public int f47788e;
    public final l5[] f47789f;
    public final k01 h;
    public final RectF f47790n;
    public final boolean f47791r;
    public final z5 f47792s;
    public boolean v;
    public boolean f47793w;
    public View f47794x;

    public v3(TLRPC.User user) {
        Paint paint = new Paint(1);
        this.f47785a = paint;
        Paint paint2 = new Paint(1);
        this.f47786b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f47787c = imageReceiver;
        this.d = new ImageReceiver();
        this.f47788e = 1;
        this.f47789f = new l5[2];
        this.f47790n = new RectF();
        this.f47792s = new z5(new u3(this, 1), 320L, pr.h, 0);
        this.f47791r = false;
        int i10 = k6.f21661d6;
        paint.setColor(k6.w0(null, i10, false));
        paint2.setColor(k6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), k6.l1(0.18f, -16777216));
        z8 z8Var = new z8((g6) null);
        z8Var.r(user);
        imageReceiver.setForUserOrChat(user, z8Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        d();
        this.h = new k01(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void a(kj0 kj0Var) {
        this.f47794x = kj0Var;
        this.d.setParentView(kj0Var);
        this.f47787c.setParentView(kj0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.f47793w = false;
        this.f47787c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        l5[] l5VarArr = this.f47789f;
        l5 l5Var = l5VarArr[0];
        if (l5Var != null) {
            l5Var.o(this.f47794x);
        }
        l5 l5Var2 = l5VarArr[1];
        if (l5Var2 != null) {
            l5Var2.o(this.f47794x);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.f47793w = true;
        this.f47787c.onAttachedToWindow();
        this.d.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        l5[] l5VarArr = this.f47789f;
        l5 l5Var = l5VarArr[0];
        if (l5Var != null) {
            l5Var.a(this.f47794x);
        }
        l5 l5Var2 = l5VarArr[1];
        if (l5Var2 != null) {
            l5Var2.a(this.f47794x);
        }
    }

    public final void d() {
        l5 l5Var;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        if (stickerSet != null && !stickerSet.documents.isEmpty()) {
            TLRPC.Document document = stickerSet.documents.get((int) Math.floor(Math.random() * stickerSet.documents.size()));
            int i10 = 1 - this.f47788e;
            this.f47788e = i10;
            l5[] l5VarArr = this.f47789f;
            l5 l5Var2 = l5VarArr[i10];
            if (l5Var2 != null) {
                l5Var2.o(this.f47794x);
            }
            l5VarArr[this.f47788e] = l5.m(UserConfig.selectedAccount, 9, document);
            l5VarArr[this.f47788e].setColorFilter(new PorterDuffColorFilter(k6.w0(null, k6.Oh, false), PorterDuff.Mode.SRC_IN));
            if (this.f47793w && (l5Var = l5VarArr[this.f47788e]) != null) {
                l5Var.a(this.f47794x);
            }
            AndroidUtilities.runOnUIThread(new u3(this, 0), 2500L);
            return;
        }
        this.v = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.groupStickersDidLoad && this.v && this.f47793w) {
            this.v = false;
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        l5 l5Var;
        l5 l5Var2;
        int i11;
        Rect bounds = getBounds();
        boolean z4 = this.f47791r;
        if (z4) {
            i10 = 48;
        } else {
            i10 = 28;
        }
        float dp = (AndroidUtilities.dp((i10 + 38) + 6.66f) + this.h.f28227c) / 2.0f;
        float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
        RectF rectF = this.f47790n;
        rectF.set(bounds.centerX() - dp, bounds.centerY() - dp2, bounds.centerX() + dp, bounds.centerY() + dp2);
        canvas.drawRoundRect(rectF, dp2, dp2, this.f47785a);
        ImageReceiver imageReceiver = this.f47787c;
        imageReceiver.setImageCoords(rectF.left, rectF.top, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        imageReceiver.draw(canvas);
        this.h.c(AndroidUtilities.dp(36.0f) + rectF.left, rectF.centerY(), 1.0f, k6.w0(null, k6.G6, false), canvas);
        if (z4) {
            float dp3 = rectF.right - AndroidUtilities.dp(22.66f);
            canvas.drawCircle(dp3, rectF.centerY(), AndroidUtilities.dp(24.0f), this.f47786b);
            ImageReceiver imageReceiver2 = this.d;
            imageReceiver2.setImageCoords(dp3 - AndroidUtilities.dp(16.0f), rectF.centerY() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
            imageReceiver2.draw(canvas);
            return;
        }
        float d = this.f47792s.d(this.f47788e, false);
        canvas.save();
        canvas.translate((int) (rectF.right - AndroidUtilities.dp(30.66f)), (int) (rectF.centerY() - AndroidUtilities.dp(12.0f)));
        int i12 = -1;
        l5[] l5VarArr = this.f47789f;
        if (d < 1.0f && (l5Var2 = l5VarArr[0]) != null) {
            canvas.save();
            f10 = 24.0f;
            if (this.f47788e == 0) {
                i11 = -1;
            } else {
                i11 = 1;
            }
            canvas.translate(0.0f, i11 * AndroidUtilities.dp(9.0f) * d);
            float f14 = 1.0f - d;
            f12 = 255.0f;
            float f15 = (f14 * 0.4f) + 0.6f;
            f11 = 0.4f;
            f13 = 12.0f;
            canvas.scale(f15, f15, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            l5Var2.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            l5Var2.setAlpha((int) (f14 * 255.0f));
            l5Var2.draw(canvas);
            canvas.restore();
        } else {
            f10 = 24.0f;
            f11 = 0.4f;
            f12 = 255.0f;
            f13 = 12.0f;
        }
        if (d > 0.0f && (l5Var = l5VarArr[1]) != null) {
            canvas.save();
            if (this.f47788e != 1) {
                i12 = 1;
            }
            canvas.translate(0.0f, (1.0f - d) * AndroidUtilities.dp(9.0f) * i12);
            float f16 = (d * f11) + 0.6f;
            canvas.scale(f16, f16, AndroidUtilities.dp(f13), AndroidUtilities.dp(f13));
            l5Var.setBounds(0, 0, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            l5Var.setAlpha((int) (d * f12));
            l5Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public v3(TLRPC.User user, TLRPC.Document document) {
        Paint paint = new Paint(1);
        this.f47785a = paint;
        Paint paint2 = new Paint(1);
        this.f47786b = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f47787c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.d = imageReceiver2;
        this.f47788e = 1;
        this.f47789f = new l5[2];
        this.f47790n = new RectF();
        this.f47792s = new z5(new u3(this, 1), 320L, pr.h, 0);
        this.f47791r = true;
        int i10 = k6.f21661d6;
        paint.setColor(k6.w0(null, i10, false));
        paint2.setColor(k6.w0(null, i10, false));
        paint2.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(2.0f), k6.l1(0.18f, -16777216));
        z8 z8Var = new z8((g6) null);
        z8Var.r(user);
        imageReceiver.setForUserOrChat(user, z8Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(16.0f));
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 120);
        imageReceiver2.setImage(ImageLocation.getForDocument(document), "120_120", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "120_120", DocumentObject.getSvgThumb(document.thumbs, k6.f21607a7, 0.35f), 0L, null, null, 0);
        this.h = new k01(UserObject.getUserName(user), 14.0f, null);
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
