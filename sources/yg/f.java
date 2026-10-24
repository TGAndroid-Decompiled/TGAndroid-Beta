package yg;

import android.view.KeyEvent;
import android.view.View;
import i2.o1;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.t30;
public final class f implements View.OnKeyListener {
    public boolean f50589a;
    public final HashSet f50590b;
    public final Runnable f50591c;
    public final h d;

    public f(h hVar, HashSet hashSet, Runnable runnable) {
        this.d = hVar;
        this.f50590b = hashSet;
        this.f50591c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        h hVar = this.d;
        ArrayList arrayList = hVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (hVar.f50596b.length() != 0) {
                    z10 = false;
                }
                this.f50589a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f50589a && !arrayList.isEmpty()) {
                hVar.a((t30) o1.i(1, arrayList), this.f50590b, this.f50591c);
                return true;
            }
        }
        return false;
    }
}
