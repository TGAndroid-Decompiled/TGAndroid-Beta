package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u11 implements TextWatcher {
    public final su0 f52417a = new su0(this, 18);
    public final b21 f52418b;

    public u11(b21 b21Var) {
        this.f52418b = b21Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        b21 b21Var = this.f52418b;
        String obj = b21Var.Y1.getText().toString();
        tL_channelParticipantsSearch.f28397q = obj;
        a21 a21Var = b21Var.f45709c2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = a21Var.f45443c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.f28397q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        a21Var.f45443c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                a21Var.f45447r = false;
                if (a21Var.f45446n >= 0) {
                    ConnectionsManager.getInstance(a21Var.f45441a).cancelRequest(a21Var.f45446n, true);
                    a21Var.f45446n = -1;
                }
                a21Var.f45445f = false;
                a21Var.d.clear();
                a21Var.h = false;
            } else {
                a21Var.f45447r = true;
                a21Var.h = false;
            }
            a21Var.b();
        }
        org.telegram.ui.Components.c51 c51Var = b21Var.f45710e2;
        if (c51Var != null) {
            c51Var.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        su0 su0Var = this.f52417a;
        if (length <= 0) {
            org.telegram.messenger.g0.r(su0Var);
            a();
            return;
        }
        org.telegram.messenger.g0.r(su0Var);
        org.telegram.messenger.g0.h3(su0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
