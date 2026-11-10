package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class zq extends er {
    public final int f52501b2;
    public final int f52502c2;
    public final br d2;

    public zq(br brVar, Context context, int i7, int i10) {
        super(context);
        this.d2 = brVar;
        this.f52501b2 = i7;
        this.f52502c2 = i10;
        this.J1 = 1.0f;
        this.K1 = new r1.g(this, er.X1);
        this.L1 = new r1.g(this, er.Y1);
        this.M1 = new r1.g(this, er.Z1);
        this.N1 = new r1.g(this, er.f45434a2);
        this.O1 = true;
        this.P1 = 1.0f;
        this.Q1 = 1.0f;
        this.W1 = false;
        setBackground(null);
        org.telegram.ui.ActionBar.t6.U(this, org.telegram.ui.ActionBar.m6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 6));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        br brVar = this.d2;
        int length = brVar.f44118f.length;
        int i7 = this.f52501b2;
        if (i7 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && brVar.f44118f[i7].length() == 1) {
                brVar.f44118f[i7].D();
                brVar.f44118f[i7].setText("");
                return true;
            } else if (keyCode == 67 && brVar.f44118f[i7].length() == 0 && i7 > 0) {
                er[] erVarArr = brVar.f44118f;
                erVarArr[i7 - 1].setSelection(erVarArr[i7 - 1].length());
                for (int i10 = 0; i10 < i7; i10++) {
                    if (i10 == i7 - 1) {
                        brVar.f44118f[i7 - 1].requestFocus();
                    } else {
                        brVar.f44118f[i10].clearFocus();
                    }
                }
                brVar.f44118f[i7 - 1].D();
                brVar.f44118f[i7 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (brVar.f44118f[i7].getText() != null && num.equals(brVar.f44118f[i7].getText().toString())) {
                        if (i7 >= this.f52502c2 - 1) {
                            brVar.a();
                        } else {
                            brVar.f44118f[i7 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (brVar.f44118f[i7].length() > 0) {
                        brVar.f44118f[i7].D();
                    }
                    brVar.f44118f[i7].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
