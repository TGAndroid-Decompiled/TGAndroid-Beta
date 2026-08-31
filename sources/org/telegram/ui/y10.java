package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class y10 extends cg.b {
    public CharSequence f43518c;
    public MessagesController.DialogFilter d;
    public TLRPC.TL_dialogFilterSuggested f43519e;

    public final boolean equals(Object obj) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y10)) {
            return false;
        }
        y10 y10Var = (y10) obj;
        int i10 = y10Var.f2505a;
        int i11 = this.f2505a;
        if (i10 != i11) {
            return false;
        }
        if ((i11 == 0 || i11 == 4 || i11 == 3 || i11 == 6) && !TextUtils.equals(this.f43518c, y10Var.f43518c)) {
            return false;
        }
        int i12 = this.f2505a;
        if (i12 == 2) {
            MessagesController.DialogFilter dialogFilter = this.d;
            if (dialogFilter == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            MessagesController.DialogFilter dialogFilter2 = y10Var.d;
            if (dialogFilter2 == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 != z12) {
                return false;
            }
            if (dialogFilter != null && dialogFilter.f18055id != dialogFilter2.f18055id) {
                return false;
            }
        }
        if (i12 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.f43519e;
            if (tL_dialogFilterSuggested == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = y10Var.f43519e;
            if (tL_dialogFilterSuggested2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4 != z10) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.f20848id != tL_dialogFilterSuggested2.filter.f20848id) {
                return false;
            }
        }
        return true;
    }
}
