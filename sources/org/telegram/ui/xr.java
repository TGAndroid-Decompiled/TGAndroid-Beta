package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class xr extends cs {
    public final int J;
    public final int K;
    public final zr L;

    public xr(zr zrVar, Context context, int i10, int i11) {
        super(context);
        this.L = zrVar;
        this.J = i10;
        this.K = i11;
        this.f35897e = 1.0f;
        this.f35898f = new o1.j(this, cs.F);
        this.h = new o1.j(this, cs.G);
        this.f35899n = new o1.j(this, cs.H);
        this.f35900r = new o1.j(this, cs.I);
        this.f35901s = true;
        this.v = 1.0f;
        this.f35902w = 1.0f;
        this.E = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new n0(this, 5));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        zr zrVar = this.L;
        int length = zrVar.f43982f.length;
        int i10 = this.J;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && zrVar.f43982f[i10].length() == 1) {
                zrVar.f43982f[i10].m();
                zrVar.f43982f[i10].setText("");
                return true;
            } else if (keyCode == 67 && zrVar.f43982f[i10].length() == 0 && i10 > 0) {
                cs[] csVarArr = zrVar.f43982f;
                csVarArr[i10 - 1].setSelection(csVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        zrVar.f43982f[i10 - 1].requestFocus();
                    } else {
                        zrVar.f43982f[i11].clearFocus();
                    }
                }
                zrVar.f43982f[i10 - 1].m();
                zrVar.f43982f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (zrVar.f43982f[i10].getText() != null && num.equals(zrVar.f43982f[i10].getText().toString())) {
                        if (i10 >= this.K - 1) {
                            zrVar.a();
                        } else {
                            zrVar.f43982f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (zrVar.f43982f[i10].length() > 0) {
                        zrVar.f43982f[i10].m();
                    }
                    zrVar.f43982f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
