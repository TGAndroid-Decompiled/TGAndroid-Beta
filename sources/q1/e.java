package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import e7.v;

public final class e implements KeyListener {

    public final KeyListener f46068a;

    public final v f46069b;

    public e(KeyListener keyListener) {
        v vVar = new v(21);
        this.f46068a = keyListener;
        this.f46069b = vVar;
    }

    @Override
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f46068a.clearMetaKeyState(view, editable, i10);
    }

    @Override
    public final int getInputType() {
        return this.f46068a.getInputType();
    }

    @Override
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean zL;
        boolean z10;
        this.f46069b.getClass();
        if (i10 != 67) {
            zL = i10 != 112 ? false : xe.b.l(editable, keyEvent, true);
        } else {
            zL = xe.b.l(editable, keyEvent, false);
        }
        if (zL) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || this.f46068a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f46068a.onKeyOther(view, editable, keyEvent);
    }

    @Override
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f46068a.onKeyUp(view, editable, i10, keyEvent);
    }
}
