package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xb0 extends org.telegram.ui.Components.wt0 {
    public final ce0 D;
    public final EditTextBoldCursor f51801a;
    public final TextView f51802b;
    public final TextView f51803c;
    public final TextView d;
    public final org.telegram.ui.Components.ch0 f51804e;
    public Bundle f51805f;
    public boolean h;
    public TL_account.Password f51806n;
    public String f51807r;
    public String f51808s;
    public String f51809w;
    public String f51810x;
    public final org.telegram.ui.Components.lb0 f51811y;

    public xb0(org.telegram.ui.ce0 r22, android.content.Context r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xb0.<init>(org.telegram.ui.ce0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z9) {
        this.h = false;
        this.D.C1(true, true);
        this.f51805f = null;
        return true;
    }

    @Override
    public final void d() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.hd.M0(2131748725, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.h && this.f51806n != null) {
            String obj = this.f51801a.getText().toString();
            if (obj.length() == 0) {
                ce0 ce0Var = this.D;
                if (ce0Var.getParentActivity() == null) {
                    return;
                }
                ce0.c1(ce0Var, this.f51811y, true);
                return;
            }
            this.h = true;
            this.D.F1(0, true);
            Utilities.f21333e.c(new q10(26, this, obj));
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new hz(this, 22), ce0.f44735y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f51805f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f51801a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f51801a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f51805f;
        if (bundle2 != null) {
            bundle.putBundle("passview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        if (bundle == null) {
            return;
        }
        boolean isEmpty = bundle.isEmpty();
        EditTextBoldCursor editTextBoldCursor = this.f51801a;
        if (isEmpty) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f51805f = bundle;
        String string = bundle.getString("password");
        this.f51807r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f51806n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f51808s = bundle.getString("phoneFormated");
        this.f51809w = bundle.getString("phoneHash");
        this.f51810x = bundle.getString("code");
        TL_account.Password password = this.f51806n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f51806n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.f51802b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.f51801a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
        this.f51803c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28088q6, false));
        this.f51811y.f();
    }
}
