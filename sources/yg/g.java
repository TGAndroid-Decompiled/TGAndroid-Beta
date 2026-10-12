package yg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.z30;
public final class g implements View.OnKeyListener {
    public boolean f48761a;
    public final HashSet f48762b;
    public final Runnable f48763c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f48762b = hashSet;
        this.f48763c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f48768b.length() != 0) {
                    z10 = false;
                }
                this.f48761a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f48761a && !arrayList.isEmpty()) {
                iVar.a((z30) i2.d.g(1, arrayList), this.f48762b, this.f48763c);
                return true;
            }
        }
        return false;
    }
}
