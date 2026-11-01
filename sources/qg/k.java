package qg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.i20;
import org.telegram.messenger.o5;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.r8;
import w7.b6;
public final class k extends og.d implements k6 {
    public final ImageView D;
    public boolean E;
    public final ImageView F;
    public boolean G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public TL_stories.TL_myBoost J;
    public final qv0 K;
    public int L;
    public final boolean[] f45566s;
    public final ep f45567w;
    public final ImageView f45568x;
    public boolean f45569y;

    public k(Context context, boolean z10, boolean z11, p6 p6Var, boolean z12) {
        super(context, p6Var);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        this.f45566s = new boolean[1];
        this.G = true;
        this.K = new qv0(this);
        this.d.setTypeface(i0.o());
        this.f14180f.setVisibility(8);
        if (z11) {
            ep epVar = new ep(21, context, p6Var);
            this.f45567w = epVar;
            epVar.b(t6.B5, t6.f21002h5, t6.f21060k7);
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(3);
            boolean z13 = dd.X;
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
            addView(epVar, b6.d(24, 24.0f, i14, f11, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            ep epVar2 = new ep(21, context, p6Var);
            this.f45567w = epVar2;
            if (z12) {
                epVar2.b(t6.f21022i7, t6.f21040j7, t6.C5);
            } else {
                epVar2.b(t6.B5, t6.f21040j7, t6.C5);
            }
            epVar2.setDrawUnchecked(true);
            epVar2.setDrawBackgroundAsArc(10);
            addView(epVar2);
            epVar2.a(false, false);
            if (dd.X) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            epVar2.setLayoutParams(b6.d(24, 24.0f, i10 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.f45567w = null;
        }
        ImageView imageView = new ImageView(context);
        this.f45568x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231245);
        int i15 = t6.f21142od;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a7.t(imageView, i15, p6Var, mode);
        if (dd.X) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(imageView, b6.d(32, 32.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.D = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231845);
        int i16 = t6.Ci;
        a7.t(imageView2, i16, p6Var, mode);
        boolean z14 = dd.X;
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
        addView(imageView2, b6.d(32, 32.0f, i17, f7, 0.0f, f10, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231914);
        a7.t(imageView3, i16, p6Var, mode);
        addView(imageView3, b6.d(32, 32.0f, (dd.X ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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
        hashSet.add(Integer.valueOf(t6.f21334z9));
    }

    @Override
    public final boolean b() {
        ep epVar = this.f45567w;
        if (epVar != null && epVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        ep epVar = this.f45567w;
        if (epVar != null && epVar.getVisibility() == 0) {
            epVar.a(z10, z11);
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
        ImageView imageView2 = this.D;
        if (z11) {
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate = imageView2.animate();
            if (z10 && this.f45569y) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            Runnable runnable2 = null;
            if (z10 && this.f45569y) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final k f45564b;

                    {
                        this.f45564b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f45564b.D.setVisibility(8);
                                return;
                            default:
                                this.f45564b.F.setVisibility(8);
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
                    public final k f45564b;

                    {
                        this.f45564b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f45564b.D.setVisibility(8);
                                return;
                            default:
                                this.f45564b.F.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z10 && this.f45569y) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        imageView2.setAlpha(f7);
        if (z10 && this.f45569y) {
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
        String L0;
        float f10;
        String str;
        this.f45568x.setVisibility(8);
        this.I = chat;
        this.H = null;
        r8 r8Var = this.f14178b;
        r8Var.q(chat);
        if (w3.c0(chat)) {
            f7 = 12.0f;
        } else {
            f7 = 20.0f;
        }
        int L = i0.L(f7);
        g9 g9Var = this.f14179c;
        g9Var.setRoundRadius(L);
        g9Var.e(chat, r8Var);
        String str2 = chat.title;
        og.c cVar = this.d;
        cVar.k(str2);
        cVar.i(null);
        if (i10 <= 0) {
            i10 = chat.participants_count;
        }
        boolean V = w3.V(chat);
        if (i10 >= 1) {
            if (V) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            L0 = dd.G(i10, str, new Object[0]);
        } else {
            if (V) {
                i11 = 2131751391;
            } else {
                i11 = 2131754876;
            }
            L0 = dd.L0(i11, null);
        }
        setSubtitle(L0);
        a7.Y(this.e, t6.f21186r5, this.f14177a);
        if (i10 > 200) {
            f10 = 0.3f;
        } else {
            f10 = 1.0f;
        }
        i(false, f10);
    }

    public final void i(boolean z10, float f7) {
        ep epVar = this.f45567w;
        if (epVar != null) {
            if (z10) {
                if (Math.abs(epVar.getAlpha() - f7) > 0.1d) {
                    epVar.animate().cancel();
                    epVar.animate().alpha(f7).start();
                    return;
                }
                return;
            }
            epVar.animate().cancel();
            epVar.setAlpha(f7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.f29813a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K.f29813a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.f45568x.setVisibility(8);
        this.J = tL_myBoost;
        TLRPC.Chat L0 = wp.r1(e20.f15506s0).L0(Long.valueOf(-o5.o(tL_myBoost.peer)));
        this.I = L0;
        r8 r8Var = this.f14178b;
        r8Var.q(L0);
        int L = i0.L(20.0f);
        g9 g9Var = this.f14179c;
        g9Var.setRoundRadius(L);
        g9Var.e(this.I, r8Var);
        String str = this.I.title;
        og.c cVar = this.d;
        cVar.k(str);
        int i10 = t6.f21186r5;
        p6 p6Var = this.f14177a;
        u5 u5Var = this.e;
        a7.Y(u5Var, i10, p6Var);
        setSubtitle(dd.a0(null, null, 2131753661, dd.D0().n0().format(new Date(tL_myBoost.expires * 1000))));
        int i11 = tL_myBoost.cooldown_until_date;
        if (i11 > 0) {
            setSubtitle(dd.a0(null, null, 2131753594, f((i11 * 1000) - System.currentTimeMillis())));
            cVar.setAlpha(0.65f);
            u5Var.setAlpha(0.65f);
            i(false, 0.3f);
            return;
        }
        cVar.setAlpha(1.0f);
        u5Var.setAlpha(1.0f);
        i(false, 1.0f);
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.f45568x;
        if (onClickListener != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
            return;
        }
        imageView.setVisibility(8);
    }

    public void setUser(TLRPC.User user) {
        int i10;
        this.f45568x.setVisibility(8);
        this.H = user;
        this.I = null;
        r8 r8Var = this.f14178b;
        r8Var.r(user);
        int L = i0.L(20.0f);
        g9 g9Var = this.f14179c;
        g9Var.setRoundRadius(L);
        g9Var.e(user, r8Var);
        String p5 = i20.p(user);
        og.c cVar = this.d;
        cVar.k(p5);
        boolean[] zArr = this.f45566s;
        zArr[0] = false;
        if (i20.t(user)) {
            int i11 = user.bot_active_users;
            if (i11 > 0) {
                setSubtitle(dd.H(',', "BotUsers", i11));
            } else {
                setSubtitle(dd.L0(2131753156, null));
            }
        } else {
            setSubtitle(dd.d0(e20.f15506s0, user, zArr, null));
        }
        if (zArr[0]) {
            i10 = t6.f21115n5;
        } else {
            i10 = t6.f21186r5;
        }
        a7.Y(this.e, i10, this.f14177a);
        ep epVar = this.f45567w;
        if (epVar != null) {
            epVar.setAlpha(1.0f);
        }
        int x02 = t6.x0(null, t6.f21334z9, false);
        this.L = x02;
        cVar.i(this.K.a(user, x02, false));
    }

    @Override
    public final void updateColors() {
        qv0 qv0Var;
        og.c cVar;
        int x02;
        try {
            if (this.H != null && (qv0Var = this.K) != null && (cVar = this.d) != null && (x02 = t6.x0(null, t6.f21334z9, false)) != this.L) {
                this.L = x02;
                qv0Var.a(this.H, x02, false);
                cVar.invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
