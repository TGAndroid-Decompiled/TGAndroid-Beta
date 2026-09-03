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
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.zi;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.cp;
import org.telegram.ui.mi1;
import org.telegram.ui.vd1;
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
    public final nr0 T;
    public d6 f44422a;
    public boolean f44423b;
    public float f44424c;
    public int d;
    public int f44425e;
    public final e f44426f;
    public final g61 h;
    public final f2.l f44427n;
    public final pt0 f44428r;
    public final zi f44429s;
    public final g v;
    public final k f44430w;
    public final h f44431x;
    public final zw0 f44432y;

    public l(nr0 nr0Var, Context context) {
        super(context);
        this.T = nr0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f44425e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.E = false;
        this.F = false;
        this.S = new Rect();
        g61 g61Var = new g61();
        this.h = g61Var;
        g61Var.O = new d(this, 1);
        g61Var.y1(this.d);
        f2.l lVar = new f2.l();
        this.f44427n = lVar;
        lVar.n(280L);
        lVar.o(pr.h);
        lVar.f5910m = false;
        e eVar = new e(this, context);
        this.f44426f = eVar;
        eVar.setScrollingTouchSlop(1);
        eVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        eVar.setPadding(0, 0, 0, 0);
        eVar.setItemAnimator(null);
        eVar.setClipToPadding(false);
        eVar.setSectionsType(2);
        eVar.setLayoutManager(g61Var);
        addView(eVar, c6.c(-1.0f, -1));
        eVar.i(new f(this, 0));
        eVar.setOnItemClickListener(new ag.h(this, 13));
        eVar.setOnItemLongClickListener(new m5(this, 22));
        ?? sl0Var = new sl0(context, null);
        this.f44428r = sl0Var;
        zi ziVar = new zi(this);
        this.f44429s = ziVar;
        sl0Var.setLayoutManager(ziVar);
        sl0Var.i(new f(this, 1));
        ziVar.y1(this.f44425e);
        sl0Var.setVisibility(8);
        addView((View) sl0Var, c6.c(-1.0f, -1));
        g gVar = new g(this, context);
        this.v = gVar;
        eVar.setAdapter(gVar);
        k kVar = new k(this, getContext());
        gVar.f44418f = kVar;
        this.f44430w = kVar;
        sl0Var.setAdapter(kVar);
        h hVar = new h(this, context);
        this.f44431x = hVar;
        hVar.f31465w = false;
        zw0 zw0Var = new zw0(context, hVar, 1, null);
        this.f44432y = zw0Var;
        zw0Var.setVisibility(8);
        zw0Var.setAnimateLayoutChange(true);
        addView(zw0Var, c6.c(-1.0f, -1));
        zw0Var.setOnTouchListener(new mi1(1));
        zw0Var.e(true, false);
        zw0Var.f34031b.setVisibility(8);
        zw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        zw0Var.f34033e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(nr0Var.f44438b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        qh.d dVar = zw0Var.f34034f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new c(this, 0));
        s0 s0Var = new s0(this, context);
        this.B = s0Var;
        int i10 = k6.f22038y6;
        g6 g6Var = nr0Var.f44439c;
        s0Var.setTextColor(k6.v0(i10, g6Var));
        s0Var.setText(LocaleController.getString(R.string.ProfileBotOr));
        s0Var.setTextSize(1, 14.0f);
        s0Var.setTextAlignment(4);
        s0Var.setGravity(17);
        s0Var.setTypeface(AndroidUtilities.bold());
        zw0Var.f34030a.addView(s0Var, c6.t(165, -2, 17, 0, 17, 0, 12));
        qh.d dVar2 = new qh.d(context, g6Var, false);
        this.C = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        zw0Var.f34030a.addView(dVar2, c6.q(-2, 44, 17));
        zw0Var.addView(hVar, 0, c6.c(-1.0f, -1));
        eVar.setEmptyView(zw0Var);
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
        if (this.f44423b) {
            float f10 = this.f44424c;
            pt0 pt0Var = this.f44428r;
            float f11 = 1.0f;
            e eVar = this.f44426f;
            if (f10 == 1.0f) {
                this.f44423b = false;
                int i10 = this.f44425e;
                this.d = i10;
                this.T.f44447y = i10;
                SharedConfig.setStoriesColumnsCount(i10);
                g gVar = this.v;
                int h = gVar.h();
                pt0Var.setVisibility(8);
                int i11 = this.d;
                g61 g61Var = this.h;
                g61Var.y1(i11);
                eVar.a0();
                eVar.invalidate();
                if (gVar.h() == h) {
                    AndroidUtilities.updateVisibleRows(eVar);
                } else {
                    gVar.l();
                }
                int i12 = this.P;
                if (i12 >= 0) {
                    View m9 = this.f44429s.m(i12);
                    if (m9 != null) {
                        this.Q = m9.getTop();
                    }
                    g61Var.h1(this.P, (-eVar.getPaddingTop()) + this.Q);
                }
            } else if (f10 == 0.0f) {
                this.f44423b = false;
                pt0Var.setVisibility(8);
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
                ofFloat.addListener(new vd1(5, this, z4));
                ofFloat.setInterpolator(pr.f30168f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z4) {
        int i10;
        int i11;
        if (!this.f44423b && !this.T.D.f33666z1) {
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
            this.f44425e = clamp;
            if (clamp != this.d && !this.E) {
                pt0 pt0Var = this.f44428r;
                pt0Var.setVisibility(0);
                pt0Var.setAdapter(this.f44430w);
                pt0Var.setPadding(pt0Var.getPaddingLeft(), 0, pt0Var.getPaddingRight(), this.G.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                zi ziVar = this.f44429s;
                ziVar.y1(clamp);
                pt0Var.a0();
                ziVar.O = new d(this, 0);
                AndroidUtilities.updateVisibleRows(this.f44426f);
                this.f44423b = true;
                this.f44424c = 0.0f;
                int i14 = this.P;
                if (i14 >= 0) {
                    ziVar.h1(i14, this.Q - pt0Var.getPaddingTop());
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
        qv0 qv0Var;
        int i12 = this.T.f44438b;
        d6 d6Var = this.f44422a;
        int i13 = 0;
        if (d6Var == null) {
            size = 0;
        } else {
            size = d6Var.f17404i.size();
        }
        d6 d6Var2 = this.f44422a;
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
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, v31.D(this.f44422a.E, null, null));
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
            qv0Var = null;
        } else {
            qv0Var = new qv0(10, this, z4);
        }
        s0 s0Var2 = iVar.f44415c;
        qh.d dVar = iVar.d;
        iVar.f44413a.setText(formatString);
        mh.n nVar = iVar.f44414b;
        nVar.g(string2, false, true);
        nVar.setOnClickListener(new org.telegram.ui.Components.voip.o(s0Var, 5));
        if (string == null) {
            s0Var2.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            s0Var2.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new u(3, qv0Var));
        }
        s0 s0Var3 = this.B;
        qh.d dVar2 = this.C;
        zw0 zw0Var = this.f44432y;
        if (z4) {
            zw0Var.d.setVisibility(0);
            zw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            zw0Var.f34033e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            zw0Var.f34034f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            s0Var3.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            zw0Var.d.setVisibility(8);
            zw0Var.f34033e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, v31.D(this.f44422a.E, null, null)));
            zw0Var.f34034f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            s0Var3.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new c(this, 1));
        }
        qh.d dVar3 = zw0Var.f34034f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f44428r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        e eVar = this.f44426f;
        eVar.setPadding(eVar.getPaddingLeft(), eVar.V2, eVar.getPaddingRight(), this.G.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(d6 d6Var) {
        if (this.f44422a != d6Var) {
            this.E = false;
            this.F = false;
            this.d = this.T.f44447y;
        }
        this.f44422a = d6Var;
        g gVar = this.v;
        gVar.f44417e = d6Var;
        if (gVar != gVar.f44421s.f44430w) {
            gVar.M();
        }
        gVar.l();
        k kVar = this.f44430w;
        kVar.f44417e = d6Var;
        if (kVar != kVar.f44421s.f44430w) {
            kVar.M();
        }
        kVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f10 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f44432y.setTranslationY(f10);
        this.f44431x.setTranslationY(-f10);
    }
}
