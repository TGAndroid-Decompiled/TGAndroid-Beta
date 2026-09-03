package ph;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i8 implements Runnable {
    public final int f41789a;
    public final int f41790b;
    public final Object f41791c;

    public i8(Object obj, int i10, int i11) {
        this.f41789a = i11;
        this.f41791c = obj;
        this.f41790b = i10;
    }

    @Override
    public final void run() {
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z4;
        int i10;
        int i11 = this.f41789a;
        final int i12 = this.f41790b;
        Object obj = this.f41791c;
        switch (i11) {
            case 0:
                da daVar = (da) obj;
                int i13 = daVar.f41517c;
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
                t6 t6Var = daVar.H1;
                if (TextUtils.equals(t6Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                t6Var.f42421k = z4;
                daVar.H1.C0 = new SpannableString(daVar.Z0.getText());
                daVar.z();
                daVar.y();
                t6 t6Var2 = daVar.H1;
                if (t6Var2 != null && t6Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                daVar.L1 = i10;
                daVar.H1 = (t6) daVar.E1.get(i12);
                daVar.O(0, 1);
                daVar.N(0, 1);
                daVar.f41512a1.f42276b.V2.N(false);
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
                    n0Var.f5801a.scrollBy(0, i12);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            case 4:
                vh.c0 c0Var = (vh.c0) obj;
                vh.f0 f0Var = c0Var.f45913f;
                if (c0Var.f45912c && f0Var.B != null && f0Var.f46414a != null) {
                    c0Var.d = true;
                    c0Var.f45910a.setPressed(false);
                    try {
                        c0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    vh.d0 d0Var = f0Var.B;
                    vh.a aVar = f0Var.f46414a;
                    vh.s3 s3Var = ((vh.k3) d0Var).f46056a;
                    s3Var.n3(false);
                    s3Var.f46209e3.m(new vh.p3(s3Var, aVar, i12), c0Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    try {
                        d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i12, true);
                            }
                        });
                        d2VarArr[0].show();
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
        }
    }
}
