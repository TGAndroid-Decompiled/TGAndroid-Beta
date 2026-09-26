package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.n30;
public final class g implements View.OnKeyListener {
    public boolean f46044a;
    public final HashSet f46045b;
    public final Runnable f46046c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f46045b = hashSet;
        this.f46046c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f46051b.length() != 0) {
                    z10 = false;
                }
                this.f46044a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f46044a && !arrayList.isEmpty()) {
                iVar.a((n30) hg.c.g(1, arrayList), this.f46045b, this.f46046c);
                return true;
            }
        }
        return false;
    }
}
