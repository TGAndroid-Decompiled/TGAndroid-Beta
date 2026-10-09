package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.d40;
public final class g implements View.OnKeyListener {
    public boolean f51137a;
    public final HashSet f51138b;
    public final Runnable f51139c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f51138b = hashSet;
        this.f51139c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.f51146e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f51144b.length() != 0) {
                    z10 = false;
                }
                this.f51137a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f51137a && !arrayList.isEmpty()) {
                iVar.a((d40) hg.c.g(1, arrayList), this.f51138b, this.f51139c);
                return true;
            }
        }
        return false;
    }
}
