package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class e implements KeyListener {
    public final KeyListener f44138a;
    public final qb.b f44139b;

    public e(KeyListener keyListener) {
        qb.b bVar = new qb.b(19);
        this.f44138a = keyListener;
        this.f44139b = bVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f44138a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f44138a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean A;
        boolean z10;
        this.f44139b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                A = false;
            } else {
                A = pf.b.A(editable, keyEvent, true);
            }
        } else {
            A = pf.b.A(editable, keyEvent, false);
        }
        if (A) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f44138a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f44138a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f44138a.onKeyUp(view, editable, i10, keyEvent);
    }
}
