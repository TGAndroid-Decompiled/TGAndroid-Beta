package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class wr extends as {
    public final int M;
    public final int N;
    public final yr O;

    public wr(yr yrVar, Context context, int i10, int i11) {
        super(context);
        this.O = yrVar;
        this.M = i10;
        this.N = i11;
        this.e = 1.0f;
        this.f32222f = new o1.k(this, as.I);
        this.h = new o1.k(this, as.J);
        this.f32223n = new o1.k(this, as.K);
        this.f32224r = new o1.k(this, as.L);
        this.f32225s = true;
        this.v = 1.0f;
        this.f32226w = 1.0f;
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
        yr yrVar = this.O;
        int length = yrVar.f40238f.length;
        int i10 = this.M;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && yrVar.f40238f[i10].length() == 1) {
                yrVar.f40238f[i10].m();
                yrVar.f40238f[i10].setText("");
                return true;
            } else if (keyCode == 67 && yrVar.f40238f[i10].length() == 0 && i10 > 0) {
                as[] asVarArr = yrVar.f40238f;
                asVarArr[i10 - 1].setSelection(asVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        yrVar.f40238f[i10 - 1].requestFocus();
                    } else {
                        yrVar.f40238f[i11].clearFocus();
                    }
                }
                yrVar.f40238f[i10 - 1].m();
                yrVar.f40238f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (yrVar.f40238f[i10].getText() != null && num.equals(yrVar.f40238f[i10].getText().toString())) {
                        if (i10 >= this.N - 1) {
                            yrVar.a();
                        } else {
                            yrVar.f40238f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (yrVar.f40238f[i10].length() > 0) {
                        yrVar.f40238f[i10].m();
                    }
                    yrVar.f40238f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
