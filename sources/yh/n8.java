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
    public int f51694a;
    public final RectF f51695b;
    public final org.telegram.ui.Components.e6 f51696c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 f51697e;
    public LinearGradient f51698f;
    public final Matrix f51699g;
    public final Paint h;
    public final boolean f51700i;
    public long f51701j;
    public final ImageReceiver f51702k;
    public final h9 f51703l;
    public final h9 f51704m;
    public e11 f51705n;
    public e11 f51706o;
    public boolean f51707p;
    public final zc f51708q;
    public int f51709r;
    public Drawable f51710s;
    public Drawable f51711t;
    public e11 f51712u;
    public int v;
    public final o8 f51713w;

    public n8(o8 o8Var, boolean z10, long j3) {
        String str;
        p8 p8Var = o8Var.f51782r;
        this.f51713w = o8Var;
        this.f51695b = new RectF();
        tr trVar = tr.h;
        this.f51696c = new org.telegram.ui.Components.e6(o8Var, 0L, 600L, trVar);
        this.d = new org.telegram.ui.Components.e6(o8Var, 0L, 200L, trVar);
        this.f51697e = new org.telegram.ui.Components.e6(o8Var, 0L, 350L, trVar);
        this.f51698f = null;
        this.f51699g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(o8Var);
        this.f51702k = imageReceiver;
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f51703l = h9Var;
        h9 h9Var2 = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f51704m = h9Var2;
        this.f51708q = new zc(o8Var);
        this.f51700i = z10;
        this.f51701j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(p8Var.f51827c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            h9Var.r(user);
            imageReceiver.setForUserOrChat(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(p8Var.f51827c).getChat(Long.valueOf(-j3));
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
        h9Var2.h(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20806c8, p8Var.f51826b));
        this.f51705n = new e11(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f51696c.d(this.f51694a, false);
        int i10 = this.f51694a;
        o8 o8Var = this.f51713w;
        if (i10 >= 0 && i10 < o8Var.f51777b.size()) {
            z10 = true;
        }
        float e7 = this.d.e(z10);
        canvas.save();
        float width = (o8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, o8Var.f51780f);
        float dp = ((o8Var.f51780f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f51695b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e7) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f51708q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e7 > 0.0f) {
            float e10 = this.f51697e.e(this.f51707p);
            if (e10 < 1.0f) {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f51702k;
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
                h9 h9Var = this.f51704m;
                h9Var.setBounds(dp3, dp4, dp5, dp6);
                h9Var.f27070y = (int) (e7 * f7 * e10);
                h9Var.draw(canvas);
                h9Var.f27070y = 255;
            }
        } else {
            f7 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f51706o.f25884c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.f51706o.f25884c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, o8Var.d);
        int i13 = (int) (e7 * f7);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f51698f != null) {
            Matrix matrix = this.f51699g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f51698f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        e11 e11Var = this.f51706o;
        e11Var.c(dp - (e11Var.f25884c / f11), AndroidUtilities.dp(23.0f) + dp2, e7, -1, canvas);
        e11 e11Var2 = this.f51705n;
        e11Var2.f25895p = width - AndroidUtilities.dp(4.0f);
        e11Var2.c(dp - (this.f51705n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e7, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, o8Var.f51782r.f51826b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f51711t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f51710s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f51711t.setAlpha(i13);
            this.f51710s.setAlpha(i13);
            this.f51711t.draw(canvas);
            this.f51710s.draw(canvas);
            e11 e11Var3 = this.f51712u;
            e11Var3.c(dp - (e11Var3.f25884c / f11), dp2 - AndroidUtilities.dp(27.0f), e7, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        o8 o8Var = this.f51713w;
        p8 p8Var = o8Var.f51782r;
        if (this.f51700i) {
            if (this.f51707p) {
                j10 = 2666000;
            } else if (this.f51701j == UserConfig.getInstance(p8Var.f51827c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f51701j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f51707p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(p8Var.f51827c).getClientUserId();
                }
                this.f51701j = j3;
                if (this.f51707p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f51702k;
                    h9 h9Var = this.f51703l;
                    if (j3 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(p8Var.f51827c).getUser(Long.valueOf(this.f51701j));
                        str = UserObject.getForcedFirstName(user);
                        h9Var.r(user);
                        imageReceiver.setForUserOrChat(user, h9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(p8Var.f51827c).getChat(Long.valueOf(-this.f51701j));
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
                this.f51705n = new e11(str2, 12.0f, null);
                o8Var.invalidate();
            }
        }
    }
}
