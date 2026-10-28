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
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.y9;
public final class l extends xg.c implements p6 {
    public boolean E;
    public final ImageView F;
    public boolean G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public TL_stories.TL_myBoost J;
    public final rx0 K;
    public int L;
    public final boolean[] f52947s;
    public final aq v;
    public final ImageView f52948w;
    public boolean f52949x;
    public final ImageView f52950y;

    public l(Context context, boolean z10, boolean z11, u6 u6Var, boolean z12) {
        super(context, u6Var);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        this.f52947s = new boolean[1];
        this.G = true;
        this.K = new rx0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f51822f.setVisibility(8);
        if (z11) {
            aq aqVar = new aq(context, 21, u6Var);
            this.v = aqVar;
            aqVar.b(y6.B5, y6.f23428h5, y6.f23486k7);
            aqVar.setDrawUnchecked(false);
            aqVar.setDrawBackgroundAsArc(3);
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
            addView(aqVar, kb1.h(24, 24.0f, i14, f11, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            aq aqVar2 = new aq(context, 21, u6Var);
            this.v = aqVar2;
            if (z12) {
                aqVar2.b(y6.f23450i7, y6.f23467j7, y6.C5);
            } else {
                aqVar2.b(y6.B5, y6.f23467j7, y6.C5);
            }
            aqVar2.setDrawUnchecked(true);
            aqVar2.setDrawBackgroundAsArc(10);
            addView(aqVar2);
            aqVar2.a(false, false);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            aqVar2.setLayoutParams(kb1.h(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.v = null;
        }
        ImageView imageView = new ImageView(context);
        this.f52948w = imageView;
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
        addView(imageView, kb1.h(32, 32.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f52950y = imageView2;
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
        addView(imageView2, kb1.h(32, 32.0f, i17, f7, 0.0f, f10, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        f7.t(imageView3, i16, u6Var, mode);
        addView(imageView3, kb1.h(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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
        hashSet.add(Integer.valueOf(y6.f23771z9));
    }

    @Override
    public final boolean b() {
        aq aqVar = this.v;
        if (aqVar != null && aqVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        aq aqVar = this.v;
        if (aqVar != null && aqVar.getVisibility() == 0) {
            aqVar.a(z10, z11);
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
        ImageView imageView2 = this.f52950y;
        if (z11) {
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate = imageView2.animate();
            if (z10 && this.f52949x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            Runnable runnable2 = null;
            if (z10 && this.f52949x) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final l f52945b;

                    {
                        this.f52945b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f52945b.f52950y.setVisibility(8);
                                return;
                            default:
                                this.f52945b.F.setVisibility(8);
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
                    public final l f52945b;

                    {
                        this.f52945b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f52945b.f52950y.setVisibility(8);
                                return;
                            default:
                                this.f52945b.F.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z10 && this.f52949x) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        imageView2.setAlpha(f7);
        if (z10 && this.f52949x) {
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
        this.f52948w.setVisibility(8);
        this.I = chat;
        this.H = null;
        j9 j9Var = this.f51820b;
        j9Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f7 = 12.0f;
        } else {
            f7 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        y9 y9Var = this.f51821c;
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
        f7.Y(this.e, y6.f23615r5, this.f51819a);
        if (i10 > 200) {
            f10 = 0.3f;
        } else {
            f10 = 1.0f;
        }
        i(f10, false);
    }

    public final void i(float f7, boolean z10) {
        aq aqVar = this.v;
        if (aqVar != null) {
            if (z10) {
                if (Math.abs(aqVar.getAlpha() - f7) > 0.1d) {
                    aqVar.animate().cancel();
                    aqVar.animate().alpha(f7).start();
                    return;
                }
                return;
            }
            aqVar.animate().cancel();
            aqVar.setAlpha(f7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.f32396a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K.f32396a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.f52948w.setVisibility(8);
        this.J = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.I = chat;
        j9 j9Var = this.f51820b;
        j9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        y9 y9Var = this.f51821c;
        y9Var.setRoundRadius(dp);
        y9Var.f(this.I, j9Var);
        String str = this.I.title;
        l4 l4Var = this.d;
        l4Var.k(str);
        int i10 = y6.f23615r5;
        u6 u6Var = this.f51819a;
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
        ImageView imageView = this.f52948w;
        if (onClickListener != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
            return;
        }
        imageView.setVisibility(8);
    }

    public void setUser(TLRPC.User user) {
        int i10;
        this.f52948w.setVisibility(8);
        this.H = user;
        this.I = null;
        j9 j9Var = this.f51820b;
        j9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        y9 y9Var = this.f51821c;
        y9Var.setRoundRadius(dp);
        y9Var.f(user, j9Var);
        String userName = UserObject.getUserName(user);
        l4 l4Var = this.d;
        l4Var.k(userName);
        boolean[] zArr = this.f52947s;
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
            i10 = y6.f23540n5;
        } else {
            i10 = y6.f23615r5;
        }
        f7.Y(this.e, i10, this.f51819a);
        aq aqVar = this.v;
        if (aqVar != null) {
            aqVar.setAlpha(1.0f);
        }
        int x02 = y6.x0(null, y6.f23771z9, false);
        this.L = x02;
        l4Var.i(this.K.a(user, false, x02));
    }

    @Override
    public final void updateColors() {
        rx0 rx0Var;
        l4 l4Var;
        int x02;
        try {
            if (this.H != null && (rx0Var = this.K) != null && (l4Var = this.d) != null && (x02 = y6.x0(null, y6.f23771z9, false)) != this.L) {
                this.L = x02;
                rx0Var.a(this.H, false, x02);
                l4Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
