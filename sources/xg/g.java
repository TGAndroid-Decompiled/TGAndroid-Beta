package xg;

import android.view.KeyEvent;
import android.view.View;
import hg.k0;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.m30;
public final class g implements View.OnKeyListener {
    public boolean f45766a;
    public final HashSet f45767b;
    public final Runnable f45768c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f45767b = hashSet;
        this.f45768c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f45773b.length() != 0) {
                    z10 = false;
                }
                this.f45766a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f45766a && !arrayList.isEmpty()) {
                iVar.a((m30) k0.h(1, arrayList), this.f45767b, this.f45768c);
                return true;
            }
        }
        return false;
    }
}
