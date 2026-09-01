package vf;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.pr;
public final class c0 extends ei implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public final oz B;
    public final ii C;
    public final xd.a f49008n;
    public final FrameLayout f49009r;
    public final qh.e1 f49010s;
    public final gj v;
    public final HashSet f49011w;
    public final z f49012x;
    public final a0 f49013y;

    public c0(Context context, g6 g6Var, mi miVar) {
        super(context, g6Var, miVar);
        this.f49008n = new xd.a(0, this, pr.h, 380L, false);
        this.f49011w = new HashSet();
        this.f49013y = new a0(this, context);
        li liVar = new li(context, k6.f21659d6, g6Var);
        liVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49009r = frameLayout;
        ii iiVar = new ii(context, g6Var, this.f26546b);
        this.C = iiVar;
        iiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        x xVar = new x(this);
        lg.f fVar = iiVar.f26172r;
        fVar.addTextChangedListener(xVar);
        fVar.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(liVar, c6.g());
        FrameLayout.LayoutParams d = c6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(iiVar, d);
        oz ozVar = new oz(context, g6Var);
        this.B = ozVar;
        ozVar.c();
        addView(ozVar, c6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        qh.e1 e1Var = new qh.e1(this, context, g6Var);
        this.f49010s = e1Var;
        e1Var.p1();
        this.f26547c = e1Var;
        this.d = e1Var;
        this.h = true;
        this.f26549f = true;
        NotificationCenter.getGlobalInstance().listen(e1Var, NotificationCenter.emojiLoaded, new org.telegram.ui.web.d1(this, 18));
        e1Var.setClipToPadding(false);
        getContext();
        gj gjVar = new gj(this, AndroidUtilities.dp(9.0f), e1Var, 4);
        this.v = gjVar;
        e1Var.setLayoutManager(gjVar);
        gjVar.P = false;
        e1Var.setHorizontalScrollBarEnabled(false);
        e1Var.setVerticalScrollBarEnabled(false);
        e1Var.setClipToPadding(false);
        addView(e1Var, c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        z zVar = new z(this, context);
        this.f49012x = zVar;
        e1Var.setAdapter(zVar);
        e1Var.setGlowColor(k6.v0(k6.A5, this.f26545a));
        e1Var.setOnItemClickListener(new ag.h(this, 22));
        e1Var.setOnScrollListener(new nb0(this, 20));
        FrameLayout.LayoutParams e6 = c6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e6).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e6);
        K();
    }

    public int getCurrentTop() {
        qh.e1 e1Var = this.f49010s;
        if (e1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = e1Var.getChildAt(0);
            fl0 fl0Var = (fl0) e1Var.G(childAt);
            if (fl0Var != null) {
                int paddingTop = e1Var.getPaddingTop();
                if (fl0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void D(ei eiVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f49010s.x0(0);
    }

    public final void K() {
        boolean z4;
        int i10 = 0;
        if (this.f49010s.getAdapter().h() == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            i10 = 8;
        }
        this.B.setVisibility(i10);
        M();
    }

    public final void M() {
        View childAt;
        oz ozVar = this.B;
        if (ozVar.getVisibility() != 0 || (childAt = this.f49010s.getChildAt(0)) == null) {
            return;
        }
        ozVar.setTranslationY((childAt.getTop() + (ozVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        qh.e1 e1Var = this.f49010s;
        if (e1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = e1Var.getChildAt(0);
        fl0 fl0Var = (fl0) e1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        xd.a aVar = this.f49008n;
        if (top >= 0 && fl0Var != null && fl0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i10;
        }
        this.f49009r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f49010s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<m6> getThemeDescriptions() {
        l6 l6Var = new l6() {
            @Override
            public final void b() {
                qh.e1 e1Var = c0.this.f49010s;
                if (e1Var != null) {
                    int childCount = e1Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        e1Var.getChildAt(i10);
                    }
                }
            }

            @Override
            public final void a(float f10) {
            }
        };
        ArrayList<m6> arrayList = new ArrayList<>();
        arrayList.add(new m6(this.B, 4, null, null, null, null, k6.f21642c7));
        arrayList.add(new m6(this.B, 2048, null, null, null, null, k6.f21732h6));
        int i10 = k6.A5;
        qh.e1 e1Var = this.f49010s;
        arrayList.add(new m6(e1Var, 32768, null, null, null, null, i10));
        arrayList.add(new m6(e1Var, 4096, null, null, null, null, k6.f21750i6));
        arrayList.add(new m6(e1Var, 0, new Class[]{View.class}, k6.f21779k0, null, null, k6.f21660d7));
        int i11 = k6.f21893q5;
        arrayList.add(new m6(e1Var, 0, new Class[]{b0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new m6(e1Var, 0, new Class[]{b0.class}, new String[]{"statusTextView"}, null, null, -1, l6Var, i11));
        arrayList.add(new m6(e1Var, 0, new Class[]{b0.class}, null, k6.f21906r0, null, k6.J7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.O7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.P7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.Q7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.R7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.S7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.T7));
        arrayList.add(new m6(null, 0, null, null, null, l6Var, k6.U7));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        M();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f26546b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(og.a aVar) {
        ii iiVar = this.C;
        if (iiVar != null) {
            iiVar.setupBlurredBackground(aVar.c(iiVar, sg.b.a(this.f26545a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        mi miVar = this.f26546b;
        if (miVar.f29078o1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            miVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    miVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            miVar.setAllowNestedScroll(true);
        }
        this.f49010s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.f26548e);
    }

    @Override
    public final void m() {
    }

    @Override
    public final void z(float f10, int i10) {
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
    }
}
