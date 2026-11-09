package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class v11 implements TextWatcher {
    public final tu0 f50544a = new tu0(this, 18);
    public final c21 f50545b;

    public v11(c21 c21Var) {
        this.f50545b = c21Var;
    }

    public final void a() {
        boolean z9;
        boolean z10;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        c21 c21Var = this.f50545b;
        String obj = c21Var.U1.getText().toString();
        tL_channelParticipantsSearch.f26955q = obj;
        b21 b21Var = c21Var.Y1;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = b21Var.f43856c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z9 = !TextUtils.equals(channelParticipantsFilter.f26955q, obj);
            z10 = false;
        } else {
            z9 = true;
            z10 = true;
        }
        b21Var.f43856c = tL_channelParticipantsSearch;
        if (z9) {
            if (z10) {
                b21Var.f43860r = false;
                if (b21Var.f43859n >= 0) {
                    ConnectionsManager.getInstance(b21Var.f43854a).cancelRequest(b21Var.f43859n, true);
                    b21Var.f43859n = -1;
                }
                b21Var.f43858f = false;
                b21Var.d.clear();
                b21Var.h = false;
            } else {
                b21Var.f43860r = true;
                b21Var.h = false;
            }
            b21Var.b();
        }
        org.telegram.ui.Components.m41 m41Var = c21Var.f44201a2;
        if (m41Var != null) {
            m41Var.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        tu0 tu0Var = this.f50544a;
        if (length <= 0) {
            org.telegram.messenger.g0.r(tu0Var);
            a();
            return;
        }
        org.telegram.messenger.g0.r(tu0Var);
        org.telegram.messenger.g0.i3(tu0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
