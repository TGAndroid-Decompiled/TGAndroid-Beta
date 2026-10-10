package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.e40;
public final class g implements View.OnKeyListener {
    public boolean f51181a;
    public final HashSet f51182b;
    public final Runnable f51183c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f51182b = hashSet;
        this.f51183c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.f51190e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f51188b.length() != 0) {
                    z10 = false;
                }
                this.f51181a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f51181a && !arrayList.isEmpty()) {
                iVar.a((e40) hg.c.g(1, arrayList), this.f51182b, this.f51183c);
                return true;
            }
        }
        return false;
    }
}
