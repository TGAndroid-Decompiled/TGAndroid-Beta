package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import n4.s;
public final class e implements KeyListener {
    public final KeyListener f46940a;
    public final pa.d f46941b;

    public e(KeyListener keyListener) {
        ?? obj = new Object();
        this.f46940a = keyListener;
        this.f46941b = obj;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f46940a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f46940a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean f7;
        boolean z10;
        this.f46941b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                f7 = false;
            } else {
                f7 = s.f(editable, keyEvent, true);
            }
        } else {
            f7 = s.f(editable, keyEvent, false);
        }
        if (f7) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f46940a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f46940a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f46940a.onKeyUp(view, editable, i10, keyEvent);
    }
}
