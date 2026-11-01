package rh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x71;
public final class g8 extends LinearLayout implements vs {
    public final int f46996a;
    public final x71 f46997b;
    public final f8 f46998c;
    public final FrameLayout d;
    public final lu0 e;
    public final long f46999f;

    public g8(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.p6 p6Var, lu0 lu0Var) {
        super(context);
        x71 wk0Var;
        wk0 wk0Var2;
        int i12;
        this.e = lu0Var;
        this.f46996a = i10;
        this.f46999f = j10;
        setOrientation(1);
        if (lu0Var == null) {
            wk0Var = new x71(context, null);
        } else {
            wk0Var = new wk0(context, p6Var, lu0Var);
        }
        x71 x71Var = wk0Var;
        this.f46997b = x71Var;
        f8 f8Var = new f8(context, i10, z10, j10, i11, p6Var);
        this.f46998c = f8Var;
        if (lu0Var == null) {
            wk0Var2 = null;
        } else {
            wk0Var2 = (wk0) x71Var;
        }
        f8Var.f46930g = wk0Var2;
        x71Var.setAdapter(f8Var);
        if (lu0Var == null) {
            i12 = 3;
        } else {
            i12 = -2;
        }
        View n10 = x71Var.n(i12, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20931d7, view, p6Var);
        if (lu0Var == null) {
            this.d = null;
            addView(n10, w7.b6.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(w7.b6.z(-1.0f), w7.b6.z(1.0f / org.telegram.messenger.i0.f16171p)));
            setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, p6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
            frameLayout.addView(n10, w7.b6.e(-1, 48, 48));
        }
        addView(x71Var, w7.b6.o(-1, -1));
    }

    public final void a(boolean z10) {
        int i10;
        f8 f8Var = this.f46998c;
        x71 x71Var = this.f46997b;
        lu0 lu0Var = this.e;
        if (lu0Var == null) {
            f8Var.i();
            x71Var.o(z10);
            return;
        }
        ArrayList arrayList = f8Var.f46931i;
        ArrayList arrayList2 = f8Var.f46931i;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            i11 |= 1 << ((b51) arrayList.get(i12)).f24656z;
        }
        View currentView = x71Var.getCurrentView();
        if (currentView instanceof e8) {
            i10 = ((e8) currentView).d;
        } else {
            i10 = 0;
        }
        f8Var.i();
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            i13 |= 1 << ((b51) arrayList2.get(i14)).f24656z;
        }
        if (i11 != i13) {
            x71Var.onTouchEvent(null);
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((b51) arrayList2.get(i15)).f24656z == i10) {
                        break;
                    }
                    i15++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            x71Var.setPosition(i15);
            x71Var.J();
            x71Var.o(false);
            lu0Var.p();
        } else if (!z10) {
            x71Var.o(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.f14830z3;
        long j10 = this.f46999f;
        if ((i10 == i12 && j10 == 0) || (i10 == at.D3 && j10 != 0 && ((Long) objArr[0]).longValue() == j10)) {
            a(true);
        }
    }

    public uk0 getCurrentListView() {
        View currentView = this.f46997b.getCurrentView();
        if (!(currentView instanceof e8)) {
            return null;
        }
        return ((e8) currentView).f46888a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public x71 getViewPager() {
        return this.f46997b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        a(false);
        at f7 = at.f(this.f46996a);
        if (this.f46999f == 0) {
            i10 = at.f14830z3;
        } else {
            i10 = at.D3;
        }
        f7.c(this, i10);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        at f7 = at.f(this.f46996a);
        if (this.f46999f == 0) {
            i10 = at.f14830z3;
        } else {
            i10 = at.D3;
        }
        f7.n(this, i10);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(ei.r rVar) {
        View[] viewPages;
        if (rVar != null) {
            f8 f8Var = this.f46998c;
            if (f8Var.h != rVar) {
                f8Var.h = rVar;
                x71 x71Var = this.f46997b;
                rVar.c(x71Var);
                for (View view : x71Var.getViewPages()) {
                    if (view instanceof e8) {
                        rVar.b(((e8) view).f46888a);
                    }
                }
            }
        }
    }
}
