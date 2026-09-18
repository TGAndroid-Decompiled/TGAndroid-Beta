package xg;

import android.view.KeyEvent;
import android.view.View;
import hg.k0;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.m30;
public final class g implements View.OnKeyListener {
    public boolean f45794a;
    public final HashSet f45795b;
    public final Runnable f45796c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f45795b = hashSet;
        this.f45796c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f45801b.length() != 0) {
                    z10 = false;
                }
                this.f45794a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f45794a && !arrayList.isEmpty()) {
                iVar.a((m30) k0.h(1, arrayList), this.f45795b, this.f45796c);
                return true;
            }
        }
        return false;
    }
}
