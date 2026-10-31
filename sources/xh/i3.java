package xh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import bi.d5;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.i5;
import org.telegram.messenger.k6;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.uh;
import org.telegram.ui.c01;
import org.telegram.ui.un;
public final class i3 extends uh implements us {
    public int D;
    public long E;
    public int F;
    public String G;
    public boolean H;
    public e3 I;
    public d2 J;
    public org.telegram.ui.ActionBar.t0 K;
    public org.telegram.ui.ActionBar.b1 L;
    public org.telegram.ui.ActionBar.b1 M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public b3 U;
    public boolean V;
    public int W;
    public e2 f53809n;
    public ValueAnimator f53810r;
    public boolean f53811s;
    public long f53812w;
    public long f53813x;
    public long f53814y;

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: xh.i3.B(int, int):void");
    }

    @Override
    public final void G(uh uhVar) {
        e2 e2Var = this.f53809n;
        CharSequence p5 = h20.p(vp.r1(this.F).Z1(Long.valueOf(this.f53812w)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.i0.L(20.0f));
            p5 = k6.m(p5, textPaint.getFontMetricsInt(), false, null, 0);
        } catch (Exception unused) {
        }
        bi biVar = this.f30947b;
        biVar.R2.setTitle(p5);
        this.J.setSwipeOffsetY(0.0f);
        if (e2Var.getWebView() != null) {
            e2Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var != null) {
            e2Var.setParentActivity(k2Var.getParentActivity());
        }
        this.K.setVisibility(0);
        if (!e2Var.R) {
            org.telegram.messenger.i0.Q3(biVar.R2.getBackButton(), 2131231270);
        }
    }

    @Override
    public final void H() {
        if (this.f53809n.N) {
            O();
        }
        this.J.setSwipeOffsetAnimationDisallowed(false);
        org.telegram.messenger.i0.g3(new b3(this, 0));
    }

    @Override
    public final void I() {
        d2 d2Var = this.J;
        d2Var.e(d2Var.getTopActionBarOffsetY() + (-d2Var.getOffsetY()));
    }

    public final boolean N() {
        String str;
        if (this.S) {
            TLRPC.User Z1 = vp.r1(this.F).Z1(Long.valueOf(this.f53812w));
            if (Z1 != null) {
                str = i5.m(0, Z1.first_name, Z1.last_name);
            } else {
                str = null;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = str;
            x1Var.T = cd.L0(2131752917, null);
            alertDialog$Builder.k(cd.L0(2131752916, null), new d3(this));
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
            x1Var.show();
            a7.V((TextView) x1Var.d(-1), t6.f21170q7, this.f30946a);
            return false;
        }
        this.f30947b.dismiss();
        return true;
    }

    public final void O() {
        bi biVar = this.f30947b;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if ((k2Var instanceof un) && ((un) k2Var).l1.Q() > org.telegram.messenger.i0.L(20.0f)) {
            org.telegram.messenger.i0.v1(biVar.W1.getFragmentView());
            org.telegram.messenger.i0.h3(new b3(this, 1), 250L);
            return;
        }
        biVar.getWindow().setSoftInputMode(20);
        setFocusable(true);
        biVar.A0(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e2 e2Var = this.f53809n;
        if (i10 == zs.f19732z1) {
            if (this.f53814y == ((Long) objArr[0]).longValue()) {
                e2Var.h();
                this.H = true;
                this.f30947b.dismiss();
            }
        } else if (i10 == zs.f19657n4) {
            e2Var.f43273n.b(t6.w0(t6.f21001h5, this.f30946a), 153);
        }
    }

    @Override
    public final boolean f() {
        return this.V;
    }

    @Override
    public final boolean g() {
        return this.Q;
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.i0.L(12.0f) + ((int) this.J.getTopActionBarOffsetY());
    }

    @Override
    public int getCurrentItemTop() {
        d2 d2Var = this.J;
        return (int) (d2Var.getOffsetY() + d2Var.getSwipeOffsetY());
    }

    @Override
    public int getCustomActionBarBackground() {
        return this.W;
    }

    @Override
    public int getCustomBackground() {
        return this.R;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (int) this.J.getOffsetY();
    }

    public String getStartCommand() {
        return this.G;
    }

    public org.telegram.ui.web.z0 getWebViewContainer() {
        return this.f53809n;
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final boolean j() {
        if (this.f53809n.C()) {
            return true;
        }
        N();
        return true;
    }

    @Override
    public final void o() {
        zs.f(this.F).n(this, zs.f19732z1);
        zs.e().n(this, zs.f19657n4);
        org.telegram.ui.ActionBar.y p5 = this.f30947b.R2.p();
        org.telegram.ui.ActionBar.t0 t0Var = this.K;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = t0Var.f20826b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        p5.removeView(t0Var);
        this.f53809n.h();
        this.T = true;
        org.telegram.messenger.i0.r(this.U);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.O) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override
    public final boolean r() {
        N();
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f53811s) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s() {
        bi biVar = this.f30947b;
        biVar.A0(false);
        biVar.getWindow().setSoftInputMode(48);
    }

    public void setAllowSwipes(boolean z10) {
        this.J.setAllowSwipes(z10);
    }

    public void setCustomActionBarBackground(int i10) {
        this.V = true;
        this.W = i10;
    }

    public void setCustomBackground(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setDelegate(org.telegram.ui.web.d0 d0Var) {
        this.f53809n.setDelegate(d0Var);
    }

    public void setMeasureOffsetY(int i10) {
        this.N = i10;
        this.J.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z10) {
        this.S = z10;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30947b.f21586b.invalidate();
    }

    @Override
    public final void t() {
        this.K.setVisibility(8);
        this.P = false;
        e2 e2Var = this.f53809n;
        boolean z10 = e2Var.R;
        bi biVar = this.f30947b;
        if (!z10) {
            org.telegram.messenger.i0.Q3(biVar.R2.getBackButton(), 2131231241);
        }
        biVar.R2.setBackground(null);
        if (e2Var.T) {
            e2Var.h();
            this.H = true;
        }
    }

    @Override
    public final void w(int i10) {
        e3 e3Var = this.I;
        e2 e2Var = this.f53809n;
        if (i10 == -1) {
            if (!e2Var.C()) {
                N();
                return;
            }
            return;
        }
        bi biVar = this.f30947b;
        if (i10 == 2131296500) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.f53812w);
            biVar.W1.presentFragment(new un(bundle));
            biVar.dismiss();
            return;
        }
        int i11 = 0;
        if (i10 == 2131296504) {
            if (e2Var.getWebView() != null) {
                e2Var.getWebView().animate().cancel();
                e2Var.getWebView().animate().alpha(0.0f).start();
            }
            e3Var.setLoadProgress(0.0f);
            e3Var.setAlpha(1.0f);
            e3Var.setVisibility(0);
            e2Var.setBotUser(vp.r1(this.F).Z1(Long.valueOf(this.f53812w)));
            e2Var.s(this.F, this.f53812w);
            zs.f(e2Var.M).d(new org.telegram.ui.web.q(e2Var, 1));
        } else if (i10 == 2131296495) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(this.F).f18307b.bots;
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i11);
                i11++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.f53812w) {
                    biVar.j1(tL_attachMenuBot2, vp.r1(this.F).Z1(Long.valueOf(this.f53812w)));
                    return;
                }
            }
        } else if (i10 == 2131296506) {
            e2Var.getClass();
            e2Var.P = System.currentTimeMillis();
            e2Var.x("settings_button_pressed", null);
        } else if (i10 == 2131296490) {
            ui.b0(this.F).y0(this.f53812w, ui.f18301c2, null);
        } else if (i10 == 2131296510) {
            gf.f.r(getContext(), cd.L0(2131752893, null));
        } else if (i10 == 2131296505) {
            int i12 = this.F;
            Context context = getContext();
            cc ccVar = new cc(ra.a(getContext()), this.f30946a);
            long j10 = this.f53812w;
            int i13 = c01.f36350s1;
            c01.J0(i12, context, j10, false, false, new ArrayList(), ccVar, null, new byte[0], null, null);
        }
    }

    @Override
    public final void y() {
        this.O = false;
        this.J.setSwipeOffsetAnimationDisallowed(false);
        this.f53809n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override
    public final void z(int i10, boolean z10) {
        boolean z11;
        e2 e2Var = this.f53809n;
        d2 d2Var = this.J;
        if (z10) {
            e2Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = d2Var.getTopActionBarOffsetY() + (-d2Var.getOffsetY());
            if (d2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                d2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int Q = this.f30947b.f24695l3.Q() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.O = true;
            d2Var.setSwipeOffsetAnimationDisallowed(true);
            if (!z11) {
                ValueAnimator valueAnimator = this.f53810r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f53810r = null;
                }
                if (e2Var.getWebView() != null) {
                    int scrollY = e2Var.getWebView().getScrollY();
                    int i11 = (Q - i10) + scrollY;
                    ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                    this.f53810r = duration;
                    duration.setInterpolator(ci.o.V);
                    this.f53810r.addUpdateListener(new c3(this, 0));
                    this.f53810r.addListener(new d5(this, i11, 15));
                    this.f53810r.start();
                }
            }
        }
    }
}
