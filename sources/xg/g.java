package xg;

import android.view.KeyEvent;
import android.view.View;
import hg.k0;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.q30;
public final class g implements View.OnKeyListener {
    public boolean f49845a;
    public final HashSet f49846b;
    public final Runnable f49847c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f49846b = hashSet;
        this.f49847c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.f49854e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f49852b.length() != 0) {
                    z10 = false;
                }
                this.f49845a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f49845a && !arrayList.isEmpty()) {
                iVar.a((q30) k0.g(1, arrayList), this.f49846b, this.f49847c);
                return true;
            }
        }
        return false;
    }
}
