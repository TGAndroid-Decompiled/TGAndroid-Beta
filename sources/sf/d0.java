package sf;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.i71;
public final class d0 extends fi implements NotificationCenter.NotificationCenterDelegate, vd.b {
    public final hz A;
    public final ji B;
    public final vd.a f47774n;
    public final FrameLayout f47775r;
    public final i71 f47776s;
    public final gj v;
    public final HashSet f47777w;
    public final a0 f47778x;
    public final b0 f47779y;

    public d0(Context context, c6 c6Var, ni niVar) {
        super(context, c6Var, niVar);
        this.f47774n = new vd.a(0, this, jr.h, 380L, false);
        this.f47777w = new HashSet();
        this.f47779y = new b0(this, context);
        mi miVar = new mi(context, g6.f23062d6, c6Var);
        miVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47775r = frameLayout;
        ji jiVar = new ji(context, c6Var, this.f28403b);
        this.B = jiVar;
        jiVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        y yVar = new y(this);
        ig.f fVar = jiVar.f34546r;
        fVar.addTextChangedListener(yVar);
        fVar.setHint(LocaleController.getString(R.string.BusinessRepliesSearch));
        frameLayout.addView(miVar, f6.g());
        FrameLayout.LayoutParams d = f6.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(jiVar, d);
        hz hzVar = new hz(context, c6Var);
        this.A = hzVar;
        hzVar.c();
        addView(hzVar, f6.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        i71 i71Var = new i71(this, context, c6Var);
        this.f47776s = i71Var;
        i71Var.p1();
        this.f28404c = i71Var;
        this.d = i71Var;
        this.h = true;
        this.f28406f = true;
        NotificationCenter.getGlobalInstance().listen(i71Var, NotificationCenter.emojiLoaded, new nh.b0(this, 18));
        i71Var.setClipToPadding(false);
        getContext();
        gj gjVar = new gj(this, AndroidUtilities.dp(9.0f), i71Var, 4);
        this.v = gjVar;
        i71Var.setLayoutManager(gjVar);
        gjVar.P = false;
        i71Var.setHorizontalScrollBarEnabled(false);
        i71Var.setVerticalScrollBarEnabled(false);
        i71Var.setClipToPadding(false);
        addView(i71Var, f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        a0 a0Var = new a0(this, context);
        this.f47778x = a0Var;
        i71Var.setAdapter(a0Var);
        i71Var.setGlowColor(g6.v0(g6.A5, this.f28402a));
        i71Var.setOnItemClickListener(new bg.o(this, 21));
        i71Var.setOnScrollListener(new h00(this, 20));
        FrameLayout.LayoutParams e10 = f6.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += AndroidUtilities.statusBarHeight;
        addView(frameLayout, e10);
        K();
    }

    public int getCurrentTop() {
        i71 i71Var = this.f47776s;
        if (i71Var.getChildCount() != 0) {
            int i10 = 0;
            View childAt = i71Var.getChildAt(0);
            vk0 vk0Var = (vk0) i71Var.G(childAt);
            if (vk0Var != null) {
                int paddingTop = i71Var.getPaddingTop();
                if (vk0Var.b() == 0 && childAt.getTop() >= 0) {
                    i10 = childAt.getTop();
                }
                return paddingTop - i10;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void D(fi fiVar) {
        this.v.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f47776s.x0(0);
    }

    public final void K() {
        boolean z10;
        int i10 = 0;
        if (this.f47776s.getAdapter().h() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        this.A.setVisibility(i10);
        L();
    }

    public final void L() {
        View childAt;
        hz hzVar = this.A;
        if (hzVar.getVisibility() != 0 || (childAt = this.f47776s.getChildAt(0)) == null) {
            return;
        }
        hzVar.setTranslationY((childAt.getTop() + (hzVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public int getCurrentItemTop() {
        int i10;
        i71 i71Var = this.f47776s;
        if (i71Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = i71Var.getChildAt(0);
        vk0 vk0Var = (vk0) i71Var.G(childAt);
        int top = (childAt.getTop() - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = top;
        } else {
            i10 = 0;
        }
        vd.a aVar = this.f47774n;
        if (top >= 0 && vk0Var != null && vk0Var.b() == 0) {
            aVar.a(false, true);
        } else {
            aVar.a(true, true);
            top = i10;
        }
        this.f47775r.setTranslationY(top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f47776s.getPaddingTop();
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
                i71 i71Var = d0.this.f47776s;
                if (i71Var != null) {
                    int childCount = i71Var.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        i71Var.getChildAt(i10);
                    }
                }
            }

            @Override
            public final void a(float f9) {
            }
        };
        ArrayList<i6> arrayList = new ArrayList<>();
        arrayList.add(new i6(this.A, 4, null, null, null, null, g6.f23045c7));
        arrayList.add(new i6(this.A, 2048, null, null, null, null, g6.f23134h6));
        int i10 = g6.A5;
        i71 i71Var = this.f47776s;
        arrayList.add(new i6(i71Var, 32768, null, null, null, null, i10));
        arrayList.add(new i6(i71Var, 4096, null, null, null, null, g6.f23152i6));
        arrayList.add(new i6(i71Var, 0, new Class[]{View.class}, g6.f23183k0, null, null, g6.f23063d7));
        int i11 = g6.f23294q5;
        arrayList.add(new i6(i71Var, 0, new Class[]{c0.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new i6(i71Var, 0, new Class[]{c0.class}, new String[]{"statusTextView"}, null, null, -1, h6Var, i11));
        arrayList.add(new i6(i71Var, 0, new Class[]{c0.class}, null, g6.f23305r0, null, g6.J7));
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
        L();
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.f28403b.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(lg.a aVar) {
        ji jiVar = this.B;
        if (jiVar != null) {
            jiVar.setupBlurredBackground(aVar.c(jiVar, pg.a.a(this.f28402a), false));
        }
    }

    @Override
    public final void y(int i10, int i11) {
        int i12;
        ni niVar = this.f28403b;
        if (niVar.f31029n1.R() > AndroidUtilities.dp(20.0f)) {
            i12 = AndroidUtilities.dp(8.0f);
            niVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    niVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            niVar.setAllowNestedScroll(true);
        }
        this.f47776s.o1(0, i12 + AndroidUtilities.statusBarHeight, 0, this.f28405e);
    }

    @Override
    public final void m() {
    }

    @Override
    public final void z(float f9, int i10) {
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
    }
}
