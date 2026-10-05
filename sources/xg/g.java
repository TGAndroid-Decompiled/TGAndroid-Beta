package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.q30;
public final class g implements View.OnKeyListener {
    public boolean f49860a;
    public final HashSet f49861b;
    public final Runnable f49862c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f49861b = hashSet;
        this.f49862c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.f49869e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f49867b.length() != 0) {
                    z10 = false;
                }
                this.f49860a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f49860a && !arrayList.isEmpty()) {
                iVar.a((q30) hg.c.g(1, arrayList), this.f49861b, this.f49862c);
                return true;
            }
        }
        return false;
    }
}
