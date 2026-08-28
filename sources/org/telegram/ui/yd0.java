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
public final class yd0 extends org.telegram.ui.Components.cv0 {
    public final EditTextBoldCursor f44831a;
    public final TextView f44832b;
    public final TextView f44833c;
    public final TextView d;
    public final org.telegram.ui.Components.pi0 f44834e;
    public Bundle f44835f;
    public boolean h;
    public TL_account.Password f44836n;
    public String f44837r;
    public String f44838s;
    public String v;
    public String f44839w;
    public final org.telegram.ui.Components.fc0 f44840x;
    public final fg0 f44841y;

    public yd0(org.telegram.ui.fg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yd0.<init>(org.telegram.ui.fg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f44841y.k1(true, true);
        this.f44835f = null;
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
        if (!this.h && this.f44836n != null) {
            String obj = this.f44831a.getText().toString();
            if (obj.length() == 0) {
                fg0 fg0Var = this.f44841y;
                if (fg0Var.getParentActivity() == null) {
                    return;
                }
                fg0.U0(fg0Var, this.f44840x, true);
                return;
            }
            this.h = true;
            this.f44841y.n1(0, true);
            Utilities.globalQueue.postRunnable(new x20(25, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new o00(this, 19), fg0.f38258p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f44835f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f44831a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f44831a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f44835f;
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
        EditTextBoldCursor editTextBoldCursor = this.f44831a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f44835f = bundle;
        String string = bundle.getString("password");
        this.f44837r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f44836n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f44838s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f44839w = bundle.getString("code");
        TL_account.Password password = this.f44836n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f44836n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.f44832b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D6, false));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        EditTextBoldCursor editTextBoldCursor = this.f44831a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
        this.f44833c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false));
        this.f44840x.f();
    }
}
