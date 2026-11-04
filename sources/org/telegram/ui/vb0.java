package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vb0 extends org.telegram.ui.Components.vt0 {
    public final xd0 E;
    public final EditTextBoldCursor f50441a;
    public final TextView f50442b;
    public final TextView f50443c;
    public final TextView d;
    public final org.telegram.ui.Components.fh0 f50444e;
    public Bundle f50445f;
    public boolean h;
    public TL_account.Password f50446n;
    public String f50447r;
    public String f50448s;
    public String f50449w;
    public String f50450x;
    public final org.telegram.ui.Components.gb0 f50451y;

    public vb0(org.telegram.ui.xd0 r22, android.content.Context r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vb0.<init>(org.telegram.ui.xd0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.E.t1(true, true);
        this.f50445f = null;
        return true;
    }

    @Override
    public final void d() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131748734, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.h && this.f50446n != null) {
            String obj = this.f50441a.getText().toString();
            if (obj.length() == 0) {
                xd0 xd0Var = this.E;
                if (xd0Var.getParentActivity() == null) {
                    return;
                }
                xd0.b1(xd0Var, this.f50451y, true);
                return;
            }
            this.h = true;
            this.E.w1(0, true);
            Utilities.f21387e.c(new tb0(1, this, obj));
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new fz(this, 21), xd0.f51945z0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f50445f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f50441a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f50441a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f50445f;
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
        EditTextBoldCursor editTextBoldCursor = this.f50441a;
        if (isEmpty) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f50445f = bundle;
        String string = bundle.getString("password");
        this.f50447r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f50446n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f50448s = bundle.getString("phoneFormated");
        this.f50449w = bundle.getString("phoneHash");
        this.f50450x = bundle.getString("code");
        TL_account.Password password = this.f50446n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f50446n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.f50442b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        EditTextBoldCursor editTextBoldCursor = this.f50441a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
        this.f50443c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28121q6, false));
        this.f50451y.f();
    }
}
