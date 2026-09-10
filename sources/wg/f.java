package wg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.w30;
public final class f implements View.OnKeyListener {
    public boolean f43992a;
    public final HashSet f43993b;
    public final Runnable f43994c;
    public final h d;

    public f(h hVar, HashSet hashSet, Runnable runnable) {
        this.d = hVar;
        this.f43993b = hashSet;
        this.f43994c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        h hVar = this.d;
        ArrayList arrayList = hVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (hVar.f43999b.length() != 0) {
                    z10 = false;
                }
                this.f43992a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f43992a && !arrayList.isEmpty()) {
                hVar.a((w30) hc.b.i(1, arrayList), this.f43993b, this.f43994c);
                return true;
            }
        }
        return false;
    }
}
