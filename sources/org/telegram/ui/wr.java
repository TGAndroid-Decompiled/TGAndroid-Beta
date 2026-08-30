package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class wr extends bs {
    public final int J;
    public final int K;
    public final yr L;

    public wr(yr yrVar, Context context, int i10, int i11) {
        super(context);
        this.L = yrVar;
        this.J = i10;
        this.K = i11;
        this.e = 1.0f;
        this.f33020f = new o1.j(this, bs.F);
        this.h = new o1.j(this, bs.G);
        this.f33021n = new o1.j(this, bs.H);
        this.f33022r = new o1.j(this, bs.I);
        this.f33023s = true;
        this.v = 1.0f;
        this.f33024w = 1.0f;
        this.E = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new n0(this, 5));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        yr yrVar = this.L;
        int length = yrVar.f40565f.length;
        int i10 = this.J;
        if (i10 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && yrVar.f40565f[i10].length() == 1) {
                yrVar.f40565f[i10].m();
                yrVar.f40565f[i10].setText("");
                return true;
            } else if (keyCode == 67 && yrVar.f40565f[i10].length() == 0 && i10 > 0) {
                bs[] bsVarArr = yrVar.f40565f;
                bsVarArr[i10 - 1].setSelection(bsVarArr[i10 - 1].length());
                for (int i11 = 0; i11 < i10; i11++) {
                    if (i11 == i10 - 1) {
                        yrVar.f40565f[i10 - 1].requestFocus();
                    } else {
                        yrVar.f40565f[i11].clearFocus();
                    }
                }
                yrVar.f40565f[i10 - 1].m();
                yrVar.f40565f[i10 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (yrVar.f40565f[i10].getText() != null && num.equals(yrVar.f40565f[i10].getText().toString())) {
                        if (i10 >= this.K - 1) {
                            yrVar.a();
                        } else {
                            yrVar.f40565f[i10 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (yrVar.f40565f[i10].length() > 0) {
                        yrVar.f40565f[i10].m();
                    }
                    yrVar.f40565f[i10].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
