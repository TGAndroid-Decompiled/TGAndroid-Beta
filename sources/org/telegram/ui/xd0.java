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
public final class xd0 extends org.telegram.ui.Components.mv0 {
    public final EditTextBoldCursor f44558a;
    public final TextView f44559b;
    public final TextView f44560c;
    public final TextView d;
    public final org.telegram.ui.Components.aj0 f44561e;
    public Bundle f44562f;
    public boolean h;
    public TL_account.Password f44563n;
    public String f44564r;
    public String f44565s;
    public String v;
    public String f44566w;
    public final org.telegram.ui.Components.uc0 f44567x;
    public final fg0 f44568y;

    public xd0(org.telegram.ui.fg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xd0.<init>(org.telegram.ui.fg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f44568y.k1(true, true);
        this.f44562f = null;
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
        if (!this.h && this.f44563n != null) {
            String obj = this.f44558a.getText().toString();
            if (obj.length() == 0) {
                fg0 fg0Var = this.f44568y;
                if (fg0Var.getParentActivity() == null) {
                    return;
                }
                fg0.U0(fg0Var, this.f44567x, true);
                return;
            }
            this.h = true;
            this.f44568y.n1(0, true);
            Utilities.globalQueue.postRunnable(new x60(22, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new q00(this, 19), fg0.f38150p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f44562f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f44558a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f44558a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f44562f;
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
        EditTextBoldCursor editTextBoldCursor = this.f44558a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f44562f = bundle;
        String string = bundle.getString("password");
        this.f44564r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f44563n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f44565s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f44566w = bundle.getString("code");
        TL_account.Password password = this.f44563n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f44563n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f44559b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f44558a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
        this.f44560c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f44567x.f();
    }
}
