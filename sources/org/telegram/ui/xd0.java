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
    public final EditTextBoldCursor f43090a;
    public final TextView f43091b;
    public final TextView f43092c;
    public final TextView d;
    public final org.telegram.ui.Components.xj0 e;
    public Bundle f43093f;
    public boolean h;
    public TL_account.Password f43094n;
    public String f43095r;
    public String f43096s;
    public String v;
    public String f43097w;
    public final org.telegram.ui.Components.sd0 f43098x;
    public final fg0 f43099y;

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
        this.f43099y.k1(true, true);
        this.f43093f = null;
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
        if (!this.h && this.f43094n != null) {
            String obj = this.f43090a.getText().toString();
            if (obj.length() == 0) {
                fg0 fg0Var = this.f43099y;
                if (fg0Var.getParentActivity() == null) {
                    return;
                }
                fg0.U0(fg0Var, this.f43098x, true);
                return;
            }
            this.h = true;
            this.f43099y.n1(0, true);
            Utilities.globalQueue.postRunnable(new b80(18, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new fz(this, 20), fg0.f36902t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f43093f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f43090a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f43090a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f43093f;
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
        EditTextBoldCursor editTextBoldCursor = this.f43090a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f43093f = bundle;
        String string = bundle.getString("password");
        this.f43095r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f43094n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f43096s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f43097w = bundle.getString("code");
        TL_account.Password password = this.f43094n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f43094n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f43091b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f43090a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
        this.f43092c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f43098x.f();
    }
}
