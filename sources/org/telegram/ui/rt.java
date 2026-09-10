package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public interface rt {
    void A(TLRPC.Document document);

    boolean B();

    boolean C(TLRPC.Document document);

    void D(TLRPC.Document document);

    String E(boolean z10);

    void F(CharSequence charSequence, String str, pf pfVar);

    void G(TLRPC.Document document);

    boolean H();

    boolean I();

    void J();

    org.telegram.ui.Components.w70 K(bi.n7 n7Var);

    void L();

    void M(TLRPC.InputStickerSet inputStickerSet, boolean z10);

    boolean N(TLRPC.Document document);

    void O(String str);

    Boolean P(TLRPC.Document document);

    boolean Q();

    long a();

    boolean b();

    boolean c();

    TLRPC.TL_messageMediaPoll d();

    boolean e(TLRPC.Document document);

    boolean f();

    TLRPC.PollAnswer g();

    boolean h();

    void i(SendMessagesHelper.ImportingSticker importingSticker);

    boolean j();

    boolean k(int i10);

    void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11);

    void m(String str);

    void n(TLRPC.Document document);

    boolean o();

    void p(TLRPC.Document document);

    void q();

    void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10);

    void s();

    void t(TLRPC.Document document);

    void u(TLRPC.StickerSet stickerSet, String str);

    void v(TLObject tLObject, Object obj);

    boolean w();

    void x(String str);

    MessageObject y();

    boolean z();
}
