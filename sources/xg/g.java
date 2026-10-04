package xg;

import android.view.KeyEvent;
import android.view.View;
import hg.k0;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.q30;
public final class g implements View.OnKeyListener {
    public boolean f49844a;
    public final HashSet f49845b;
    public final Runnable f49846c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f49845b = hashSet;
        this.f49846c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.f49853e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f49851b.length() != 0) {
                    z10 = false;
                }
                this.f49844a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f49844a && !arrayList.isEmpty()) {
                iVar.a((q30) k0.g(1, arrayList), this.f49845b, this.f49846c);
                return true;
            }
        }
        return false;
    }
}
