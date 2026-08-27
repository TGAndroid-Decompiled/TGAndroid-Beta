package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class rc1 implements RequestDelegate {

    public final int f41902a;

    public final Object f41903b;

    public final Object f41904c;

    public rc1(int i10, Object obj, Object obj2) {
        this.f41902a = i10;
        this.f41903b = obj;
        this.f41904c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41902a) {
            case 0:
                tc1 tc1Var = (tc1) this.f41903b;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) this.f41904c;
                if (!(tLObject instanceof TLRPC.TL_theme)) {
                    AndroidUtilities.runOnUIThread(new pc1(tc1Var, tL_error, updatetheme));
                } else {
                    AndroidUtilities.runOnUIThread(new m21(15, tc1Var, (TLRPC.TL_theme) tLObject));
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new pc1((se1) this.f41903b, (String) this.f41904c, tLObject, 5));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ex0((zf1) this.f41903b, tLObject, (String) this.f41904c, tL_error, 15));
                break;
            case 3:
                zf1 zf1Var = (zf1) this.f41903b;
                byte[] bArr = (byte[]) this.f41904c;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new vf1(zf1Var, tL_error, 3));
                } else {
                    AndroidUtilities.runOnUIThread(new tf1(zf1Var, bArr, 1));
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new m21(29, (th1) this.f41903b, (int[]) this.f41904c));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ex0((pf.c) this.f41903b, tL_error, (String) this.f41904c, tLObject, 18));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gs0((pf.u0) this.f41903b, (String) this.f41904c, tLObject, 26));
                break;
            case 7:
                pf.k1 k1Var = (pf.k1) this.f41903b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f41904c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gs0(k1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 29));
                }
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new qf.a(this.f41903b, tLObject, this.f41904c, 2));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new zh1(19, (qf.g0) this.f41903b, (org.telegram.ui.Components.xl) this.f41904c));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new qf.a(this.f41903b, tLObject, this.f41904c, 7));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ex0((zf.n2) this.f41903b, tLObject, (zf.l2) this.f41904c, tL_error, 26));
                break;
        }
    }
}
