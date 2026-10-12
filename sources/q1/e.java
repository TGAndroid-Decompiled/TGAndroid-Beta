package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import n4.y;
public final class e implements KeyListener {
    public final KeyListener f45854a;
    public final qb.b f45855b;

    public e(KeyListener keyListener) {
        qb.b bVar = new qb.b(19);
        this.f45854a = keyListener;
        this.f45855b = bVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f45854a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f45854a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean h;
        boolean z10;
        this.f45855b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                h = false;
            } else {
                h = y.h(editable, keyEvent, true);
            }
        } else {
            h = y.h(editable, keyEvent, false);
        }
        if (h) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f45854a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f45854a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f45854a.onKeyUp(view, editable, i10, keyEvent);
    }
}
