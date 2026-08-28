package pf;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g7.e6;
import java.util.ArrayList;
import java.util.HashSet;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.yy;
import org.telegram.ui.w50;
public final class e0 extends ci implements NotificationCenter.NotificationCenterDelegate, td.b {
    public final yy A;
    public final gi B;
    public final td.a f45607n;
    public final FrameLayout f45608r;
    public final w50 f45609s;
    public final dj v;
    public final HashSet f45610w;
    public final b0 f45611x;
    public final c0 f45612y;

    public e0(Context context, b6 b6Var, ki kiVar) {
        super(context, b6Var, kiVar);
        this.f45607n = new td.a(0, this, gr.h, 380L, false);
        this.f45610w = new HashSet();
        this.f45612y = new c0(this, context);
        ji jiVar = new ji(context, f6.f23001d6, b6Var);
        jiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45608r = frameLayout;
        gi giVar = new gi(context, b6Var, this.f27493b);
        this.B = giVar;
        giVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        z zVar = new z(this);
        fg.g gVar = giVar.f30664r;
        gVar.addTextChangedListener(zVar);
        gVar.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(jiVar, e6.g());
        FrameLayout.LayoutParams d = e6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(giVar, d);
        yy yyVar = new yy(context, b6Var);
        this.A = yyVar;
        yyVar.c();
        addView(yyVar, e6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        w50 w50Var = new w50(this, context, b6Var, 2);
        this.f45609s = w50Var;
        w50Var.p1();
        this.f27494c = w50Var;
        this.d = w50Var;
        this.h = true;
        this.f27496f = true;
        NotificationCenter.getGlobalInstance().listen(w50Var, NotificationCenter.emojiLoaded, new i9(this, 11));
        w50Var.setClipToPadding(false);
        getContext();
        dj djVar = new dj(this, AndroidUtilities.dp(9.0f), w50Var, 4);
        this.v = djVar;
        w50Var.setLayoutManager(djVar);
        djVar.P = false;
        w50Var.setHorizontalScrollBarEnabled(false);
        w50Var.setVerticalScrollBarEnabled(false);
        w50Var.setClipToPadding(false);
        addView(w50Var, e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        b0 b0Var = new b0(this, context);
        this.f45611x = b0Var;
        w50Var.setAdapter(b0Var);
        w50Var.setGlowColor(f6.v0(f6.A5, this.f27492a));
        w50Var.setOnItemClickListener(new eh.j(this, 17));
        w50Var.setOnScrollListener(new kn(this, 19));
        FrameLayout.LayoutParams e10 = e6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e10);
        K();
    }

    public int getCurrentTop() {
        w50 w50Var = this.f45609s;
        if (w50Var.getChildCount() != 0) {
            int i9 = 0;
            View childAt = w50Var.getChildAt(0);
            ik0 ik0Var = (ik0) w50Var.G(childAt);
            if (ik0Var != null) {
                int paddingTop = w50Var.getPaddingTop();
                if (ik0Var.b() == 0 && childAt.getTop() >= 0) {
                    i9 = childAt.getTop();
                }
                return paddingTop - i9;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void D(ci ciVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f45609s.x0(0);
    }

    public final void K() {
        boolean z10;
        int i9 = 0;
        if (this.f45609s.getAdapter().h() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i9 = 8;
        }
        this.A.setVisibility(i9);
        L();
    }

    public final void L() {
        View childAt;
        yy yyVar = this.A;
        if (yyVar.getVisibility() != 0 || (childAt = this.f45609s.getChildAt(0)) == null) {
            return;
        }
        yyVar.setTranslationY((childAt.getTop() + (yyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i9;
        w50 w50Var = this.f45609s;
        if (w50Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = w50Var.getChildAt(0);
        ik0 ik0Var = (ik0) w50Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && ik0Var != null && ik0Var.b() == 0) {
            i9 = top;
        } else {
            i9 = 0;
        }
        td.a aVar = this.f45607n;
        if (top >= 0 && ik0Var != null && ik0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i9;
        }
        this.f45608r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f45609s.getPaddingTop();
    }

    @Override
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override
    public ArrayList<h6> getThemeDescriptions() {
        g6 g6Var = new g6() {
            @Override
            public final void b() {
                w50 w50Var = e0.this.f45609s;
                if (w50Var != null) {
                    int childCount = w50Var.getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        w50Var.getChildAt(i9);
                    }
                }
            }

            @Override
            public final void a(float f10) {
            }
        };
        ArrayList<h6> arrayList = new ArrayList<>();
        arrayList.add(new h6(this.A, 4, null, null, null, null, f6.f22984c7));
        arrayList.add(new h6(this.A, 2048, null, null, null, null, f6.f23073h6));
        int i9 = f6.A5;
        w50 w50Var = this.f45609s;
        arrayList.add(new h6(w50Var, 32768, null, null, null, null, i9));
        arrayList.add(new h6(w50Var, 4096, null, null, null, null, f6.f23092i6));
        arrayList.add(new h6(w50Var, 0, new Class[]{View.class}, f6.f23121k0, null, null, f6.f23002d7));
        int i10 = f6.f23228q5;
        arrayList.add(new h6(w50Var, 0, new Class[]{d0.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new h6(w50Var, 0, new Class[]{d0.class}, new String[]{"statusTextView"}, null, null, -1, g6Var, i10));
        arrayList.add(new h6(w50Var, 0, new Class[]{d0.class}, null, f6.f23242r0, null, f6.J7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.O7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.P7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.Q7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.R7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.S7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.T7));
        arrayList.add(new h6(null, 0, null, null, null, g6Var, f6.U7));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        L();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f27493b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(ig.a aVar) {
        gi giVar = this.B;
        if (giVar != null) {
            giVar.setupBlurredBackground(aVar.c(giVar, mg.c.a(this.f27492a), false));
        }
    }

    @Override
    public final void y(int i9, int i10) {
        int i11;
        ki kiVar = this.f27493b;
        if (kiVar.f30138n1.R() > AndroidUtilities.dp(20.0f)) {
            i11 = AndroidUtilities.dp(8.0f);
            kiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    kiVar.setAllowNestedScroll(true);
                }
            }
            i11 = (i10 / 5) * 2;
            kiVar.setAllowNestedScroll(true);
        }
        this.f45609s.o1(0, i11 + AndroidUtilities.statusBarHeight, 0, this.f27495e);
    }

    @Override
    public final void m() {
    }

    @Override
    public final void B(float f10, int i9) {
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
    }
}
