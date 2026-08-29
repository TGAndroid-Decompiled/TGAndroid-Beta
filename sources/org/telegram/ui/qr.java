package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class qr extends ur {
    public final int I;
    public final int J;
    public final sr K;

    public qr(sr srVar, Context context, int i10, int i11) {
        super(context);
        this.K = srVar;
        this.I = i10;
        this.J = i11;
        this.f43319e = 1.0f;
        this.f43320f = new o1.k(this, ur.E);
        this.h = new o1.k(this, ur.F);
        this.f43321n = new o1.k(this, ur.G);
        this.f43322r = new o1.k(this, ur.H);
        this.f43323s = true;
        this.v = 1.0f;
        this.f43324w = 1.0f;
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
        sr srVar = this.K;
        int length = srVar.f42455f.length;
        int i10 = this.I;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && srVar.f42455f[i10].length() == 1) {
                srVar.f42455f[i10].m();
                srVar.f42455f[i10].setText("");
                return true;
            } else if (keyCode == 67 && srVar.f42455f[i10].length() == 0 && i10 > 0) {
                ur[] urVarArr = srVar.f42455f;
                urVarArr[i10 - 1].setSelection(urVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        srVar.f42455f[i10 - 1].requestFocus();
                    } else {
                        srVar.f42455f[i11].clearFocus();
                    }
                }
                srVar.f42455f[i10 - 1].m();
                srVar.f42455f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (srVar.f42455f[i10].getText() != null && num.equals(srVar.f42455f[i10].getText().toString())) {
                        if (i10 >= this.J - 1) {
                            srVar.a();
                        } else {
                            srVar.f42455f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (srVar.f42455f[i10].length() > 0) {
                        srVar.f42455f[i10].m();
                    }
                    srVar.f42455f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
