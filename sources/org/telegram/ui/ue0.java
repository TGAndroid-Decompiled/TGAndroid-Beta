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
public final class ue0 extends org.telegram.ui.Components.tw0 {
    public final EditTextBoldCursor f40656a;
    public final TextView f40657b;
    public final TextView f40658c;
    public final TextView d;
    public final org.telegram.ui.Components.bk0 e;
    public Bundle f40659f;
    public boolean h;
    public TL_account.Password f40660n;
    public String f40661r;
    public String f40662s;
    public String v;
    public String f40663w;
    public final org.telegram.ui.Components.yd0 f40664x;
    public final bh0 f40665y;

    public ue0(org.telegram.ui.bh0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ue0.<init>(org.telegram.ui.bh0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f40665y.k1(true, true);
        this.f40659f = null;
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
        if (!this.h && this.f40660n != null) {
            String obj = this.f40656a.getText().toString();
            if (obj.length() == 0) {
                bh0 bh0Var = this.f40665y;
                if (bh0Var.getParentActivity() == null) {
                    return;
                }
                bh0.U0(bh0Var, this.f40664x, true);
                return;
            }
            this.h = true;
            this.f40665y.n1(0, true);
            Utilities.globalQueue.postRunnable(new wc0(5, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new zz(this, 20), bh0.f34542t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f40659f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f40656a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f40656a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f40659f;
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
        EditTextBoldCursor editTextBoldCursor = this.f40656a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f40659f = bundle;
        String string = bundle.getString("password");
        this.f40661r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f40660n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f40662s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f40663w = bundle.getString("code");
        TL_account.Password password = this.f40660n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f40660n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.f40657b.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.D6, false));
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f40656a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.H6, false));
        this.f40658c.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f40664x.f();
    }
}
