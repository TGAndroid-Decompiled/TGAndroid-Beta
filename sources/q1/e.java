package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class e implements KeyListener {
    public final KeyListener f44111a;
    public final qb.b f44112b;

    public e(KeyListener keyListener) {
        qb.b bVar = new qb.b(19);
        this.f44111a = keyListener;
        this.f44112b = bVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f44111a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f44111a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean A;
        boolean z10;
        this.f44112b.getClass();
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
        if (z10 || this.f44111a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f44111a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f44111a.onKeyUp(view, editable, i10, keyEvent);
    }
}
