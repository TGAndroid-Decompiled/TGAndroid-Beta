package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import t7.u;
public final class e implements KeyListener {
    public final KeyListener f44355a;
    public final u f44356b;

    public e(KeyListener keyListener) {
        u uVar = new u(19);
        this.f44355a = keyListener;
        this.f44356b = uVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f44355a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f44355a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean B;
        boolean z10;
        this.f44356b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                B = false;
            } else {
                B = qf.b.B(editable, keyEvent, true);
            }
        } else {
            B = qf.b.B(editable, keyEvent, false);
        }
        if (B) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f44355a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f44355a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f44355a.onKeyUp(view, editable, i10, keyEvent);
    }
}
