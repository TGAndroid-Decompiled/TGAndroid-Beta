package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class v61 implements TextWatcher {
    public final xy0 f42135a = new xy0(this, 17);
    public final c71 f42136b;

    public v61(c71 c71Var) {
        this.f42136b = c71Var;
    }

    public final void a() {
        boolean z4;
        boolean z10;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        c71 c71Var = this.f42136b;
        String obj = c71Var.Z.getText().toString();
        tL_channelParticipantsSearch.f20842q = obj;
        b71 b71Var = c71Var.f35699d0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = b71Var.f35373c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z4 = !TextUtils.equals(channelParticipantsFilter.f20842q, obj);
            z10 = false;
        } else {
            z4 = true;
            z10 = true;
        }
        b71Var.f35373c = tL_channelParticipantsSearch;
        if (z4) {
            if (z10) {
                b71Var.f35377r = false;
                if (b71Var.f35376n >= 0) {
                    ConnectionsManager.getInstance(b71Var.f35371a).cancelRequest(b71Var.f35376n, true);
                    b71Var.f35376n = -1;
                }
                b71Var.f35375f = false;
                b71Var.d.clear();
                b71Var.h = false;
            } else {
                b71Var.f35377r = true;
                b71Var.h = false;
            }
            b71Var.b();
        }
        org.telegram.ui.Components.x51 x51Var = c71Var.f35701f0;
        if (x51Var != null) {
            x51Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        xy0 xy0Var = this.f42135a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(xy0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(xy0Var);
        AndroidUtilities.runOnUIThread(xy0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
