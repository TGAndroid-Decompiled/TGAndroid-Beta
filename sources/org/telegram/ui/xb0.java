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
    public final EditTextBoldCursor f53809a;
    public final TextView f53810b;
    public final TextView f53811c;
    public final TextView d;
    public final org.telegram.ui.Components.rh0 f53812e;
    public Bundle f53813f;
    public boolean h;
    public TL_account.Password f53814n;
    public String f53815r;
    public String f53816s;
    public String f53817w;
    public String f53818x;
    public final org.telegram.ui.Components.yb0 f53819y;

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
        this.f53813f = null;
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
        if (!this.h && this.f53814n != null) {
            String obj = this.f53809a.getText().toString();
            if (obj.length() == 0) {
                de0 de0Var = this.E;
                if (de0Var.getParentActivity() == null) {
                    return;
                }
                de0.c1(de0Var, this.f53819y, true);
                return;
            }
            this.h = true;
            this.E.F1(0, true);
            Utilities.f22807e.c(new h60(19, this, obj));
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.h3(new lz(this, 22), de0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f53813f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f53809a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f53809a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f53813f;
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
        EditTextBoldCursor editTextBoldCursor = this.f53809a;
        if (isEmpty) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f53813f = bundle;
        String string = bundle.getString("password");
        this.f53815r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f53814n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f53816s = bundle.getString("phoneFormated");
        this.f53817w = bundle.getString("phoneHash");
        this.f53818x = bundle.getString("code");
        TL_account.Password password = this.f53814n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f53814n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.f53810b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.D6, false));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.f53809a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.H6, false));
        this.f53811c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29618q6, false));
        this.f53819y.f();
    }
}
