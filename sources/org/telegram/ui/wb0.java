package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wb0 extends org.telegram.ui.Components.hu0 {
    public final de0 E;
    public final EditTextBoldCursor f53278a;
    public final TextView f53279b;
    public final TextView f53280c;
    public final TextView d;
    public final org.telegram.ui.Components.qh0 f53281e;
    public Bundle f53282f;
    public boolean h;
    public TL_account.Password f53283n;
    public String f53284r;
    public String f53285s;
    public String f53286w;
    public String f53287x;
    public final org.telegram.ui.Components.vb0 f53288y;

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
        this.f53282f = null;
        return true;
    }

    @Override
    public final void d() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.gd.N0(2131748533, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.h && this.f53283n != null) {
            String obj = this.f53278a.getText().toString();
            if (obj.length() == 0) {
                de0 de0Var = this.E;
                if (de0Var.getParentActivity() == null) {
                    return;
                }
                de0.c1(de0Var, this.f53288y, true);
                return;
            }
            this.h = true;
            this.E.F1(0, true);
            Utilities.f22877e.c(new i50(23, this, obj));
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.h3(new kz(this, 22), de0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f53282f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f53278a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f53278a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f53282f;
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
        EditTextBoldCursor editTextBoldCursor = this.f53278a;
        if (isEmpty) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f53282f = bundle;
        String string = bundle.getString("password");
        this.f53284r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f53283n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f53285s = bundle.getString("phoneFormated");
        this.f53286w = bundle.getString("phoneHash");
        this.f53287x = bundle.getString("code");
        TL_account.Password password = this.f53283n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f53283n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.f53279b.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.D6, false));
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.f53278a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.H6, false));
        this.f53280c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29691q6, false));
        this.f53288y.f();
    }
}
