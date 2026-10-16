package rg;

import com.google.android.gms.internal.play_billing.k3;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class n2 {
    public String f44139a;
    public String f44140b;
    public String f44141c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f44142f;
    public TLRPC.InputFile f44143g;
    public boolean h;
    public long f44144i;
    public TLRPC.StickerSet f44145j;
    public TLRPC.Document f44146k;
    public String f44147l;
    public Utilities.Callback2 f44148m;
    public Utilities.Callback f44149n;
    public boolean f44150o;
    public ArrayList f44151p;
    public ArrayList f44152q;
    public MessageObject f44153r;
    public VideoEditedInfo f44154s;
    public float f44155t;
    public float f44156u;

    public final void a() {
        ArrayList arrayList = this.f44152q;
        ArrayList arrayList2 = this.f44151p;
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
        if (this.f44148m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f44154s == null) {
            return f7 * this.f44156u;
        }
        return k3.A(this.f44156u, 0.5f, this.f44155t * 0.5f, f7);
    }
}
