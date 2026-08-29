package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xj implements ft {
    public final tn f44599a;

    public xj(tn tnVar) {
        this.f44599a = tnVar;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String E(boolean z10) {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.j70 G(bg.d1 d1Var) {
        return null;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean J() {
        return false;
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet != null) {
            tn tnVar = this.f44599a;
            if (tnVar.getParentActivity() != null) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
                tL_inputStickerSetID.f22412id = inputStickerSet.f22412id;
                org.telegram.ui.Components.nx0 nx0Var = new org.telegram.ui.Components.nx0(tnVar.getParentActivity(), tnVar, tL_inputStickerSetID, null, tnVar.U, tnVar.f42746aa);
                nx0Var.setCalcMandatoryInsets(tnVar.x9());
                nx0Var.f31175e0 = z10;
                tnVar.showDialog(nx0Var);
            }
        }
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override
    public final boolean Q() {
        return true;
    }

    @Override
    public final long a() {
        return this.f44599a.P5;
    }

    @Override
    public final boolean b() {
        return this.f44599a.D6();
    }

    @Override
    public final boolean c() {
        if (this.f44599a.N3 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i10) {
        return true;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f44599a.U.a(document, str, obj, null, true, z10, i10, i11);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final MessageObject y() {
        return null;
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void A(TLRPC.Document document) {
    }

    @Override
    public final void D(TLRPC.Document document) {
    }

    @Override
    public final void H(TLRPC.Document document) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void m(String str) {
    }

    @Override
    public final void n(TLRPC.Document document) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(TLRPC.Document document) {
    }

    @Override
    public final void x(String str) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void F(CharSequence charSequence, String str, tm tmVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
