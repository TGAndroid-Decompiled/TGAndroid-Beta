package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public interface qt {
    boolean A();

    void B(TLRPC.Document document);

    boolean C();

    boolean D(TLRPC.Document document);

    void E(TLRPC.Document document);

    String F(boolean z10);

    void G(CharSequence charSequence, String str, nf nfVar);

    void H(TLRPC.Document document);

    boolean I();

    boolean J();

    void K();

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

    org.telegram.ui.Components.n70 t(ah.w wVar);

    void u(TLRPC.Document document);

    void v(TLRPC.StickerSet stickerSet, String str);

    void w(TLObject tLObject, Object obj);

    boolean x();

    void y(String str);

    MessageObject z();
}
