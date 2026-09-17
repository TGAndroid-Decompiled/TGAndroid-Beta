package xg;

import android.view.KeyEvent;
import android.view.View;
import hg.k0;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.m30;
public final class g implements View.OnKeyListener {
    public boolean f45789a;
    public final HashSet f45790b;
    public final Runnable f45791c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f45790b = hashSet;
        this.f45791c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f45796b.length() != 0) {
                    z10 = false;
                }
                this.f45789a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f45789a && !arrayList.isEmpty()) {
                iVar.a((m30) k0.h(1, arrayList), this.f45790b, this.f45791c);
                return true;
            }
        }
        return false;
    }
}
