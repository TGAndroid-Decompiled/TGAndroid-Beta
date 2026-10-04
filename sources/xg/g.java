package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.q30;
public final class g implements View.OnKeyListener {
    public boolean f49853a;
    public final HashSet f49854b;
    public final Runnable f49855c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f49854b = hashSet;
        this.f49855c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.f49862e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f49860b.length() != 0) {
                    z10 = false;
                }
                this.f49853a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f49853a && !arrayList.isEmpty()) {
                iVar.a((q30) hg.c.g(1, arrayList), this.f49854b, this.f49855c);
                return true;
            }
        }
        return false;
    }
}
