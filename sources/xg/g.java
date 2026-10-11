package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.e40;
public final class g implements View.OnKeyListener {
    public boolean f51258a;
    public final HashSet f51259b;
    public final Runnable f51260c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f51259b = hashSet;
        this.f51260c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.f51267e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f51265b.length() != 0) {
                    z10 = false;
                }
                this.f51258a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f51258a && !arrayList.isEmpty()) {
                iVar.a((e40) hg.c.g(1, arrayList), this.f51259b, this.f51260c);
                return true;
            }
        }
        return false;
    }
}
