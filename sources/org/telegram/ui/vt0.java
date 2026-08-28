package org.telegram.ui;

import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public interface vt0 {
    boolean a(int i9);

    File b(int i9);

    String c(int i9);

    TLObject d(int i9);

    boolean e(int i9);

    TLRPC.PhotoSize f(TLObject tLObject, int[] iArr);

    Object g();

    TL_iv.PageBlock get(int i9);

    List getAll();

    void h(TL_iv.PageBlock pageBlock);

    CharSequence i(int i9);

    int j();
}
