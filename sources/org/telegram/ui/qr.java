package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
public final class qr extends vr {
    public final int I;
    public final int J;
    public final sr K;

    public qr(sr srVar, Context context, int i9, int i10) {
        super(context);
        this.K = srVar;
        this.I = i9;
        this.J = i10;
        this.f43567e = 1.0f;
        this.f43568f = new o1.j(this, vr.E);
        this.h = new o1.j(this, vr.F);
        this.f43569n = new o1.j(this, vr.G);
        this.f43570r = new o1.j(this, vr.H);
        this.f43571s = true;
        this.v = 1.0f;
        this.f43572w = 1.0f;
        this.D = false;
        setBackground(null);
        setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        setMovementMethod(null);
        addTextChangedListener(new o0(this, 5));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        sr srVar = this.K;
        int length = srVar.f42755f.length;
        int i9 = this.I;
        if (i9 >= length) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            if (keyCode == 67 && srVar.f42755f[i9].length() == 1) {
                srVar.f42755f[i9].m();
                srVar.f42755f[i9].setText("");
                return true;
            } else if (keyCode == 67 && srVar.f42755f[i9].length() == 0 && i9 > 0) {
                vr[] vrVarArr = srVar.f42755f;
                vrVarArr[i9 - 1].setSelection(vrVarArr[i9 - 1].length());
                for (int i10 = 0; i10 < i9; i10++) {
                    if (i10 == i9 - 1) {
                        srVar.f42755f[i9 - 1].requestFocus();
                    } else {
                        srVar.f42755f[i10].clearFocus();
                    }
                }
                srVar.f42755f[i9 - 1].m();
                srVar.f42755f[i9 - 1].setText("");
                return true;
            } else {
                if (keyCode >= 7 && keyCode <= 16) {
                    String num = Integer.toString(keyCode - 7);
                    if (srVar.f42755f[i9].getText() != null && num.equals(srVar.f42755f[i9].getText().toString())) {
                        if (i9 >= this.J - 1) {
                            srVar.a();
                        } else {
                            srVar.f42755f[i9 + 1].requestFocus();
                        }
                        return true;
                    }
                    if (srVar.f42755f[i9].length() > 0) {
                        srVar.f42755f[i9].m();
                    }
                    srVar.f42755f[i9].setText(num);
                }
                return true;
            }
        }
        return isFocused();
    }
}
