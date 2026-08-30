package ph;

import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class j8 implements Runnable {
    public final int f41787a;
    public final int f41788b;
    public final Object f41789c;

    public j8(Object obj, int i10, int i11) {
        this.f41787a = i11;
        this.f41789c = obj;
        this.f41788b = i10;
    }

    @Override
    public final void run() {
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z4;
        int i10;
        int i11 = this.f41787a;
        int i12 = this.f41788b;
        Object obj = this.f41789c;
        switch (i11) {
            case 0:
                da daVar = (da) obj;
                int i13 = daVar.f41479c;
                daVar.m();
                daVar.U1 = false;
                File file = daVar.H1.O0;
                if (file != null) {
                    file.delete();
                    daVar.H1.O0 = null;
                }
                daVar.W(daVar.H1, true);
                CharSequence[] charSequenceArr = {daVar.Z0.getText()};
                if (MessagesController.getInstance(i13).storyEntitiesAllowed()) {
                    arrayList = MediaDataController.getInstance(i13).getEntities(charSequenceArr, true);
                } else {
                    arrayList = new ArrayList<>();
                }
                CharSequence[] charSequenceArr2 = {daVar.H1.C0};
                if (MessagesController.getInstance(i13).storyEntitiesAllowed()) {
                    arrayList2 = MediaDataController.getInstance(i13).getEntities(charSequenceArr2, true);
                } else {
                    arrayList2 = new ArrayList<>();
                }
                u6 u6Var = daVar.H1;
                if (TextUtils.equals(u6Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                u6Var.f42420k = z4;
                daVar.H1.C0 = new SpannableString(daVar.Z0.getText());
                daVar.z();
                daVar.y();
                u6 u6Var2 = daVar.H1;
                if (u6Var2 != null && u6Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                daVar.L1 = i10;
                daVar.H1 = (u6) daVar.E1.get(i12);
                daVar.O(0, 1);
                daVar.N(0, 1);
                daVar.f41474a1.f42240b.V2.N(false);
                daVar.Z0.setText(daVar.H1.C0);
                return;
            case 1:
                ((tf.z) obj).m(i12);
                return;
            case 2:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i12).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i12).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                f2.n0 n0Var = (f2.n0) obj;
                n0Var.getClass();
                try {
                    n0Var.f5812a.scrollBy(0, i12);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            default:
                vh.b0 b0Var = (vh.b0) obj;
                vh.e0 e0Var = b0Var.f45813f;
                if (b0Var.f45812c && e0Var.B != null && e0Var.f46283a != null) {
                    b0Var.d = true;
                    b0Var.f45810a.setPressed(false);
                    try {
                        b0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    vh.c0 c0Var = e0Var.B;
                    vh.a aVar = e0Var.f46283a;
                    vh.r3 r3Var = ((vh.j3) c0Var).f45959a;
                    r3Var.o3(false);
                    r3Var.f46112e3.l(new vh.o3(r3Var, aVar, i12), b0Var);
                    return;
                }
                return;
        }
    }
}
