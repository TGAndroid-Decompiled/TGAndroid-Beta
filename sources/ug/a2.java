package ug;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.b20;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
public final class a2 {
    public String f55863a;
    public String f55864b;
    public String f55865c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f55866e;
    public TLRPC.TL_messageMediaDocument f55867f;
    public TLRPC.InputFile f55868g;
    public boolean h;
    public long f55869i;
    public TLRPC.StickerSet f55870j;
    public TLRPC.Document f55871k;
    public String f55872l;
    public n10 f55873m;
    public u10 f55874n;
    public boolean f55875o;
    public ArrayList f55876p;
    public ArrayList f55877q;
    public zi f55878r;
    public b20 f55879s;
    public float f55880t;
    public float f55881u;

    public final void a() {
        ArrayList arrayList = this.f55877q;
        ArrayList arrayList2 = this.f55876p;
        int size = arrayList2.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            try {
                ((File) obj).delete();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            try {
                ((File) obj2).delete();
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f10;
        if (this.f55873m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f55879s == null) {
            return f10 * this.f55881u;
        }
        return com.google.android.recaptcha.internal.a.A(this.f55881u, 0.5f, this.f55880t * 0.5f, f10);
    }
}
