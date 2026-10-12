package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u71 implements TextWatcher {
    public final uz0 f40557a = new uz0(this, 17);
    public final b81 f40558b;

    public u71(b81 b81Var) {
        this.f40558b = b81Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        b81 b81Var = this.f40558b;
        String obj = b81Var.f34451c0.getText().toString();
        tL_channelParticipantsSearch.f19215q = obj;
        a81 a81Var = b81Var.f34455g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = a81Var.f34082c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f19215q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        a81Var.f34082c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                a81Var.f34085r = false;
                if (a81Var.f34084n >= 0) {
                    ConnectionsManager.getInstance(a81Var.f34080a).cancelRequest(a81Var.f34084n, true);
                    a81Var.f34084n = -1;
                }
                a81Var.f34083f = false;
                a81Var.d.clear();
                a81Var.h = false;
            } else {
                a81Var.f34085r = true;
                a81Var.h = false;
            }
            a81Var.b();
        }
        org.telegram.ui.Components.z61 z61Var = b81Var.f34457i0;
        if (z61Var != null) {
            z61Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        uz0 uz0Var = this.f40557a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(uz0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(uz0Var);
        AndroidUtilities.runOnUIThread(uz0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
