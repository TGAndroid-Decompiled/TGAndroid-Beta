package yg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.z30;
public final class g implements View.OnKeyListener {
    public boolean f48760a;
    public final HashSet f48761b;
    public final Runnable f48762c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f48761b = hashSet;
        this.f48762c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f48767b.length() != 0) {
                    z10 = false;
                }
                this.f48760a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f48760a && !arrayList.isEmpty()) {
                iVar.a((z30) i2.d.h(1, arrayList), this.f48761b, this.f48762c);
                return true;
            }
        }
        return false;
    }
}
