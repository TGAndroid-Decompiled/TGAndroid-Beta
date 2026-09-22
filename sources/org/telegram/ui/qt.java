package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public interface qt {
    MessageObject A();

    boolean B();

    void C(TLRPC.Document document);

    boolean D();

    boolean E(TLRPC.Document document);

    void F(TLRPC.Document document);

    String G(boolean z10);

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

    org.telegram.ui.Components.y70 i(ci.n6 n6Var);

    void j(SendMessagesHelper.ImportingSticker importingSticker);

    boolean k();

    boolean l(int i10);

    void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11);

    void n(String str);

    void o(TLRPC.Document document);

    boolean p();

    void q(TLRPC.Document document);

    void r();

    void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10);

    void t();

    void u(CharSequence charSequence, String str, of ofVar);

    void v(TLRPC.Document document);

    void w(TLRPC.StickerSet stickerSet, String str);

    void x(TLObject tLObject, Object obj);

    boolean y();

    void z(String str);
}
