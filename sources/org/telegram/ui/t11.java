package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t11 implements TextWatcher {
    public final qu0 f52210a = new qu0(this, 18);
    public final a21 f52211b;

    public t11(a21 a21Var) {
        this.f52211b = a21Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        a21 a21Var = this.f52211b;
        String obj = a21Var.Y1.getText().toString();
        tL_channelParticipantsSearch.f28491q = obj;
        z11 z11Var = a21Var.f45570c2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = z11Var.f54483c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f28491q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        z11Var.f54483c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                z11Var.f54487r = false;
                if (z11Var.f54486n >= 0) {
                    ConnectionsManager.getInstance(z11Var.f54481a).cancelRequest(z11Var.f54486n, true);
                    z11Var.f54486n = -1;
                }
                z11Var.f54485f = false;
                z11Var.d.clear();
                z11Var.h = false;
            } else {
                z11Var.f54487r = true;
                z11Var.h = false;
            }
            z11Var.b();
        }
        org.telegram.ui.Components.b51 b51Var = a21Var.f45571e2;
        if (b51Var != null) {
            b51Var.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        qu0 qu0Var = this.f52210a;
        if (length <= 0) {
            org.telegram.messenger.g0.r(qu0Var);
            a();
            return;
        }
        org.telegram.messenger.g0.r(qu0Var);
        org.telegram.messenger.g0.h3(qu0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
