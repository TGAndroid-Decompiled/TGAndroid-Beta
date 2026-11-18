package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u11 implements TextWatcher {
    public final ru0 f52416a = new ru0(this, 18);
    public final b21 f52417b;

    public u11(b21 b21Var) {
        this.f52417b = b21Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        b21 b21Var = this.f52417b;
        String obj = b21Var.Y1.getText().toString();
        tL_channelParticipantsSearch.f28404q = obj;
        a21 a21Var = b21Var.f45735c2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = a21Var.f45433c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f28404q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        a21Var.f45433c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                a21Var.f45437r = false;
                if (a21Var.f45436n >= 0) {
                    ConnectionsManager.getInstance(a21Var.f45431a).cancelRequest(a21Var.f45436n, true);
                    a21Var.f45436n = -1;
                }
                a21Var.f45435f = false;
                a21Var.d.clear();
                a21Var.h = false;
            } else {
                a21Var.f45437r = true;
                a21Var.h = false;
            }
            a21Var.b();
        }
        org.telegram.ui.Components.z41 z41Var = b21Var.f45736e2;
        if (z41Var != null) {
            z41Var.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ru0 ru0Var = this.f52416a;
        if (length <= 0) {
            org.telegram.messenger.g0.r(ru0Var);
            a();
            return;
        }
        org.telegram.messenger.g0.r(ru0Var);
        org.telegram.messenger.g0.h3(ru0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
