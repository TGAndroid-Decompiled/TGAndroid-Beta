package rg;

import com.google.android.gms.internal.play_billing.k3;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f45456a;
    public String f45457b;
    public String f45458c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f45459f;
    public TLRPC.InputFile f45460g;
    public boolean h;
    public long f45461i;
    public TLRPC.StickerSet f45462j;
    public TLRPC.Document f45463k;
    public String f45464l;
    public Utilities.Callback2 f45465m;
    public Utilities.Callback f45466n;
    public boolean f45467o;
    public ArrayList f45468p;
    public ArrayList f45469q;
    public MessageObject f45470r;
    public VideoEditedInfo f45471s;
    public float f45472t;
    public float f45473u;

    public final void a() {
        ArrayList arrayList = this.f45469q;
        ArrayList arrayList2 = this.f45468p;
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
        if (this.f45465m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45471s == null) {
            return f7 * this.f45473u;
        }
        return k3.A(this.f45473u, 0.5f, this.f45472t * 0.5f, f7);
    }
}
