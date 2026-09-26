package xg;

import ai.z5;
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
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.ww0;
import w7.y5;
public final class l extends vg.c {
    public final ImageView E;
    public boolean F;
    public TLRPC.User G;
    public TLRPC.Chat H;
    public TL_stories.TL_myBoost I;
    public final ww0 J;
    public final boolean[] f46062r;
    public final pp f46063s;
    public final ImageView v;
    public boolean f46064w;
    public final ImageView f46065x;
    public boolean f46066y;

    public l(Context context, boolean z10, boolean z11, d6 d6Var, boolean z12) {
        super(context, d6Var);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        float f12;
        this.f46062r = new boolean[1];
        this.F = true;
        this.J = new ww0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f44590f.setVisibility(8);
        if (z11) {
            pp ppVar = new pp(context, 21, d6Var);
            this.f46063s = ppVar;
            ppVar.b(h6.B5, h6.f19129h5, h6.f19187k7);
            ppVar.setDrawUnchecked(false);
            ppVar.setDrawBackgroundAsArc(3);
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
            addView(ppVar, y5.d(24, 24.0f, i14, f11, 33.0f, f12, 0.0f));
            d();
        } else if (z10) {
            pp ppVar2 = new pp(context, 21, d6Var);
            this.f46063s = ppVar2;
            if (z12) {
                ppVar2.b(h6.f19149i7, h6.f19167j7, h6.C5);
            } else {
                ppVar2.b(h6.B5, h6.f19167j7, h6.C5);
            }
            ppVar2.setDrawUnchecked(true);
            ppVar2.setDrawBackgroundAsArc(10);
            addView(ppVar2);
            ppVar2.a(false, false);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            ppVar2.setLayoutParams(y5.d(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.f46063s = null;
        }
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int v02 = h6.v0(h6.Ac, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, y5.d(32, 32.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f46065x = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i15 = h6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(h6.v0(i15, d6Var), mode));
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
        imageView3.setColorFilter(new PorterDuffColorFilter(h6.v0(i15, d6Var), mode));
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
        pp ppVar = this.f46063s;
        if (ppVar != null && ppVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        pp ppVar = this.f46063s;
        if (ppVar != null && ppVar.getVisibility() == 0) {
            ppVar.a(z10, z11);
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
        ImageView imageView2 = this.f46065x;
        if (z11) {
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate = imageView2.animate();
            if (z10 && this.f46064w) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            Runnable runnable2 = null;
            if (z10 && this.f46064w) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final l f46060b;

                    {
                        this.f46060b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f46060b.f46065x.setVisibility(8);
                                return;
                            default:
                                this.f46060b.E.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha.withEndAction(runnable).start();
            imageView.setVisibility(0);
            ViewPropertyAnimator animate2 = imageView.animate();
            if (z10 && this.f46066y) {
                f11 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z10 || !this.f46066y) {
                runnable2 = new Runnable(this) {
                    public final l f46060b;

                    {
                        this.f46060b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f46060b.f46065x.setVisibility(8);
                                return;
                            default:
                                this.f46060b.E.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z10 && this.f46064w) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        imageView2.setAlpha(f7);
        if (z10 && this.f46064w) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        imageView.animate().cancel();
        if (z10 && this.f46066y) {
            f11 = 1.0f;
        }
        imageView.setAlpha(f11);
        imageView.setVisibility((z10 && this.f46066y) ? 8 : 8);
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
        h9 h9Var = this.f44588b;
        h9Var.q(chat);
        if (ChatObject.isForum(chat)) {
            f7 = 12.0f;
        } else {
            f7 = 20.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        w9 w9Var = this.f44589c;
        w9Var.setRoundRadius(dp);
        w9Var.e(chat, h9Var);
        String str2 = chat.title;
        z5 z5Var = this.d;
        z5Var.k(str2);
        z5Var.i(null);
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
        this.e.setTextColor(h6.v0(h6.f19315r5, this.f44587a));
        if (i10 > 200) {
            f10 = 0.3f;
        } else {
            f10 = 1.0f;
        }
        i(f10, false);
    }

    public final void i(float f7, boolean z10) {
        pp ppVar = this.f46063s;
        if (ppVar != null) {
            if (z10) {
                if (Math.abs(ppVar.getAlpha() - f7) > 0.1d) {
                    ppVar.animate().cancel();
                    ppVar.animate().alpha(f7).start();
                    return;
                }
                return;
            }
            ppVar.animate().cancel();
            ppVar.setAlpha(f7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J.f30218a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J.f30218a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.v.setVisibility(8);
        this.I = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.H = chat;
        h9 h9Var = this.f44588b;
        h9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        w9 w9Var = this.f44589c;
        w9Var.setRoundRadius(dp);
        w9Var.e(this.H, h9Var);
        String str = this.H.title;
        z5 z5Var = this.d;
        z5Var.k(str);
        int v02 = h6.v0(h6.f19315r5, this.f44587a);
        h5 h5Var = this.e;
        h5Var.setTextColor(v02);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 > 0) {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i10 * 1000) - System.currentTimeMillis())));
            z5Var.setAlpha(0.65f);
            h5Var.setAlpha(0.65f);
            i(0.3f, false);
            return;
        }
        z5Var.setAlpha(1.0f);
        h5Var.setAlpha(1.0f);
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
        o5 a2;
        this.v.setVisibility(8);
        this.G = user;
        this.H = null;
        h9 h9Var = this.f44588b;
        h9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        w9 w9Var = this.f44589c;
        w9Var.setRoundRadius(dp);
        w9Var.e(user, h9Var);
        String userName = UserObject.getUserName(user);
        z5 z5Var = this.d;
        z5Var.k(userName);
        boolean[] zArr = this.f46062r;
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
            i10 = h6.f19242n5;
        } else {
            i10 = h6.f19315r5;
        }
        this.e.setTextColor(h6.v0(i10, this.f44587a));
        pp ppVar = this.f46063s;
        if (ppVar != null) {
            ppVar.setAlpha(1.0f);
        }
        int w02 = h6.w0(null, h6.f19464z9, false);
        boolean u10 = e2.u(user);
        ww0 ww0Var = this.J;
        if (u10) {
            a2 = ww0Var.a(user, null, w02, false);
        } else {
            a2 = ww0Var.a(null, null, w02, false);
        }
        z5Var.i(a2);
    }
}
