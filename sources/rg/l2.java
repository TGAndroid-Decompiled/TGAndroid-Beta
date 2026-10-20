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
    public String f45453a;
    public String f45454b;
    public String f45455c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f45456f;
    public TLRPC.InputFile f45457g;
    public boolean h;
    public long f45458i;
    public TLRPC.StickerSet f45459j;
    public TLRPC.Document f45460k;
    public String f45461l;
    public Utilities.Callback2 f45462m;
    public Utilities.Callback f45463n;
    public boolean f45464o;
    public ArrayList f45465p;
    public ArrayList f45466q;
    public MessageObject f45467r;
    public VideoEditedInfo f45468s;
    public float f45469t;
    public float f45470u;

    public final void a() {
        ArrayList arrayList = this.f45466q;
        ArrayList arrayList2 = this.f45465p;
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
        if (this.f45462m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45468s == null) {
            return f7 * this.f45470u;
        }
        return k3.A(this.f45470u, 0.5f, this.f45469t * 0.5f, f7);
    }
}
