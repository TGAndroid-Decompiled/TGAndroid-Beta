package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.n30;
public final class g implements View.OnKeyListener {
    public boolean f46030a;
    public final HashSet f46031b;
    public final Runnable f46032c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f46031b = hashSet;
        this.f46032c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f46037b.length() != 0) {
                    z10 = false;
                }
                this.f46030a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f46030a && !arrayList.isEmpty()) {
                iVar.a((n30) hg.c.g(1, arrayList), this.f46031b, this.f46032c);
                return true;
            }
        }
        return false;
    }
}
