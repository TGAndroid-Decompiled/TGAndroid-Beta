package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;

public final class sr extends wr {
    public final int I;
    public final int J;
    public final ur K;

    public sr(ur urVar, Context context, int i10, int i11) {
        super(context);
        this.K = urVar;
        this.I = i10;
        this.J = i11;
        this.f44174e = 1.0f;
        this.f44175f = new o1.j(this, wr.E);
        this.h = new o1.j(this, wr.F);
        this.f44176n = new o1.j(this, wr.G);
        this.f44177r = new o1.j(this, wr.H);
        this.f44178s = true;
        this.v = 1.0f;
        this.f44179w = 1.0f;
        this.D = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new p0(this, 5));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        ur urVar = this.K;
        int length = urVar.f43279f.length;
        int i10 = this.I;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() != 1) {
            return isFocused();
        }
        if (keyCode == 67 && urVar.f43279f[i10].length() == 1) {
            urVar.f43279f[i10].m();
            urVar.f43279f[i10].setText("");
            return true;
        }
        if (keyCode == 67 && urVar.f43279f[i10].length() == 0 && i10 > 0) {
            wr[] wrVarArr = urVar.f43279f;
            wrVarArr[i10 - 1].setSelection(wrVarArr[i10 - 1].length());
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 == i10 - 1) {
                    urVar.f43279f[i10 - 1].requestFocus();
                } else {
                    urVar.f43279f[i11].clearFocus();
                }
            }
            urVar.f43279f[i10 - 1].m();
            urVar.f43279f[i10 - 1].setText("");
            return true;
        }
        if (keyCode >= 7 && keyCode <= 16) {
            String string = Integer.toString(keyCode - 7);
            if (urVar.f43279f[i10].getText() != null && string.equals(urVar.f43279f[i10].getText().toString())) {
                if (i10 >= this.J - 1) {
                    urVar.a();
                } else {
                    urVar.f43279f[i10 + 1].requestFocus();
                }
                return true;
            }
            if (urVar.f43279f[i10].length() > 0) {
                urVar.f43279f[i10].m();
            }
            urVar.f43279f[i10].setText(string);
        }
        return true;
    }
}
