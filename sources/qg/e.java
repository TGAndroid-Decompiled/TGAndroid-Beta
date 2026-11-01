package qg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.s20;
public final class e implements View.OnKeyListener {
    public boolean f45542a;
    public final HashSet f45543b;
    public final Runnable f45544c;
    public final h d;

    public e(h hVar, HashSet hashSet, Runnable runnable) {
        this.d = hVar;
        this.f45543b = hashSet;
        this.f45544c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        h hVar = this.d;
        ArrayList arrayList = hVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (hVar.f45554b.length() != 0) {
                    z10 = false;
                }
                this.f45542a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f45542a && !arrayList.isEmpty()) {
                hVar.a((s20) i0.a.g(1, arrayList), this.f45543b, this.f45544c);
                return true;
            }
        }
        return false;
    }
}
