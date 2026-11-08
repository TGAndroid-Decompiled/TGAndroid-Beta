package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class wq extends br {
    public final int f51481b2;
    public final int f51482c2;
    public final yq d2;

    public wq(yq yqVar, Context context, int i7, int i10) {
        super(context);
        this.d2 = yqVar;
        this.f51481b2 = i7;
        this.f51482c2 = i10;
        this.J1 = 1.0f;
        this.K1 = new r1.g(this, br.X1);
        this.L1 = new r1.g(this, br.Y1);
        this.M1 = new r1.g(this, br.Z1);
        this.N1 = new r1.g(this, br.f44479a2);
        this.O1 = true;
        this.P1 = 1.0f;
        this.Q1 = 1.0f;
        this.W1 = false;
        setBackground(null);
        org.telegram.ui.ActionBar.r6.V(this, org.telegram.ui.ActionBar.k6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 6));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        yq yqVar = this.d2;
        int length = yqVar.f52289f.length;
        int i7 = this.f51481b2;
        if (i7 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && yqVar.f52289f[i7].length() == 1) {
                yqVar.f52289f[i7].D();
                yqVar.f52289f[i7].setText("");
                return true;
            } else if (keyCode == 67 && yqVar.f52289f[i7].length() == 0 && i7 > 0) {
                br[] brVarArr = yqVar.f52289f;
                brVarArr[i7 - 1].setSelection(brVarArr[i7 - 1].length());
                for (int i10 = 0; i10 < i7; i10++) {
                    if (i10 == i7 - 1) {
                        yqVar.f52289f[i7 - 1].requestFocus();
                    } else {
                        yqVar.f52289f[i10].clearFocus();
                    }
                }
                yqVar.f52289f[i7 - 1].D();
                yqVar.f52289f[i7 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (yqVar.f52289f[i7].getText() != null && num.equals(yqVar.f52289f[i7].getText().toString())) {
                        if (i7 >= this.f51482c2 - 1) {
                            yqVar.a();
                        } else {
                            yqVar.f52289f[i7 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (yqVar.f52289f[i7].length() > 0) {
                        yqVar.f52289f[i7].D();
                    }
                    yqVar.f52289f[i7].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
