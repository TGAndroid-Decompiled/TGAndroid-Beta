package zh;

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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.k9;
public final class f8 {
    public int f50523a;
    public final RectF f50524b;
    public final org.telegram.ui.Components.g6 f50525c;
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Components.g6 e;
    public LinearGradient f50526f;
    public final Matrix f50527g;
    public final Paint h;
    public final boolean f50528i;
    public long f50529j;
    public final ImageReceiver f50530k;
    public final k9 f50531l;
    public final k9 f50532m;
    public i11 f50533n;
    public i11 f50534o;
    public boolean f50535p;
    public final ad f50536q;
    public int f50537r;
    public Drawable f50538s;
    public Drawable f50539t;
    public i11 f50540u;
    public int v;
    public final g8 f50541w;

    public f8(g8 g8Var, boolean z10, long j10) {
        String str;
        h8 h8Var = g8Var.f50592r;
        this.f50541w = g8Var;
        this.f50524b = new RectF();
        es esVar = es.h;
        this.f50525c = new org.telegram.ui.Components.g6(g8Var, 0L, 600L, esVar);
        this.d = new org.telegram.ui.Components.g6(g8Var, 0L, 200L, esVar);
        this.e = new org.telegram.ui.Components.g6(g8Var, 0L, 350L, esVar);
        this.f50526f = null;
        this.f50527g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(g8Var);
        this.f50530k = imageReceiver;
        k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
        this.f50531l = k9Var;
        k9 k9Var2 = new k9((org.telegram.ui.ActionBar.c6) null);
        this.f50532m = k9Var2;
        this.f50536q = new ad(g8Var);
        this.f50528i = z10;
        this.f50529j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(h8Var.f50642c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            k9Var.r(user);
            imageReceiver.setForUserOrChat(user, k9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(h8Var.f50642c).getChat(Long.valueOf(-j10));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            k9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, k9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        k9Var2.g(21);
        k9Var2.h(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19584c8, h8Var.f50641b));
        this.f50533n = new i11(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f50525c.d(this.f50523a, false);
        int i10 = this.f50523a;
        g8 g8Var = this.f50541w;
        if (i10 >= 0 && i10 < g8Var.f50588b.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (g8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, g8Var.f50590f);
        float dp = ((g8Var.f50590f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f50524b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f50536q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.f50535p);
            if (e7 < 1.0f) {
                f11 = 255.0f;
                f7 = 40.0f;
                f10 = 2.0f;
                ImageReceiver imageReceiver = this.f50530k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f7 = 40.0f;
                f10 = 2.0f;
                f11 = 255.0f;
            }
            if (e7 > 0.0f) {
                int i11 = (int) dp;
                int dp3 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp4 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp5 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp6 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                k9 k9Var = this.f50532m;
                k9Var.setBounds(dp3, dp4, dp5, dp6);
                k9Var.f26300y = (int) (e * f11 * e7);
                k9Var.draw(canvas);
                k9Var.f26300y = 255;
            }
        } else {
            f7 = 40.0f;
            f10 = 2.0f;
            f11 = 255.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f50534o.f25455c / f10)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f10), (this.f50534o.f25455c / f10) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f10) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, g8Var.d);
        int i13 = (int) (e * f11);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f50526f != null) {
            Matrix matrix = this.f50527g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f50526f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        i11 i11Var = this.f50534o;
        i11Var.c(dp - (i11Var.f25455c / f10), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        i11 i11Var2 = this.f50533n;
        i11Var2.f25465p = width - AndroidUtilities.dp(4.0f);
        i11Var2.c(dp - (this.f50533n.l() / f10), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, g8Var.f50592r.f50641b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f50539t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f50538s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f50539t.setAlpha(i13);
            this.f50538s.setAlpha(i13);
            this.f50539t.draw(canvas);
            this.f50538s.draw(canvas);
            i11 i11Var3 = this.f50540u;
            i11Var3.c(dp - (i11Var3.f25455c / f10), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z10;
        String str;
        String str2;
        g8 g8Var = this.f50541w;
        h8 h8Var = g8Var.f50592r;
        if (this.f50528i) {
            if (this.f50535p) {
                j11 = 2666000;
            } else if (this.f50529j == UserConfig.getInstance(h8Var.f50642c).getClientUserId()) {
                j11 = 0;
            } else {
                j11 = this.f50529j;
            }
            if (j11 != j10) {
                int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f50535p = z10;
                if (j10 == 0 || i10 == 0) {
                    j10 = UserConfig.getInstance(h8Var.f50642c).getClientUserId();
                }
                this.f50529j = j10;
                if (this.f50535p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f50530k;
                    k9 k9Var = this.f50531l;
                    if (i11 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(h8Var.f50642c).getUser(Long.valueOf(this.f50529j));
                        str = UserObject.getForcedFirstName(user);
                        k9Var.r(user);
                        imageReceiver.setForUserOrChat(user, k9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(h8Var.f50642c).getChat(Long.valueOf(-this.f50529j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        k9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, k9Var);
                    }
                    str2 = str;
                }
                this.f50533n = new i11(str2, 12.0f, null);
                g8Var.invalidate();
            }
        }
    }
}
