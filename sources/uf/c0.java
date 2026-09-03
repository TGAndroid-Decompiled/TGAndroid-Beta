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
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.mz;
import org.telegram.ui.d81;
public final class c0 extends di implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public final mz B;
    public final hi C;
    public final xd.a f45331n;
    public final FrameLayout f45332r;
    public final d81 f45333s;
    public final ej v;
    public final HashSet f45334w;
    public final z f45335x;
    public final a0 f45336y;

    public c0(Context context, f6 f6Var, li liVar) {
        super(context, f6Var, liVar);
        this.f45331n = new xd.a(0, this, mr.h, 380L, false);
        this.f45334w = new HashSet();
        this.f45336y = new a0(this, context);
        ki kiVar = new ki(context, j6.f19881d6, f6Var);
        kiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45332r = frameLayout;
        hi hiVar = new hi(context, f6Var, this.f24282b);
        this.C = hiVar;
        hiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        x xVar = new x(this);
        kg.f fVar = hiVar.f24117r;
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
        d81 d81Var = new d81(this, context, f6Var);
        this.f45333s = d81Var;
        d81Var.o1();
        this.f24283c = d81Var;
        this.d = d81Var;
        this.h = true;
        this.f24284f = true;
        NotificationCenter.getGlobalInstance().listen(d81Var, NotificationCenter.emojiLoaded, new org.telegram.ui.web.a1(this, 18));
        d81Var.setClipToPadding(false);
        getContext();
        ej ejVar = new ej(this, AndroidUtilities.dp(9.0f), d81Var, 4);
        this.v = ejVar;
        d81Var.setLayoutManager(ejVar);
        ejVar.P = false;
        d81Var.setHorizontalScrollBarEnabled(false);
        d81Var.setVerticalScrollBarEnabled(false);
        d81Var.setClipToPadding(false);
        addView(d81Var, b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        z zVar = new z(this, context);
        this.f45335x = zVar;
        d81Var.setAdapter(zVar);
        d81Var.setGlowColor(j6.v0(j6.A5, this.f24281a));
        d81Var.setOnItemClickListener(new dg.n(this, 21));
        d81Var.setOnScrollListener(new mb0(this, 20));
        FrameLayout.LayoutParams e = b6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e);
        K();
    }

    public int getCurrentTop() {
        d81 d81Var = this.f45333s;
        if (d81Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = d81Var.getChildAt(0);
            dl0 dl0Var = (dl0) d81Var.G(childAt);
            if (dl0Var != null) {
                int paddingTop = d81Var.getPaddingTop();
                if (dl0Var.b() == 0 && childAt.getTop() >= 0) {
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
        this.f45333s.x0(0);
    }

    public final void K() {
        boolean z4;
        int i10 = 0;
        if (this.f45333s.getAdapter().h() == 2) {
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
        if (mzVar.getVisibility() != 0 || (childAt = this.f45333s.getChildAt(0)) == null) {
            return;
        }
        mzVar.setTranslationY((childAt.getTop() + (mzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        d81 d81Var = this.f45333s;
        if (d81Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = d81Var.getChildAt(0);
        dl0 dl0Var = (dl0) d81Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && dl0Var != null && dl0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        xd.a aVar = this.f45331n;
        if (top >= 0 && dl0Var != null && dl0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i10;
        }
        this.f45332r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f45333s.getPaddingTop();
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
                d81 d81Var = c0.this.f45333s;
                if (d81Var != null) {
                    int childCount = d81Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        d81Var.getChildAt(i10);
                    }
                }
            }

            @Override
            public final void a(float f10) {
            }
        };
        ArrayList<l6> arrayList = new ArrayList<>();
        arrayList.add(new l6(this.B, 4, null, null, null, null, j6.f19864c7));
        arrayList.add(new l6(this.B, 2048, null, null, null, null, j6.f19953h6));
        int i10 = j6.A5;
        d81 d81Var = this.f45333s;
        arrayList.add(new l6(d81Var, 32768, null, null, null, null, i10));
        arrayList.add(new l6(d81Var, 4096, null, null, null, null, j6.f19971i6));
        arrayList.add(new l6(d81Var, 0, new Class[]{View.class}, j6.f20000k0, null, null, j6.f19882d7));
        int i11 = j6.f20114q5;
        arrayList.add(new l6(d81Var, 0, new Class[]{b0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new l6(d81Var, 0, new Class[]{b0.class}, new String[]{"statusTextView"}, null, null, -1, k6Var, i11));
        arrayList.add(new l6(d81Var, 0, new Class[]{b0.class}, null, j6.f20126r0, null, j6.J7));
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
        this.f24282b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ng.a aVar) {
        hi hiVar = this.C;
        if (hiVar != null) {
            hiVar.setupBlurredBackground(aVar.c(hiVar, rg.b.a(this.f24281a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        li liVar = this.f24282b;
        if (liVar.f26722o1.R() > AndroidUtilities.dp(20.0f)) {
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
        this.f45333s.n1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.e);
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
