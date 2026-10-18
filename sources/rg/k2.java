package rg;

import com.google.android.gms.internal.play_billing.k3;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class k2 {
    public String f45478a;
    public String f45479b;
    public String f45480c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f45481f;
    public TLRPC.InputFile f45482g;
    public boolean h;
    public long f45483i;
    public TLRPC.StickerSet f45484j;
    public TLRPC.Document f45485k;
    public String f45486l;
    public Utilities.Callback2 f45487m;
    public Utilities.Callback f45488n;
    public boolean f45489o;
    public ArrayList f45490p;
    public ArrayList f45491q;
    public MessageObject f45492r;
    public VideoEditedInfo f45493s;
    public float f45494t;
    public float f45495u;

    public final void a() {
        ArrayList arrayList = this.f45491q;
        ArrayList arrayList2 = this.f45490p;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            try {
                ((File) obj).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            try {
                ((File) obj2).delete();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f7;
        if (this.f45487m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45493s == null) {
            return f7 * this.f45495u;
        }
        return k3.A(this.f45495u, 0.5f, this.f45494t * 0.5f, f7);
    }
}
