package yg;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.m30;
public final class g implements View.OnKeyListener {
    public boolean f50174a;
    public final HashSet f50175b;
    public final Runnable f50176c;
    public final i d;

    public g(i iVar, HashSet hashSet, Runnable runnable) {
        this.d = iVar;
        this.f50175b = hashSet;
        this.f50176c = runnable;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        i iVar = this.d;
        ArrayList arrayList = iVar.f50183e;
        if (i10 == 67) {
            boolean z10 = true;
            if (keyEvent.getAction() == 0) {
                if (iVar.f50181b.length() != 0) {
                    z10 = false;
                }
                this.f50174a = z10;
                return false;
            } else if (keyEvent.getAction() == 1 && this.f50174a && !arrayList.isEmpty()) {
                iVar.a((m30) i2.g.h(1, arrayList), this.f50175b, this.f50176c);
                return true;
            }
        }
        return false;
    }
}
