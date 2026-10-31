package qg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.s20;
public final class e implements View.OnKeyListener {
    public boolean f45531a;
    public final HashSet f45532b;
    public final Runnable f45533c;
    public final h d;

    public e(h hVar, HashSet hashSet, Runnable runnable) {
        this.d = hVar;
        this.f45532b = hashSet;
        this.f45533c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        h hVar = this.d;
        ArrayList arrayList = hVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (hVar.f45543b.length() != 0) {
                    z10 = false;
                }
                this.f45531a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f45531a && !arrayList.isEmpty()) {
                hVar.a((s20) i0.a.g(1, arrayList), this.f45532b, this.f45533c);
                return true;
            }
        }
        return false;
    }
}
