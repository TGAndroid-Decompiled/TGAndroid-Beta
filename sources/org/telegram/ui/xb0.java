package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xb0 extends org.telegram.ui.Components.fu0 {
    public final ee0 E;
    public final EditTextBoldCursor f53766a;
    public final TextView f53767b;
    public final TextView f53768c;
    public final TextView d;
    public final org.telegram.ui.Components.ph0 f53769e;
    public Bundle f53770f;
    public boolean h;
    public TL_account.Password f53771n;
    public String f53772r;
    public String f53773s;
    public String f53774w;
    public String f53775x;
    public final org.telegram.ui.Components.xb0 f53776y;

    public xb0(org.telegram.ui.ee0 r22, android.content.Context r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xb0.<init>(org.telegram.ui.ee0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.E.C1(true, true);
        this.f53770f = null;
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
        if (!this.h && this.f53771n != null) {
            String obj = this.f53766a.getText().toString();
            if (obj.length() == 0) {
                ee0 ee0Var = this.E;
                if (ee0Var.getParentActivity() == null) {
                    return;
                }
                ee0.c1(ee0Var, this.f53776y, true);
                return;
            }
            this.h = true;
            this.E.F1(0, true);
            Utilities.f22779e.c(new o60(17, this, obj));
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.h3(new lz(this, 22), ee0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f53770f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f53766a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f53766a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f53770f;
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
        EditTextBoldCursor editTextBoldCursor = this.f53766a;
        if (isEmpty) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f53770f = bundle;
        String string = bundle.getString("password");
        this.f53772r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f53771n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f53773s = bundle.getString("phoneFormated");
        this.f53774w = bundle.getString("phoneHash");
        this.f53775x = bundle.getString("code");
        TL_account.Password password = this.f53771n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f53771n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.f53767b.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.D6, false));
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.f53766a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.H6, false));
        this.f53768c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29634q6, false));
        this.f53776y.f();
    }
}
