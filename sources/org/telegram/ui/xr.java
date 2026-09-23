package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class xr extends bs {
    public final int M;
    public final int N;
    public final zr O;

    public xr(zr zrVar, Context context, int i10, int i11) {
        super(context);
        this.O = zrVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f32168f = new o1.k(this, bs.I);
        this.h = new o1.k(this, bs.J);
        this.f32169n = new o1.k(this, bs.K);
        this.f32170r = new o1.k(this, bs.L);
        this.f32171s = true;
        this.v = 1.0f;
        this.f32172w = 1.0f;
        this.H = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new m0(this, 5));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        zr zrVar = this.O;
        int length = zrVar.f40230f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && zrVar.f40230f[i10].length() == 1) {
                zrVar.f40230f[i10].m();
                zrVar.f40230f[i10].setText("");
                return true;
            } else if (keyCode == 67 && zrVar.f40230f[i10].length() == 0 && i10 > 0) {
                bs[] bsVarArr = zrVar.f40230f;
                bsVarArr[i10 - 1].setSelection(bsVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        zrVar.f40230f[i10 - 1].requestFocus();
                    } else {
                        zrVar.f40230f[i11].clearFocus();
                    }
                }
                zrVar.f40230f[i10 - 1].m();
                zrVar.f40230f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (zrVar.f40230f[i10].getText() != null && num.equals(zrVar.f40230f[i10].getText().toString())) {
                        if (i10 >= this.N - 1) {
                            zrVar.a();
                        } else {
                            zrVar.f40230f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (zrVar.f40230f[i10].length() > 0) {
                        zrVar.f40230f[i10].m();
                    }
                    zrVar.f40230f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
