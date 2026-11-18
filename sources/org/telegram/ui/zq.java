package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class zq extends er {
    public final int f54573h2;
    public final int f54574i2;
    public final br f54575j2;

    public zq(br brVar, Context context, int i7, int i10) {
        super(context);
        this.f54575j2 = brVar;
        this.f54573h2 = i7;
        this.f54574i2 = i10;
        this.P1 = 1.0f;
        this.Q1 = new r1.g(this, er.d2);
        this.R1 = new r1.g(this, er.f47341e2);
        this.S1 = new r1.g(this, er.f47342f2);
        this.T1 = new r1.g(this, er.f47343g2);
        this.U1 = true;
        this.V1 = 1.0f;
        this.W1 = 1.0f;
        this.f47346c2 = false;
        setBackground(null);
        org.telegram.ui.ActionBar.u6.U(this, org.telegram.ui.ActionBar.n6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 6));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        br brVar = this.f54575j2;
        int length = brVar.f46283f.length;
        int i7 = this.f54573h2;
        if (i7 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && brVar.f46283f[i7].length() == 1) {
                brVar.f46283f[i7].E();
                brVar.f46283f[i7].setText("");
                return true;
            } else if (keyCode == 67 && brVar.f46283f[i7].length() == 0 && i7 > 0) {
                er[] erVarArr = brVar.f46283f;
                erVarArr[i7 - 1].setSelection(erVarArr[i7 - 1].length());
                for (int i10 = 0; i10 < i7; i10++) {
                    if (i10 == i7 - 1) {
                        brVar.f46283f[i7 - 1].requestFocus();
                    } else {
                        brVar.f46283f[i10].clearFocus();
                    }
                }
                brVar.f46283f[i7 - 1].E();
                brVar.f46283f[i7 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (brVar.f46283f[i7].getText() != null && num.equals(brVar.f46283f[i7].getText().toString())) {
                        if (i7 >= this.f54574i2 - 1) {
                            brVar.a();
                        } else {
                            brVar.f46283f[i7 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (brVar.f46283f[i7].length() > 0) {
                        brVar.f46283f[i7].E();
                    }
                    brVar.f46283f[i7].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
