package uh;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.f9;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final h f43751a;
    public final t1 f43752b;
    public final ImageReceiver f43753c;
    public final long d;
    public b e;
    public b f43754f;
    public Paint f43755g;
    public final StaticLayout h;
    public float f43756i;
    public float f43757j;
    public ValueAnimator f43758k;
    public float f43759l;
    public boolean f43760m;
    public ValueAnimator f43761n;
    public float f43762o;
    public boolean f43763p;

    public d(h hVar, long j3) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f7;
        CharSequence ellipsize;
        f9 f9Var = new f9((e6) null);
        int i10 = UserConfig.selectedAccount;
        this.f43759l = 1.0f;
        this.f43760m = true;
        this.f43762o = 0.0f;
        this.f43763p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(hVar.f43791a);
        this.f43753c = imageReceiver2;
        this.f43751a = hVar;
        t1 t1Var = hVar.f43801y;
        this.f43752b = t1Var;
        this.d = j3;
        f9Var.f23867p = 1.0f;
        if (DialogObject.isUserDialog(j3)) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            f9Var.m(i10, user);
            if (UserObject.isUserSelf(user)) {
                str2 = LocaleController.getString(R.string.SavedMessages);
                f9Var.g(1);
                f9Var.f23867p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.setImage(null, null, null, null, f9Var, 0L, null, user, 0);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(g.f43784a / 2.0f));
                imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
                Paint M2 = t1Var.M2("paintChatActionText");
                if (str2 == null && M2 != null) {
                    int dp = AndroidUtilities.dp(48);
                    TextPaint textPaint = new TextPaint(M2);
                    this.h = new StaticLayout(TextUtils.ellipsize(str2, textPaint, AndroidUtilities.displaySize.x - dp, TextUtils.TruncateAt.END), textPaint, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    return;
                }
            }
            imageReceiver = imageReceiver2;
            str = user != null ? ContactsController.formatName(user.first_name, user.last_name) : "";
            imageReceiver.setForUserOrChat(user, f9Var);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            str = chat != null ? chat.title : "";
            f9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, f9Var);
        }
        str2 = str;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(g.f43784a / 2.0f));
        imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
        Paint M22 = t1Var.M2("paintChatActionText");
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
            return a4.a.e(f18, 2.0f, (max - max2) / f19, f17);
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
        int i10 = g.f43784a;
        float f13 = 21;
        canvas.scale(f11 / AndroidUtilities.dp(f13), f11 / AndroidUtilities.dp(f13));
        ImageReceiver imageReceiver = this.f43753c;
        imageReceiver.setAlpha(((this.f43759l * 0.25f) + 0.75f) * f12);
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f43761n) {
            this.f43762o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f43758k) {
            this.f43759l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f43751a.invalidateSelf();
    }
}
