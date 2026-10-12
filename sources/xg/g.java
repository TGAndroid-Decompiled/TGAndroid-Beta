package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.g40;
public final class g implements View.OnKeyListener {
    public boolean f51373a;
    public final HashSet f51374b;
    public final Runnable f51375c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f51374b = hashSet;
        this.f51375c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.f51382e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f51380b.length() != 0) {
                    z10 = false;
                }
                this.f51373a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f51373a && !arrayList.isEmpty()) {
                iVar.a((g40) hg.c.h(1, arrayList), this.f51374b, this.f51375c);
                return true;
            }
        }
        return false;
    }
}
