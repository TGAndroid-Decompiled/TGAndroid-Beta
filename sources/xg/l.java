package xg;

import ai.a6;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.google.android.gms.internal.vision.e2;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.y9;
import w7.x5;
public final class l extends vg.c {
    public boolean E;
    public final ImageView F;
    public boolean G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public TL_stories.TL_myBoost J;
    public final px0 K;
    public final boolean[] f51244s;
    public final dq v;
    public final ImageView f51245w;
    public boolean f51246x;
    public final ImageView f51247y;

    public l(Context context, boolean z10, boolean z11, d6 d6Var, boolean z12) {
        super(context, d6Var);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        this.f51244s = new boolean[1];
        this.G = true;
        this.K = new px0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f49665f.setVisibility(8);
        if (z11) {
            dq dqVar = new dq(context, 21, d6Var);
            this.v = dqVar;
            dqVar.b(h6.B5, h6.f20857h5, h6.f20915k7);
            dqVar.setDrawUnchecked(false);
            dqVar.setDrawBackgroundAsArc(3);
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i14 = i13 | 48;
            if (z13) {
                f11 = 0.0f;
            } else {
                f11 = 40.0f;
            }
            addView(dqVar, x5.a(24.0f, f11, 33.0f, z13 ? 39.0f : 0.0f, 0.0f, 24, i14));
            d();
        } else if (z10) {
            dq dqVar2 = new dq(context, 21, d6Var);
            this.v = dqVar2;
            if (z12) {
                dqVar2.b(h6.f20878i7, h6.f20896j7, h6.C5);
            } else {
                dqVar2.b(h6.B5, h6.f20896j7, h6.C5);
            }
            dqVar2.setDrawUnchecked(true);
            dqVar2.setDrawBackgroundAsArc(10);
            addView(dqVar2);
            dqVar2.a(false, false);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            dqVar2.setLayoutParams(x5.a(24.0f, 13.0f, 0.0f, 14.0f, 0.0f, 24, i10 | 16));
            d();
        } else {
            this.v = null;
        }
        ImageView imageView = new ImageView(context);
        this.f51245w = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int w02 = h6.w0(h6.Ac, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, x5.a(32.0f, 12.0f, 0.0f, 12.0f, 0.0f, 32, i11 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f51247y = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i15 = h6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(h6.w0(i15, d6Var), mode));
        boolean z14 = LocaleController.isRTL;
        if (z14) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        int i16 = i12 | 16;
        if (z14) {
            f7 = 52.0f;
        } else {
            f7 = 12.0f;
        }
        if (z14) {
            f10 = 12.0f;
        } else {
            f10 = 52.0f;
        }
        addView(imageView2, x5.a(32.0f, f7, 0.0f, f10, 0.0f, 32, i16));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(h6.w0(i15, d6Var), mode));
        addView(imageView3, x5.a(32.0f, 12.0f, 0.0f, 12.0f, 0.0f, 32, (LocaleController.isRTL ? 3 : 5) | 16));
        imageView3.setVisibility(8);
    }

    public static String f(long j3) {
        long j10 = j3 / 3600000;
        long j11 = j3 % 3600000;
        long j12 = j11 / 60000;
        long j13 = (j11 % 60000) / 1000;
        StringBuilder sb2 = new StringBuilder();
        if (j10 > 0) {
            sb2.append(String.format("%02d", Long.valueOf(j10)));
            sb2.append(":");
        }
        sb2.append(String.format("%02d", Long.valueOf(j12)));
        sb2.append(":");
        sb2.append(String.format("%02d", Long.valueOf(j13)));
        return sb2.toString();
    }

    @Override
    public final boolean b() {
        dq dqVar = this.v;
        if (dqVar != null && dqVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        dq dqVar = this.v;
        if (dqVar != null && dqVar.getVisibility() == 0) {
            dqVar.a(z10, z11);
        }
    }

    public final void g(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        Runnable runnable;
        if (this.G == z10) {
            return;
        }
        this.G = z10;
        float f11 = 0.0f;
        int i11 = 0;
        ImageView imageView = this.F;
        ImageView imageView2 = this.f51247y;
        if (z11) {
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate = imageView2.animate();
            if (z10 && this.f51246x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            Runnable runnable2 = null;
            if (z10 && this.f51246x) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final l f51242b;

                    {
                        this.f51242b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f51242b.f51247y.setVisibility(8);
                                return;
                            default:
                                this.f51242b.F.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha.withEndAction(runnable).start();
            imageView.setVisibility(0);
            ViewPropertyAnimator animate2 = imageView.animate();
            if (z10 && this.E) {
                f11 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z10 || !this.E) {
                runnable2 = new Runnable(this) {
                    public final l f51242b;

                    {
                        this.f51242b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f51242b.f51247y.setVisibility(8);
                                return;
                            default:
                                this.f51242b.F.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z10 && this.f51246x) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        imageView2.setAlpha(f7);
        if (z10 && this.f51246x) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        imageView.animate().cancel();
        if (z10 && this.E) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
        if (!z10 || !this.E) {
            i11 = 8;
        }
        imageView.setVisibility(i11);
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.J;
    }

    public TLRPC.Chat getChat() {
        return this.I;
    }

    public TLRPC.User getUser() {
        return this.H;
    }

    public final void h(int i10, TLRPC.Chat chat) {
        float f7;
        int i11;
        String string;
        float f10;
        String str;
        this.f51245w.setVisibility(8);
        this.I = chat;
        this.H = null;
        j9 j9Var = this.f49662b;
        j9Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f7 = 12.0f;
        } else {
            f7 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        y9 y9Var = this.f49663c;
        y9Var.setRoundRadius(dp);
        y9Var.e(chat, j9Var);
        String str2 = chat.title;
        a6 a6Var = this.d;
        a6Var.k(str2);
        a6Var.i(null);
        if (i10 <= 0) {
            i10 = chat.participants_count;
        }
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (i10 >= 1) {
            if (isChannelAndNotMegaGroup) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            string = LocaleController.formatPluralString(str, i10, new Object[0]);
        } else {
            if (isChannelAndNotMegaGroup) {
                i11 = R.string.DiscussChannel;
            } else {
                i11 = R.string.AccDescrGroup;
            }
            string = LocaleController.getString(i11);
        }
        setSubtitle(string);
        this.f49664e.setTextColor(h6.w0(h6.f21044r5, this.f49661a));
        if (i10 > 200) {
            f10 = 0.3f;
        } else {
            f10 = 1.0f;
        }
        i(f10, false);
    }

    public final void i(float f7, boolean z10) {
        dq dqVar = this.v;
        if (dqVar != null) {
            if (z10) {
                if (Math.abs(dqVar.getAlpha() - f7) > 0.1d) {
                    dqVar.animate().cancel();
                    dqVar.animate().alpha(f7).start();
                    return;
                }
                return;
            }
            dqVar.animate().cancel();
            dqVar.setAlpha(f7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.f29868a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K.f29868a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.f51245w.setVisibility(8);
        this.J = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.I = chat;
        j9 j9Var = this.f49662b;
        j9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        y9 y9Var = this.f49663c;
        y9Var.setRoundRadius(dp);
        y9Var.e(this.I, j9Var);
        String str = this.I.title;
        a6 a6Var = this.d;
        a6Var.k(str);
        int w02 = h6.w0(h6.f21044r5, this.f49661a);
        h5 h5Var = this.f49664e;
        h5Var.setTextColor(w02);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 > 0) {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i10 * 1000) - System.currentTimeMillis())));
            a6Var.setAlpha(0.65f);
            h5Var.setAlpha(0.65f);
            i(0.3f, false);
            return;
        }
        a6Var.setAlpha(1.0f);
        h5Var.setAlpha(1.0f);
        i(1.0f, false);
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.f51245w;
        if (onClickListener != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
            return;
        }
        imageView.setVisibility(8);
    }

    public void setUser(TLRPC.User user) {
        int i10;
        q5 a2;
        this.f51245w.setVisibility(8);
        this.H = user;
        this.I = null;
        j9 j9Var = this.f49662b;
        j9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        y9 y9Var = this.f49663c;
        y9Var.setRoundRadius(dp);
        y9Var.e(user, j9Var);
        String userName = UserObject.getUserName(user);
        a6 a6Var = this.d;
        a6Var.k(userName);
        boolean[] zArr = this.f51244s;
        zArr[0] = false;
        if (UserObject.isBot(user)) {
            int i11 = user.bot_active_users;
            if (i11 > 0) {
                setSubtitle(LocaleController.formatPluralStringComma("BotUsers", i11, ','));
            } else {
                setSubtitle(LocaleController.getString(R.string.Bot));
            }
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
        }
        if (zArr[0]) {
            i10 = h6.f20970n5;
        } else {
            i10 = h6.f21044r5;
        }
        this.f49664e.setTextColor(h6.w0(i10, this.f49661a));
        dq dqVar = this.v;
        if (dqVar != null) {
            dqVar.setAlpha(1.0f);
        }
        int x02 = h6.x0(null, h6.f21192z9, false);
        boolean t10 = e2.t(user);
        px0 px0Var = this.K;
        if (t10) {
            a2 = px0Var.a(user, null, x02, false);
        } else {
            a2 = px0Var.a(null, null, x02, false);
        }
        a6Var.i(a2);
    }
}
