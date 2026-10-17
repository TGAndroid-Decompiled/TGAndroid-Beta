package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class qr extends vr {
    public final int M;
    public final int N;
    public final sr O;

    public qr(sr srVar, Context context, int i10, int i11) {
        super(context);
        this.O = srVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f42258f = new o1.k(this, vr.I);
        this.h = new o1.k(this, vr.J);
        this.f42259n = new o1.k(this, vr.K);
        this.f42260r = new o1.k(this, vr.L);
        this.f42261s = true;
        this.v = 1.0f;
        this.f42262w = 1.0f;
        this.H = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new o0(this, 5));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        sr srVar = this.O;
        int length = srVar.f41486f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && srVar.f41486f[i10].length() == 1) {
                srVar.f41486f[i10].m();
                srVar.f41486f[i10].setText("");
                return true;
            } else if (keyCode == 67 && srVar.f41486f[i10].length() == 0 && i10 > 0) {
                vr[] vrVarArr = srVar.f41486f;
                vrVarArr[i10 - 1].setSelection(vrVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        srVar.f41486f[i10 - 1].requestFocus();
                    } else {
                        srVar.f41486f[i11].clearFocus();
                    }
                }
                srVar.f41486f[i10 - 1].m();
                srVar.f41486f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (srVar.f41486f[i10].getText() != null && num.equals(srVar.f41486f[i10].getText().toString())) {
                        if (i10 >= this.N - 1) {
                            srVar.a();
                        } else {
                            srVar.f41486f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (srVar.f41486f[i10].length() > 0) {
                        srVar.f41486f[i10].m();
                    }
                    srVar.f41486f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
