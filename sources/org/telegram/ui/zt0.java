package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public interface zt0 {
    boolean A();

    void B(int i9);

    CharSequence C(int i9);

    void D();

    bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11);

    void F(boolean z10);

    void G();

    int H();

    void I();

    boolean J();

    boolean K();

    void L(VideoEditedInfo videoEditedInfo);

    boolean M();

    boolean N();

    boolean O();

    boolean P();

    int Q(Object obj);

    int R(int i9);

    boolean S();

    boolean T();

    MessageObject U();

    void V();

    void W(int i9);

    void X(int i9);

    boolean Y();

    void Z(int i9);

    long a();

    String a0();

    boolean b();

    CharSequence b0(int i9);

    ArrayList c();

    void d();

    void e(CharSequence charSequence);

    void f(String str, String str2, boolean z10);

    boolean g();

    boolean h();

    void i();

    ImageReceiver.BitmapHolder j(int i9);

    int k(int i9, VideoEditedInfo videoEditedInfo);

    boolean l();

    void m();

    void n();

    void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11);

    boolean p();

    boolean q();

    boolean r();

    void s();

    boolean t();

    boolean u();

    HashMap v();

    boolean w();

    boolean x(int i9);

    int y();

    boolean z();
}
