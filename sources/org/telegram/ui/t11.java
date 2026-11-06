package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class t11 implements TextWatcher {
    public final ru0 f49892a = new ru0(this, 18);
    public final a21 f49893b;

    public t11(a21 a21Var) {
        this.f49893b = a21Var;
    }

    public final void a() {
        boolean z9;
        boolean z10;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        a21 a21Var = this.f49893b;
        String obj = a21Var.U1.getText().toString();
        tL_channelParticipantsSearch.f26951q = obj;
        z11 z11Var = a21Var.Y1;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = z11Var.f52430c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z9 = !TextUtils.equals(channelParticipantsFilter.f26951q, obj);
            z10 = false;
        } else {
            z9 = true;
            z10 = true;
        }
        z11Var.f52430c = tL_channelParticipantsSearch;
        if (z9) {
            if (z10) {
                z11Var.f52434r = false;
                if (z11Var.f52433n >= 0) {
                    ConnectionsManager.getInstance(z11Var.f52428a).cancelRequest(z11Var.f52433n, true);
                    z11Var.f52433n = -1;
                }
                z11Var.f52432f = false;
                z11Var.d.clear();
                z11Var.h = false;
            } else {
                z11Var.f52434r = true;
                z11Var.h = false;
            }
            z11Var.b();
        }
        org.telegram.ui.Components.k41 k41Var = a21Var.f43552a2;
        if (k41Var != null) {
            k41Var.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ru0 ru0Var = this.f49892a;
        if (length <= 0) {
            org.telegram.messenger.g0.r(ru0Var);
            a();
            return;
        }
        org.telegram.messenger.g0.r(ru0Var);
        org.telegram.messenger.g0.i3(ru0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
