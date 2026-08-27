package qf;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import h7.z5;
import java.util.ArrayList;
import java.util.HashSet;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.xm;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.zi;
import org.telegram.ui.a60;

public final class e0 extends yh implements NotificationCenter.NotificationCenterDelegate, ud.b {
    public final az A;
    public final ci B;

    public final ud.a f46278n;

    public final FrameLayout f46279r;

    public final a60 f46280s;
    public final zi v;

    public final HashSet f46281w;

    public final b0 f46282x;

    public final c0 f46283y;

    public e0(Context context, c6 c6Var, gi giVar) {
        super(context, c6Var, giVar);
        this.f46278n = new ud.a(0, this, er.h, 380L, false);
        this.f46281w = new HashSet();
        this.f46283y = new c0(this, context);
        fi fiVar = new fi(context, g6.f23053d6, c6Var);
        fiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46279r = frameLayout;
        ci ciVar = new ci(context, c6Var, this.f34900b);
        this.B = ciVar;
        ciVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        z zVar = new z(this);
        gg.g gVar = ciVar.f31468r;
        gVar.addTextChangedListener(zVar);
        gVar.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(fiVar, z5.g());
        FrameLayout.LayoutParams layoutParamsD = z5.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) layoutParamsD).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(ciVar, layoutParamsD);
        az azVar = new az(context, c6Var);
        this.A = azVar;
        azVar.c();
        addView(azVar, z5.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        a60 a60Var = new a60(this, context, c6Var, 2);
        this.f46280s = a60Var;
        a60Var.p1();
        this.f34901c = a60Var;
        this.d = a60Var;
        this.h = true;
        this.f34903f = true;
        NotificationCenter.getGlobalInstance().listen(a60Var, NotificationCenter.emojiLoaded, new n6(this, 13));
        a60Var.setClipToPadding(false);
        getContext();
        zi ziVar = new zi(this, AndroidUtilities.dp(9.0f), a60Var, 4);
        this.v = ziVar;
        a60Var.setLayoutManager(ziVar);
        ziVar.P = false;
        a60Var.setHorizontalScrollBarEnabled(false);
        a60Var.setVerticalScrollBarEnabled(false);
        a60Var.setClipToPadding(false);
        addView(a60Var, z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        b0 b0Var = new b0(this, context);
        this.f46282x = b0Var;
        a60Var.setAdapter(b0Var);
        a60Var.setGlowColor(g6.v0(g6.A5, this.f34899a));
        a60Var.setOnItemClickListener(new ag.p0(this, 19));
        a60Var.setOnScrollListener(new xm(this, 20));
        FrameLayout.LayoutParams layoutParamsE = z5.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) layoutParamsE).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, layoutParamsE);
        L();
    }

    public int getCurrentTop() {
        a60 a60Var = this.f46280s;
        if (a60Var.getChildCount() == 0) {
            return -1000;
        }
        int top = 0;
        View childAt = a60Var.getChildAt(0);
        lk0 lk0Var = (lk0) a60Var.G(childAt);
        if (lk0Var == null) {
            return -1000;
        }
        int paddingTop = a60Var.getPaddingTop();
        if (lk0Var.b() == 0 && childAt.getTop() >= 0) {
            top = childAt.getTop();
        }
        return paddingTop - top;
    }

    @Override
    public final void E(yh yhVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f46280s.x0(0);
    }

    public final void L() {
        this.A.setVisibility(this.f46280s.getAdapter().h() == 2 ? 0 : 8);
        M();
    }

    public final void M() {
        View childAt;
        az azVar = this.A;
        if (azVar.getVisibility() == 0 && (childAt = this.f46280s.getChildAt(0)) != null) {
            azVar.setTranslationY((childAt.getTop() + (azVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override
    public int getCurrentItemTop() {
        a60 a60Var = this.f46280s;
        if (a60Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = a60Var.getChildAt(0);
        lk0 lk0Var = (lk0) a60Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i10 = (top <= 0 || lk0Var == null || lk0Var.b() != 0) ? 0 : top;
        ud.a aVar = this.f46278n;
        if (top < 0 || lk0Var == null || lk0Var.b() != 0) {
            aVar.a(true, true);
            top = i10;
        } else {
            aVar.a(false, true);
        }
        this.f46279r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f46280s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<i6> getThemeDescriptions() {
        h6 h6Var = new h6() {
            @Override
            public final void b() {
                a60 a60Var = this.f46495a.f46280s;
                if (a60Var != null) {
                    int childCount = a60Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        a60Var.getChildAt(i10);
                    }
                }
            }

            @Override
            public final void a(float f10) {
            }
        };
        ArrayList<i6> arrayList = new ArrayList<>();
        arrayList.add(new i6(this.A, 4, null, null, null, null, g6.f23037c7));
        arrayList.add(new i6(this.A, 2048, null, null, null, null, g6.f23125h6));
        int i10 = g6.A5;
        a60 a60Var = this.f46280s;
        arrayList.add(new i6(a60Var, 32768, null, null, null, null, i10));
        arrayList.add(new i6(a60Var, 4096, null, null, null, null, g6.f23144i6));
        arrayList.add(new i6(a60Var, 0, new Class[]{View.class}, g6.f23175k0, null, null, g6.f23054d7));
        int i11 = g6.f23283q5;
        arrayList.add(new i6(a60Var, 0, new Class[]{d0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new i6(a60Var, 0, new Class[]{d0.class}, new String[]{"statusTextView"}, null, null, -1, h6Var, i11));
        arrayList.add(new i6(a60Var, 0, new Class[]{d0.class}, null, g6.f23295r0, null, g6.J7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.O7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.P7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.Q7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.R7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.S7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.T7));
        arrayList.add(new i6(null, 0, null, null, null, h6Var, g6.U7));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        M();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f34900b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(jg.a aVar) {
        ci ciVar = this.B;
        if (ciVar != null) {
            ciVar.setupBlurredBackground(aVar.c(ciVar, ng.c.a(this.f34899a), false));
        }
    }

    @Override
    public final void z(int i10, int i11) {
        int iDp;
        gi giVar = this.f34900b;
        if (giVar.f28674n1.R() > AndroidUtilities.dp(20.0f)) {
            iDp = AndroidUtilities.dp(8.0f);
            giVar.setAllowNestedScroll(false);
        } else {
            if (AndroidUtilities.isTablet()) {
                iDp = (i11 / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    iDp = (int) (i11 / 3.5f);
                } else {
                    iDp = (i11 / 5) * 2;
                }
            }
            giVar.setAllowNestedScroll(true);
        }
        this.f46280s.o1(0, iDp + AndroidUtilities.statusBarHeight, 0, this.f34902e);
    }

    @Override
    public final void m() {
    }

    @Override
    public final void A(float f10, int i10) {
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
    }
}
