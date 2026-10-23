package yg;

import android.view.KeyEvent;
import android.view.View;
import i2.o1;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.v30;
public final class f implements View.OnKeyListener {
    public boolean f50590a;
    public final HashSet f50591b;
    public final Runnable f50592c;
    public final h d;

    public f(h hVar, HashSet hashSet, Runnable runnable) {
        this.d = hVar;
        this.f50591b = hashSet;
        this.f50592c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        h hVar = this.d;
        ArrayList arrayList = hVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (hVar.f50597b.length() != 0) {
                    z10 = false;
                }
                this.f50590a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f50590a && !arrayList.isEmpty()) {
                hVar.a((v30) o1.i(1, arrayList), this.f50591b, this.f50592c);
                return true;
            }
        }
        return false;
    }
}
