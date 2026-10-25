package zg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import di.l4;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zp;
public final class l extends xg.c implements p6 {
    public boolean E;
    public final ImageView F;
    public boolean G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public TL_stories.TL_myBoost J;
    public final qx0 K;
    public int L;
    public final boolean[] f52886s;
    public final zp v;
    public final ImageView f52887w;
    public boolean f52888x;
    public final ImageView f52889y;

    public l(Context context, boolean z10, boolean z11, u6 u6Var, boolean z12) {
        super(context, u6Var);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        this.f52886s = new boolean[1];
        this.G = true;
        this.K = new qx0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f51761f.setVisibility(8);
        if (z11) {
            zp zpVar = new zp(context, 21, u6Var);
            this.v = zpVar;
            zpVar.b(y6.B5, y6.f23425h5, y6.f23483k7);
            zpVar.setDrawUnchecked(false);
            zpVar.setDrawBackgroundAsArc(3);
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
            addView(zpVar, gb1.h(24, 24.0f, i14, f11, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            zp zpVar2 = new zp(context, 21, u6Var);
            this.v = zpVar2;
            if (z12) {
                zpVar2.b(y6.f23447i7, y6.f23464j7, y6.C5);
            } else {
                zpVar2.b(y6.B5, y6.f23464j7, y6.C5);
            }
            zpVar2.setDrawUnchecked(true);
            zpVar2.setDrawBackgroundAsArc(10);
            addView(zpVar2);
            zpVar2.a(false, false);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            zpVar2.setLayoutParams(gb1.h(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.v = null;
        }
        ImageView imageView = new ImageView(context);
        this.f52887w = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int i15 = y6.Ac;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        f7.t(imageView, i15, u6Var, mode);
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, gb1.h(32, 32.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f52889y = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i16 = y6.Oh;
        f7.t(imageView2, i16, u6Var, mode);
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
        addView(imageView2, gb1.h(32, 32.0f, i17, f7, 0.0f, f10, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        f7.t(imageView3, i16, u6Var, mode);
        addView(imageView3, gb1.h(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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
        hashSet.add(Integer.valueOf(y6.f23768z9));
    }

    @Override
    public final boolean b() {
        zp zpVar = this.v;
        if (zpVar != null && zpVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        zp zpVar = this.v;
        if (zpVar != null && zpVar.getVisibility() == 0) {
            zpVar.a(z10, z11);
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
        ImageView imageView2 = this.f52889y;
        if (z11) {
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate = imageView2.animate();
            if (z10 && this.f52888x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            Runnable runnable2 = null;
            if (z10 && this.f52888x) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final l f52884b;

                    {
                        this.f52884b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f52884b.f52889y.setVisibility(8);
                                return;
                            default:
                                this.f52884b.F.setVisibility(8);
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
                    public final l f52884b;

                    {
                        this.f52884b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f52884b.f52889y.setVisibility(8);
                                return;
                            default:
                                this.f52884b.F.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z10 && this.f52888x) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        imageView2.setAlpha(f7);
        if (z10 && this.f52888x) {
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
        this.f52887w.setVisibility(8);
        this.I = chat;
        this.H = null;
        j9 j9Var = this.f51759b;
        j9Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f7 = 12.0f;
        } else {
            f7 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        y9 y9Var = this.f51760c;
        y9Var.setRoundRadius(dp);
        y9Var.f(chat, j9Var);
        String str2 = chat.title;
        l4 l4Var = this.d;
        l4Var.k(str2);
        l4Var.i(null);
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
        f7.Y(this.e, y6.f23612r5, this.f51758a);
        if (i10 > 200) {
            f10 = 0.3f;
        } else {
            f10 = 1.0f;
        }
        i(f10, false);
    }

    public final void i(float f7, boolean z10) {
        zp zpVar = this.v;
        if (zpVar != null) {
            if (z10) {
                if (Math.abs(zpVar.getAlpha() - f7) > 0.1d) {
                    zpVar.animate().cancel();
                    zpVar.animate().alpha(f7).start();
                    return;
                }
                return;
            }
            zpVar.animate().cancel();
            zpVar.setAlpha(f7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.f32055a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K.f32055a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.f52887w.setVisibility(8);
        this.J = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.I = chat;
        j9 j9Var = this.f51759b;
        j9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        y9 y9Var = this.f51760c;
        y9Var.setRoundRadius(dp);
        y9Var.f(this.I, j9Var);
        String str = this.I.title;
        l4 l4Var = this.d;
        l4Var.k(str);
        int i10 = y6.f23612r5;
        u6 u6Var = this.f51758a;
        b6 b6Var = this.e;
        f7.Y(b6Var, i10, u6Var);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i11 = tL_myBoost.cooldown_until_date;
        if (i11 > 0) {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i11 * 1000) - System.currentTimeMillis())));
            l4Var.setAlpha(0.65f);
            b6Var.setAlpha(0.65f);
            i(0.3f, false);
            return;
        }
        l4Var.setAlpha(1.0f);
        b6Var.setAlpha(1.0f);
        i(1.0f, false);
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.f52887w;
        if (onClickListener != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
            return;
        }
        imageView.setVisibility(8);
    }

    public void setUser(TLRPC.User user) {
        int i10;
        this.f52887w.setVisibility(8);
        this.H = user;
        this.I = null;
        j9 j9Var = this.f51759b;
        j9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        y9 y9Var = this.f51760c;
        y9Var.setRoundRadius(dp);
        y9Var.f(user, j9Var);
        String userName = UserObject.getUserName(user);
        l4 l4Var = this.d;
        l4Var.k(userName);
        boolean[] zArr = this.f52886s;
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
            i10 = y6.f23537n5;
        } else {
            i10 = y6.f23612r5;
        }
        f7.Y(this.e, i10, this.f51758a);
        zp zpVar = this.v;
        if (zpVar != null) {
            zpVar.setAlpha(1.0f);
        }
        int x02 = y6.x0(null, y6.f23768z9, false);
        this.L = x02;
        l4Var.i(this.K.a(user, false, x02));
    }

    @Override
    public final void updateColors() {
        qx0 qx0Var;
        l4 l4Var;
        int x02;
        try {
            if (this.H != null && (qx0Var = this.K) != null && (l4Var = this.d) != null && (x02 = y6.x0(null, y6.f23768z9, false)) != this.L) {
                this.L = x02;
                qx0Var.a(this.H, false, x02);
                l4Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
