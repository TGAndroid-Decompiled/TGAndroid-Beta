package rh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wk0;
public final class f8 extends p71 {
    public final Context f46926a;
    public final int f46927b;
    public final boolean f46928c;
    public final int d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final long f46929f;
    public wk0 f46930g;
    public ei.r h;
    public final ArrayList f46931i = new ArrayList();

    public f8(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f46926a = context;
        this.f46927b = i10;
        this.f46928c = z10;
        this.d = i11;
        this.e = p6Var;
        this.f46929f = j10;
        i();
    }

    @Override
    public final void b(View view, int i10, int i11) {
        wk0 wk0Var = this.f46930g;
        if (wk0Var != null) {
            wk0Var.L(view);
        }
    }

    @Override
    public final View d(int i10) {
        e8 e8Var = new e8(this.f46926a, this.f46928c, this.f46929f, i10, this.f46927b, this.d, this.e);
        if (this.f46930g != null) {
            e8Var.setClipChildren(false);
            e8Var.setClipToPadding(false);
            v51 v51Var = e8Var.f46888a;
            v51Var.setClipToPadding(false);
            v51Var.s1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), false);
            v51Var.f31183f3.f29638r = false;
            v51Var.setCaptureSectionsDecoratorAllowed(true);
            v51Var.setOverScrollMode(0);
            ei.r rVar = this.h;
            if (rVar != null) {
                rVar.b(v51Var);
            }
        }
        return e8Var;
    }

    @Override
    public final int e() {
        return this.f46931i.size();
    }

    @Override
    public final CharSequence g(int i10) {
        int h = h(i10);
        if (h != 0) {
            if (h != 1) {
                if (h != 2) {
                    return "";
                }
                return dd.L0(2131744936, null);
            }
            return dd.L0(2131744937, null);
        }
        return dd.L0(2131744938, null);
    }

    @Override
    public final int h(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f46931i;
            if (i10 < arrayList.size()) {
                return ((b51) arrayList.get(i10)).f24656z;
            }
            return 0;
        }
        return 0;
    }

    public final void i() {
        ArrayList arrayList = this.f46931i;
        arrayList.clear();
        long j10 = this.f46929f;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f46927b;
        if (i10 == 0) {
            e6 y3 = e6.y(i11, this.f46928c);
            arrayList.add(b51.D(0));
            if (y3.N(1)) {
                arrayList.add(b51.D(1));
            }
            if (y3.N(2)) {
                arrayList.add(b51.D(2));
                return;
            }
            return;
        }
        r g10 = r.g(i11);
        arrayList.add(b51.D(0));
        if (!g10.k(j10).f47345a[1].isEmpty()) {
            arrayList.add(b51.D(1));
        }
        if (!g10.k(j10).f47345a[2].isEmpty()) {
            arrayList.add(b51.D(2));
        }
    }
}
