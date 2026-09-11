package yg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.m30;
public final class g implements View.OnKeyListener {
    public boolean f50173a;
    public final HashSet f50174b;
    public final Runnable f50175c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f50174b = hashSet;
        this.f50175c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.f50182e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f50180b.length() != 0) {
                    z10 = false;
                }
                this.f50173a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f50173a && !arrayList.isEmpty()) {
                iVar.a((m30) i2.g.h(1, arrayList), this.f50174b, this.f50175c);
                return true;
            }
        }
        return false;
    }
}
