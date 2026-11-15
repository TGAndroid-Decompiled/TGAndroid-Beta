package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class yq extends dr {
    public final int f53578h2;
    public final int f53579i2;
    public final ar f53580j2;

    public yq(ar arVar, Context context, int i7, int i10) {
        super(context);
        this.f53580j2 = arVar;
        this.f53578h2 = i7;
        this.f53579i2 = i10;
        this.P1 = 1.0f;
        this.Q1 = new r1.g(this, dr.d2);
        this.R1 = new r1.g(this, dr.f46442e2);
        this.S1 = new r1.g(this, dr.f46443f2);
        this.T1 = new r1.g(this, dr.f46444g2);
        this.U1 = true;
        this.V1 = 1.0f;
        this.W1 = 1.0f;
        this.f46447c2 = false;
        setBackground(null);
        org.telegram.ui.ActionBar.q6.U(this, org.telegram.ui.ActionBar.j6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 6));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        ar arVar = this.f53580j2;
        int length = arVar.f45485f.length;
        int i7 = this.f53578h2;
        if (i7 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && arVar.f45485f[i7].length() == 1) {
                arVar.f45485f[i7].E();
                arVar.f45485f[i7].setText("");
                return true;
            } else if (keyCode == 67 && arVar.f45485f[i7].length() == 0 && i7 > 0) {
                dr[] drVarArr = arVar.f45485f;
                drVarArr[i7 - 1].setSelection(drVarArr[i7 - 1].length());
                for (int i10 = 0; i10 < i7; i10++) {
                    if (i10 == i7 - 1) {
                        arVar.f45485f[i7 - 1].requestFocus();
                    } else {
                        arVar.f45485f[i10].clearFocus();
                    }
                }
                arVar.f45485f[i7 - 1].E();
                arVar.f45485f[i7 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (arVar.f45485f[i7].getText() != null && num.equals(arVar.f45485f[i7].getText().toString())) {
                        if (i7 >= this.f53579i2 - 1) {
                            arVar.a();
                        } else {
                            arVar.f45485f[i7 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (arVar.f45485f[i7].length() > 0) {
                        arVar.f45485f[i7].E();
                    }
                    arVar.f45485f[i7].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
