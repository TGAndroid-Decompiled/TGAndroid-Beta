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
public final class re0 extends org.telegram.ui.Components.fw0 {
    public final EditTextBoldCursor f37126a;
    public final TextView f37127b;
    public final TextView f37128c;
    public final TextView d;
    public final org.telegram.ui.Components.kj0 e;
    public Bundle f37129f;
    public boolean h;
    public TL_account.Password f37130n;
    public String f37131r;
    public String f37132s;
    public String v;
    public String f37133w;
    public final org.telegram.ui.Components.hd0 f37134x;
    public final yg0 f37135y;

    public re0(org.telegram.ui.yg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.re0.<init>(org.telegram.ui.yg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f37135y.k1(true, true);
        this.f37129f = null;
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
        if (!this.h && this.f37130n != null) {
            String obj = this.f37126a.getText().toString();
            if (obj.length() == 0) {
                yg0 yg0Var = this.f37135y;
                if (yg0Var.getParentActivity() == null) {
                    return;
                }
                yg0.U0(yg0Var, this.f37134x, true);
                return;
            }
            this.h = true;
            this.f37135y.n1(0, true);
            Utilities.globalQueue.postRunnable(new r80(19, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new g10(this, 19), yg0.f39908t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f37129f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f37126a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f37126a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f37129f;
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
        EditTextBoldCursor editTextBoldCursor = this.f37126a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f37129f = bundle;
        String string = bundle.getString("password");
        this.f37131r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f37130n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f37132s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f37133w = bundle.getString("code");
        TL_account.Password password = this.f37130n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f37130n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f37127b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f37126a;
        editTextBoldCursor.setTextColor(w02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
        this.f37128c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.f37134x.f();
    }
}
