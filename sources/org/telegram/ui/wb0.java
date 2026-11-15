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
    public final EditTextBoldCursor f52530a;
    public final TextView f52531b;
    public final TextView f52532c;
    public final TextView d;
    public final org.telegram.ui.Components.fh0 f52533e;
    public Bundle f52534f;
    public boolean h;
    public TL_account.Password f52535n;
    public String f52536r;
    public String f52537s;
    public String f52538w;
    public String f52539x;
    public final org.telegram.ui.Components.mb0 f52540y;

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
        this.f52534f = null;
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
        if (!this.h && this.f52535n != null) {
            String obj = this.f52530a.getText().toString();
            if (obj.length() == 0) {
                ce0 ce0Var = this.E;
                if (ce0Var.getParentActivity() == null) {
                    return;
                }
                ce0.c1(ce0Var, this.f52540y, true);
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
        this.f52534f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f52530a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f52530a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f52534f;
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
        EditTextBoldCursor editTextBoldCursor = this.f52530a;
        if (isEmpty) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f52534f = bundle;
        String string = bundle.getString("password");
        this.f52536r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f52535n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f52537s = bundle.getString("phoneFormated");
        this.f52538w = bundle.getString("phoneHash");
        this.f52539x = bundle.getString("code");
        TL_account.Password password = this.f52535n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f52535n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        this.f52531b.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.D6, false));
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.f52530a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.H6, false));
        this.f52532c.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29089q6, false));
        this.f52540y.f();
    }
}
