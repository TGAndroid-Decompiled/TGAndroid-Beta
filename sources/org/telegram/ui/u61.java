package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u61 implements TextWatcher {
    public final vy0 f38852a = new vy0(this, 18);
    public final b71 f38853b;

    public u61(b71 b71Var) {
        this.f38853b = b71Var;
    }

    public final void a() {
        boolean z4;
        boolean z10;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        b71 b71Var = this.f38853b;
        String obj = b71Var.Z.getText().toString();
        tL_channelParticipantsSearch.f19183q = obj;
        a71 a71Var = b71Var.f32832d0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = a71Var.f32478c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z4 = !TextUtils.equals(channelParticipantsFilter.f19183q, obj);
            z10 = false;
        } else {
            z4 = true;
            z10 = true;
        }
        a71Var.f32478c = tL_channelParticipantsSearch;
        if (z4) {
            if (z10) {
                a71Var.f32481r = false;
                if (a71Var.f32480n >= 0) {
                    ConnectionsManager.getInstance(a71Var.f32476a).cancelRequest(a71Var.f32480n, true);
                    a71Var.f32480n = -1;
                }
                a71Var.f32479f = false;
                a71Var.d.clear();
                a71Var.h = false;
            } else {
                a71Var.f32481r = true;
                a71Var.h = false;
            }
            a71Var.b();
        }
        org.telegram.ui.Components.w51 w51Var = b71Var.f32834f0;
        if (w51Var != null) {
            w51Var.N(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        vy0 vy0Var = this.f38852a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(vy0Var);
            a();
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(vy0Var);
        AndroidUtilities.runOnUIThread(vy0Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
