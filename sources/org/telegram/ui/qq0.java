package org.telegram.ui;

import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public interface qq0 {
    boolean a(int i7);

    File b(int i7);

    String c(int i7);

    TLObject d(int i7);

    boolean e(int i7);

    TLRPC.PhotoSize f(TLObject tLObject, int[] iArr);

    Object g();

    TL_iv.PageBlock get(int i7);

    List getAll();

    void h(TL_iv.PageBlock pageBlock);

    CharSequence i(int i7);

    int j();
}
