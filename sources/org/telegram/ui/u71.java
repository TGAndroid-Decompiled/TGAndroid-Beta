package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u71 implements TextWatcher {
    public final tz0 f40283a = new tz0(this, 17);
    public final b81 f40284b;

    public u71(b81 b81Var) {
        this.f40284b = b81Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        b81 b81Var = this.f40284b;
        String obj = b81Var.f34235c0.getText().toString();
        tL_channelParticipantsSearch.f18915q = obj;
        a81 a81Var = b81Var.f34239g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = a81Var.f33785c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f18915q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        a81Var.f33785c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                a81Var.f33788r = false;
                if (a81Var.f33787n >= 0) {
                    ConnectionsManager.getInstance(a81Var.f33783a).cancelRequest(a81Var.f33787n, true);
                    a81Var.f33787n = -1;
                }
                a81Var.f33786f = false;
                a81Var.d.clear();
                a81Var.h = false;
            } else {
                a81Var.f33788r = true;
                a81Var.h = false;
            }
            a81Var.b();
        }
        org.telegram.ui.Components.a71 a71Var = b81Var.f34241i0;
        if (a71Var != null) {
            a71Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        tz0 tz0Var = this.f40283a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(tz0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(tz0Var);
        AndroidUtilities.runOnUIThread(tz0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
