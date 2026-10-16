package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class sh1 implements RequestDelegate {
    public final int f39824a;
    public final Object f39825b;
    public final Object f39826c;
    public final Object d;
    public final Object e;
    public final Object f39827f;
    public final Object f39828g;

    public sh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f39824a = i10;
        this.f39825b = obj;
        this.f39826c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f39827f = obj5;
        this.f39828g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39824a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ji.k((UserInfoActivity) this.f39825b, tL_error, (TLObject) this.f39826c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, tLObject, (int[]) this.f39827f, (ArrayList) this.f39828g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ji.k(tL_error, (ug.v) this.f39825b, tLObject, (List) this.f39826c, (c5.i) this.d, (ug.v) this.e, (org.telegram.ui.ActionBar.m2) this.f39827f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f39828g, 7));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ji.k(tL_error, (Utilities.Callback) this.f39825b, tLObject, (List) this.f39826c, (c5.i) this.d, (Utilities.Callback) this.e, (org.telegram.ui.ActionBar.m2) this.f39827f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f39828g, 8));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ji.k(tLObject, (c5.p) this.f39825b, (c5.i) this.f39826c, (rh.r) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f39827f, (List) this.f39828g, tL_error, 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ji.k(tLObject, (c5.p) this.f39825b, (c5.i) this.f39826c, (org.telegram.ui.Components.c90) this.d, (Activity) this.e, (TLRPC.TL_inputStorePaymentStarsGift) this.f39827f, (List) this.f39828g, tL_error, 10));
                return;
        }
    }
}
