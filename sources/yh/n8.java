package yh;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zc;
public final class n8 {
    public int f51693a;
    public final RectF f51694b;
    public final org.telegram.ui.Components.e6 f51695c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 f51696e;
    public LinearGradient f51697f;
    public final Matrix f51698g;
    public final Paint h;
    public final boolean f51699i;
    public long f51700j;
    public final ImageReceiver f51701k;
    public final h9 f51702l;
    public final h9 f51703m;
    public e11 f51704n;
    public e11 f51705o;
    public boolean f51706p;
    public final zc f51707q;
    public int f51708r;
    public Drawable f51709s;
    public Drawable f51710t;
    public e11 f51711u;
    public int v;
    public final o8 f51712w;

    public n8(o8 o8Var, boolean z10, long j3) {
        String str;
        p8 p8Var = o8Var.f51785r;
        this.f51712w = o8Var;
        this.f51694b = new RectF();
        tr trVar = tr.h;
        this.f51695c = new org.telegram.ui.Components.e6(o8Var, 0L, 600L, trVar);
        this.d = new org.telegram.ui.Components.e6(o8Var, 0L, 200L, trVar);
        this.f51696e = new org.telegram.ui.Components.e6(o8Var, 0L, 350L, trVar);
        this.f51697f = null;
        this.f51698g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(o8Var);
        this.f51701k = imageReceiver;
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f51702l = h9Var;
        h9 h9Var2 = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f51703m = h9Var2;
        this.f51707q = new zc(o8Var);
        this.f51699i = z10;
        this.f51700j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(p8Var.f51831c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            h9Var.r(user);
            imageReceiver.setForUserOrChat(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(p8Var.f51831c).getChat(Long.valueOf(-j3));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            h9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, h9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        h9Var2.g(21);
        h9Var2.h(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20802c8, p8Var.f51830b));
        this.f51704n = new e11(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f51695c.d(this.f51693a, false);
        int i10 = this.f51693a;
        o8 o8Var = this.f51712w;
        if (i10 >= 0 && i10 < o8Var.f51780b.size()) {
            z10 = true;
        }
        float e7 = this.d.e(z10);
        canvas.save();
        float width = (o8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, o8Var.f51783f);
        float dp = ((o8Var.f51783f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f51694b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e7) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f51707q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e7 > 0.0f) {
            float e10 = this.f51696e.e(this.f51706p);
            if (e10 < 1.0f) {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f51701k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                imageReceiver.setAlpha(e7);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
            }
            if (e10 > 0.0f) {
                int i11 = (int) dp;
                int dp3 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp4 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp5 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp6 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                h9 h9Var = this.f51703m;
                h9Var.setBounds(dp3, dp4, dp5, dp6);
                h9Var.f27065y = (int) (e7 * f7 * e10);
                h9Var.draw(canvas);
                h9Var.f27065y = 255;
            }
        } else {
            f7 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f51705o.f25879c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.f51705o.f25879c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, o8Var.d);
        int i13 = (int) (e7 * f7);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f51697f != null) {
            Matrix matrix = this.f51698g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f51697f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        e11 e11Var = this.f51705o;
        e11Var.c(dp - (e11Var.f25879c / f11), AndroidUtilities.dp(23.0f) + dp2, e7, -1, canvas);
        e11 e11Var2 = this.f51704n;
        e11Var2.f25890p = width - AndroidUtilities.dp(4.0f);
        e11Var2.c(dp - (this.f51704n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e7, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, o8Var.f51785r.f51830b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f51710t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f51709s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f51710t.setAlpha(i13);
            this.f51709s.setAlpha(i13);
            this.f51710t.draw(canvas);
            this.f51709s.draw(canvas);
            e11 e11Var3 = this.f51711u;
            e11Var3.c(dp - (e11Var3.f25879c / f11), dp2 - AndroidUtilities.dp(27.0f), e7, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        o8 o8Var = this.f51712w;
        p8 p8Var = o8Var.f51785r;
        if (this.f51699i) {
            if (this.f51706p) {
                j10 = 2666000;
            } else if (this.f51700j == UserConfig.getInstance(p8Var.f51831c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f51700j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f51706p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(p8Var.f51831c).getClientUserId();
                }
                this.f51700j = j3;
                if (this.f51706p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f51701k;
                    h9 h9Var = this.f51702l;
                    if (j3 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(p8Var.f51831c).getUser(Long.valueOf(this.f51700j));
                        str = UserObject.getForcedFirstName(user);
                        h9Var.r(user);
                        imageReceiver.setForUserOrChat(user, h9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(p8Var.f51831c).getChat(Long.valueOf(-this.f51700j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        h9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, h9Var);
                    }
                    str2 = str;
                }
                this.f51704n = new e11(str2, 12.0f, null);
                o8Var.invalidate();
            }
        }
    }
}
