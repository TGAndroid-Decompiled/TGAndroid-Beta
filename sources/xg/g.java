package xg;

import android.view.KeyEvent;
import android.view.View;
import hg.k0;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.m30;
public final class g implements View.OnKeyListener {
    public boolean f46064a;
    public final HashSet f46065b;
    public final Runnable f46066c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f46065b = hashSet;
        this.f46066c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f46071b.length() != 0) {
                    z10 = false;
                }
                this.f46064a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f46064a && !arrayList.isEmpty()) {
                iVar.a((m30) k0.g(1, arrayList), this.f46065b, this.f46066c);
                return true;
            }
        }
        return false;
    }
}
