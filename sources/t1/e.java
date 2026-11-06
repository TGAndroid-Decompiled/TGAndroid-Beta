package t1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class e implements KeyListener {
    public final KeyListener f55269a;
    public final qb.a f55270b;

    public e(KeyListener keyListener) {
        qb.a aVar = new qb.a(24);
        this.f55269a = keyListener;
        this.f55270b = aVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f55269a.clearMetaKeyState(view, editable, i7);
    }

    @Override
    public final int getInputType() {
        return this.f55269a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        boolean E;
        boolean z9;
        this.f55270b.getClass();
        if (i7 != 67) {
            if (i7 != 112) {
                E = false;
            } else {
                E = wf.b.E(editable, keyEvent, true);
            }
        } else {
            E = wf.b.E(editable, keyEvent, false);
        }
        if (E) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 || this.f55269a.onKeyDown(view, editable, i7, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f55269a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f55269a.onKeyUp(view, editable, i7, keyEvent);
    }
}
