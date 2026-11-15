package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wb0 extends org.telegram.ui.Components.xt0 {
    public final ce0 E;
    public final EditTextBoldCursor f52527a;
    public final TextView f52528b;
    public final TextView f52529c;
    public final TextView d;
    public final org.telegram.ui.Components.fh0 f52530e;
    public Bundle f52531f;
    public boolean h;
    public TL_account.Password f52532n;
    public String f52533r;
    public String f52534s;
    public String f52535w;
    public String f52536x;
    public final org.telegram.ui.Components.mb0 f52537y;

    public wb0(org.telegram.ui.ce0 r23, android.content.Context r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wb0.<init>(org.telegram.ui.ce0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.E.C1(true, true);
        this.f52531f = null;
        return true;
    }

    @Override
    public final void d() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.hd.M0(2131748726, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.h && this.f52532n != null) {
            String obj = this.f52527a.getText().toString();
            if (obj.length() == 0) {
                ce0 ce0Var = this.E;
                if (ce0Var.getParentActivity() == null) {
                    return;
                }
                ce0.c1(ce0Var, this.f52537y, true);
                return;
            }
            this.h = true;
            this.E.F1(0, true);
            Utilities.f22416e.c(new g50(22, this, obj));
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new iz(this, 22), ce0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f52531f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f52527a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f52527a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f52531f;
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
        EditTextBoldCursor editTextBoldCursor = this.f52527a;
        if (isEmpty) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f52531f = bundle;
        String string = bundle.getString("password");
        this.f52533r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f52532n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f52534s = bundle.getString("phoneFormated");
        this.f52535w = bundle.getString("phoneHash");
        this.f52536x = bundle.getString("code");
        TL_account.Password password = this.f52532n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f52532n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        this.f52528b.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.D6, false));
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.f52527a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.H6, false));
        this.f52529c.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29089q6, false));
        this.f52537y.f();
    }
}
