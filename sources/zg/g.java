package zg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.x30;
public final class g implements View.OnKeyListener {
    public boolean f52928a;
    public final HashSet f52929b;
    public final Runnable f52930c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f52929b = hashSet;
        this.f52930c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f52935b.length() != 0) {
                    z10 = false;
                }
                this.f52928a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f52928a && !arrayList.isEmpty()) {
                iVar.a((x30) ic.a.g(1, arrayList), this.f52929b, this.f52930c);
                return true;
            }
        }
        return false;
    }
}
