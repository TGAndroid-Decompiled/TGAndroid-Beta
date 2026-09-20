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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.vw0;
import w7.y5;
public final class l extends vg.c {
    public final ImageView E;
    public boolean F;
    public TLRPC.User G;
    public TLRPC.Chat H;
    public TL_stories.TL_myBoost I;
    public final vw0 J;
    public final boolean[] f46083r;
    public final np f46084s;
    public final ImageView v;
    public boolean f46085w;
    public final ImageView f46086x;
    public boolean f46087y;

    public l(Context context, boolean z10, boolean z11, f6 f6Var, boolean z12) {
        super(context, f6Var);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        float f12;
        this.f46083r = new boolean[1];
        this.F = true;
        this.J = new vw0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f44607f.setVisibility(8);
        if (z11) {
            np npVar = new np(context, 21, f6Var);
            this.f46084s = npVar;
            npVar.b(j6.B5, j6.f19165h5, j6.f19223k7);
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
            addView(npVar, y5.d(24, 24.0f, i14, f11, 33.0f, f12, 0.0f));
            d();
        } else if (z10) {
            np npVar2 = new np(context, 21, f6Var);
            this.f46084s = npVar2;
            if (z12) {
                npVar2.b(j6.f19185i7, j6.f19203j7, j6.C5);
            } else {
                npVar2.b(j6.B5, j6.f19203j7, j6.C5);
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
            npVar2.setLayoutParams(y5.d(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.f46084s = null;
        }
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int v02 = j6.v0(j6.Ac, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, y5.d(32, 32.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f46086x = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i15 = j6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(i15, f6Var), mode));
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
        addView(imageView2, y5.d(32, 32.0f, i16, f7, 0.0f, f10, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.E = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(j6.v0(i15, f6Var), mode));
        addView(imageView3, y5.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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
        np npVar = this.f46084s;
        if (npVar != null && npVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        np npVar = this.f46084s;
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
        ImageView imageView2 = this.f46086x;
        if (z11) {
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate = imageView2.animate();
            if (z10 && this.f46085w) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            Runnable runnable2 = null;
            if (z10 && this.f46085w) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final l f46081b;

                    {
                        this.f46081b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f46081b.f46086x.setVisibility(8);
                                return;
                            default:
                                this.f46081b.E.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha.withEndAction(runnable).start();
            imageView.setVisibility(0);
            ViewPropertyAnimator animate2 = imageView.animate();
            if (z10 && this.f46087y) {
                f11 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z10 || !this.f46087y) {
                runnable2 = new Runnable(this) {
                    public final l f46081b;

                    {
                        this.f46081b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f46081b.f46086x.setVisibility(8);
                                return;
                            default:
                                this.f46081b.E.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z10 && this.f46085w) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        imageView2.setAlpha(f7);
        if (z10 && this.f46085w) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        imageView.animate().cancel();
        if (z10 && this.f46087y) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
        imageView.setVisibility((z10 && this.f46087y) ? 8 : 8);
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
        g9 g9Var = this.f44605b;
        g9Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f7 = 12.0f;
        } else {
            f7 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        v9 v9Var = this.f44606c;
        v9Var.setRoundRadius(dp);
        v9Var.e(chat, g9Var);
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
        this.e.setTextColor(j6.v0(j6.f19350r5, this.f44604a));
        if (i10 > 200) {
            f10 = 0.3f;
        } else {
            f10 = 1.0f;
        }
        i(f10, false);
    }

    public final void i(float f7, boolean z10) {
        np npVar = this.f46084s;
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
        this.J.f29851a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J.f29851a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.v.setVisibility(8);
        this.I = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.H = chat;
        g9 g9Var = this.f44605b;
        g9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        v9 v9Var = this.f44606c;
        v9Var.setRoundRadius(dp);
        v9Var.e(this.H, g9Var);
        String str = this.H.title;
        a6 a6Var = this.d;
        a6Var.k(str);
        int v02 = j6.v0(j6.f19350r5, this.f44604a);
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
        n5 a2;
        this.v.setVisibility(8);
        this.G = user;
        this.H = null;
        g9 g9Var = this.f44605b;
        g9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        v9 v9Var = this.f44606c;
        v9Var.setRoundRadius(dp);
        v9Var.e(user, g9Var);
        String userName = UserObject.getUserName(user);
        a6 a6Var = this.d;
        a6Var.k(userName);
        boolean[] zArr = this.f46083r;
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
            i10 = j6.f19278n5;
        } else {
            i10 = j6.f19350r5;
        }
        this.e.setTextColor(j6.v0(i10, this.f44604a));
        np npVar = this.f46084s;
        if (npVar != null) {
            npVar.setAlpha(1.0f);
        }
        int w02 = j6.w0(null, j6.f19499z9, false);
        boolean u10 = e2.u(user);
        vw0 vw0Var = this.J;
        if (u10) {
            a2 = vw0Var.a(user, null, w02, false);
        } else {
            a2 = vw0Var.a(null, null, w02, false);
        }
        a6Var.i(a2);
    }
}
