package yg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.m30;
public final class g implements View.OnKeyListener {
    public boolean f50203a;
    public final HashSet f50204b;
    public final Runnable f50205c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f50204b = hashSet;
        this.f50205c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.f50212e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f50210b.length() != 0) {
                    z10 = false;
                }
                this.f50203a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f50203a && !arrayList.isEmpty()) {
                iVar.a((m30) i2.g.h(1, arrayList), this.f50204b, this.f50205c);
                return true;
            }
        }
        return false;
    }
}
