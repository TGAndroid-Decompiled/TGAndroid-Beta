package s4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
public final class d1 extends r0.b {
    public final int d = 0;
    public final Object f45768e;

    public d1(e1 e1Var) {
        this.f45768e = e1Var;
    }

    @Override
    public void b(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: s4.d1.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, s0.c cVar) {
        boolean z10;
        switch (this.d) {
            case 0:
                this.f44662a.onInitializeAccessibilityNodeInfo(view, cVar.f45685a);
                e1 e1Var = (e1) this.f45768e;
                RecyclerView recyclerView = e1Var.d;
                RecyclerView recyclerView2 = e1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().T(view, cVar);
                    return;
                }
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f45685a;
                this.f44662a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                cVar.i(z4.g.class.getName());
                z4.g gVar = (z4.g) this.f45768e;
                z4.a aVar = gVar.f50737e;
                if (aVar != null && aVar.b() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                accessibilityNodeInfo.setScrollable(z10);
                if (gVar.canScrollHorizontally(1)) {
                    cVar.a(4096);
                }
                if (gVar.canScrollHorizontally(-1)) {
                    cVar.a(8192);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean d(View view, int i10, Bundle bundle) {
        switch (this.d) {
            case 0:
                e1 e1Var = (e1) this.f45768e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                RecyclerView recyclerView = e1Var.d;
                RecyclerView recyclerView2 = e1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    pf.e eVar = recyclerView2.getLayoutManager().f45842b.f1867b;
                }
                return false;
            default:
                z4.g gVar = (z4.g) this.f45768e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                if (i10 != 4096) {
                    if (i10 == 8192 && gVar.canScrollHorizontally(-1)) {
                        gVar.setCurrentItem(gVar.f50739f - 1);
                        return true;
                    }
                } else if (gVar.canScrollHorizontally(1)) {
                    gVar.setCurrentItem(gVar.f50739f + 1);
                    return true;
                }
                return false;
        }
    }

    public d1(z4.g gVar) {
        this.f45768e = gVar;
    }
}
