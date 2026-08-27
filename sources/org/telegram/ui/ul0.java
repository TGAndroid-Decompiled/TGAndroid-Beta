package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import j$.util.Objects;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class ul0 implements TextWatcher {

    public final int f43248a;

    public final Object f43249b;

    public String f43250c;
    public final Object d;

    public ul0(xm0 xm0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.f43248a = i10;
        this.d = xm0Var;
        this.f43249b = editTextBoldCursor;
        this.f43250c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long j10;
        int i10;
        switch (this.f43248a) {
            case 0:
                xm0.J0((xm0) this.d, (EditTextBoldCursor) this.f43249b, this.f43250c, editable, false);
                break;
            case 1:
                xm0.J0((xm0) this.d, (EditTextBoldCursor) this.f43249b, this.f43250c, editable, false);
                break;
            default:
                yf.w wVar = (yf.w) this.d;
                yf.x xVar = wVar.f50108f;
                EditTextBoldCursor editTextBoldCursor = wVar.d;
                if (!wVar.f50107e && this.f43250c != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(this.f43250c.toString(), editable.toString())) {
                    String string = editable.toString();
                    if (string.length() <= 8) {
                        if (((Pattern) this.f43249b).matcher(editable).find()) {
                            int length = string.length();
                            if (length != 3) {
                                if (length == 6) {
                                    i10 = ((int) Long.parseLong(string, 16)) - 16777216;
                                } else if (length != 8) {
                                    i10 = xVar.f50115f;
                                } else {
                                    j10 = Long.parseLong(string, 16);
                                }
                                if (i10 == xVar.f50115f) {
                                    xVar.m(i10, 5);
                                    break;
                                }
                            } else {
                                j10 = Long.parseLong("FF" + string.charAt(0) + string.charAt(0) + string.charAt(1) + string.charAt(1) + string.charAt(2) + string.charAt(2), 16);
                            }
                            i10 = (int) j10;
                            if (i10 == xVar.f50115f) {
                                xVar.m(i10, 5);
                                break;
                            }
                        }
                    } else {
                        editTextBoldCursor.setText(string.substring(2, 8).toUpperCase());
                        editTextBoldCursor.setSelection(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f43248a) {
            case 0:
            case 1:
                break;
            default:
                this.f43250c = charSequence.toString();
                break;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f43248a;
    }

    public ul0(yf.w wVar) {
        this.f43248a = 2;
        this.d = wVar;
        this.f43249b = Pattern.compile("^[0-9a-fA-F]*$");
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
