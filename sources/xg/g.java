package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.g40;
public final class g implements View.OnKeyListener {
    public boolean f51365a;
    public final HashSet f51366b;
    public final Runnable f51367c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f51366b = hashSet;
        this.f51367c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.f51374e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f51372b.length() != 0) {
                    z10 = false;
                }
                this.f51365a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f51365a && !arrayList.isEmpty()) {
                iVar.a((g40) hg.c.h(1, arrayList), this.f51366b, this.f51367c);
                return true;
            }
        }
        return false;
    }
}
