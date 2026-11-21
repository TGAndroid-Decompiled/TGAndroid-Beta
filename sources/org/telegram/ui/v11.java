package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class v11 implements TextWatcher {
    public final ru0 f52697a = new ru0(this, 18);
    public final c21 f52698b;

    public v11(c21 c21Var) {
        this.f52698b = c21Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        c21 c21Var = this.f52698b;
        String obj = c21Var.Y1.getText().toString();
        tL_channelParticipantsSearch.f28430q = obj;
        b21 b21Var = c21Var.f46393c2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = b21Var.f45749c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f28430q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        b21Var.f45749c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                b21Var.f45753r = false;
                if (b21Var.f45752n >= 0) {
                    ConnectionsManager.getInstance(b21Var.f45747a).cancelRequest(b21Var.f45752n, true);
                    b21Var.f45752n = -1;
                }
                b21Var.f45751f = false;
                b21Var.d.clear();
                b21Var.h = false;
            } else {
                b21Var.f45753r = true;
                b21Var.h = false;
            }
            b21Var.b();
        }
        org.telegram.ui.Components.c51 c51Var = c21Var.f46394e2;
        if (c51Var != null) {
            c51Var.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ru0 ru0Var = this.f52697a;
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
