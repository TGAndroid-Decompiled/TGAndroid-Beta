package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xb0 extends org.telegram.ui.Components.iu0 {
    public final de0 E;
    public final EditTextBoldCursor f53733a;
    public final TextView f53734b;
    public final TextView f53735c;
    public final TextView d;
    public final org.telegram.ui.Components.rh0 f53736e;
    public Bundle f53737f;
    public boolean h;
    public TL_account.Password f53738n;
    public String f53739r;
    public String f53740s;
    public String f53741w;
    public String f53742x;
    public final org.telegram.ui.Components.yb0 f53743y;

    public xb0(org.telegram.ui.de0 r22, android.content.Context r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xb0.<init>(org.telegram.ui.de0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.E.C1(true, true);
        this.f53737f = null;
        return true;
    }

    @Override
    public final void d() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.hd.N0(2131748533, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.h && this.f53738n != null) {
            String obj = this.f53733a.getText().toString();
            if (obj.length() == 0) {
                de0 de0Var = this.E;
                if (de0Var.getParentActivity() == null) {
                    return;
                }
                de0.c1(de0Var, this.f53743y, true);
                return;
            }
            this.h = true;
            this.E.F1(0, true);
            Utilities.f22774e.c(new o60(17, this, obj));
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.h3(new lz(this, 22), de0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f53737f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f53733a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f53733a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f53737f;
        if (bundle2 != null) {
            bundle.putBundle("passview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        boolean isEmpty = bundle.isEmpty();
        EditTextBoldCursor editTextBoldCursor = this.f53733a;
        if (isEmpty) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f53737f = bundle;
        String string = bundle.getString("password");
        this.f53739r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f53738n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f53740s = bundle.getString("phoneFormated");
        this.f53741w = bundle.getString("phoneHash");
        this.f53742x = bundle.getString("code");
        TL_account.Password password = this.f53738n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f53738n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.f53734b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.D6, false));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.f53733a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.H6, false));
        this.f53735c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29587q6, false));
        this.f53743y.f();
    }
}
