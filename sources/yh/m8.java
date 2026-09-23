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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.yc;
public final class m8 {
    public int f47414a;
    public final RectF f47415b;
    public final org.telegram.ui.Components.e6 f47416c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 e;
    public LinearGradient f47417f;
    public final Matrix f47418g;
    public final Paint h;
    public final boolean f47419i;
    public long f47420j;
    public final ImageReceiver f47421k;
    public final h9 f47422l;
    public final h9 f47423m;
    public f01 f47424n;
    public f01 f47425o;
    public boolean f47426p;
    public final yc f47427q;
    public int f47428r;
    public Drawable f47429s;
    public Drawable f47430t;
    public f01 f47431u;
    public int v;
    public final n8 f47432w;

    public m8(n8 n8Var, boolean z10, long j3) {
        String str;
        o8 o8Var = n8Var.f47471r;
        this.f47432w = n8Var;
        this.f47415b = new RectF();
        rr rrVar = rr.h;
        this.f47416c = new org.telegram.ui.Components.e6(n8Var, 0L, 600L, rrVar);
        this.d = new org.telegram.ui.Components.e6(n8Var, 0L, 200L, rrVar);
        this.e = new org.telegram.ui.Components.e6(n8Var, 0L, 350L, rrVar);
        this.f47417f = null;
        this.f47418g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(n8Var);
        this.f47421k = imageReceiver;
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f47422l = h9Var;
        h9 h9Var2 = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f47423m = h9Var2;
        this.f47427q = new yc(n8Var);
        this.f47419i = z10;
        this.f47420j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(o8Var.f47517c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            h9Var.r(user);
            imageReceiver.setForUserOrChat(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(o8Var.f47517c).getChat(Long.valueOf(-j3));
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
        h9Var2.h(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18773c8, o8Var.f47516b));
        this.f47424n = new f01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f47416c.d(this.f47414a, false);
        int i10 = this.f47414a;
        n8 n8Var = this.f47432w;
        if (i10 >= 0 && i10 < n8Var.f47467b.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (n8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, n8Var.f47469f);
        float dp = ((n8Var.f47469f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f47415b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f47427q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.f47426p);
            if (e7 < 1.0f) {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f47421k;
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
                h9 h9Var = this.f47423m;
                h9Var.setBounds(dp3, dp4, dp5, dp6);
                h9Var.f24598y = (int) (e * f7 * e7);
                h9Var.draw(canvas);
                h9Var.f24598y = 255;
            }
        } else {
            f7 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f47425o.f23785c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.f47425o.f23785c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, n8Var.d);
        int i13 = (int) (e * f7);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f47417f != null) {
            Matrix matrix = this.f47418g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f47417f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        f01 f01Var = this.f47425o;
        f01Var.c(dp - (f01Var.f23785c / f11), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        f01 f01Var2 = this.f47424n;
        f01Var2.f23795p = width - AndroidUtilities.dp(4.0f);
        f01Var2.c(dp - (this.f47424n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, n8Var.f47471r.f47516b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f47430t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47429s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47430t.setAlpha(i13);
            this.f47429s.setAlpha(i13);
            this.f47430t.draw(canvas);
            this.f47429s.draw(canvas);
            f01 f01Var3 = this.f47431u;
            f01Var3.c(dp - (f01Var3.f23785c / f11), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        n8 n8Var = this.f47432w;
        o8 o8Var = n8Var.f47471r;
        if (this.f47419i) {
            if (this.f47426p) {
                j10 = 2666000;
            } else if (this.f47420j == UserConfig.getInstance(o8Var.f47517c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f47420j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f47426p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(o8Var.f47517c).getClientUserId();
                }
                this.f47420j = j3;
                if (this.f47426p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f47421k;
                    h9 h9Var = this.f47422l;
                    if (j3 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(o8Var.f47517c).getUser(Long.valueOf(this.f47420j));
                        str = UserObject.getForcedFirstName(user);
                        h9Var.r(user);
                        imageReceiver.setForUserOrChat(user, h9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(o8Var.f47517c).getChat(Long.valueOf(-this.f47420j));
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
                this.f47424n = new f01(str2, 12.0f, null);
                n8Var.invalidate();
            }
        }
    }
}
