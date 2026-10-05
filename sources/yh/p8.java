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
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zc;
public final class p8 {
    public int f51827a;
    public final RectF f51828b;
    public final org.telegram.ui.Components.e6 f51829c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 f51830e;
    public LinearGradient f51831f;
    public final Matrix f51832g;
    public final Paint h;
    public final boolean f51833i;
    public long f51834j;
    public final ImageReceiver f51835k;
    public final h9 f51836l;
    public final h9 f51837m;
    public f11 f51838n;
    public f11 f51839o;
    public boolean f51840p;
    public final zc f51841q;
    public int f51842r;
    public Drawable f51843s;
    public Drawable f51844t;
    public f11 f51845u;
    public int v;
    public final q8 f51846w;

    public p8(q8 q8Var, boolean z10, long j3) {
        String str;
        r8 r8Var = q8Var.f51889r;
        this.f51846w = q8Var;
        this.f51828b = new RectF();
        tr trVar = tr.h;
        this.f51829c = new org.telegram.ui.Components.e6(q8Var, 0L, 600L, trVar);
        this.d = new org.telegram.ui.Components.e6(q8Var, 0L, 200L, trVar);
        this.f51830e = new org.telegram.ui.Components.e6(q8Var, 0L, 350L, trVar);
        this.f51831f = null;
        this.f51832g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(q8Var);
        this.f51835k = imageReceiver;
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f51836l = h9Var;
        h9 h9Var2 = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f51837m = h9Var2;
        this.f51841q = new zc(q8Var);
        this.f51833i = z10;
        this.f51834j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(r8Var.f51939c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            h9Var.r(user);
            imageReceiver.setForUserOrChat(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(r8Var.f51939c).getChat(Long.valueOf(-j3));
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
        h9Var2.h(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20811c8, r8Var.f51938b));
        this.f51838n = new f11(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f51829c.d(this.f51827a, false);
        int i10 = this.f51827a;
        q8 q8Var = this.f51846w;
        if (i10 >= 0 && i10 < q8Var.f51884b.size()) {
            z10 = true;
        }
        float e7 = this.d.e(z10);
        canvas.save();
        float width = (q8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, q8Var.f51887f);
        float dp = ((q8Var.f51887f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f51828b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e7) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f51841q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e7 > 0.0f) {
            float e10 = this.f51830e.e(this.f51840p);
            if (e10 < 1.0f) {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f51835k;
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
                h9 h9Var = this.f51837m;
                h9Var.setBounds(dp3, dp4, dp5, dp6);
                h9Var.f27162y = (int) (e7 * f7 * e10);
                h9Var.draw(canvas);
                h9Var.f27162y = 255;
            }
        } else {
            f7 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f51839o.f26266c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.f51839o.f26266c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, q8Var.d);
        int i13 = (int) (e7 * f7);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f51831f != null) {
            Matrix matrix = this.f51832g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f51831f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        f11 f11Var = this.f51839o;
        f11Var.c(dp - (f11Var.f26266c / f11), AndroidUtilities.dp(23.0f) + dp2, e7, -1, canvas);
        f11 f11Var2 = this.f51838n;
        f11Var2.f26277p = width - AndroidUtilities.dp(4.0f);
        f11Var2.c(dp - (this.f51838n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e7, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, q8Var.f51889r.f51938b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f51844t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f51843s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f51844t.setAlpha(i13);
            this.f51843s.setAlpha(i13);
            this.f51844t.draw(canvas);
            this.f51843s.draw(canvas);
            f11 f11Var3 = this.f51845u;
            f11Var3.c(dp - (f11Var3.f26266c / f11), dp2 - AndroidUtilities.dp(27.0f), e7, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        q8 q8Var = this.f51846w;
        r8 r8Var = q8Var.f51889r;
        if (this.f51833i) {
            if (this.f51840p) {
                j10 = 2666000;
            } else if (this.f51834j == UserConfig.getInstance(r8Var.f51939c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f51834j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f51840p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(r8Var.f51939c).getClientUserId();
                }
                this.f51834j = j3;
                if (this.f51840p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f51835k;
                    h9 h9Var = this.f51836l;
                    if (j3 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(r8Var.f51939c).getUser(Long.valueOf(this.f51834j));
                        str = UserObject.getForcedFirstName(user);
                        h9Var.r(user);
                        imageReceiver.setForUserOrChat(user, h9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(r8Var.f51939c).getChat(Long.valueOf(-this.f51834j));
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
                this.f51838n = new f11(str2, 12.0f, null);
                q8Var.invalidate();
            }
        }
    }
}
