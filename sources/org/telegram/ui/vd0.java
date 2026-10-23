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
public final class vd0 extends org.telegram.ui.Components.qw0 {
    public final EditTextBoldCursor f42212a;
    public final TextView f42213b;
    public final TextView f42214c;
    public final TextView d;
    public final org.telegram.ui.Components.yj0 e;
    public Bundle f42215f;
    public boolean h;
    public TL_account.Password f42216n;
    public String f42217r;
    public String f42218s;
    public String v;
    public String f42219w;
    public final org.telegram.ui.Components.sd0 f42220x;
    public final dg0 f42221y;

    public vd0(org.telegram.ui.dg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vd0.<init>(org.telegram.ui.dg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f42221y.k1(true, true);
        this.f42215f = null;
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
        if (!this.h && this.f42216n != null) {
            String obj = this.f42212a.getText().toString();
            if (obj.length() == 0) {
                dg0 dg0Var = this.f42221y;
                if (dg0Var.getParentActivity() == null) {
                    return;
                }
                dg0.U0(dg0Var, this.f42220x, true);
                return;
            }
            this.h = true;
            this.f42221y.n1(0, true);
            Utilities.globalQueue.postRunnable(new z70(18, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new dz(this, 20), dg0.f36370t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f42215f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f42212a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f42212a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f42215f;
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
        EditTextBoldCursor editTextBoldCursor = this.f42212a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f42215f = bundle;
        String string = bundle.getString("password");
        this.f42217r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f42216n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f42218s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f42219w = bundle.getString("code");
        TL_account.Password password = this.f42216n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f42216n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f42213b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f42212a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
        this.f42214c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f42220x.f();
    }
}
