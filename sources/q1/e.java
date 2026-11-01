package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class e implements KeyListener {
    public final KeyListener f45411a;
    public final oa.d f45412b;

    public e(KeyListener keyListener) {
        oa.d dVar = new oa.d(17);
        this.f45411a = keyListener;
        this.f45412b = dVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f45411a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f45411a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean O;
        boolean z10;
        this.f45412b.getClass();
        if (i10 != 67) {
            if (i10 != 112) {
                O = false;
            } else {
                O = hf.b.O(editable, keyEvent, true);
            }
        } else {
            O = hf.b.O(editable, keyEvent, false);
        }
        if (O) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f45411a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f45411a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f45411a.onKeyUp(view, editable, i10, keyEvent);
    }
}
