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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.u9;
import w7.x5;
public final class l extends vg.c {
    public final ImageView E;
    public boolean F;
    public TLRPC.User G;
    public TLRPC.Chat H;
    public TL_stories.TL_myBoost I;
    public final kw0 J;
    public final boolean[] f45781r;
    public final np f45782s;
    public final ImageView v;
    public boolean f45783w;
    public final ImageView f45784x;
    public boolean f45785y;

    public l(Context context, boolean z10, boolean z11, e6 e6Var, boolean z12) {
        super(context, e6Var);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        float f12;
        this.f45781r = new boolean[1];
        this.F = true;
        this.J = new kw0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f44306f.setVisibility(8);
        if (z11) {
            np npVar = new np(context, 21, e6Var);
            this.f45782s = npVar;
            npVar.b(i6.B5, i6.f18904h5, i6.f18962k7);
            npVar.setDrawUnchecked(false);
            npVar.setDrawBackgroundAsArc(3);
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
            if (z13) {
                f12 = 39.0f;
            } else {
                f12 = 0.0f;
            }
            addView(npVar, x5.d(24, 24.0f, i14, f11, 33.0f, f12, 0.0f));
            d();
        } else if (z10) {
            np npVar2 = new np(context, 21, e6Var);
            this.f45782s = npVar2;
            if (z12) {
                npVar2.b(i6.f18924i7, i6.f18942j7, i6.C5);
            } else {
                npVar2.b(i6.B5, i6.f18942j7, i6.C5);
            }
            npVar2.setDrawUnchecked(true);
            npVar2.setDrawBackgroundAsArc(10);
            addView(npVar2);
            npVar2.a(false, false);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            npVar2.setLayoutParams(x5.d(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.f45782s = null;
        }
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int v02 = i6.v0(i6.Ac, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, x5.d(32, 32.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f45784x = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i15 = i6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(i6.v0(i15, e6Var), mode));
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
        addView(imageView2, x5.d(32, 32.0f, i16, f7, 0.0f, f10, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.E = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(i6.v0(i15, e6Var), mode));
        addView(imageView3, x5.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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
        np npVar = this.f45782s;
        if (npVar != null && npVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        np npVar = this.f45782s;
        if (npVar != null && npVar.getVisibility() == 0) {
            npVar.a(z10, z11);
        }
    }

    public final void g(boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        Runnable runnable;
        if (this.F == z10) {
            return;
        }
        this.F = z10;
        float f11 = 0.0f;
        int i11 = 0;
        ImageView imageView = this.E;
        ImageView imageView2 = this.f45784x;
        if (z11) {
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate = imageView2.animate();
            if (z10 && this.f45783w) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            Runnable runnable2 = null;
            if (z10 && this.f45783w) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final l f45779b;

                    {
                        this.f45779b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f45779b.f45784x.setVisibility(8);
                                return;
                            default:
                                this.f45779b.E.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha.withEndAction(runnable).start();
            imageView.setVisibility(0);
            ViewPropertyAnimator animate2 = imageView.animate();
            if (z10 && this.f45785y) {
                f11 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z10 || !this.f45785y) {
                runnable2 = new Runnable(this) {
                    public final l f45779b;

                    {
                        this.f45779b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f45779b.f45784x.setVisibility(8);
                                return;
                            default:
                                this.f45779b.E.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z10 && this.f45783w) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        imageView2.setAlpha(f7);
        if (z10 && this.f45783w) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        imageView.animate().cancel();
        if (z10 && this.f45785y) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
        imageView.setVisibility((z10 && this.f45785y) ? 8 : 8);
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.I;
    }

    public TLRPC.Chat getChat() {
        return this.H;
    }

    public TLRPC.User getUser() {
        return this.G;
    }

    public final void h(int i10, TLRPC.Chat chat) {
        float f7;
        int i11;
        String string;
        float f10;
        String str;
        this.v.setVisibility(8);
        this.H = chat;
        this.G = null;
        f9 f9Var = this.f44304b;
        f9Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f7 = 12.0f;
        } else {
            f7 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        u9 u9Var = this.f44305c;
        u9Var.setRoundRadius(dp);
        u9Var.e(chat, f9Var);
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
        this.e.setTextColor(i6.v0(i6.f19088r5, this.f44303a));
        if (i10 > 200) {
            f10 = 0.3f;
        } else {
            f10 = 1.0f;
        }
        i(f10, false);
    }

    public final void i(float f7, boolean z10) {
        np npVar = this.f45782s;
        if (npVar != null) {
            if (z10) {
                if (Math.abs(npVar.getAlpha() - f7) > 0.1d) {
                    npVar.animate().cancel();
                    npVar.animate().alpha(f7).start();
                    return;
                }
                return;
            }
            npVar.animate().cancel();
            npVar.setAlpha(f7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J.f25686a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J.f25686a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.v.setVisibility(8);
        this.I = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.H = chat;
        f9 f9Var = this.f44304b;
        f9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        u9 u9Var = this.f44305c;
        u9Var.setRoundRadius(dp);
        u9Var.e(this.H, f9Var);
        String str = this.H.title;
        a6 a6Var = this.d;
        a6Var.k(str);
        int v02 = i6.v0(i6.f19088r5, this.f44303a);
        j5 j5Var = this.e;
        j5Var.setTextColor(v02);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 > 0) {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i10 * 1000) - System.currentTimeMillis())));
            a6Var.setAlpha(0.65f);
            j5Var.setAlpha(0.65f);
            i(0.3f, false);
            return;
        }
        a6Var.setAlpha(1.0f);
        j5Var.setAlpha(1.0f);
        i(1.0f, false);
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.v;
        if (onClickListener != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
            return;
        }
        imageView.setVisibility(8);
    }

    public void setUser(TLRPC.User user) {
        int i10;
        m5 a2;
        this.v.setVisibility(8);
        this.G = user;
        this.H = null;
        f9 f9Var = this.f44304b;
        f9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        u9 u9Var = this.f44305c;
        u9Var.setRoundRadius(dp);
        u9Var.e(user, f9Var);
        String userName = UserObject.getUserName(user);
        a6 a6Var = this.d;
        a6Var.k(userName);
        boolean[] zArr = this.f45781r;
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
            i10 = i6.f19017n5;
        } else {
            i10 = i6.f19088r5;
        }
        this.e.setTextColor(i6.v0(i10, this.f44303a));
        np npVar = this.f45782s;
        if (npVar != null) {
            npVar.setAlpha(1.0f);
        }
        int w02 = i6.w0(null, i6.f19237z9, false);
        boolean u10 = e2.u(user);
        kw0 kw0Var = this.J;
        if (u10) {
            a2 = kw0Var.a(user, null, w02, false);
        } else {
            a2 = kw0Var.a(null, null, w02, false);
        }
        a6Var.i(a2);
    }
}
