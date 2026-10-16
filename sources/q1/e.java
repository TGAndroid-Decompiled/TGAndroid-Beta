package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import t7.u;
public final class e implements KeyListener {
    public final KeyListener f42988a;
    public final u f42989b;

    public e(KeyListener keyListener) {
        u uVar = new u(19);
        this.f42988a = keyListener;
        this.f42989b = uVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f42988a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f42988a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        this.f42989b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                z10 = false;
            } else {
                z10 = qf.b.z(editable, keyEvent, true);
            }
        } else {
            z10 = qf.b.z(editable, keyEvent, false);
        }
        if (z10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || this.f42988a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f42988a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f42988a.onKeyUp(view, editable, i10, keyEvent);
    }
}
