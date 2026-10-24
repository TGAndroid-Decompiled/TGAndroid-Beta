package s4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
public final class c1 extends r0.b {
    public final int d = 0;
    public final Object e;

    public c1(d1 d1Var) {
        this.e = d1Var;
    }

    @Override
    public void b(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: s4.c1.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, s0.d dVar) {
        boolean z10;
        switch (this.d) {
            case 0:
                this.f45209a.onInitializeAccessibilityNodeInfo(view, dVar.f46299a);
                d1 d1Var = (d1) this.e;
                RecyclerView recyclerView = d1Var.d;
                RecyclerView recyclerView2 = d1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().T(view, dVar);
                    return;
                }
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46299a;
                this.f45209a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                dVar.i(z4.h.class.getName());
                z4.h hVar = (z4.h) this.e;
                z4.a aVar = hVar.e;
                if (aVar != null && aVar.b() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                accessibilityNodeInfo.setScrollable(z10);
                if (hVar.canScrollHorizontally(1)) {
                    dVar.a(4096);
                }
                if (hVar.canScrollHorizontally(-1)) {
                    dVar.a(8192);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean d(View view, int i10, Bundle bundle) {
        switch (this.d) {
            case 0:
                d1 d1Var = (d1) this.e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                RecyclerView recyclerView = d1Var.d;
                RecyclerView recyclerView2 = d1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    qf.e eVar = recyclerView2.getLayoutManager().f46435b.f3610b;
                }
                return false;
            default:
                z4.h hVar = (z4.h) this.e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                if (i10 != 4096) {
                    if (i10 == 8192 && hVar.canScrollHorizontally(-1)) {
                        hVar.setCurrentItem(hVar.f51155f - 1);
                        return true;
                    }
                } else if (hVar.canScrollHorizontally(1)) {
                    hVar.setCurrentItem(hVar.f51155f + 1);
                    return true;
                }
                return false;
        }
    }

    public c1(z4.h hVar) {
        this.e = hVar;
    }
}
