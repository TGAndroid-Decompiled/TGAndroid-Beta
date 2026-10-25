package zg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.x30;
public final class g implements View.OnKeyListener {
    public boolean f52867a;
    public final HashSet f52868b;
    public final Runnable f52869c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f52868b = hashSet;
        this.f52869c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f52874b.length() != 0) {
                    z10 = false;
                }
                this.f52867a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f52867a && !arrayList.isEmpty()) {
                iVar.a((x30) ic.a.g(1, arrayList), this.f52868b, this.f52869c);
                return true;
            }
        }
        return false;
    }
}
