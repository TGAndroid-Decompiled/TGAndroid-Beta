package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xd0 extends org.telegram.ui.Components.ow0 {
    public final EditTextBoldCursor f43074a;
    public final TextView f43075b;
    public final TextView f43076c;
    public final TextView d;
    public final org.telegram.ui.Components.xj0 e;
    public Bundle f43077f;
    public boolean h;
    public TL_account.Password f43078n;
    public String f43079r;
    public String f43080s;
    public String v;
    public String f43081w;
    public final org.telegram.ui.Components.sd0 f43082x;
    public final eg0 f43083y;

    public xd0(org.telegram.ui.eg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xd0.<init>(org.telegram.ui.eg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f43083y.k1(true, true);
        this.f43077f = null;
        return true;
    }

    @Override
    public final void d() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        if (!this.h && this.f43078n != null) {
            String obj = this.f43074a.getText().toString();
            if (obj.length() == 0) {
                eg0 eg0Var = this.f43083y;
                if (eg0Var.getParentActivity() == null) {
                    return;
                }
                eg0.U0(eg0Var, this.f43082x, true);
                return;
            }
            this.h = true;
            this.f43083y.n1(0, true);
            Utilities.globalQueue.postRunnable(new b80(18, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new fz(this, 20), eg0.f36488t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f43077f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f43074a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f43074a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f43077f;
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
        EditTextBoldCursor editTextBoldCursor = this.f43074a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f43077f = bundle;
        String string = bundle.getString("password");
        this.f43079r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f43078n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f43080s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f43081w = bundle.getString("code");
        TL_account.Password password = this.f43078n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f43078n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f43075b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f43074a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
        this.f43076c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f43082x.f();
    }
}
