package t1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
public final class e implements KeyListener {
    public final KeyListener f56954a;
    public final nb.a f56955b;

    public e(KeyListener keyListener) {
        nb.a aVar = new nb.a(25);
        this.f56954a = keyListener;
        this.f56955b = aVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f56954a.clearMetaKeyState(view, editable, i7);
    }

    @Override
    public final int getInputType() {
        return this.f56954a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        boolean s5;
        boolean z10;
        this.f56955b.getClass();
        if (i7 != 67) {
            if (i7 != 112) {
                s5 = false;
            } else {
                s5 = wf.b.s(editable, keyEvent, true);
            }
        } else {
            s5 = wf.b.s(editable, keyEvent, false);
        }
        if (s5) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f56954a.onKeyDown(view, editable, i7, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f56954a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f56954a.onKeyUp(view, editable, i7, keyEvent);
    }
}
