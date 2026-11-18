package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wb0 extends org.telegram.ui.Components.fu0 {
    public final de0 E;
    public final EditTextBoldCursor f53049a;
    public final TextView f53050b;
    public final TextView f53051c;
    public final TextView d;
    public final org.telegram.ui.Components.ph0 f53052e;
    public Bundle f53053f;
    public boolean h;
    public TL_account.Password f53054n;
    public String f53055r;
    public String f53056s;
    public String f53057w;
    public String f53058x;
    public final org.telegram.ui.Components.xb0 f53059y;

    public wb0(org.telegram.ui.de0 r22, android.content.Context r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wb0.<init>(org.telegram.ui.de0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.E.C1(true, true);
        this.f53053f = null;
        return true;
    }

    @Override
    public final void d() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.gd.M0(2131748534, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.h && this.f53054n != null) {
            String obj = this.f53049a.getText().toString();
            if (obj.length() == 0) {
                de0 de0Var = this.E;
                if (de0Var.getParentActivity() == null) {
                    return;
                }
                de0.c1(de0Var, this.f53059y, true);
                return;
            }
            this.h = true;
            this.E.F1(0, true);
            Utilities.f22782e.c(new n60(17, this, obj));
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.h3(new lz(this, 22), de0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f53053f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f53049a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f53049a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f53053f;
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
        EditTextBoldCursor editTextBoldCursor = this.f53049a;
        if (isEmpty) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f53053f = bundle;
        String string = bundle.getString("password");
        this.f53055r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f53054n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f53056s = bundle.getString("phoneFormated");
        this.f53057w = bundle.getString("phoneHash");
        this.f53058x = bundle.getString("code");
        TL_account.Password password = this.f53054n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f53054n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.f53050b.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.D6, false));
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.f53049a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.H6, false));
        this.f53051c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29636q6, false));
        this.f53059y.f();
    }
}
