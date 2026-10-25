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
public final class yd0 extends org.telegram.ui.Components.ax0 {
    public final EditTextBoldCursor f46032a;
    public final TextView f46033b;
    public final TextView f46034c;
    public final TextView d;
    public final org.telegram.ui.Components.ak0 e;
    public Bundle f46035f;
    public boolean h;
    public TL_account.Password f46036n;
    public String f46037r;
    public String f46038s;
    public String v;
    public String f46039w;
    public final org.telegram.ui.Components.rd0 f46040x;
    public final gg0 f46041y;

    public yd0(org.telegram.ui.gg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yd0.<init>(org.telegram.ui.gg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f46041y.p1(true, true);
        this.f46035f = null;
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
        if (!this.h && this.f46036n != null) {
            String obj = this.f46032a.getText().toString();
            if (obj.length() == 0) {
                gg0 gg0Var = this.f46041y;
                if (gg0Var.getParentActivity() == null) {
                    return;
                }
                gg0.X0(gg0Var, this.f46040x, true);
                return;
            }
            this.h = true;
            this.f46041y.s1(0, true);
            Utilities.globalQueue.postRunnable(new wb0(5, this, obj));
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new p00(this, 21), gg0.f39647x0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f46035f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f46032a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f46032a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f46035f;
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
        EditTextBoldCursor editTextBoldCursor = this.f46032a;
        if (isEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f46035f = bundle;
        String string = bundle.getString("password");
        this.f46037r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f46036n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f46038s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f46039w = bundle.getString("code");
        TL_account.Password password = this.f46036n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.f46036n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.f46033b.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.D6, false));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f46032a;
        editTextBoldCursor.setTextColor(x02);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.H6, false));
        this.f46034c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23595q6, false));
        this.f46040x.f();
    }
}
