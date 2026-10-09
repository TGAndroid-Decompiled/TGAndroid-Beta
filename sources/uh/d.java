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
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.j9;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final h f48958a;
    public final u1 f48959b;
    public final ImageReceiver f48960c;
    public final long d;
    public b f48961e;
    public b f48962f;
    public Paint f48963g;
    public final StaticLayout h;
    public float f48964i;
    public float f48965j;
    public ValueAnimator f48966k;
    public float f48967l;
    public boolean f48968m;
    public ValueAnimator f48969n;
    public float f48970o;
    public boolean f48971p;

    public d(h hVar, long j3) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f7;
        CharSequence ellipsize;
        j9 j9Var = new j9((e6) null);
        int i10 = UserConfig.selectedAccount;
        this.f48967l = 1.0f;
        this.f48968m = true;
        this.f48970o = 0.0f;
        this.f48971p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(hVar.f49000a);
        this.f48960c = imageReceiver2;
        this.f48958a = hVar;
        u1 u1Var = hVar.f49011y;
        this.f48959b = u1Var;
        this.d = j3;
        j9Var.f27652p = 1.0f;
        if (DialogObject.isUserDialog(j3)) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            j9Var.m(i10, user);
            if (UserObject.isUserSelf(user)) {
                str2 = LocaleController.getString(R.string.SavedMessages);
                j9Var.g(1);
                j9Var.f27652p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.setImage(null, null, null, null, j9Var, 0L, null, user, 0);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(g.f48993a / 2.0f));
                imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
                Paint M2 = u1Var.M2("paintChatActionText");
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
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            str = chat != null ? chat.title : "";
            j9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, j9Var);
        }
        str2 = str;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(g.f48993a / 2.0f));
        imageReceiver.setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
        Paint M22 = u1Var.M2("paintChatActionText");
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
            return a1.g.e(f18, 2.0f, (max - max2) / f19, f17);
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
        int i10 = g.f48993a;
        float f13 = 21;
        canvas.scale(f11 / AndroidUtilities.dp(f13), f11 / AndroidUtilities.dp(f13));
        ImageReceiver imageReceiver = this.f48960c;
        imageReceiver.setAlpha(((this.f48967l * 0.25f) + 0.75f) * f12);
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f48969n) {
            this.f48970o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f48966k) {
            this.f48967l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f48958a.invalidateSelf();
    }
}
