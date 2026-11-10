package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w11 implements TextWatcher {
    public final uu0 f50876a = new uu0(this, 18);
    public final d21 f50877b;

    public w11(d21 d21Var) {
        this.f50877b = d21Var;
    }

    public final void a() {
        boolean z9;
        boolean z10;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        d21 d21Var = this.f50877b;
        String obj = d21Var.X1.getText().toString();
        tL_channelParticipantsSearch.f26959q = obj;
        c21 c21Var = d21Var.f44886b2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = c21Var.f44204c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z9 = !TextUtils.equals(channelParticipantsFilter.f26959q, obj);
            z10 = false;
        } else {
            z9 = true;
            z10 = true;
        }
        c21Var.f44204c = tL_channelParticipantsSearch;
        if (z9) {
            if (z10) {
                c21Var.f44208r = false;
                if (c21Var.f44207n >= 0) {
                    ConnectionsManager.getInstance(c21Var.f44202a).cancelRequest(c21Var.f44207n, true);
                    c21Var.f44207n = -1;
                }
                c21Var.f44206f = false;
                c21Var.d.clear();
                c21Var.h = false;
            } else {
                c21Var.f44208r = true;
                c21Var.h = false;
            }
            c21Var.b();
        }
        org.telegram.ui.Components.m41 m41Var = d21Var.d2;
        if (m41Var != null) {
            m41Var.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        uu0 uu0Var = this.f50876a;
        if (length <= 0) {
            org.telegram.messenger.g0.r(uu0Var);
            a();
            return;
        }
        org.telegram.messenger.g0.r(uu0Var);
        org.telegram.messenger.g0.i3(uu0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
