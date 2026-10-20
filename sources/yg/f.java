package yg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.v30;
public final class f implements View.OnKeyListener {
    public boolean f50147a;
    public final HashSet f50148b;
    public final Runnable f50149c;
    public final h d;

    public f(h hVar, HashSet hashSet, Runnable runnable) {
        this.d = hVar;
        this.f50148b = hashSet;
        this.f50149c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        h hVar = this.d;
        ArrayList arrayList = hVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (hVar.f50154b.length() != 0) {
                    z10 = false;
                }
                this.f50147a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f50147a && !arrayList.isEmpty()) {
                hVar.a((v30) i2.e.h(1, arrayList), this.f50148b, this.f50149c);
                return true;
            }
        }
        return false;
    }
}
