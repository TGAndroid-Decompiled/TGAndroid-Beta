package yg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.v30;
public final class f implements View.OnKeyListener {
    public boolean f50162a;
    public final HashSet f50163b;
    public final Runnable f50164c;
    public final h d;

    public f(h hVar, HashSet hashSet, Runnable runnable) {
        this.d = hVar;
        this.f50163b = hashSet;
        this.f50164c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        h hVar = this.d;
        ArrayList arrayList = hVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (hVar.f50169b.length() != 0) {
                    z10 = false;
                }
                this.f50162a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f50162a && !arrayList.isEmpty()) {
                hVar.a((v30) i0.a.h(1, arrayList), this.f50163b, this.f50164c);
                return true;
            }
        }
        return false;
    }
}
