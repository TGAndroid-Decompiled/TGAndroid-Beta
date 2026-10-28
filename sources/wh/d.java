package wh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.j9;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final h f51271a;
    public final s1 f51272b;
    public final ImageReceiver f51273c;
    public final long d;
    public b e;
    public b f51274f;
    public Paint f51275g;
    public final StaticLayout h;
    public float f51276i;
    public float f51277j;
    public ValueAnimator f51278k;
    public float f51279l;
    public boolean f51280m;
    public ValueAnimator f51281n;
    public float f51282o;
    public boolean f51283p;

    public d(h hVar, long j10) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f7;
        CharSequence ellipsize;
        j9 j9Var = new j9((u6) null);
        int i10 = UserConfig.selectedAccount;
        this.f51279l = 1.0f;
        this.f51280m = true;
        this.f51282o = 0.0f;
        this.f51283p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(hVar.f51311a);
        this.f51273c = imageReceiver2;
        this.f51271a = hVar;
        s1 s1Var = hVar.f51321y;
        this.f51272b = s1Var;
        this.d = j10;
        j9Var.f29558p = 1.0f;
        if (DialogObject.isUserDialog(j10)) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            j9Var.m(i10, user);
            if (UserObject.isUserSelf(user)) {
                str2 = LocaleController.getString(R.string.SavedMessages);
                j9Var.g(1);
                j9Var.f29558p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.setImage(null, null, null, null, j9Var, 0L, null, user, 0);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(g.f51304a / 2.0f));
                imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
                Paint M2 = s1Var.M2("paintChatActionText");
                if (str2 == null && M2 != null) {
                    int dp = AndroidUtilities.dp(48);
                    TextPaint textPaint = new TextPaint(M2);
                    this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, AndroidUtilities.displaySize.x - dp, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return;
                }
            }
            imageReceiver = imageReceiver2;
            str = user != null ? ContactsController.formatName(user.first_name, user.last_name) : "";
            imageReceiver.setForUserOrChat(user, j9Var);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            str = chat != null ? chat.title : "";
            j9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, j9Var);
        }
        str2 = str;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(g.f51304a / 2.0f));
        imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
        Paint M22 = s1Var.M2("paintChatActionText");
        if (str2 == null) {
        }
    }

    public static float b(float f7, float f10, float f11, float f12) {
        float f13 = f10 / 2.0f;
        float f14 = f7 - f13;
        float f15 = f7 + f13;
        float f16 = f12 - f11;
        if (f10 > f16) {
            float f17 = (f11 + f12) / 2.0f;
            float f18 = f10 - f16;
            float max = Math.max(0.0f, f11 - f14);
            float max2 = Math.max(0.0f, f15 - f12);
            float f19 = max + max2;
            if (f19 < 0.1f) {
                return f17;
            }
            return a1.g.c(f18, 2.0f, (max - max2) / f19, f17);
        } else if (f14 < f11) {
            return f11 + f13;
        } else {
            if (f15 > f12) {
                return f12 - f13;
            }
            return f7;
        }
    }

    public final void a(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.translate(f7 - f11, f10 - f11);
        int i10 = g.f51304a;
        float f13 = 21;
        canvas.scale(f11 / AndroidUtilities.dp(f13), f11 / AndroidUtilities.dp(f13));
        ImageReceiver imageReceiver = this.f51273c;
        imageReceiver.setAlpha(((this.f51279l * 0.25f) + 0.75f) * f12);
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f51281n) {
            this.f51282o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f51278k) {
            this.f51279l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f51271a.invalidateSelf();
    }
}
