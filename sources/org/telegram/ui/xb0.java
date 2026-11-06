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
    public final EditTextBoldCursor f51816a;
    public final TextView f51817b;
    public final TextView f51818c;
    public final TextView d;
    public final org.telegram.ui.Components.ch0 f51819e;
    public Bundle f51820f;
    public boolean h;
    public TL_account.Password f51821n;
    public String f51822r;
    public String f51823s;
    public String f51824w;
    public String f51825x;
    public final org.telegram.ui.Components.lb0 f51826y;

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
        this.f51820f = null;
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
        if (!this.h && this.f51821n != null) {
            String obj = this.f51816a.getText().toString();
            if (obj.length() == 0) {
                ce0 ce0Var = this.D;
                if (ce0Var.getParentActivity() == null) {
                    return;
                }
                ce0.c1(ce0Var, this.f51826y, true);
                return;
            }
            this.h = true;
            this.D.F1(0, true);
            Utilities.f21333e.c(new q10(26, this, obj));
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new hz(this, 22), ce0.f44755y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f51820f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f51816a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f51816a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f51820f;
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
        EditTextBoldCursor editTextBoldCursor = this.f51816a;
        if (isEmpty) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f51820f = bundle;
        String string = bundle.getString("password");
        this.f51822r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.f51821n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f51823s = bundle.getString("phoneFormated");
        this.f51824w = bundle.getString("phoneHash");
        this.f51825x = bundle.getString("code");
        TL_account.Password password = this.f51821n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f51821n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.f51817b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.f51816a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
        this.f51818c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28089q6, false));
        this.f51826y.f();
    }
}
