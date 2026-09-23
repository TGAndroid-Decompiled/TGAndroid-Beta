package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.n30;
public final class g implements View.OnKeyListener {
    public boolean f45716a;
    public final HashSet f45717b;
    public final Runnable f45718c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f45717b = hashSet;
        this.f45718c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f45723b.length() != 0) {
                    z10 = false;
                }
                this.f45716a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f45716a && !arrayList.isEmpty()) {
                iVar.a((n30) hg.c.h(1, arrayList), this.f45717b, this.f45718c);
                return true;
            }
        }
        return false;
    }
}
