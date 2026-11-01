package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class xr extends bs {
    public final int f43449b2;
    public final int f43450c2;
    public final zr f43451d2;

    public xr(zr zrVar, Context context, int i10, int i11) {
        super(context);
        this.f43451d2 = zrVar;
        this.f43449b2 = i10;
        this.f43450c2 = i11;
        this.J1 = 1.0f;
        this.K1 = new o1.j(this, bs.X1);
        this.L1 = new o1.j(this, bs.Y1);
        this.M1 = new o1.j(this, bs.Z1);
        this.N1 = new o1.j(this, bs.a2);
        this.O1 = true;
        this.P1 = 1.0f;
        this.Q1 = 1.0f;
        this.W1 = false;
        setBackground(null);
        org.telegram.ui.ActionBar.a7.V(this, org.telegram.ui.ActionBar.t6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new n0(this, 6));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        zr zrVar = this.f43451d2;
        int length = zrVar.f44045f.length;
        int i10 = this.f43449b2;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && zrVar.f44045f[i10].length() == 1) {
                zrVar.f44045f[i10].D();
                zrVar.f44045f[i10].setText("");
                return true;
            } else if (keyCode == 67 && zrVar.f44045f[i10].length() == 0 && i10 > 0) {
                bs[] bsVarArr = zrVar.f44045f;
                bsVarArr[i10 - 1].setSelection(bsVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        zrVar.f44045f[i10 - 1].requestFocus();
                    } else {
                        zrVar.f44045f[i11].clearFocus();
                    }
                }
                zrVar.f44045f[i10 - 1].D();
                zrVar.f44045f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (zrVar.f44045f[i10].getText() != null && num.equals(zrVar.f44045f[i10].getText().toString())) {
                        if (i10 >= this.f43450c2 - 1) {
                            zrVar.a();
                        } else {
                            zrVar.f44045f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (zrVar.f44045f[i10].length() > 0) {
                        zrVar.f44045f[i10].D();
                    }
                    zrVar.f44045f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
