package xg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.m30;
public final class g implements View.OnKeyListener {
    public boolean f45762a;
    public final HashSet f45763b;
    public final Runnable f45764c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f45763b = hashSet;
        this.f45764c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f45769b.length() != 0) {
                    z10 = false;
                }
                this.f45762a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f45762a && !arrayList.isEmpty()) {
                iVar.a((m30) hg.c.h(1, arrayList), this.f45763b, this.f45764c);
                return true;
            }
        }
        return false;
    }
}
