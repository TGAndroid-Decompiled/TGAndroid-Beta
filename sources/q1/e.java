package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import t7.u;
public final class e implements KeyListener {
    public final KeyListener f44337a;
    public final u f44338b;

    public e(KeyListener keyListener) {
        u uVar = new u(19);
        this.f44337a = keyListener;
        this.f44338b = uVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f44337a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f44337a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean C;
        boolean z10;
        this.f44338b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                C = false;
            } else {
                C = qf.b.C(editable, keyEvent, true);
            }
        } else {
            C = qf.b.C(editable, keyEvent, false);
        }
        if (C) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f44337a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f44337a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f44337a.onKeyUp(view, editable, i10, keyEvent);
    }
}
