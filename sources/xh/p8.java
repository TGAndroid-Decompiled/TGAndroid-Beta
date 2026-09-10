package xh;

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
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;
public final class p8 {
    public int f45882a;
    public final RectF f45883b;
    public final org.telegram.ui.Components.d6 f45884c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public LinearGradient f45885f;
    public final Matrix f45886g;
    public final Paint h;
    public final boolean f45887i;
    public long f45888j;
    public final ImageReceiver f45889k;
    public final g9 f45890l;
    public final g9 f45891m;
    public t01 f45892n;
    public t01 f45893o;
    public boolean f45894p;
    public final xc f45895q;
    public int f45896r;
    public Drawable f45897s;
    public Drawable f45898t;
    public t01 f45899u;
    public int v;
    public final q8 f45900w;

    public p8(q8 q8Var, boolean z10, long j3) {
        String str;
        r8 r8Var = q8Var.f45944r;
        this.f45900w = q8Var;
        this.f45883b = new RectF();
        wr wrVar = wr.h;
        this.f45884c = new org.telegram.ui.Components.d6(q8Var, 0L, 600L, wrVar);
        this.d = new org.telegram.ui.Components.d6(q8Var, 0L, 200L, wrVar);
        this.e = new org.telegram.ui.Components.d6(q8Var, 0L, 350L, wrVar);
        this.f45885f = null;
        this.f45886g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(q8Var);
        this.f45889k = imageReceiver;
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        this.f45890l = g9Var;
        g9 g9Var2 = new g9((org.telegram.ui.ActionBar.f6) null);
        this.f45891m = g9Var2;
        this.f45895q = new xc(q8Var);
        this.f45887i = z10;
        this.f45888j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(r8Var.f45989c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            g9Var.r(user);
            imageReceiver.setForUserOrChat(user, g9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(r8Var.f45989c).getChat(Long.valueOf(-j3));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            g9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, g9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        g9Var2.g(21);
        g9Var2.h(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17912c8, r8Var.f45988b));
        this.f45892n = new t01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f45884c.d(this.f45882a, false);
        int i10 = this.f45882a;
        q8 q8Var = this.f45900w;
        if (i10 >= 0 && i10 < q8Var.f45940b.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (q8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, q8Var.f45942f);
        float dp = ((q8Var.f45942f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f45883b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f45895q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.f45894p);
            if (e7 < 1.0f) {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f45889k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
            }
            if (e7 > 0.0f) {
                int i11 = (int) dp;
                int dp3 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp4 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp5 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp6 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                g9 g9Var = this.f45891m;
                g9Var.setBounds(dp3, dp4, dp5, dp6);
                g9Var.f23294y = (int) (e * f7 * e7);
                g9Var.draw(canvas);
                g9Var.f23294y = 255;
            }
        } else {
            f7 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f45893o.f27247c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.f45893o.f27247c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, q8Var.d);
        int i13 = (int) (e * f7);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f45885f != null) {
            Matrix matrix = this.f45886g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f45885f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        t01 t01Var = this.f45893o;
        t01Var.c(dp - (t01Var.f27247c / f11), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        t01 t01Var2 = this.f45892n;
        t01Var2.f27257p = width - AndroidUtilities.dp(4.0f);
        t01Var2.c(dp - (this.f45892n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, q8Var.f45944r.f45988b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f45898t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f45897s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f45898t.setAlpha(i13);
            this.f45897s.setAlpha(i13);
            this.f45898t.draw(canvas);
            this.f45897s.draw(canvas);
            t01 t01Var3 = this.f45899u;
            t01Var3.c(dp - (t01Var3.f27247c / f11), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        q8 q8Var = this.f45900w;
        r8 r8Var = q8Var.f45944r;
        if (this.f45887i) {
            if (this.f45894p) {
                j10 = 2666000;
            } else if (this.f45888j == UserConfig.getInstance(r8Var.f45989c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f45888j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f45894p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(r8Var.f45989c).getClientUserId();
                }
                this.f45888j = j3;
                if (this.f45894p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f45889k;
                    g9 g9Var = this.f45890l;
                    if (j3 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(r8Var.f45989c).getUser(Long.valueOf(this.f45888j));
                        str = UserObject.getForcedFirstName(user);
                        g9Var.r(user);
                        imageReceiver.setForUserOrChat(user, g9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(r8Var.f45989c).getChat(Long.valueOf(-this.f45888j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        g9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, g9Var);
                    }
                    str2 = str;
                }
                this.f45892n = new t01(str2, 12.0f, null);
                q8Var.invalidate();
            }
        }
    }
}
