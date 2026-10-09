package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.d40;
public final class g implements View.OnKeyListener {
    public boolean f51135a;
    public final HashSet f51136b;
    public final Runnable f51137c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f51136b = hashSet;
        this.f51137c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.f51144e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f51142b.length() != 0) {
                    z10 = false;
                }
                this.f51135a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f51135a && !arrayList.isEmpty()) {
                iVar.a((d40) hg.c.g(1, arrayList), this.f51136b, this.f51137c);
                return true;
            }
        }
        return false;
    }
}
