package th;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.g9;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final i f42186a;
    public final t1 f42187b;
    public final ImageReceiver f42188c;
    public final long d;
    public b e;
    public b f42189f;
    public Paint f42190g;
    public final StaticLayout h;
    public float f42191i;
    public float f42192j;
    public ValueAnimator f42193k;
    public float f42194l;
    public boolean f42195m;
    public ValueAnimator f42196n;
    public float f42197o;
    public boolean f42198p;

    public d(i iVar, long j3) {
        ImageReceiver imageReceiver;
        String str;
        String str2;
        float f7;
        CharSequence ellipsize;
        g9 g9Var = new g9((f6) null);
        int i10 = UserConfig.selectedAccount;
        this.f42194l = 1.0f;
        this.f42195m = true;
        this.f42197o = 0.0f;
        this.f42198p = false;
        ImageReceiver imageReceiver2 = new ImageReceiver(iVar.f42228a);
        this.f42188c = imageReceiver2;
        this.f42186a = iVar;
        t1 t1Var = iVar.f42238y;
        this.f42187b = t1Var;
        this.d = j3;
        g9Var.f23286p = 1.0f;
        if (DialogObject.isUserDialog(j3)) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            g9Var.m(i10, user);
            if (UserObject.isUserSelf(user)) {
                str2 = LocaleController.getString(R.string.SavedMessages);
                g9Var.g(1);
                g9Var.f23286p = 0.75f;
                imageReceiver = imageReceiver2;
                imageReceiver.setImage(null, null, null, null, g9Var, 0L, null, user, 0);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(h.f42221a / 2.0f));
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
            imageReceiver.setForUserOrChat(user, g9Var);
        } else {
            imageReceiver = imageReceiver2;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            str = chat != null ? chat.title : "";
            g9Var.k(i10, chat);
            imageReceiver.setForUserOrChat(chat, g9Var);
        }
        str2 = str;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(h.f42221a / 2.0f));
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
        int i10 = h.f42221a;
        float f13 = 21;
        canvas.scale(f11 / AndroidUtilities.dp(f13), f11 / AndroidUtilities.dp(f13));
        ImageReceiver imageReceiver = this.f42188c;
        imageReceiver.setAlpha(((this.f42194l * 0.25f) + 0.75f) * f12);
        imageReceiver.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.f42196n) {
            this.f42197o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.f42193k) {
            this.f42194l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        this.f42186a.invalidateSelf();
    }
}
