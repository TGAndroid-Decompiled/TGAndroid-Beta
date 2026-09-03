package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class z10 extends bg.b {
    public CharSequence f40374c;
    public MessagesController.DialogFilter d;
    public TLRPC.TL_dialogFilterSuggested e;

    public final boolean equals(Object obj) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z10)) {
            return false;
        }
        z10 z10Var = (z10) obj;
        int i10 = z10Var.f1830a;
        int i11 = this.f1830a;
        if (i10 != i11) {
            return false;
        }
        if ((i11 == 0 || i11 == 4 || i11 == 3 || i11 == 6) && !TextUtils.equals(this.f40374c, z10Var.f40374c)) {
            return false;
        }
        int i12 = this.f1830a;
        if (i12 == 2) {
            MessagesController.DialogFilter dialogFilter = this.d;
            if (dialogFilter == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            MessagesController.DialogFilter dialogFilter2 = z10Var.d;
            if (dialogFilter2 == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 != z12) {
                return false;
            }
            if (dialogFilter != null && dialogFilter.f16649id != dialogFilter2.f16649id) {
                return false;
            }
        }
        if (i12 == 5) {
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.e;
            if (tL_dialogFilterSuggested == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = z10Var.e;
            if (tL_dialogFilterSuggested2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z4 != z10) {
                return false;
            }
            if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.f19164id != tL_dialogFilterSuggested2.filter.f19164id) {
                return false;
            }
        }
        return true;
    }
}
