package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import t7.u;
public final class e implements KeyListener {
    public final KeyListener f43244a;
    public final u f43245b;

    public e(KeyListener keyListener) {
        u uVar = new u(19);
        this.f43244a = keyListener;
        this.f43245b = uVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f43244a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f43244a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean A;
        boolean z10;
        this.f43245b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                A = false;
            } else {
                A = qf.b.A(editable, keyEvent, true);
            }
        } else {
            A = qf.b.A(editable, keyEvent, false);
        }
        if (A) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f43244a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f43244a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f43244a.onKeyUp(view, editable, i10, keyEvent);
    }
}
