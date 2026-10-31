package rh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.w71;
public final class g8 extends LinearLayout implements us {
    public final int f46982a;
    public final w71 f46983b;
    public final f8 f46984c;
    public final FrameLayout d;
    public final ku0 e;
    public final long f46985f;

    public g8(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.p6 p6Var, ku0 ku0Var) {
        super(context);
        w71 vk0Var;
        vk0 vk0Var2;
        int i12;
        this.e = ku0Var;
        this.f46982a = i10;
        this.f46985f = j10;
        setOrientation(1);
        if (ku0Var == null) {
            vk0Var = new w71(context, null);
        } else {
            vk0Var = new vk0(context, p6Var, ku0Var);
        }
        w71 w71Var = vk0Var;
        this.f46983b = w71Var;
        f8 f8Var = new f8(context, i10, z10, j10, i11, p6Var);
        this.f46984c = f8Var;
        if (ku0Var == null) {
            vk0Var2 = null;
        } else {
            vk0Var2 = (vk0) w71Var;
        }
        f8Var.f46916g = vk0Var2;
        w71Var.setAdapter(f8Var);
        if (ku0Var == null) {
            i12 = 3;
        } else {
            i12 = -2;
        }
        View n10 = w71Var.n(i12, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d7, view, p6Var);
        if (ku0Var == null) {
            this.d = null;
            addView(n10, w7.b6.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(w7.b6.z(-1.0f), w7.b6.z(1.0f / org.telegram.messenger.i0.f16025p)));
            setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, p6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
            frameLayout.addView(n10, w7.b6.e(-1, 48, 48));
        }
        addView(w71Var, w7.b6.o(-1, -1));
    }

    public final void a(boolean z10) {
        int i10;
        f8 f8Var = this.f46984c;
        w71 w71Var = this.f46983b;
        ku0 ku0Var = this.e;
        if (ku0Var == null) {
            f8Var.i();
            w71Var.o(z10);
            return;
        }
        ArrayList arrayList = f8Var.f46917i;
        ArrayList arrayList2 = f8Var.f46917i;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            i11 |= 1 << ((a51) arrayList.get(i12)).f24305z;
        }
        View currentView = w71Var.getCurrentView();
        if (currentView instanceof e8) {
            i10 = ((e8) currentView).d;
        } else {
            i10 = 0;
        }
        f8Var.i();
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            i13 |= 1 << ((a51) arrayList2.get(i14)).f24305z;
        }
        if (i11 != i13) {
            w71Var.onTouchEvent(null);
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((a51) arrayList2.get(i15)).f24305z == i10) {
                        break;
                    }
                    i15++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            w71Var.setPosition(i15);
            w71Var.J();
            w71Var.o(false);
            ku0Var.p();
        } else if (!z10) {
            w71Var.o(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.f19734z3;
        long j10 = this.f46985f;
        if ((i10 == i12 && j10 == 0) || (i10 == zs.D3 && j10 != 0 && ((Long) objArr[0]).longValue() == j10)) {
            a(true);
        }
    }

    public tk0 getCurrentListView() {
        View currentView = this.f46983b.getCurrentView();
        if (!(currentView instanceof e8)) {
            return null;
        }
        return ((e8) currentView).f46874a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public w71 getViewPager() {
        return this.f46983b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        a(false);
        zs f7 = zs.f(this.f46982a);
        if (this.f46985f == 0) {
            i10 = zs.f19734z3;
        } else {
            i10 = zs.D3;
        }
        f7.c(this, i10);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        zs f7 = zs.f(this.f46982a);
        if (this.f46985f == 0) {
            i10 = zs.f19734z3;
        } else {
            i10 = zs.D3;
        }
        f7.n(this, i10);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(ei.r rVar) {
        View[] viewPages;
        if (rVar != null) {
            f8 f8Var = this.f46984c;
            if (f8Var.h != rVar) {
                f8Var.h = rVar;
                w71 w71Var = this.f46983b;
                rVar.c(w71Var);
                for (View view : w71Var.getViewPages()) {
                    if (view instanceof e8) {
                        rVar.b(((e8) view).f46874a);
                    }
                }
            }
        }
    }
}
