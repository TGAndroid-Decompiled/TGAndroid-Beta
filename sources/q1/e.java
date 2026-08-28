package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class e implements KeyListener {
    public final KeyListener f45904a;
    public final v9.d f45905b;

    public e(KeyListener keyListener) {
        v9.d dVar = new v9.d(21);
        this.f45904a = keyListener;
        this.f45905b = dVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i9) {
        this.f45904a.clearMetaKeyState(view, editable, i9);
    }

    @Override
    public final int getInputType() {
        return this.f45904a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i9, KeyEvent keyEvent) {
        boolean l10;
        boolean z10;
        this.f45905b.getClass();
        if (i9 != 67) {
            if (i9 != 112) {
                l10 = false;
            } else {
                l10 = we.b.l(editable, keyEvent, true);
            }
        } else {
            l10 = we.b.l(editable, keyEvent, false);
        }
        if (l10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f45904a.onKeyDown(view, editable, i9, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f45904a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i9, KeyEvent keyEvent) {
        return this.f45904a.onKeyUp(view, editable, i9, keyEvent);
    }
}
