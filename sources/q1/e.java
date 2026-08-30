package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class e implements KeyListener {
    public final KeyListener f42687a;
    public final cb.b f42688b;

    public e(KeyListener keyListener) {
        cb.b bVar = new cb.b(20);
        this.f42687a = keyListener;
        this.f42688b = bVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f42687a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f42687a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean v;
        boolean z4;
        this.f42688b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                v = false;
            } else {
                v = bf.b.v(editable, keyEvent, true);
            }
        } else {
            v = bf.b.v(editable, keyEvent, false);
        }
        if (v) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || this.f42687a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f42687a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f42687a.onKeyUp(view, editable, i10, keyEvent);
    }
}
