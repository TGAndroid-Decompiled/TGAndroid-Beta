package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class e implements KeyListener {
    public final KeyListener f44428a;
    public final cb.b f44429b;

    public e(KeyListener keyListener) {
        cb.b bVar = new cb.b(20);
        this.f44428a = keyListener;
        this.f44429b = bVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f44428a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f44428a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean u10;
        boolean z4;
        this.f44429b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                u10 = false;
            } else {
                u10 = bf.b.u(editable, keyEvent, true);
            }
        } else {
            u10 = bf.b.u(editable, keyEvent, false);
        }
        if (u10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || this.f44428a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f44428a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f44428a.onKeyUp(view, editable, i10, keyEvent);
    }
}
