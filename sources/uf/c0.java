package uf;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.nr;
public final class c0 extends di implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public final mz B;
    public final hi C;
    public final xd.a f45267n;
    public final FrameLayout f45268r;
    public final ph.e1 f45269s;
    public final ej v;
    public final HashSet f45270w;
    public final z f45271x;
    public final a0 f45272y;

    public c0(Context context, f6 f6Var, li liVar) {
        super(context, f6Var, liVar);
        this.f45267n = new xd.a(0, this, nr.h, 380L, false);
        this.f45270w = new HashSet();
        this.f45272y = new a0(this, context);
        ki kiVar = new ki(context, j6.f19906d6, f6Var);
        kiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45268r = frameLayout;
        hi hiVar = new hi(context, f6Var, this.f24278b);
        this.C = hiVar;
        hiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        x xVar = new x(this);
        kg.f fVar = hiVar.f23815r;
        fVar.addTextChangedListener(xVar);
        fVar.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(kiVar, b6.g());
        FrameLayout.LayoutParams d = b6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(hiVar, d);
        mz mzVar = new mz(context, f6Var);
        this.B = mzVar;
        mzVar.c();
        addView(mzVar, b6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        ph.e1 e1Var = new ph.e1(this, context, f6Var);
        this.f45269s = e1Var;
        e1Var.p1();
        this.f24279c = e1Var;
        this.d = e1Var;
        this.h = true;
        this.f24280f = true;
        NotificationCenter.getGlobalInstance().listen(e1Var, NotificationCenter.emojiLoaded, new org.telegram.ui.web.y0(this, 18));
        e1Var.setClipToPadding(false);
        getContext();
        ej ejVar = new ej(this, AndroidUtilities.dp(9.0f), e1Var, 4);
        this.v = ejVar;
        e1Var.setLayoutManager(ejVar);
        ejVar.P = false;
        e1Var.setHorizontalScrollBarEnabled(false);
        e1Var.setVerticalScrollBarEnabled(false);
        e1Var.setClipToPadding(false);
        addView(e1Var, b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        z zVar = new z(this, context);
        this.f45271x = zVar;
        e1Var.setAdapter(zVar);
        e1Var.setGlowColor(j6.v0(j6.A5, this.f24277a));
        e1Var.setOnItemClickListener(new dg.n(this, 21));
        e1Var.setOnScrollListener(new lb0(this, 20));
        FrameLayout.LayoutParams e = b6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        K();
    }

    public int getCurrentTop() {
        ph.e1 e1Var = this.f45269s;
        if (e1Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = e1Var.getChildAt(0);
            el0 el0Var = (el0) e1Var.G(childAt);
            if (el0Var != null) {
                int paddingTop = e1Var.getPaddingTop();
                if (el0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void D(di diVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f45269s.x0(0);
    }

    public final void K() {
        boolean z4;
        int i10 = 0;
        if (this.f45269s.getAdapter().h() == 2) {
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
        mz mzVar = this.B;
        if (mzVar.getVisibility() != 0 || (childAt = this.f45269s.getChildAt(0)) == null) {
            return;
        }
        mzVar.setTranslationY((childAt.getTop() + (mzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        ph.e1 e1Var = this.f45269s;
        if (e1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = e1Var.getChildAt(0);
        el0 el0Var = (el0) e1Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && el0Var != null && el0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        xd.a aVar = this.f45267n;
        if (top >= 0 && el0Var != null && el0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i10;
        }
        this.f45268r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f45269s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<l6> getThemeDescriptions() {
        k6 k6Var = new k6() {
            @Override
            public final void b() {
                ph.e1 e1Var = c0.this.f45269s;
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
        ArrayList<l6> arrayList = new ArrayList<>();
        arrayList.add(new l6(this.B, 4, null, null, null, null, j6.f19889c7));
        arrayList.add(new l6(this.B, 2048, null, null, null, null, j6.f19978h6));
        int i10 = j6.A5;
        ph.e1 e1Var = this.f45269s;
        arrayList.add(new l6(e1Var, 32768, null, null, null, null, i10));
        arrayList.add(new l6(e1Var, 4096, null, null, null, null, j6.f19996i6));
        arrayList.add(new l6(e1Var, 0, new Class[]{View.class}, j6.f20025k0, null, null, j6.f19907d7));
        int i11 = j6.f20139q5;
        arrayList.add(new l6(e1Var, 0, new Class[]{b0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new l6(e1Var, 0, new Class[]{b0.class}, new String[]{"statusTextView"}, null, null, -1, k6Var, i11));
        arrayList.add(new l6(e1Var, 0, new Class[]{b0.class}, null, j6.f20152r0, null, j6.J7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.O7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.P7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.Q7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.R7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.S7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.T7));
        arrayList.add(new l6(null, 0, null, null, null, k6Var, j6.U7));
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
        this.f24278b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ng.a aVar) {
        hi hiVar = this.C;
        if (hiVar != null) {
            hiVar.setupBlurredBackground(aVar.c(hiVar, rg.b.a(this.f24277a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        li liVar = this.f24278b;
        if (liVar.f26726o1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            liVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    liVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            liVar.setAllowNestedScroll(true);
        }
        this.f45269s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
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
