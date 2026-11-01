package yh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.lt;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.un;
import org.telegram.ui.z01;
import r0.h0;
import w7.b6;
import xh.e3;
import xh.n1;
public final class p extends k2 implements fe.e {
    public final fe.b f54517a;
    public long f54518b;
    public FrameLayout f54519c;
    public v51 d;
    public bh.i e;
    public LinearLayout f54520f;
    public vh.d h;
    public vh.d f54521n;
    public ew0 f54522r;
    public TLRPC.ChatFull f54523s;
    public d0 f54524w;
    public int f54525x;

    public p(Bundle bundle) {
        super(bundle);
        this.f54517a = new fe.b(0, this, gr.h, 320L, false);
    }

    public static void Z(p pVar, b51 b51Var) {
        Object obj = b51Var.G;
        if (obj instanceof zh.f) {
            zh.f fVar = (zh.f) obj;
            long j10 = fVar.f55792a;
            TLRPC.Chat L0 = wp.r1(pVar.currentAccount).L0(Long.valueOf(-j10));
            TLRPC.User Z1 = wp.r1(pVar.currentAccount).Z1(Long.valueOf(j10));
            if (Z1 != null) {
                pVar.presentFragment(un.ma(Z1.f19943id));
            } else if (!w3.t0(L0) && !w3.j0(L0)) {
                new ai.c(pVar.getParentActivity(), L0, new e3(1, pVar, fVar)).show();
            } else {
                pVar.presentFragment(un.ma(-L0.f19794id));
            }
        }
    }

    public final void a0(int i10) {
        this.d.setPadding(0, 0, 0, i0.L(60.0f) + i10);
        this.f54520f.setPadding(i0.L(7.0f), 0, i0.L(7.0f), i0.L(12.0f) + i10);
        this.f54522r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(i0.L(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        d0 d0Var = new d0(getParentActivity(), this.resourceProvider, cc.a0(this), this.currentAccount, this.f54518b);
        this.f54524w = d0Var;
        d0Var.h = new s9.g(this);
        d0Var.d();
        this.f54524w.e();
        this.actionBar.setBackButtonDrawable(new c2(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, 22));
        this.actionBar.setTitle(dd.L0(2131751895, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f54519c = frameLayout;
        int i10 = t6.f20873a7;
        a7.i(i10, frameLayout, null);
        v51 v51Var = new v51(this, new n1(this, 3), new m(this), new xg.a(25, this));
        this.d = v51Var;
        v51Var.setClipToPadding(false);
        v51 v51Var2 = this.d;
        v51Var2.f31183f3.f29638r = false;
        v51Var2.r1();
        this.d.j(new o(this, 0));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f54519c.addView(this.d, b6.c(-1.0f, -1));
        bh.i iVar = new bh.i(context);
        this.e = iVar;
        iVar.setupColorKey(i10);
        this.e.setFadeZoneBottom(i0.L(72.0f));
        this.e.setFadeHeightBottom(i0.L(24.0f));
        this.f54519c.addView(this.e, b6.g());
        this.f54519c.addView(this.actionBar, b6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f54520f = linearLayout;
        linearLayout.setOrientation(0);
        this.f54520f.setPadding(i0.L(7.0f), 0, i0.L(7.0f), i0.L(12.0f));
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        this.f54521n = dVar;
        dVar.e();
        vh.d dVar2 = this.f54521n;
        int f7 = i0.b.f(0.125f, getThemedColor(t6.f20930d6), getThemedColor(t6.G6));
        this.f54525x = f7;
        dVar2.setColor(f7);
        this.f54521n.setText(dd.L0(2131751900, null));
        this.f54521n.f();
        this.f54521n.setOnClickListener(new View.OnClickListener(this) {
            public final p f54514b;

            {
                this.f54514b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f54514b.f54524w.f(false, true);
                        return;
                    default:
                        this.f54514b.f54524w.f(true, true);
                        return;
                }
            }
        });
        this.f54520f.addView(this.f54521n, b6.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        vh.d dVar3 = new vh.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(dd.L0(2131751902, null));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final p f54514b;

            {
                this.f54514b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f54514b.f54524w.f(false, true);
                        return;
                    default:
                        this.f54514b.f54524w.f(true, true);
                        return;
                }
            }
        });
        this.f54520f.addView(this.h, b6.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f54519c.addView(this.f54520f, b6.e(-1, -2, 80));
        ew0 ew0Var = new ew0(getParentActivity(), null, 16, this.resourceProvider);
        this.f54522r = ew0Var;
        ew0Var.d.setText(dd.L0(2131748242, null));
        this.f54522r.e.setText(dd.L0(2131748241, null));
        this.f54522r.setAnimateLayoutChange(true);
        this.f54522r.setVisibility(8);
        this.f54519c.addView(this.f54522r, b6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f54523s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f54517a.a(z10, false);
        a0(0);
        FrameLayout frameLayout2 = this.f54519c;
        m mVar = new m(this);
        WeakHashMap weakHashMap = h0.f46134a;
        r0.z.i(frameLayout2, mVar);
        setBulletinDelegate(new mg.u(15));
        FrameLayout frameLayout3 = this.f54519c;
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
        this.f54518b = this.arguments.getLong("community_id", 0L);
        getMessagesController().L0(Long.valueOf(this.f54518b));
        this.f54523s = getMessagesController().M0(this.f54518b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        d0 d0Var = this.f54524w;
        lt ltVar = d0Var.f54476i;
        if (ltVar != null) {
            ltVar.run();
        }
        d0Var.f54476i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f7 = i0.b.f(0.125f, getThemedColor(t6.f20930d6), getThemedColor(t6.G6));
            vh.d dVar = this.f54521n;
            if (dVar != null && f7 != this.f54525x) {
                this.f54525x = f7;
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
        this.f54520f.setAlpha(f11);
        LinearLayout linearLayout = this.f54520f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f54522r.setAlpha(f7);
        ew0 ew0Var = this.f54522r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        ew0Var.setVisibility(i12);
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
