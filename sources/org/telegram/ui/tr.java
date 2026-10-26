package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class tr extends xr {
    public final int M;
    public final int N;
    public final vr O;

    public tr(vr vrVar, Context context, int i10, int i11) {
        super(context);
        this.O = vrVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f45839f = new o1.j(this, xr.I);
        this.h = new o1.j(this, xr.J);
        this.f45840n = new o1.j(this, xr.K);
        this.f45841r = new o1.j(this, xr.L);
        this.f45842s = true;
        this.v = 1.0f;
        this.f45843w = 1.0f;
        this.H = false;
        setBackground(null);
        org.telegram.ui.ActionBar.f7.V(this, org.telegram.ui.ActionBar.y6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 5));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        vr vrVar = this.O;
        int length = vrVar.f44897f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && vrVar.f44897f[i10].length() == 1) {
                vrVar.f44897f[i10].m();
                vrVar.f44897f[i10].setText("");
                return true;
            } else if (keyCode == 67 && vrVar.f44897f[i10].length() == 0 && i10 > 0) {
                xr[] xrVarArr = vrVar.f44897f;
                xrVarArr[i10 - 1].setSelection(xrVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        vrVar.f44897f[i10 - 1].requestFocus();
                    } else {
                        vrVar.f44897f[i11].clearFocus();
                    }
                }
                vrVar.f44897f[i10 - 1].m();
                vrVar.f44897f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (vrVar.f44897f[i10].getText() != null && num.equals(vrVar.f44897f[i10].getText().toString())) {
                        if (i10 >= this.N - 1) {
                            vrVar.a();
                        } else {
                            vrVar.f44897f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (vrVar.f44897f[i10].length() > 0) {
                        vrVar.f44897f[i10].m();
                    }
                    vrVar.f44897f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
