package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class zr extends ds {
    public final int M;
    public final int N;
    public final bs O;

    public zr(bs bsVar, Context context, int i10, int i11) {
        super(context);
        this.O = bsVar;
        this.M = i10;
        this.N = i11;
        this.f37079e = 1.0f;
        this.f37080f = new o1.k(this, ds.I);
        this.h = new o1.k(this, ds.J);
        this.f37081n = new o1.k(this, ds.K);
        this.f37082r = new o1.k(this, ds.L);
        this.f37083s = true;
        this.v = 1.0f;
        this.f37084w = 1.0f;
        this.H = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new l0(this, 5));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        bs bsVar = this.O;
        int length = bsVar.f36450f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && bsVar.f36450f[i10].length() == 1) {
                bsVar.f36450f[i10].m();
                bsVar.f36450f[i10].setText("");
                return true;
            } else if (keyCode == 67 && bsVar.f36450f[i10].length() == 0 && i10 > 0) {
                ds[] dsVarArr = bsVar.f36450f;
                dsVarArr[i10 - 1].setSelection(dsVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        bsVar.f36450f[i10 - 1].requestFocus();
                    } else {
                        bsVar.f36450f[i11].clearFocus();
                    }
                }
                bsVar.f36450f[i10 - 1].m();
                bsVar.f36450f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (bsVar.f36450f[i10].getText() != null && num.equals(bsVar.f36450f[i10].getText().toString())) {
                        if (i10 >= this.N - 1) {
                            bsVar.a();
                        } else {
                            bsVar.f36450f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (bsVar.f36450f[i10].length() > 0) {
                        bsVar.f36450f[i10].m();
                    }
                    bsVar.f36450f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
