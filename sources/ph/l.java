package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import f2.d0;
import f2.f0;
import fg.s0;
import java.util.HashMap;
import jg.u;
import k7.c6;
import mh.m5;
import oh.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.zi;
import org.telegram.ui.cp;
import org.telegram.ui.gi1;
import org.telegram.ui.qd1;
public final class l extends FrameLayout {
    public static final int U = 0;
    public final s0 B;
    public final qh.d C;
    public final f0 D;
    public boolean E;
    public boolean F;
    public final i G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public final Rect S;
    public final or0 T;
    public d6 f44391a;
    public boolean f44392b;
    public float f44393c;
    public int d;
    public int f44394e;
    public final e f44395f;
    public final h61 h;
    public final f2.l f44396n;
    public final qt0 f44397r;
    public final zi f44398s;
    public final g v;
    public final k f44399w;
    public final h f44400x;
    public final ax0 f44401y;

    public l(or0 or0Var, Context context) {
        super(context);
        this.T = or0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f44394e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.E = false;
        this.F = false;
        this.S = new Rect();
        h61 h61Var = new h61();
        this.h = h61Var;
        h61Var.O = new d(this, 1);
        h61Var.y1(this.d);
        f2.l lVar = new f2.l();
        this.f44396n = lVar;
        lVar.n(280L);
        lVar.o(pr.h);
        lVar.f5910m = false;
        e eVar = new e(this, context);
        this.f44395f = eVar;
        eVar.setScrollingTouchSlop(1);
        eVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        eVar.setPadding(0, 0, 0, 0);
        eVar.setItemAnimator(null);
        eVar.setClipToPadding(false);
        eVar.setSectionsType(2);
        eVar.setLayoutManager(h61Var);
        addView(eVar, c6.c(-1.0f, -1));
        eVar.i(new f(this, 0));
        eVar.setOnItemClickListener(new ag.h(this, 13));
        eVar.setOnItemLongClickListener(new m5(this, 22));
        ?? tl0Var = new tl0(context, null);
        this.f44397r = tl0Var;
        zi ziVar = new zi(this);
        this.f44398s = ziVar;
        tl0Var.setLayoutManager(ziVar);
        tl0Var.i(new f(this, 1));
        ziVar.y1(this.f44394e);
        tl0Var.setVisibility(8);
        addView((View) tl0Var, c6.c(-1.0f, -1));
        g gVar = new g(this, context);
        this.v = gVar;
        eVar.setAdapter(gVar);
        k kVar = new k(this, getContext());
        gVar.f44387f = kVar;
        this.f44399w = kVar;
        tl0Var.setAdapter(kVar);
        h hVar = new h(this, context);
        this.f44400x = hVar;
        hVar.f31509w = false;
        ax0 ax0Var = new ax0(context, hVar, 1, null);
        this.f44401y = ax0Var;
        ax0Var.setVisibility(8);
        ax0Var.setAnimateLayoutChange(true);
        addView(ax0Var, c6.c(-1.0f, -1));
        ax0Var.setOnTouchListener(new gi1(1));
        ax0Var.e(true, false);
        ax0Var.f25362b.setVisibility(8);
        ax0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        ax0Var.f25364e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(or0Var.f44407b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        qh.d dVar = ax0Var.f25365f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new c(this, 0));
        s0 s0Var = new s0(this, context);
        this.B = s0Var;
        int i10 = k6.f22036y6;
        g6 g6Var = or0Var.f44408c;
        s0Var.setTextColor(k6.v0(i10, g6Var));
        s0Var.setText(LocaleController.getString(R.string.ProfileBotOr));
        s0Var.setTextSize(1, 14.0f);
        s0Var.setTextAlignment(4);
        s0Var.setGravity(17);
        s0Var.setTypeface(AndroidUtilities.bold());
        ax0Var.f25361a.addView(s0Var, c6.t(165, -2, 17, 0, 17, 0, 12));
        qh.d dVar2 = new qh.d(context, g6Var, false);
        this.C = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        ax0Var.f25361a.addView(dVar2, c6.q(-2, 44, 17));
        ax0Var.addView(hVar, 0, c6.c(-1.0f, -1));
        eVar.setEmptyView(ax0Var);
        eVar.V1 = true;
        eVar.W1 = 0;
        new SparseArray();
        new HashMap();
        f0 f0Var = new f0(new cp(this, 6));
        this.D = f0Var;
        f0Var.d(eVar);
        i iVar = new i(context, g6Var);
        this.G = iVar;
        addView(iVar, c6.e(-1, -2, 48));
    }

    public final void a() {
        boolean z4;
        if (this.f44392b) {
            float f10 = this.f44393c;
            qt0 qt0Var = this.f44397r;
            float f11 = 1.0f;
            e eVar = this.f44395f;
            if (f10 == 1.0f) {
                this.f44392b = false;
                int i10 = this.f44394e;
                this.d = i10;
                this.T.f44416y = i10;
                SharedConfig.setStoriesColumnsCount(i10);
                g gVar = this.v;
                int h = gVar.h();
                qt0Var.setVisibility(8);
                int i11 = this.d;
                h61 h61Var = this.h;
                h61Var.y1(i11);
                eVar.a0();
                eVar.invalidate();
                if (gVar.h() == h) {
                    AndroidUtilities.updateVisibleRows(eVar);
                } else {
                    gVar.l();
                }
                int i12 = this.P;
                if (i12 >= 0) {
                    View m9 = this.f44398s.m(i12);
                    if (m9 != null) {
                        this.Q = m9.getTop();
                    }
                    h61Var.h1(this.P, (-eVar.getPaddingTop()) + this.Q);
                }
            } else if (f10 == 0.0f) {
                this.f44392b = false;
                qt0Var.setVisibility(8);
                eVar.invalidate();
            } else {
                if (f10 > 0.2f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
                ofFloat.addUpdateListener(new d0(this, 9));
                ofFloat.addListener(new qd1(5, this, z4));
                ofFloat.setInterpolator(pr.f30183f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z4) {
        int i10;
        int i11;
        if (!this.f44392b && !this.T.D.f34021z1) {
            int i12 = this.d;
            if (!z4) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i13 = i12 + i10;
            if (i13 > 6) {
                if (!z4) {
                    i13 = 9;
                } else {
                    i13 = 6;
                }
            }
            if (this.E) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            int clamp = Utilities.clamp(i13, 6, i11);
            this.f44394e = clamp;
            if (clamp != this.d && !this.E) {
                qt0 qt0Var = this.f44397r;
                qt0Var.setVisibility(0);
                qt0Var.setAdapter(this.f44399w);
                qt0Var.setPadding(qt0Var.getPaddingLeft(), 0, qt0Var.getPaddingRight(), this.G.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                zi ziVar = this.f44398s;
                ziVar.y1(clamp);
                qt0Var.a0();
                ziVar.O = new d(this, 0);
                AndroidUtilities.updateVisibleRows(this.f44395f);
                this.f44392b = true;
                this.f44393c = 0.0f;
                int i14 = this.P;
                if (i14 >= 0) {
                    ziVar.h1(i14, this.Q - qt0Var.getPaddingTop());
                }
            }
        }
    }

    public final void c() {
        int size;
        boolean z4;
        int i10;
        String formatString;
        int i11;
        String string;
        rv0 rv0Var;
        int i12 = this.T.f44407b;
        d6 d6Var = this.f44391a;
        int i13 = 0;
        if (d6Var == null) {
            size = 0;
        } else {
            size = d6Var.f17402i.size();
        }
        d6 d6Var2 = this.f44391a;
        if (d6Var2 != null && !TextUtils.isEmpty(d6Var2.E)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (size > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        i iVar = this.G;
        iVar.setVisibility(i10);
        if (z4) {
            formatString = LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral);
        } else {
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, w31.D(this.f44391a.E, null, null));
        }
        String string2 = LocaleController.getString(R.string.ProfileBotAddPreview);
        org.telegram.ui.web.s0 s0Var = new org.telegram.ui.web.s0(this, 7);
        if (!z4 && size > 0) {
            string = null;
        } else {
            if (z4) {
                i11 = R.string.ProfileBotPreviewFooterCreateTranslation;
            } else {
                i11 = R.string.ProfileBotPreviewFooterDeleteTranslation;
            }
            string = LocaleController.getString(i11);
        }
        if (!z4 && size > 0) {
            rv0Var = null;
        } else {
            rv0Var = new rv0(10, this, z4);
        }
        s0 s0Var2 = iVar.f44384c;
        qh.d dVar = iVar.d;
        iVar.f44382a.setText(formatString);
        mh.n nVar = iVar.f44383b;
        nVar.g(string2, false, true);
        nVar.setOnClickListener(new org.telegram.ui.Components.voip.o(s0Var, 5));
        if (string == null) {
            s0Var2.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            s0Var2.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new u(3, rv0Var));
        }
        s0 s0Var3 = this.B;
        qh.d dVar2 = this.C;
        ax0 ax0Var = this.f44401y;
        if (z4) {
            ax0Var.d.setVisibility(0);
            ax0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            ax0Var.f25364e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            ax0Var.f25365f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            s0Var3.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            ax0Var.d.setVisibility(8);
            ax0Var.f25364e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, w31.D(this.f44391a.E, null, null)));
            ax0Var.f25365f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            s0Var3.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new c(this, 1));
        }
        qh.d dVar3 = ax0Var.f25365f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f44397r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        e eVar = this.f44395f;
        eVar.setPadding(eVar.getPaddingLeft(), eVar.V2, eVar.getPaddingRight(), this.G.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(d6 d6Var) {
        if (this.f44391a != d6Var) {
            this.E = false;
            this.F = false;
            this.d = this.T.f44416y;
        }
        this.f44391a = d6Var;
        g gVar = this.v;
        gVar.f44386e = d6Var;
        if (gVar != gVar.f44390s.f44399w) {
            gVar.M();
        }
        gVar.l();
        k kVar = this.f44399w;
        kVar.f44386e = d6Var;
        if (kVar != kVar.f44390s.f44399w) {
            kVar.M();
        }
        kVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f10 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f44401y.setTranslationY(f10);
        this.f44400x.setTranslationY(-f10);
    }
}
