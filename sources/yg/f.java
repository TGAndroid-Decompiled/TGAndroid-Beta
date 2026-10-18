package yg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.v30;
public final class f implements View.OnKeyListener {
    public boolean f50141a;
    public final HashSet f50142b;
    public final Runnable f50143c;
    public final h d;

    public f(h hVar, HashSet hashSet, Runnable runnable) {
        this.d = hVar;
        this.f50142b = hashSet;
        this.f50143c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        h hVar = this.d;
        ArrayList arrayList = hVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (hVar.f50148b.length() != 0) {
                    z10 = false;
                }
                this.f50141a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f50141a && !arrayList.isEmpty()) {
                hVar.a((v30) i2.d.h(1, arrayList), this.f50142b, this.f50143c);
                return true;
            }
        }
        return false;
    }
}
