package rh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.vk0;
public final class f8 extends o71 {
    public final Context f46912a;
    public final int f46913b;
    public final boolean f46914c;
    public final int d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final long f46915f;
    public vk0 f46916g;
    public ei.r h;
    public final ArrayList f46917i = new ArrayList();

    public f8(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f46912a = context;
        this.f46913b = i10;
        this.f46914c = z10;
        this.d = i11;
        this.e = p6Var;
        this.f46915f = j10;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        vk0 vk0Var = this.f46916g;
        if (vk0Var != null) {
            vk0Var.L(view);
        }
    }

    @Override
    public final View d(int i10) {
        e8 e8Var = new e8(this.f46912a, this.f46914c, this.f46915f, i10, this.f46913b, this.d, this.e);
        if (this.f46916g != null) {
            e8Var.setClipChildren(false);
            e8Var.setClipToPadding(false);
            u51 u51Var = e8Var.f46874a;
            u51Var.setClipToPadding(false);
            u51Var.s1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), false);
            u51Var.f30819f3.f29295r = false;
            u51Var.setCaptureSectionsDecoratorAllowed(true);
            u51Var.setOverScrollMode(0);
            ei.r rVar = this.h;
            if (rVar != null) {
                rVar.b(u51Var);
            }
        }
        return e8Var;
    }

    @Override
    public final int e() {
        return this.f46917i.size();
    }

    @Override
    public final CharSequence g(int i10) {
        int h = h(i10);
        if (h != 0) {
            if (h != 1) {
                if (h != 2) {
                    return "";
                }
                return cd.L0(2131744936, null);
            }
            return cd.L0(2131744937, null);
        }
        return cd.L0(2131744938, null);
    }

    @Override
    public final int h(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f46917i;
            if (i10 < arrayList.size()) {
                return ((a51) arrayList.get(i10)).f24305z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f46917i;
        arrayList.clear();
        long j10 = this.f46915f;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f46913b;
        if (i10 == 0) {
            e6 y3 = e6.y(i11, this.f46914c);
            arrayList.add(a51.D(0));
            if (y3.N(1)) {
                arrayList.add(a51.D(1));
            }
            if (y3.N(2)) {
                arrayList.add(a51.D(2));
                return;
            }
            return;
        }
        r g10 = r.g(i11);
        arrayList.add(a51.D(0));
        if (!g10.k(j10).f47331a[1].isEmpty()) {
            arrayList.add(a51.D(1));
        }
        if (!g10.k(j10).f47331a[2].isEmpty()) {
            arrayList.add(a51.D(2));
        }
    }
}
