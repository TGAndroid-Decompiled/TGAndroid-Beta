package zg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.x30;
public final class g implements View.OnKeyListener {
    public boolean f52870a;
    public final HashSet f52871b;
    public final Runnable f52872c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f52871b = hashSet;
        this.f52872c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f52877b.length() != 0) {
                    z10 = false;
                }
                this.f52870a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f52870a && !arrayList.isEmpty()) {
                iVar.a((x30) ic.a.g(1, arrayList), this.f52871b, this.f52872c);
                return true;
            }
        }
        return false;
    }
}
