package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.p30;
public final class g implements View.OnKeyListener {
    public boolean f46046a;
    public final HashSet f46047b;
    public final Runnable f46048c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f46047b = hashSet;
        this.f46048c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f46053b.length() != 0) {
                    z10 = false;
                }
                this.f46046a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f46046a && !arrayList.isEmpty()) {
                iVar.a((p30) hg.c.g(1, arrayList), this.f46047b, this.f46048c);
                return true;
            }
        }
        return false;
    }
}
