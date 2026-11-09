package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class yq extends dr {
    public final int f52157b2;
    public final int f52158c2;
    public final ar d2;

    public yq(ar arVar, Context context, int i7, int i10) {
        super(context);
        this.d2 = arVar;
        this.f52157b2 = i7;
        this.f52158c2 = i10;
        this.J1 = 1.0f;
        this.K1 = new r1.g(this, dr.X1);
        this.L1 = new r1.g(this, dr.Y1);
        this.M1 = new r1.g(this, dr.Z1);
        this.N1 = new r1.g(this, dr.f45106a2);
        this.O1 = true;
        this.P1 = 1.0f;
        this.Q1 = 1.0f;
        this.W1 = false;
        setBackground(null);
        org.telegram.ui.ActionBar.s6.U(this, org.telegram.ui.ActionBar.l6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 6));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        ar arVar = this.d2;
        int length = arVar.f43768f.length;
        int i7 = this.f52157b2;
        if (i7 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && arVar.f43768f[i7].length() == 1) {
                arVar.f43768f[i7].D();
                arVar.f43768f[i7].setText("");
                return true;
            } else if (keyCode == 67 && arVar.f43768f[i7].length() == 0 && i7 > 0) {
                dr[] drVarArr = arVar.f43768f;
                drVarArr[i7 - 1].setSelection(drVarArr[i7 - 1].length());
                for (int i10 = 0; i10 < i7; i10++) {
                    if (i10 == i7 - 1) {
                        arVar.f43768f[i7 - 1].requestFocus();
                    } else {
                        arVar.f43768f[i10].clearFocus();
                    }
                }
                arVar.f43768f[i7 - 1].D();
                arVar.f43768f[i7 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (arVar.f43768f[i7].getText() != null && num.equals(arVar.f43768f[i7].getText().toString())) {
                        if (i7 >= this.f52158c2 - 1) {
                            arVar.a();
                        } else {
                            arVar.f43768f[i7 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (arVar.f43768f[i7].length() > 0) {
                        arVar.f43768f[i7].D();
                    }
                    arVar.f43768f[i7].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
