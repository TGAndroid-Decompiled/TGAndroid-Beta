package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class e implements KeyListener {
    public final KeyListener f42717a;
    public final ab.a f42718b;

    public e(KeyListener keyListener) {
        ab.a aVar = new ab.a(20);
        this.f42717a = keyListener;
        this.f42718b = aVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f42717a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f42717a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean v;
        boolean z4;
        this.f42718b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                v = false;
            } else {
                v = af.c.v(editable, keyEvent, true);
            }
        } else {
            v = af.c.v(editable, keyEvent, false);
        }
        if (v) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || this.f42717a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f42717a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f42717a.onKeyUp(view, editable, i10, keyEvent);
    }
}
