package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class vq extends zq {
    public final int c2;
    public final int f50578d2;
    public final xq f50579e2;

    public vq(xq xqVar, Context context, int i3, int i10) {
        super(context);
        this.f50579e2 = xqVar;
        this.c2 = i3;
        this.f50578d2 = i10;
        this.K1 = 1.0f;
        this.L1 = new q1.g(this, zq.Y1);
        this.M1 = new q1.g(this, zq.Z1);
        this.N1 = new q1.g(this, zq.f52739a2);
        this.O1 = new q1.g(this, zq.f52740b2);
        this.P1 = true;
        this.Q1 = 1.0f;
        this.R1 = 1.0f;
        this.X1 = false;
        setBackground(null);
        org.telegram.ui.ActionBar.r6.V(this, org.telegram.ui.ActionBar.k6.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new n0(this, 6));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        xq xqVar = this.f50579e2;
        int length = xqVar.f52078f.length;
        int i3 = this.c2;
        if (i3 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && xqVar.f52078f[i3].length() == 1) {
                xqVar.f52078f[i3].D();
                xqVar.f52078f[i3].setText("");
                return true;
            } else if (keyCode == 67 && xqVar.f52078f[i3].length() == 0 && i3 > 0) {
                zq[] zqVarArr = xqVar.f52078f;
                zqVarArr[i3 - 1].setSelection(zqVarArr[i3 - 1].length());
                for (int i10 = 0; i10 < i3; i10++) {
                    if (i10 == i3 - 1) {
                        xqVar.f52078f[i3 - 1].requestFocus();
                    } else {
                        xqVar.f52078f[i10].clearFocus();
                    }
                }
                xqVar.f52078f[i3 - 1].D();
                xqVar.f52078f[i3 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (xqVar.f52078f[i3].getText() != null && num.equals(xqVar.f52078f[i3].getText().toString())) {
                        if (i3 >= this.f50578d2 - 1) {
                            xqVar.a();
                        } else {
                            xqVar.f52078f[i3 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (xqVar.f52078f[i3].length() > 0) {
                        xqVar.f52078f[i3].D();
                    }
                    xqVar.f52078f[i3].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
