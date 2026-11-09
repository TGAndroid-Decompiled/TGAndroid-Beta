package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zb0 extends org.telegram.ui.Components.yt0 {
    public final ee0 D;
    public final EditTextBoldCursor f52484a;
    public final TextView f52485b;
    public final TextView f52486c;
    public final TextView d;
    public final org.telegram.ui.Components.dh0 f52487e;
    public Bundle f52488f;
    public boolean h;
    public TL_account.Password f52489n;
    public String f52490r;
    public String f52491s;
    public String f52492w;
    public String f52493x;
    public final org.telegram.ui.Components.mb0 f52494y;

    public zb0(org.telegram.ui.ee0 r22, android.content.Context r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zb0.<init>(org.telegram.ui.ee0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z9) {
        this.h = false;
        this.D.C1(true, true);
        this.f52488f = null;
        return true;
    }

    @Override
    public final void d() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131748726, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.h && this.f52489n != null) {
            String obj = this.f52484a.getText().toString();
            if (obj.length() == 0) {
                ee0 ee0Var = this.D;
                if (ee0Var.getParentActivity() == null) {
                    return;
                }
                ee0.c1(ee0Var, this.f52494y, true);
                return;
            }
            this.h = true;
            this.D.F1(0, true);
            Utilities.f21336e.c(new s10(26, this, obj));
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new jz(this, 22), ee0.f45367y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f52488f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f52484a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f52484a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f52488f;
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
        EditTextBoldCursor editTextBoldCursor = this.f52484a;
        if (isEmpty) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f52488f = bundle;
        String string = bundle.getString("password");
        this.f52490r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f52489n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f52491s = bundle.getString("phoneFormated");
        this.f52492w = bundle.getString("phoneHash");
        this.f52493x = bundle.getString("code");
        TL_account.Password password = this.f52489n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f52489n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i7, false));
        this.f52485b.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.D6, false));
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.f52484a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.l6.x0(null, i7, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.H6, false));
        this.f52486c.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28105q6, false));
        this.f52494y.f();
    }
}
