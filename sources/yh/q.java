package yh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.kt;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.u51;
import org.telegram.ui.un;
import org.telegram.ui.y01;
import r0.h0;
import w7.b6;
import xh.n1;
public final class q extends k2 implements fe.e {
    public final fe.b f54516a;
    public long f54517b;
    public FrameLayout f54518c;
    public u51 d;
    public bh.i e;
    public LinearLayout f54519f;
    public vh.d h;
    public vh.d f54520n;
    public dw0 f54521r;
    public TLRPC.ChatFull f54522s;
    public e0 f54523w;
    public int f54524x;

    public q(Bundle bundle) {
        super(bundle);
        this.f54516a = new fe.b(0, this, gr.h, 320L, false);
    }

    public static void Y(q qVar, a51 a51Var) {
        Object obj = a51Var.G;
        if (obj instanceof zh.f) {
            zh.f fVar = (zh.f) obj;
            long j10 = fVar.f55774a;
            TLRPC.Chat L0 = vp.r1(qVar.currentAccount).L0(Long.valueOf(-j10));
            TLRPC.User Z1 = vp.r1(qVar.currentAccount).Z1(Long.valueOf(j10));
            if (Z1 != null) {
                qVar.presentFragment(un.ha(Z1.f19942id));
            } else if (!w3.t0(L0) && !w3.j0(L0)) {
                new ai.c(qVar.getParentActivity(), L0, new o(0, qVar, fVar)).show();
            } else {
                qVar.presentFragment(un.ha(-L0.f19793id));
            }
        }
    }

    public final void Z(int i10) {
        this.d.setPadding(0, 0, 0, i0.L(60.0f) + i10);
        this.f54519f.setPadding(i0.L(7.0f), 0, i0.L(7.0f), i0.L(12.0f) + i10);
        this.f54521r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(i0.L(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        e0 e0Var = new e0(getParentActivity(), this.resourceProvider, cc.a0(this), this.currentAccount, this.f54517b);
        this.f54523w = e0Var;
        e0Var.h = new s9.g(this);
        e0Var.d();
        this.f54523w.e();
        this.actionBar.setBackButtonDrawable(new c2(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 22));
        this.actionBar.setTitle(cd.L0(2131751895, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f54518c = frameLayout;
        int i10 = t6.f20872a7;
        a7.i(i10, frameLayout, null);
        u51 u51Var = new u51(this, new n1(this, 3), new m(this), new xg.a(25, this));
        this.d = u51Var;
        u51Var.setClipToPadding(false);
        u51 u51Var2 = this.d;
        u51Var2.f30819f3.f29295r = false;
        u51Var2.r1();
        this.d.j(new p(this, 0));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f54518c.addView(this.d, b6.c(-1.0f, -1));
        bh.i iVar = new bh.i(context);
        this.e = iVar;
        iVar.setupColorKey(i10);
        this.e.setFadeZoneBottom(i0.L(72.0f));
        this.e.setFadeHeightBottom(i0.L(24.0f));
        this.f54518c.addView(this.e, b6.g());
        this.f54518c.addView(this.actionBar, b6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f54519f = linearLayout;
        linearLayout.setOrientation(0);
        this.f54519f.setPadding(i0.L(7.0f), 0, i0.L(7.0f), i0.L(12.0f));
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        this.f54520n = dVar;
        dVar.e();
        vh.d dVar2 = this.f54520n;
        int f7 = i0.b.f(0.125f, getThemedColor(t6.f20929d6), getThemedColor(t6.G6));
        this.f54524x = f7;
        dVar2.setColor(f7);
        this.f54520n.setText(cd.L0(2131751900, null));
        this.f54520n.f();
        this.f54520n.setOnClickListener(new View.OnClickListener(this) {
            public final q f54510b;

            {
                this.f54510b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f54510b.f54523w.f(false, true);
                        return;
                    default:
                        this.f54510b.f54523w.f(true, true);
                        return;
                }
            }
        });
        this.f54519f.addView(this.f54520n, b6.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        vh.d dVar3 = new vh.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(cd.L0(2131751902, null));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final q f54510b;

            {
                this.f54510b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f54510b.f54523w.f(false, true);
                        return;
                    default:
                        this.f54510b.f54523w.f(true, true);
                        return;
                }
            }
        });
        this.f54519f.addView(this.h, b6.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f54518c.addView(this.f54519f, b6.e(-1, -2, 80));
        dw0 dw0Var = new dw0(getParentActivity(), null, 16, this.resourceProvider);
        this.f54521r = dw0Var;
        dw0Var.d.setText(cd.L0(2131748242, null));
        this.f54521r.e.setText(cd.L0(2131748241, null));
        this.f54521r.setAnimateLayoutChange(true);
        this.f54521r.setVisibility(8);
        this.f54518c.addView(this.f54521r, b6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f54522s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f54516a.a(z10, false);
        Z(0);
        FrameLayout frameLayout2 = this.f54518c;
        m mVar = new m(this);
        WeakHashMap weakHashMap = h0.f46123a;
        r0.z.i(frameLayout2, mVar);
        setBulletinDelegate(new mg.u(15));
        FrameLayout frameLayout3 = this.f54518c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f54517b = this.arguments.getLong("community_id", 0L);
        getMessagesController().L0(Long.valueOf(this.f54517b));
        this.f54522s = getMessagesController().M0(this.f54517b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        e0 e0Var = this.f54523w;
        kt ktVar = e0Var.f54478i;
        if (ktVar != null) {
            ktVar.run();
        }
        e0Var.f54478i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f7 = i0.b.f(0.125f, getThemedColor(t6.f20929d6), getThemedColor(t6.G6));
            vh.d dVar = this.f54520n;
            if (dVar != null && f7 != this.f54524x) {
                this.f54524x = f7;
                dVar.setColor(f7);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f54519f.setAlpha(f11);
        LinearLayout linearLayout = this.f54519f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f54521r.setAlpha(f7);
        dw0 dw0Var = this.f54521r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        dw0Var.setVisibility(i12);
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
