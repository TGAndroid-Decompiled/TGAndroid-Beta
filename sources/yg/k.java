package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import ci.k4;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xp;
import w7.z5;
public final class k extends wg.c implements b6 {
    public boolean E;
    public final ImageView F;
    public boolean G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public TL_stories.TL_myBoost J;
    public final jx0 K;
    public int L;
    public final boolean[] f50609s;
    public final xp v;
    public final ImageView f50610w;
    public boolean f50611x;
    public final ImageView f50612y;

    public k(Context context, boolean z10, boolean z11, g6 g6Var, boolean z12) {
        super(context, g6Var);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        this.f50609s = new boolean[1];
        this.G = true;
        this.K = new jx0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f49402f.setVisibility(8);
        if (z11) {
            xp xpVar = new xp(context, 21, g6Var);
            this.v = xpVar;
            xpVar.b(k6.B5, k6.f21254h5, k6.f21311k7);
            xpVar.setDrawUnchecked(false);
            xpVar.setDrawBackgroundAsArc(3);
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
            addView(xpVar, z5.d(24, 24.0f, i14, f11, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            xp xpVar2 = new xp(context, 21, g6Var);
            this.v = xpVar2;
            if (z12) {
                xpVar2.b(k6.f21273i7, k6.f21291j7, k6.C5);
            } else {
                xpVar2.b(k6.B5, k6.f21291j7, k6.C5);
            }
            xpVar2.setDrawUnchecked(true);
            xpVar2.setDrawBackgroundAsArc(10);
            addView(xpVar2);
            xpVar2.a(false, false);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            xpVar2.setLayoutParams(z5.d(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.v = null;
        }
        ImageView imageView = new ImageView(context);
        this.f50610w = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int i15 = k6.Ac;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView, i15, g6Var, mode);
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, z5.d(32, 32.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f50612y = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i16 = k6.Oh;
        r6.t(imageView2, i16, g6Var, mode);
        boolean z14 = LocaleController.isRTL;
        if (z14) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        int i17 = i12 | 16;
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
        addView(imageView2, z5.d(32, 32.0f, i17, f7, 0.0f, f10, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        r6.t(imageView3, i16, g6Var, mode);
        addView(imageView3, z5.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView3.setVisibility(8);
    }

    public static String f(long j10) {
        long j11 = j10 / 3600000;
        long j12 = j10 % 3600000;
        long j13 = j12 / 60000;
        long j14 = (j12 % 60000) / 1000;
        StringBuilder sb2 = new StringBuilder();
        if (j11 > 0) {
            sb2.append(String.format("%02d", Long.valueOf(j11)));
            sb2.append(":");
        }
        sb2.append(String.format("%02d", Long.valueOf(j13)));
        sb2.append(":");
        sb2.append(String.format("%02d", Long.valueOf(j14)));
        return sb2.toString();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f21591z9));
    }

    @Override
    public final boolean b() {
        xp xpVar = this.v;
        if (xpVar != null && xpVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        xp xpVar = this.v;
        if (xpVar != null && xpVar.getVisibility() == 0) {
            xpVar.a(z10, z11);
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
        ImageView imageView2 = this.f50612y;
        if (z11) {
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate = imageView2.animate();
            if (z10 && this.f50611x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            Runnable runnable2 = null;
            if (z10 && this.f50611x) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final k f50607b;

                    {
                        this.f50607b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f50607b.f50612y.setVisibility(8);
                                return;
                            default:
                                this.f50607b.F.setVisibility(8);
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
                    public final k f50607b;

                    {
                        this.f50607b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f50607b.f50612y.setVisibility(8);
                                return;
                            default:
                                this.f50607b.F.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z10 && this.f50611x) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        imageView2.setAlpha(f7);
        if (z10 && this.f50611x) {
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
        this.f50610w.setVisibility(8);
        this.I = chat;
        this.H = null;
        h9 h9Var = this.f49400b;
        h9Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f7 = 12.0f;
        } else {
            f7 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        w9 w9Var = this.f49401c;
        w9Var.setRoundRadius(dp);
        w9Var.e(chat, h9Var);
        String str2 = chat.title;
        k4 k4Var = this.d;
        k4Var.k(str2);
        k4Var.i(null);
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
        r6.Z(this.e, k6.f21439r5, this.f49399a);
        if (i10 > 200) {
            f10 = 0.3f;
        } else {
            f10 = 1.0f;
        }
        i(f10, false);
    }

    public final void i(float f7, boolean z10) {
        xp xpVar = this.v;
        if (xpVar != null) {
            if (z10) {
                if (Math.abs(xpVar.getAlpha() - f7) > 0.1d) {
                    xpVar.animate().cancel();
                    xpVar.animate().alpha(f7).start();
                    return;
                }
                return;
            }
            xpVar.animate().cancel();
            xpVar.setAlpha(f7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.f27775a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K.f27775a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.f50610w.setVisibility(8);
        this.J = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.I = chat;
        h9 h9Var = this.f49400b;
        h9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        w9 w9Var = this.f49401c;
        w9Var.setRoundRadius(dp);
        w9Var.e(this.I, h9Var);
        String str = this.I.title;
        k4 k4Var = this.d;
        k4Var.k(str);
        int i10 = k6.f21439r5;
        g6 g6Var = this.f49399a;
        n5 n5Var = this.e;
        r6.Z(n5Var, i10, g6Var);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i11 = tL_myBoost.cooldown_until_date;
        if (i11 > 0) {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i11 * 1000) - System.currentTimeMillis())));
            k4Var.setAlpha(0.65f);
            n5Var.setAlpha(0.65f);
            i(0.3f, false);
            return;
        }
        k4Var.setAlpha(1.0f);
        n5Var.setAlpha(1.0f);
        i(1.0f, false);
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.f50610w;
        if (onClickListener != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
            return;
        }
        imageView.setVisibility(8);
    }

    public void setUser(TLRPC.User user) {
        int i10;
        this.f50610w.setVisibility(8);
        this.H = user;
        this.I = null;
        h9 h9Var = this.f49400b;
        h9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        w9 w9Var = this.f49401c;
        w9Var.setRoundRadius(dp);
        w9Var.e(user, h9Var);
        String userName = UserObject.getUserName(user);
        k4 k4Var = this.d;
        k4Var.k(userName);
        boolean[] zArr = this.f50609s;
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
            i10 = k6.f21365n5;
        } else {
            i10 = k6.f21439r5;
        }
        r6.Z(this.e, i10, this.f49399a);
        xp xpVar = this.v;
        if (xpVar != null) {
            xpVar.setAlpha(1.0f);
        }
        int x02 = k6.x0(null, k6.f21591z9, false);
        this.L = x02;
        k4Var.i(this.K.a(user, false, x02));
    }

    @Override
    public final void updateColors() {
        jx0 jx0Var;
        k4 k4Var;
        int x02;
        try {
            if (this.H != null && (jx0Var = this.K) != null && (k4Var = this.d) != null && (x02 = k6.x0(null, k6.f21591z9, false)) != this.L) {
                this.L = x02;
                jx0Var.a(this.H, false, x02);
                k4Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
