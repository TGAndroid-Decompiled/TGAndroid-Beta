package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.q30;
public final class g implements View.OnKeyListener {
    public boolean f46152a;
    public final HashSet f46153b;
    public final Runnable f46154c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f46153b = hashSet;
        this.f46154c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f46159b.length() != 0) {
                    z10 = false;
                }
                this.f46152a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f46152a && !arrayList.isEmpty()) {
                iVar.a((q30) hg.c.g(1, arrayList), this.f46153b, this.f46154c);
                return true;
            }
        }
        return false;
    }
}
